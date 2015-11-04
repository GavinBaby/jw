package com.jw.magicbpm.action.personalaffairs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.action.baseintface.JwBaseFlowAction;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.dao.C_T_Sys_DepartmentMapper;
import com.jw.baseframe.dao.C_T_Sys_UserMapper;
import com.jw.baseframe.model.C_T_Sys_User;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.personalaffairs.B_T_Flow_Dept_WorkMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Flow_Dept_WorkMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Ufp_DeptWorkManageMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Uft_DepartmentMapper;
import com.jw.magicbpm.model.personalaffairs.B_T_Flow_Dept_Work;
import com.jw.magicbpm.model.personalaffairs.B_T_Flow_Dept_WorkExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Flow_Dept_Work;
import com.jw.magicbpm.model.personalaffairs.B_V_Flow_Dept_WorkExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManageExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_Department;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_DepartmentExample;

@SuppressWarnings("deprecation")
public class DeptWorkAction extends JwBaseFlowAction implements JwBaseActionI {

	/**
	 * 版本标识
	 */
	private static final long serialVersionUID = -7348865400696275364L;
	// 模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_DEPT_WORK;
	// 年List
	private List<String> yearList;
	// 处室工作记录List
	private List<B_T_Flow_Dept_Work> list_B_T_Flow_Dept_Work;
	private List<B_V_Flow_Dept_Work> list_B_V_Flow_Dept_Work;
	// 处室工作记录类
	private B_T_Flow_Dept_Work deptWork;
	private B_T_Flow_Dept_Work deptWork1;
	// 部门名称
	private String deptNameS;
	// 部门类
	private B_V_Uft_Department dept;
	private List<B_V_Uft_Department> DeptList;
	// 数据导入
	private String start;// 开始行号
	private String end;// 结束行号
	// 处室工作记录id
	private String DeptWorkId;
	// 用户名 id
	private String userId;
	private String userName;
	// 查询字段年/月
	private String year;
	private String month;
	private String monthend;
	private String year1;
	private String month1;
	private String deptid;
	private String yearmonth;
	private String yearmonthend;

	// 删除Ids集合
	private String checkedIds;
	// json
	private String jsonResult;
	//权限
	private String allPermission = "#";
	private String allPermission1 = "#";
	//月/年
	private String month3;
	private String year3;
	// 新建的权限
	private String xinjian;
	private String xinjian2 = "1";
	// 上传的附件ID集合
	private String newFileIds;
	// 已选管理部门List
	private List<B_V_Ufp_DeptWorkManage> list_B_V_Ufp_DeptWorkManage;
	@Resource
	B_T_Flow_Dept_WorkMapper mapperDT;
	@Resource
	C_T_Sys_UserMapper mapperU;
	@Resource
	B_V_Ufp_DeptWorkManageMapper mapperDV;
	@Resource
	C_T_Sys_DepartmentMapper mapperDM;
	@Resource
	B_V_Uft_DepartmentMapper mapperDMV;
	@Resource
	B_V_Flow_Dept_WorkMapper mapperDW;

	/**
	 * 部门工作日志 删除
	 */
	public String detailsDelete() {
			DbOperationFation.deleteByExample("B_T_Flow_Dept_Work", checkedIds, moduleId);
			deleteDocFlowInfor();
			sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
			return SUCCESS;
	}

