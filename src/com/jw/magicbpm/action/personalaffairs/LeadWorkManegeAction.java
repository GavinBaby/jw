package com.jw.magicbpm.action.personalaffairs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.dao.C_T_Sys_UserMapper;
import com.jw.baseframe.dao.C_V_Sys_UsertreeMapper;
import com.jw.baseframe.model.C_T_Sys_User;
import com.jw.baseframe.model.C_T_Sys_UserExample;
import com.jw.baseframe.model.C_V_Sys_Usertree;
import com.jw.baseframe.model.C_V_Sys_UsertreeExample;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.JsonTools;
import com.jw.magicbpm.dao.personalaffairs.B_T_Ufp_LeadWorkManageMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Ufp_LeadWorkManagetreeMapper;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_LeadWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_LeadWorkManageExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManagetree;
public class LeadWorkManegeAction extends JwBaseAction {

	/**
	 * 2013-02-22 领导日志权限维护
	 */
	private static final long serialVersionUID = 4409989707915950150L;
	//领导所在部门DEPT_ID
	private static  final String LEAD_DEPT_ID = "dept0001";
	
	// 领导List
	private List<C_T_Sys_User> list_C_T_Sys_User;
	//领导工作树
	private List<B_V_Ufp_LeadWorkManagetree> listLeadWorkManegeleadworkmanagetree;
    //部门人员
	private String seldeptsByUser;
	// 搜索类型
	private String type;
	// 查询条件
	private String allPermission = "*";
	//部门名称/ID
	private String username;
	private String deptid;
	//mapper资源
	@Resource
	C_T_Sys_UserMapper mapperU ;
	@Resource
	B_T_Ufp_LeadWorkManageMapper mapperLWM; 
	@Resource
	C_V_Sys_UsertreeMapper mapperUT;
	@Resource
	B_V_Ufp_LeadWorkManagetreeMapper mapperLWMV;

	/**
	 * 详细信息
	 * @return
	 * @throws Exception
	 */
	public String detailsLoad() throws Exception {
		// 人员表
		C_T_Sys_UserExample example = null;
		try {
			example = new C_T_Sys_UserExample();
			example.or().andDeptIdEqualTo(LEAD_DEPT_ID);
			example.setOrderByClause("sort asc");
			list_C_T_Sys_User = mapperU.selectByExample(example);
			//add to youjh 默认是登陆的领导账号
			username = SessionFactory.getSessionUserId();
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
		}
		return SUCCESS;
	}

	/**
	 * 新增及更新
	 * @return
	 * @throws Exception
	 */
	public String detailsUpdate() throws Exception {

		Object[] arrObject = null;
		JSONObject jObject = null;
		B_T_Ufp_LeadWorkManage b_T_Ufp_LeadWorkManage=null;
		B_T_Ufp_LeadWorkManageExample example2 = null;
		try {
			example2 = new B_T_Ufp_LeadWorkManageExample();
			example2.or().andRoleUserIdEqualTo(username);
			mapperLWM.deleteByExample(example2);// 先将之前的记录删除
	
			seldeptsByUser = java.net.URLDecoder.decode(seldeptsByUser,"UTF-8");
			arrObject = JsonTools.getObjectArrayFromJson(seldeptsByUser);
			
			for (int i = 0; i < arrObject.length; i++) {
				jObject = (JSONObject) arrObject[i];
	
				b_T_Ufp_LeadWorkManage = new B_T_Ufp_LeadWorkManage();
				
				C_V_Sys_Usertree Userdata = getUserdata(jObject.getString("id"));
				if(Userdata.getFla()!=null&&Userdata.getFla().equals("3"))
				{
					b_T_Ufp_LeadWorkManage.setUuid(new GUID().toString());
					b_T_Ufp_LeadWorkManage.setDepartmentId(Userdata.getDeptId());
					b_T_Ufp_LeadWorkManage.setRoleUserId(username);
					b_T_Ufp_LeadWorkManage.setUserSysName(Userdata.getId());
					b_T_Ufp_LeadWorkManage.setUnitid(Userdata.getUnitId());
					b_T_Ufp_LeadWorkManage.setIsDelete(0);
					mapperLWM.insertSelective(b_T_Ufp_LeadWorkManage);
				}
			}
			jsonResult = "true";
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			arrObject = null;
			jObject = null;
			b_T_Ufp_LeadWorkManage=null;
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
	public C_V_Sys_Usertree getUserdata(String userid)throws Exception {
		C_V_Sys_UsertreeExample example = new C_V_Sys_UsertreeExample();
		example.or().andIdEqualTo(userid);
		List<C_V_Sys_Usertree> userlist = mapperUT.selectByExample(example);
		if (userlist.size()>0)
			return (C_V_Sys_Usertree)userlist.get(0);
		else
			return null;		
	}
	
	/**
	 * 领导树
	 * @return
	 * @throws Exception
	 */
	public String leadworkmanagetree()throws Exception {
		// 取得数据连接
		Map<String, Object> map = null;
		map = new HashMap<String, Object>();
		map.put("username", username);
		listLeadWorkManegeleadworkmanagetree = mapperLWMV.selectleadworkmanagetreeByMap(map);
		return SUCCESS;
	}
			
	/*********************************** get--set ************************************************************************************/
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

	public List<C_T_Sys_User> getList_C_T_Sys_User() {
		return list_C_T_Sys_User;
	}

	public void setList_C_T_Sys_User(List<C_T_Sys_User> listCTSysUser) {
		list_C_T_Sys_User = listCTSysUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<B_V_Ufp_LeadWorkManagetree> getListLeadWorkManegeleadworkmanagetree() {
		return listLeadWorkManegeleadworkmanagetree;
	}

	public void setListLeadWorkManegeleadworkmanagetree(
			List<B_V_Ufp_LeadWorkManagetree> listLeadWorkManegeleadworkmanagetree) {
		this.listLeadWorkManegeleadworkmanagetree = listLeadWorkManegeleadworkmanagetree;
	}

}
