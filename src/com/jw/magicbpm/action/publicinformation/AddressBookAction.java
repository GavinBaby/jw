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
 * ͨѶ¼ 2012��12-17
 */
public class AddressBookAction extends JwBaseAction {

	/**
	 * �汾��ʶ
	 */
	private static final long serialVersionUID = -2814590404586490100L;

	// ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_ADDRESSBOOK;
	// ��λ�������б�
	private List<B_V_Ufp_UnitDept_Tree> listAddressBookgetUnitTree;
	// ����ͨѶ¼ʵ��
	private B_T_Ufp_Address_Book b_T_Ufp_Address_Book;
	// ��λͨѶ¼ʵ��
	private B_V_Ufp_UnitAddress_Book b_V_Ufp_UnitAddress_Book;
	// ����ͨѶ¼Ⱥ���б�
	private List<C_T_Sys_Maintain> listAddressBookgetPersonAddressBook;
	// ��ѯ��������
	private String userNameS;
	//��λ
	private String unitNameS;
	//�б�ϵͳ��
	private String userSysName;
	//Ⱥ�����
	private String categoryIdS;
	// ���ֵ�λ�͸���ͨѶ¼
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
	 * ����ͨѶ¼ ɾ��
	 */
	public String persondetailsDelete() throws Exception {
		DbOperationFation.deleteByExample("B_T_Ufp_Address_Book", checkedIds,
				moduleId);
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * ����ͨѶ¼��ϸ��Ϣҳ�����
	 */
	public String persondetailsLoad() throws Exception {
		allPermission = "*";
		b_T_Ufp_Address_Book = mapperABT.selectByPrimaryKey(mainDocId);
		// �½�
		if (b_T_Ufp_Address_Book == null) {
			b_T_Ufp_Address_Book = new B_T_Ufp_Address_Book();
			b_T_Ufp_Address_Book.setCategoryId(categoryIdS);
		} else {
			//�õ�����ʱ��
			getDocUpdateTime("B_T_Ufp_Address_Book");
		}
		listAddressBookgetPersonAddressBook = getPersonAddressBookList();
		return SUCCESS;
	}

	/**
	 * ��λͨѶ¼��ϸ��Ϣ
	 */
	public String unitdetailsLoad() throws Exception {
		allPermission = "#";
		B_V_Ufp_UnitAddress_BookExample example = null;
		try {
			// ������ѯ����
			example = new B_V_Ufp_UnitAddress_BookExample();
			example.or().andUserSysNameEqualTo(userSysName);
			b_V_Ufp_UnitAddress_Book = mapperUBV.selectByExample(example)
					.get(0);
		} catch (Exception e) {
			throw e;
		} finally {
			// �ͷ���Դ
			example = null;
		}
		return SUCCESS;
	}

	/**
	 * ����ͨѶ¼��ϸ��Ϣ�½����޸�
	 */
	public String persondetailsUpdate() throws Exception {
		// ȡ����������
		B_T_Ufp_Address_BookExample example = null;
		B_V_Ufp_UnitAddress_BookExample exampleUnit = null;
		try {
			example = new B_T_Ufp_Address_BookExample();
			exampleUnit = new B_V_Ufp_UnitAddress_BookExample();

			String returnMsg = null;
			// �����ӵ�����ͨѶ¼��ť(flag:toPerson)���������Ӧ����
			if (!"toPerson".equals(flag)) {
				if (StringTools.isNullOrNoValue(mainDocId)) {
					// �������ϵ����ݸ�ֵ����Ҫ���µ����ݣ�������ǵ������Ļ���Ҫ�ֶ���������ֵ��
					// ��������
					b_T_Ufp_Address_Book.setCategoryId(categoryIdS);
					b_T_Ufp_Address_Book.setBelongsUser(SessionFactory
							.getSessionUserId());
					b_T_Ufp_Address_Book.setIsFromUnitbook(0);
					mapperABT.insertSelective(b_T_Ufp_Address_Book);
					returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
				} else {
					// �ж��Ƿ����˱༭��
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
						// �жϸ���ͨѶ¼���Ƿ��и���Ա
						example.clear();
						example.or().andUsercopySysNameEqualTo(temp)
								.andIsFromUnitbookEqualTo(1)
								.andBelongsUserEqualTo(SessionFactory.getSessionUserId());
						b_T_Ufp_Address_Book_list = mapperABT
								.selectByExample(example);
						rowCount = b_T_Ufp_Address_Book_list.size();

						if (rowCount > 0) {
							// ���¸���ͨѶ¼�е���Ϣ
							b_T_Ufp_Address_Book = b_T_Ufp_Address_Book_list.get(0);
							b_T_Ufp_Address_Book.setCategoryId(categoryIdS);
							mapperABT.updateByPrimaryKeySelective(b_T_Ufp_Address_Book);
							returnMsg = Constants.UPDATE_SUCCESSFUL_MSG;
						} else {
							// �����¼������ͨѶ¼
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
			// �ͷ���Դ
			example = null;
			exampleUnit = null;
		}
		return SUCCESS;
	}

	/**
	 * ��λͨѶ¼�б����
	 */
	public String unitlistLoad() throws Exception {
		flag = "dw";
		listAddressBookgetPersonAddressBook = getPersonAddressBookList();
		return SUCCESS;
	}

	/**
	 * ����ͨѶ¼�б����
	 */
	public String personlistLoad() throws Exception {
		flag = "gr";
		return SUCCESS;
	}

	/**
	 * ��λͨѶ¼ Grid���ݼ���
	 */
	public String unitgridLoad() throws Exception {
		B_V_Ufp_UnitAddress_BookExample example = null;
		B_V_Ufp_UnitAddress_BookExample.Criteria criteria = null;
		try {
			// ������ѯ����
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
			// ��¼�����ļ�¼
			total = mapperUBV.countByExample(example);
			// ��ҳ
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//����
			example.setOrderByClause("sort");
			// ��ʽ��result һ��Ҫ��JSONObject
			result = CommonLogic.getResult(total, mapperUBV
					.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// �ͷ���Դ
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	/**
	 * ����ͨѶ¼ Grid���ݼ���
	 */
	public String persongridLoad() throws Exception {
		B_T_Ufp_Address_BookExample example = null;
		B_T_Ufp_Address_BookExample.Criteria criteria = null;
		try {
			// ������ѯ����
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
			// ��¼�����ļ�¼
			total = mapperABT.countByExample(example);
			// ��ҳ
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//����
			example.setOrderByClause("sort desc");

			// ��ʽ��result һ��Ҫ��JSONObject
			result = CommonLogic.getResult(total, mapperABT
					.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// �ͷ���Դ
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	/**
	 * ��ȡ��ߵ�λ�б���
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
	 * ��ȡͨѶ¼Ⱥ��ά���б�
	 * 
	 * @return
	 */
	public List<C_T_Sys_Maintain> getPersonAddressBookList() throws Exception {
		C_T_Sys_MaintainExample example = null;
		List<C_T_Sys_Maintain> list_C_T_Sys_Maintain = null;
		String moduleUuid = "";
		try {
			// ������ѯ����
			example = new C_T_Sys_MaintainExample();
			moduleUuid = moduleId.substring(0, 10);
			example.or().andModuleUuidLike(moduleUuid + "%").andMuserEqualTo(
					SessionFactory.getSessionUserId()).andUrlIsNull().andIsDeleteEqualTo(0);
			list_C_T_Sys_Maintain = mapperMT.selectByExample(example);
		} catch (Exception e) {
			throw e;
		} finally {
			// �ͷ���Դ
			example = null;
		}
		return list_C_T_Sys_Maintain;
	}

	/**************************** get set���� **********************************************************************/
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
