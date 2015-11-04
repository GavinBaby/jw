package com.jw.magicbpm.action.publicinformation;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Materia_ClassMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia_Class;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia_ClassExample;

public class MateriaClassAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * 资料类别管理action
	 */
	private static final long serialVersionUID = 1L;

	
	//模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MATERIA;
	//资料类别详细信息
	private B_T_Ufp_Materia_Class b_T_Ufp_Materia_Class;
	//权限
	private String allPermission;
	// 所有部门信息
	private String selectDeptJson;
	//查询条件
	private String className;
	@Resource
	B_T_Ufp_Materia_ClassMapper mapperMCT;
	/**
	 * 删除数据
	 */
	public String detailsDelete()throws Exception {
			DbOperationFation.deleteByExample("B_T_Ufp_Materia_Class", checkedIds,
					moduleId);
			sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
			return SUCCESS;
	}

	/**
	 * 详细画面加载
	 * 
	 */
	public String detailsLoad()throws Exception {
		allPermission="*";

		if (StringTools.isNullOrNoValue(mainDocId)) {
			b_T_Ufp_Materia_Class = new B_T_Ufp_Materia_Class();
		} else {
			b_T_Ufp_Materia_Class = mapperMCT.selectByPrimaryKey(mainDocId);
			// 取得更新时间
			getDocUpdateTime("B_T_Ufp_Materia_Class");	
		}
		
		selectDeptJson = DbOperationFation.getSelectDataForJson(
				"C_T_SYS_DEPARTMENT", "PAREN_DEPTID", "UUID", "DEPT_NAME",
				"IS_DELETE = 0 ");
		return SUCCESS;
	}

	
	/**
	 * 更新/新增数据
	 */
	public String detailsUpdate()throws Exception {
		String returnMsg = "";

		if (StringTools.isNullOrNoValue(mainDocId)){
			b_T_Ufp_Materia_Class.setUuid(new GUID().toString());
			mapperMCT.insertSelective(b_T_Ufp_Materia_Class);
			returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
		}else{
			//判断是否有人编辑过
			if (isDocUpdated("b_t_ufp_materia_class")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				mapperMCT.updateByPrimaryKeySelective(b_T_Ufp_Materia_Class);
				returnMsg=Constants.UPDATE_SUCCESSFUL_MSG;
			}
		}
		sucessMessage(returnMsg);	

		return SUCCESS;
	}
	
	/**
	 * 列表画面加载
	 */
	public String listLoad() {

		return SUCCESS;
	}
		
	/**
	 * Grid数据加载
	 */
	public String gridLoad() throws Exception {
		B_T_Ufp_Materia_ClassExample example = null;
		B_T_Ufp_Materia_ClassExample.Criteria criteria = null;
		try {
			example = new B_T_Ufp_Materia_ClassExample();
			criteria = example.createCriteria();
			if (StringTools.isNotNullAndHasValue(className)) {
				criteria.andClassnameLike("%" + className + "%");
			}
			criteria.andIsDeleteEqualTo(0);
			// 取得总的记录条数
			total = mapperMCT.countByExample(example);
			//分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("sort");
			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperMCT
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
	//==============================get/set==============================
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public B_T_Ufp_Materia_Class getB_T_Ufp_Materia_Class() {
		return b_T_Ufp_Materia_Class;
	}

	public void setB_T_Ufp_Materia_Class(B_T_Ufp_Materia_Class bTUfpMateriaClass) {
		b_T_Ufp_Materia_Class = bTUfpMateriaClass;
	}

	public String getSelectDeptJson() {
		return selectDeptJson;
	}

	public void setSelectDeptJson(String selectDeptJson) {
		this.selectDeptJson = selectDeptJson;
	}

	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}
}
