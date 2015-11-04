package com.jw.magicbpm.action.personalaffairs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.dao.C_T_Sys_DepartmentMapper;
import com.jw.baseframe.dao.C_V_Sys_UsertreeMapper;
import com.jw.baseframe.model.C_T_Sys_Department;
import com.jw.baseframe.model.C_T_Sys_DepartmentExample;
import com.jw.baseframe.model.C_V_Sys_Usertree;
import com.jw.baseframe.model.C_V_Sys_UsertreeExample;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.JsonTools;
import com.jw.magicbpm.dao.personalaffairs.B_T_Ufp_DeptWorkManageMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Ufp_DeptWorkManagetreeMapper;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_DeptWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_DeptWorkManageExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManagetree;
public class DeptWorkManegeAction extends JwBaseAction {

	/**
	 * 2013-02-22 部门日志权限维护
	 */
	private static final long serialVersionUID = 4409989707915950150L;

	// 部门List
	private List<C_T_Sys_Department> list_C_T_Sys_Department;
	//部门人员树
	private List<B_V_Ufp_DeptWorkManagetree> listDeptWorkManegedeptworkmanagetree;
    //部门选择人员
	private String seldeptsByUser;
	// 搜索类型
	private String type;
	// 查询条件
	private String allPermission = "*";
	//部门名称/ID
	private String deptName;
	private String deptid;
	@Resource
	C_T_Sys_DepartmentMapper mapperDM;
	@Resource
	B_T_Ufp_DeptWorkManageMapper mapperDWM;
	@Resource
	C_V_Sys_UsertreeMapper mapperUT;
	@Resource
	B_V_Ufp_DeptWorkManagetreeMapper mapperDWMT;

	/**
	 * 详细信息
	 * @return
	 * @throws Exception
	 */
	public String detailsLoad() throws Exception {
		C_T_Sys_DepartmentExample example = null;
		C_T_Sys_DepartmentExample.Criteria criteria = null;
		try {
			// 部门表
			example = new C_T_Sys_DepartmentExample();
			criteria = example.createCriteria();
			criteria.andParenDeptidIsNull();
			example.or(criteria);
			example.setOrderByClause("sort asc");
			list_C_T_Sys_Department = mapperDM.selectByExample(example);
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
	 * 新增更新
	 * @return
	 * @throws Exception
	 */
	public String detailsUpdate() throws Exception {

		Object[] arrObject = null;
		JSONObject jObject = null;
		B_T_Ufp_DeptWorkManage b_T_Ufp_DeptWorkManage=null;
		B_T_Ufp_DeptWorkManageExample example2 = null;
		try {
			example2 = new B_T_Ufp_DeptWorkManageExample();
			example2.or().andRoleUserIdEqualTo(deptName);
			mapperDWM.deleteByExample(example2);// 先将之前的记录删除
	
			seldeptsByUser = java.net.URLDecoder.decode(seldeptsByUser,"UTF-8");
			arrObject = JsonTools.getObjectArrayFromJson(seldeptsByUser);
			
			for (int i = 0; i < arrObject.length; i++) {
				jObject = (JSONObject) arrObject[i];
				b_T_Ufp_DeptWorkManage = new B_T_Ufp_DeptWorkManage();
				
				C_V_Sys_Usertree Userdata = getUserdata(jObject.getString("id"));
				if(Userdata.getFla()!=null&&Userdata.getFla().equals("3"))
				{
					b_T_Ufp_DeptWorkManage.setUuid(new GUID().toString());
					b_T_Ufp_DeptWorkManage.setDepartmentId(Userdata.getDeptId());
					b_T_Ufp_DeptWorkManage.setRoleUserId(deptName);
					b_T_Ufp_DeptWorkManage.setUserSysName(Userdata.getId());
					b_T_Ufp_DeptWorkManage.setUnitid(Userdata.getUnitId());
					b_T_Ufp_DeptWorkManage.setIsDelete(0);
					mapperDWM.insertSelective(b_T_Ufp_DeptWorkManage);
				}
			}
			jsonResult = "true";
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example2 = null;
		}
		return SUCCESS;
	}
	
	/**
	 * 根据用户ID取得该用户数据
	  * <b>Summary: </b>
	  *     getUserdata(请用一句话描述这个方法的作用)
	  * @param sqlSession
	  * @param userid 模块ID
	  * @return
	 */
	public C_V_Sys_Usertree getUserdata(String userid) {
		C_V_Sys_UsertreeExample example = new C_V_Sys_UsertreeExample();
		example.clear();
		example.or().andIdEqualTo(userid);
		List<C_V_Sys_Usertree> userlist = mapperUT.selectByExample(example);
		if (userlist.size()>0)
			return (C_V_Sys_Usertree)userlist.get(0);
		else
			return null;		
	}
	
	/**
	 * 部门工作树
	 * @return
	 */
	public String deptworkmanagetree() {
		Map<String, Object> map = null;
		map = new HashMap<String, Object>();
		map.put("deptid", deptid);
		listDeptWorkManegedeptworkmanagetree = mapperDWMT.selectdeptworkmanagetreeByMap(map);
		return SUCCESS;
	}
			
	/*********************************** get--set ************************************************************************************/
	public List<C_T_Sys_Department> getList_C_T_Sys_Department() {
		return list_C_T_Sys_Department;
	}

	public void setList_C_T_Sys_Department(List<C_T_Sys_Department> listCTSysDepartment) {
		list_C_T_Sys_Department = listCTSysDepartment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}

	public String getSeldeptsByUser() {
		return seldeptsByUser;
	}

	public void setSeldeptsByUser(String seldeptsByUser) {
		this.seldeptsByUser = seldeptsByUser;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public List<B_V_Ufp_DeptWorkManagetree> getListDeptWorkManegedeptworkmanagetree() {
		return listDeptWorkManegedeptworkmanagetree;
	}

	public void setListDeptWorkManegedeptworkmanagetree(
			List<B_V_Ufp_DeptWorkManagetree> listDeptWorkManegedeptworkmanagetree) {
		this.listDeptWorkManegedeptworkmanagetree = listDeptWorkManegedeptworkmanagetree;
	}

}
