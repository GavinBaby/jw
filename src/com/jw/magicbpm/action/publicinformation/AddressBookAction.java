package com.jw.magicbpm.action.publicinformation;

import java.util.List;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.dao.C_T_Sys_DepartmentMapper;
import com.jw.baseframe.dao.C_T_Sys_MaintainMapper;
import com.jw.baseframe.model.C_T_Sys_Department;
import com.jw.baseframe.model.C_T_Sys_Maintain;
import com.jw.baseframe.model.C_T_Sys_MaintainExample;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Address_BookMapper;
import com.jw.magicbpm.dao.publicinformation.B_V_Ufp_UnitAddress_BookMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_Book;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_BookExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitAddress_Book;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitAddress_BookExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitDept_Tree;

/**
 * 通讯录 2012—12-17
 */
public class AddressBookAction extends JwBaseAction {

	/**
	 * 版本标识
	 */
	private static final long serialVersionUID = -2814590404586490100L;

	// 模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_ADDRESSBOOK;
	// 单位部门树列表
	private List<B_V_Ufp_UnitDept_Tree> listAddressBookgetUnitTree;
	// 个人通讯录实体
	private B_T_Ufp_Address_Book b_T_Ufp_Address_Book;
	// 单位通讯录实体
	private B_V_Ufp_UnitAddress_Book b_V_Ufp_UnitAddress_Book;
	// 个人通讯录群组列表
	private List<C_T_Sys_Maintain> listAddressBookgetPersonAddressBook;
	// 查询条件姓名
	private String userNameS;
	//单位
	private String unitNameS;
	//列表系统名
	private String userSysName;
	//群组类别
	private String categoryIdS;
	// 区分单位和个人通讯录
	private String flag;
	@Resource
	B_T_Ufp_Address_BookMapper mapperABT;
	@Resource
	B_V_Ufp_UnitAddress_BookMapper mapperUBV;
	@Resource
	C_T_Sys_DepartmentMapper mapperDep;
	@Resource
	C_T_Sys_MaintainMapper mapperMT;