	/**
	 *部门工作日志详细信息页面加载
	 */
	@SuppressWarnings("unchecked")
	public String detailsLoad() throws Exception{
		allPermission = "*";
		try {
			Date newDate = new Date();
			int newYear = newDate.getYear() + 1900;
			yearList = new ArrayList();
			for (int i = 2011; i < newYear + 2; i++) {
				yearList.add(i + "");
			}
			if (StringTools.isNotNullAndHasValue(DeptWorkId)) {
				deptWork = (B_T_Flow_Dept_Work) mapperDT.selectByPrimaryKey(DeptWorkId);
				deptid = deptWork.getDeptId();
				year = deptWork.getYear();
				month = deptWork.getMonth();
				userId = deptWork.getUserId();
				C_T_Sys_User user = (C_T_Sys_User) mapperU.selectByPrimaryKey(userId);
				userName = user.getUserName();
				if (Integer.parseInt(month) >= 12) {
					month1 = "1";
					year1 = String.valueOf(Integer.parseInt(year) + 1);
				} else {
					month1 = String.valueOf(Integer.parseInt(month) + 1);
					year1 = year;
				}
				// begin权限部门的取得
				B_V_Ufp_DeptWorkManageExample example2 = new B_V_Ufp_DeptWorkManageExample();
				example2.or().andUserSysNameEqualTo(SessionFactory.getSessionUserId());
				example2.setOrderByClause("sort asc");
				list_B_V_Ufp_DeptWorkManage = mapperDV.selectByExample(example2);
				// end
				// 判断是否有权限
				for (int i = 0; i < list_B_V_Ufp_DeptWorkManage.size(); i++) {
					if (deptid.equals(list_B_V_Ufp_DeptWorkManage.get(i).getRoleUserId())) {
						allPermission = "*";
						xinjian2 = "2";
					}
				}
				if(!"2".equals(xinjian2)){
					allPermission="#";
				}
				// 更新本月计划
				if ("01".equals(month)) {
					month3 = "12";
					year3 = String.valueOf(Integer.parseInt(year) - 1);
				} else {
					if (String.valueOf(Integer.parseInt(month) - 1).length() > 1) {
						month3 = String.valueOf(Integer.parseInt(month) - 1);
					} else {
						month3 = "0" + String.valueOf(Integer.parseInt(month) - 1);
					}
					year3 = String.valueOf(Integer.parseInt(year));
				}
				B_T_Flow_Dept_WorkExample example1 = new B_T_Flow_Dept_WorkExample();
	
				example1.or().andDeptIdEqualTo(deptid).andYearEqualTo(year3).andMonthEqualTo(month3);
				list_B_T_Flow_Dept_Work = mapperDT.selectByExample(example1);
				if (list_B_T_Flow_Dept_Work.size() != 0) {
					deptWork1 = list_B_T_Flow_Dept_Work.get(0);
					deptWork.setPlan(deptWork1.getActual());
				}
			} else {
	
				if (year == null || "".equals(year)) {
					year = newDate.getYear() + 1900 + "";
					month = newDate.getMonth() + 1 > 9 ? newDate.getMonth() + 1 + "" : "0" + (newDate.getMonth() + 1);
				}
				if (Integer.parseInt(month) >= 12) {
					month1 = "1";
					year1 = String.valueOf(Integer.parseInt(year) + 1);
				} else {
					month1 = String.valueOf(Integer.parseInt(month) + 1);
					year1 = year;
				}
				B_T_Flow_Dept_WorkExample example = new B_T_Flow_Dept_WorkExample();
				B_T_Flow_Dept_WorkExample.Criteria criteria = example.createCriteria();
				criteria.andYearEqualTo(year);
				criteria.andMonthEqualTo(month);
				// begin权限部门的取得
				B_V_Ufp_DeptWorkManageExample example2 = new B_V_Ufp_DeptWorkManageExample();
				example2.or().andUserSysNameEqualTo(SessionFactory.getSessionUserId());
				example2.setOrderByClause("sort asc");
				list_B_V_Ufp_DeptWorkManage = mapperDV.selectByExample(example2);
				// end
				if (null != deptid && !"".equals(deptid)) {
					criteria.andDeptIdEqualTo(deptid);
				} else {
					// 初始化选择第一个部门
					if (list_B_V_Ufp_DeptWorkManage.size() != 0) {
						deptid = list_B_V_Ufp_DeptWorkManage.get(0).getRoleUserId();
						criteria.andDeptIdEqualTo(deptid);
					}
				}
				// 初始化选择第一个部门结束
				if (list_B_V_Ufp_DeptWorkManage.size() > 0) {
					// 判断是否有权限
					for (int i = 0; i < list_B_V_Ufp_DeptWorkManage.size(); i++) {
						if (deptid.equals(list_B_V_Ufp_DeptWorkManage.get(i).getRoleUserId())) {
							allPermission = "*";
							xinjian2 = "2";
						}
					}
				}
				if(!xinjian2.equals("2")){
					allPermission="#";
				}
				example.or(criteria);
				list_B_T_Flow_Dept_Work = mapperDT.selectByExample(example);
				if (list_B_T_Flow_Dept_Work.size() != 0) {
					deptWork = list_B_T_Flow_Dept_Work.get(0);
					userId = deptWork.getUserId();
					C_T_Sys_User user = (C_T_Sys_User) mapperU.selectByPrimaryKey(userId);
					userName = user.getUserName();
					// 更新本月计划
					if ("01".equals(month)) {
						month3 = "12";
						year3 = String.valueOf(Integer.parseInt(year) - 1);
					} else {
						if (String.valueOf(Integer.parseInt(month) - 1).length() > 1) {
							month3 = String.valueOf(Integer.parseInt(month) - 1);
						} else {
							month3 = "0" + String.valueOf(Integer.parseInt(month) - 1);
						}
						year3 = String.valueOf(Integer.parseInt(year));
					}
	
					B_T_Flow_Dept_WorkExample example1 = new B_T_Flow_Dept_WorkExample();
					example1.or().andDeptIdEqualTo(deptid).andYearEqualTo(year3).andMonthEqualTo(month3);
					
					list_B_T_Flow_Dept_Work = mapperDT.selectByExample(example1);
					if (list_B_T_Flow_Dept_Work.size() != 0) {
						deptWork1 = list_B_T_Flow_Dept_Work.get(0);
						deptWork.setPlan(deptWork1.getActual());
					}
				} else {// 如果本月工作计划为空，查找上月的工作计划并取出工作安排存入本月工作完成情况中
					if ("01".equals(month)) {
						month3 = "12";
						year3 = String.valueOf(Integer.parseInt(year) - 1);
					} else {
						if (String.valueOf(Integer.parseInt(month) - 1).length() > 1) {
							month3 = String.valueOf(Integer.parseInt(month) - 1);
						} else {
							month3 = "0" + String.valueOf(Integer.parseInt(month) - 1);
						}
	
						year3 = String.valueOf(Integer.parseInt(year));
					}
					B_T_Flow_Dept_WorkExample example1 = new B_T_Flow_Dept_WorkExample();
					example1.or().andDeptIdEqualTo(deptid).andYearEqualTo(year3).andMonthEqualTo(month3);
					
					deptWork = new B_T_Flow_Dept_Work();
					list_B_T_Flow_Dept_Work = mapperDT.selectByExample(example1);
					if (list_B_T_Flow_Dept_Work.size() != 0) {
						deptWork1 = list_B_T_Flow_Dept_Work.get(0);
						deptWork.setPlan(deptWork1.getActual());
					}
					userName = SessionFactory.getSessionUserNm();
					deptWork.setUserId(SessionFactory.getSessionUserId());
					deptWork.setDeptId(deptid);
				}
			}
			deptNameS = mapperDM.selectByPrimaryKey(deptid).getDeptName();
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
		}
		return SUCCESS;
	}