	/**
	 * 个人通讯录 删除
	 */
	public String persondetailsDelete() throws Exception {
		DbOperationFation.deleteByExample("B_T_Ufp_Address_Book", checkedIds,
				moduleId);
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * 个人通讯录详细信息页面加载
	 */
	public String persondetailsLoad() throws Exception {
		allPermission = "*";
		b_T_Ufp_Address_Book = mapperABT.selectByPrimaryKey(mainDocId);
		// 新建
		if (b_T_Ufp_Address_Book == null) {
			b_T_Ufp_Address_Book = new B_T_Ufp_Address_Book();
			b_T_Ufp_Address_Book.setCategoryId(categoryIdS);
		} else {
			//得到更新时间
			getDocUpdateTime("B_T_Ufp_Address_Book");
		}
		listAddressBookgetPersonAddressBook = getPersonAddressBookList();
		return SUCCESS;
	}

	/**
	 * 单位通讯录详细信息
	 */
	public String unitdetailsLoad() throws Exception {
		allPermission = "#";
		B_V_Ufp_UnitAddress_BookExample example = null;
		try {
			// 创建查询条件
			example = new B_V_Ufp_UnitAddress_BookExample();
			example.or().andUserSysNameEqualTo(userSysName);
			b_V_Ufp_UnitAddress_Book = mapperUBV.selectByExample(example)
					.get(0);
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
		}
		return SUCCESS;
	}

	/**
	 * 个人通讯录详细信息新建或修改
	 */
	public String persondetailsUpdate() throws Exception {
		// 取得数据连接
		B_T_Ufp_Address_BookExample example = null;
		B_V_Ufp_UnitAddress_BookExample exampleUnit = null;
		try {
			example = new B_T_Ufp_Address_BookExample();
			exampleUnit = new B_V_Ufp_UnitAddress_BookExample();

			String returnMsg = null;
			// 点击添加到个人通讯录按钮(flag:toPerson)，则进行相应操作
			if (!"toPerson".equals(flag)) {
				if (StringTools.isNullOrNoValue(mainDocId)) {
					// 将画面上的数据赋值给需要更新的数据（如果不是单主键的话需要手动给主键赋值）
					// 插入数据
					b_T_Ufp_Address_Book.setCategoryId(categoryIdS);
					b_T_Ufp_Address_Book.setBelongsUser(SessionFactory
							.getSessionUserId());
					b_T_Ufp_Address_Book.setIsFromUnitbook(0);
					mapperABT.insertSelective(b_T_Ufp_Address_Book);
					returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
				} else {
					// 判断是否有人编辑过
					if (isDocUpdated("B_T_Ufp_Address_Book")) {
						errorMessage(Constants.DISP_EDIT_CONFLICTS);
					} else {
						b_T_Ufp_Address_Book.setUuid(mainDocId);
						mapperABT
								.updateByPrimaryKeySelective(b_T_Ufp_Address_Book);
						returnMsg = Constants.UPDATE_SUCCESSFUL_MSG;
					}
				}
			} else {
				int rowCount = 0;
				B_T_Ufp_Address_Book recordTemp;
				B_V_Ufp_UnitAddress_Book b_V_Ufp_UnitAddress_Book;
				List<B_T_Ufp_Address_Book> b_T_Ufp_Address_Book_list = null;
				if (!"".equals(checkedIds)) {
					String temps[] = checkedIds.split(",");
					for (String temp : temps) {
						exampleUnit.clear();
						exampleUnit.or().andUserSysNameEqualTo(temp);
						b_V_Ufp_UnitAddress_Book = mapperUBV.selectByExample(
								exampleUnit).get(0);
						// 判断个人通讯录中是否有该人员
						example.clear();
						example.or().andUsercopySysNameEqualTo(temp)
								.andIsFromUnitbookEqualTo(1)
								.andBelongsUserEqualTo(SessionFactory.getSessionUserId());
						b_T_Ufp_Address_Book_list = mapperABT
								.selectByExample(example);
						rowCount = b_T_Ufp_Address_Book_list.size();

						if (rowCount > 0) {
							// 更新个人通讯录中的信息
							b_T_Ufp_Address_Book = b_T_Ufp_Address_Book_list.get(0);
							b_T_Ufp_Address_Book.setCategoryId(categoryIdS);
							mapperABT.updateByPrimaryKeySelective(b_T_Ufp_Address_Book);
							returnMsg = Constants.UPDATE_SUCCESSFUL_MSG;
						} else {
							// 保存记录到个人通讯录
							recordTemp = new B_T_Ufp_Address_Book();
							recordTemp.setUserName(b_V_Ufp_UnitAddress_Book
									.getUserName());
							recordTemp.setSort(b_V_Ufp_UnitAddress_Book
									.getSort());
							recordTemp.setUnitName(b_V_Ufp_UnitAddress_Book
									.getUnitName());
							recordTemp.setDeptName(b_V_Ufp_UnitAddress_Book
									.getDeptName());
							recordTemp.setPositionName(b_V_Ufp_UnitAddress_Book
									.getPositionName());
							recordTemp.setOfficePhone(b_V_Ufp_UnitAddress_Book
									.getOfficephone());
							recordTemp.setHomePhone(b_V_Ufp_UnitAddress_Book
									.getHomephone());
							recordTemp.setMobilePhone(b_V_Ufp_UnitAddress_Book
									.getMobilephone());
							recordTemp.setVirtualPhone(b_V_Ufp_UnitAddress_Book
									.getVirtualphone());
							recordTemp.setFaxPhone(b_V_Ufp_UnitAddress_Book
									.getFaxphone());
							recordTemp
									.setUsercopySysName(b_V_Ufp_UnitAddress_Book
											.getUserSysName());
							recordTemp
									.setUsercopyUnitId(b_V_Ufp_UnitAddress_Book
											.getUnitId());
							recordTemp.setIsFromUnitbook(1);
							recordTemp.setBelongsUser(SessionFactory.getSessionUserId());
							recordTemp.setCategoryId(categoryIdS);
							mapperABT.insertSelective(recordTemp);
							returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
						}
					}
				}
			}
			sucessMessage(returnMsg);
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			exampleUnit = null;
		}
		return SUCCESS;
	}

	/**
	 * 单位通讯录列表加载
	 */
	public String unitlistLoad() throws Exception {
		flag = "dw";
		listAddressBookgetPersonAddressBook = getPersonAddressBookList();
		return SUCCESS;
	}

	/**
	 * 个人通讯录列表加载
	 */
	public String personlistLoad() throws Exception {
		flag = "gr";
		return SUCCESS;
	}

	/**
	 * 单位通讯录 Grid数据加载
	 */
	public String unitgridLoad() throws Exception {
		B_V_Ufp_UnitAddress_BookExample example = null;
		B_V_Ufp_UnitAddress_BookExample.Criteria criteria = null;
		try {
			// 创建查询条件
			example = new B_V_Ufp_UnitAddress_BookExample();
			criteria = example.createCriteria();

			C_T_Sys_Department c_T_Sys_Department = mapperDep
					.selectByPrimaryKey(mainDocId);
			String unitId = "";
			if (c_T_Sys_Department != null) {
				unitId = c_T_Sys_Department.getUnitId();
				flag = "dept";
			} else {
				unitId = mainDocId;
				flag = "unit";
			}
			if (StringTools.isNotNullAndHasValue(unitId)) {
				criteria.andUnitIdEqualTo(unitId);
			}
			if ("dept".equals(flag)) {
				if (StringTools.isNotNullAndHasValue(mainDocId)) {
					criteria.andDeptIdEqualTo(mainDocId);
				}
			}
			if (StringTools.isNotNullAndHasValue(userNameS)) {
				criteria.andUserNameLike("%" + userNameS + "%");
			}
			if (StringTools.isNotNullAndHasValue(unitNameS)) {
				criteria.andUnitNameLike("%" + unitNameS + "%");
			}
			// 记录条数的记录
			total = mapperUBV.countByExample(example);
			// 分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("sort");
			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperUBV
					.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	/**
	 * 个人通讯录 Grid数据加载
	 */
	public String persongridLoad() throws Exception {
		B_T_Ufp_Address_BookExample example = null;
		B_T_Ufp_Address_BookExample.Criteria criteria = null;
		try {
			// 创建查询条件
			example = new B_T_Ufp_Address_BookExample();
			criteria = example.createCriteria();
			int isAdmin = SessionFactory.getSessionUserType();
			if (isAdmin == 0) {
				criteria.andBelongsUserEqualTo(SessionFactory
						.getSessionUserId());
			}
			if (StringTools.isNotNullAndHasValue(userNameS)) {
				criteria.andUserNameLike("%" + userNameS + "%");
			}
			if (StringTools.isNotNullAndHasValue(categoryIdS)) {
				criteria.andCategoryIdEqualTo(categoryIdS);
			}
			criteria.andIsDeleteEqualTo(0);
			// 记录条数的记录
			total = mapperABT.countByExample(example);
			// 分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("sort desc");

			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperABT
					.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	/**
	 * 获取左边单位列表树
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String getUnitTree() throws Exception {
		String where = "1=1 order by sort";
		listAddressBookgetUnitTree = DbOperationFation.getTreeDataForJson(
				"B_V_Ufp_UnitDept_Tree", "pid", "uuid", "NAME", where);
		return SUCCESS;
	}

	/**
	 * 获取通讯录群组维护列表
	 * 
	 * @return
	 */
	public List<C_T_Sys_Maintain> getPersonAddressBookList() throws Exception {
		C_T_Sys_MaintainExample example = null;
		List<C_T_Sys_Maintain> list_C_T_Sys_Maintain = null;
		String moduleUuid = "";
		try {
			// 创建查询条件
			example = new C_T_Sys_MaintainExample();
			moduleUuid = moduleId.substring(0, 10);
			example.or().andModuleUuidLike(moduleUuid + "%").andMuserEqualTo(
					SessionFactory.getSessionUserId()).andUrlIsNull().andIsDeleteEqualTo(0);
			list_C_T_Sys_Maintain = mapperMT.selectByExample(example);
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
		}
		return list_C_T_Sys_Maintain;
	}

	/**************************** get set方法 **********************************************************************/
	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public List<B_V_Ufp_UnitDept_Tree> getListAddressBookgetUnitTree() {
		return listAddressBookgetUnitTree;
	}

	public void setListAddressBookgetUnitTree(
			List<B_V_Ufp_UnitDept_Tree> listAddressBookgetUnitTree) {
		this.listAddressBookgetUnitTree = listAddressBookgetUnitTree;
	}

	public B_T_Ufp_Address_Book getB_T_Ufp_Address_Book() {
		return b_T_Ufp_Address_Book;
	}

	public void setB_T_Ufp_Address_Book(B_T_Ufp_Address_Book bTUfpAddressBook) {
		b_T_Ufp_Address_Book = bTUfpAddressBook;
	}

	public String getUserNameS() {
		return userNameS;
	}

	public void setUserNameS(String userNameS) {
		this.userNameS = userNameS;
	}

	public String getUnitNameS() {
		return unitNameS;
	}

	public void setUnitNameS(String unitNameS) {
		this.unitNameS = unitNameS;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public B_V_Ufp_UnitAddress_Book getB_V_Ufp_UnitAddress_Book() {
		return b_V_Ufp_UnitAddress_Book;
	}

	public void setB_V_Ufp_UnitAddress_Book(
			B_V_Ufp_UnitAddress_Book bVUfpUnitAddressBook) {
		b_V_Ufp_UnitAddress_Book = bVUfpUnitAddressBook;
	}

	public String getUserSysName() {
		return userSysName;
	}

	public void setUserSysName(String userSysName) {
		this.userSysName = userSysName;
	}

	public List<C_T_Sys_Maintain> getListAddressBookgetPersonAddressBook() {
		return listAddressBookgetPersonAddressBook;
	}

	public void setListAddressBookgetPersonAddressBook(
			List<C_T_Sys_Maintain> listAddressBookgetPersonAddressBook) {
		this.listAddressBookgetPersonAddressBook = listAddressBookgetPersonAddressBook;
	}

	public String getCategoryIdS() {
		return categoryIdS;
	}

	public void setCategoryIdS(String categoryIdS) {
		this.categoryIdS = categoryIdS;
	}

}