	/**
	 * 部门工作日志详细信息新建或修改
	 */
	public String detailsUpdate() throws Exception{
		// 取得数据连接
		String returnMsg = "";
		try {
			if (StringTools.isNullOrNoValue(deptWork.getUuid())) {
				deptWork.setUuid(new GUID().toString());
				deptWork.setUnitid(SessionFactory.getSessionUnitId());
				deptWork.setDeptId(deptid);
				deptWork.setUserId(SessionFactory.getSessionUserId());
				deptWork.setYear(year);
				deptWork.setMonth(month);
				mapperDT.insertSelective(deptWork);
				jsonResult = "true";
				returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
			} else {
				mapperDT.updateByPrimaryKeySelective(deptWork);
				jsonResult = "true";
				returnMsg = Constants.UPDATE_SUCCESSFUL_MSG;
			}
	
			sucessMessage(returnMsg);
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
		}
		return SUCCESS;
	}

	/**
	 * 部门工作日志列表加载
	 */
	public String listLoad() throws Exception{
		B_V_Uft_DepartmentExample departmentExample = null;
		try {
			departmentExample = new B_V_Uft_DepartmentExample();
			departmentExample.or().andIsDeleteEqualTo(0);
			departmentExample.setOrderByClause("SORT ASC");
			DeptList = mapperDMV.selectByExample(departmentExample);
			// 对于新建权限的控制
			xinjian = "0";
			// begin权限部门的取得
			B_V_Ufp_DeptWorkManageExample example2 = new B_V_Ufp_DeptWorkManageExample();
			example2.or().andUserSysNameEqualTo(SessionFactory.getSessionUserId());
			example2.setOrderByClause("SORT ASC");
			list_B_V_Ufp_DeptWorkManage = mapperDV.selectByExample(example2);
			// end
			if (list_B_V_Ufp_DeptWorkManage.size() > 0) {
				xinjian = "1";
				allPermission = "*";
			}
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			departmentExample = null;
		}
		return SUCCESS;
	}

	/**
	 * 部门工作日志 Grid数据加载
	 */
	public String gridLoad() throws Exception{
		B_V_Flow_Dept_WorkExample example = null;
		B_V_Flow_Dept_WorkExample.Criteria criteria = null;
		try {
			example = new B_V_Flow_Dept_WorkExample();
			criteria = example.createCriteria();
			if(yearmonth==null&&yearmonthend==null){
				Date date=new Date();
				String dateft=new String();
				SimpleDateFormat df=new SimpleDateFormat("yyyy");
				dateft=df.format(date);
				criteria.andYearmonthGreaterThanOrEqualTo(dateft+"-00");
				criteria.andYearmonthLessThanOrEqualTo(dateft+"-12");
				yearmonth=dateft+"-01";
				yearmonthend=dateft+"-12";
			}
			if (yearmonth != null && !"".equals(yearmonth)) {
				criteria.andYearmonthGreaterThanOrEqualTo(yearmonth);
			}
			if (yearmonthend != null && !"".equals(yearmonthend)) {
				criteria.andYearmonthLessThanOrEqualTo(yearmonthend);	
			}
			if (deptid != null && !"".equals(deptid)) {
				criteria.andDeptIdEqualTo(deptid);
			}
			// 记录条数的记录
			total = mapperDW.countByExample(example);
			// 分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("CREATE_TIME desc");
			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperDW.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	//--------------------------get set 方法-------------------------------
	public List<String> getYearList() {
		return yearList;
	}

	public void setYearList(List<String> yearList) {
		this.yearList = yearList;
	}

	public List<B_T_Flow_Dept_Work> getList_B_T_Flow_Dept_Work() {
		return list_B_T_Flow_Dept_Work;
	}

	public void setList_B_T_Flow_Dept_Work(List<B_T_Flow_Dept_Work> listBTFlowDeptWork) {
		list_B_T_Flow_Dept_Work = listBTFlowDeptWork;
	}

	public B_T_Flow_Dept_Work getDeptWork() {
		return deptWork;
	}

	public void setDeptWork(B_T_Flow_Dept_Work deptWork) {
		this.deptWork = deptWork;
	}

	public String getDeptWorkId() {
		return DeptWorkId;
	}

	public void setDeptWorkId(String deptWorkId) {
		DeptWorkId = deptWorkId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getCheckedIds() {
		return checkedIds;
	}

	public void setCheckedIds(String checkedIds) {
		this.checkedIds = checkedIds;
	}

	public String getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}

	public B_V_Uft_Department getDept() {
		return dept;
	}

	public void setDept(B_V_Uft_Department dept) {
		this.dept = dept;
	}

	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public String getYear1() {
		return year1;
	}

	public void setYear1(String year1) {
		this.year1 = year1;
	}

	public String getMonth1() {
		return month1;
	}

	public void setMonth1(String month1) {
		this.month1 = month1;
	}

	public String getXinjian() {
		return xinjian;
	}

	public void setXinjian(String xinjian) {
		this.xinjian = xinjian;
	}

	public List<B_V_Flow_Dept_Work> getList_B_V_Flow_Dept_Work() {
		return list_B_V_Flow_Dept_Work;
	}

	public void setList_B_V_Flow_Dept_Work(List<B_V_Flow_Dept_Work> listBVFlowDeptWork) {
		list_B_V_Flow_Dept_Work = listBVFlowDeptWork;
	}

	public List<B_V_Uft_Department> getDeptList() {
		return DeptList;
	}

	public void setDeptList(List<B_V_Uft_Department> deptList) {
		DeptList = deptList;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getMonthend() {
		return monthend;
	}

	public void setMonthend(String monthend) {
		this.monthend = monthend;
	}

	public String getXinjian2() {
		return xinjian2;
	}

	public void setXinjian2(String xinjian2) {
		this.xinjian2 = xinjian2;
	}

	public String getAllPermission1() {
		return allPermission1;
	}

	public void setAllPermission1(String allPermission1) {
		this.allPermission1 = allPermission1;
	}

	public String getNewFileIds() {
		return newFileIds;
	}

	public void setNewFileIds(String newFileIds) {
		this.newFileIds = newFileIds;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public B_T_Flow_Dept_Work getDeptWork1() {
		return deptWork1;
	}

	public void setDeptWork1(B_T_Flow_Dept_Work deptWork1) {
		this.deptWork1 = deptWork1;
	}

	public String getMonth3() {
		return month3;
	}

	public void setMonth3(String month3) {
		this.month3 = month3;
	}

	public List<B_V_Ufp_DeptWorkManage> getList_B_V_Ufp_DeptWorkManage() {
		return list_B_V_Ufp_DeptWorkManage;
	}

	public void setList_B_V_Ufp_DeptWorkManage(List<B_V_Ufp_DeptWorkManage> listBVUfpDeptWorkManage) {
		list_B_V_Ufp_DeptWorkManage = listBVUfpDeptWorkManage;
	}

	public String getDeptNameS() {
		return deptNameS;
	}

	public void setDeptNameS(String deptNameS) {
		this.deptNameS = deptNameS;
	}

	public String getYearmonth() {
		return yearmonth;
	}

	public void setYearmonth(String yearmonth) {
		this.yearmonth = yearmonth;
	}

	public String getYearmonthend() {
		return yearmonthend;
	}

	public void setYearmonthend(String yearmonthend) {
		this.yearmonthend = yearmonthend;
	}

}
