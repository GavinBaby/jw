package com.jw.baseframe.util;

import java.util.List;

import com.jw.baseframe.common.bean.BeanLocator;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.dao.C_T_Sys_Group_ModuleMapper;
import com.jw.baseframe.dao.C_V_Sys_GroupInfoMapper;
import com.jw.baseframe.dao.C_V_Sys_Unit_ModuleMapper;
import com.jw.baseframe.model.C_T_Sys_Group_Module;
import com.jw.baseframe.model.C_T_Sys_Group_ModuleExample;
import com.jw.baseframe.model.C_V_Sys_GroupInfo;
import com.jw.baseframe.model.C_V_Sys_GroupInfoExample;
import com.jw.baseframe.model.C_V_Sys_Unit_Module;
import com.jw.baseframe.model.C_V_Sys_Unit_ModuleExample;

public class PermissionsTools {
	private static C_V_Sys_Unit_ModuleMapper mapperM = (C_V_Sys_Unit_ModuleMapper) BeanLocator
			.getService("c_V_Sys_Unit_ModuleMapper");
	private static C_V_Sys_GroupInfoMapper mapperG = (C_V_Sys_GroupInfoMapper) BeanLocator
			.getService("c_V_Sys_GroupInfoMapper");
	private static C_T_Sys_Group_ModuleMapper mapperGM = (C_T_Sys_Group_ModuleMapper) BeanLocator
			.getService("c_T_Sys_Group_ModuleMapper");
	private static List<C_V_Sys_Unit_Module> unitModuleList;

	/**
	 * @author youjh
	 * @param userType
	 *            2：超级管理员 1：管理员 0：普通用户
	 * @return 头模块树
	 */

	public static List<C_V_Sys_Unit_Module> getModuleTree(Integer userType) {
		C_V_Sys_Unit_ModuleExample example = null;
		C_V_Sys_GroupInfoExample exampleG = null;
		C_T_Sys_Group_ModuleExample exampleGM = null;
		try {
			String strUnitId = SessionFactory.getSessionUnitId();
			example = new C_V_Sys_Unit_ModuleExample();
			exampleG = new C_V_Sys_GroupInfoExample();
			exampleGM = new C_T_Sys_Group_ModuleExample();
			if (userType == 2) {
				example.or().andParenModuleEqualTo("-1")
						.andExpandXmlGreaterThanOrEqualTo("2");
			} else if (userType == 1) {
				example.or().andParenModuleEqualTo("-1")
						.andExpandXmlLessThanOrEqualTo("2").andUnitidEqualTo(
								strUnitId);
				example.or().andParenModuleEqualTo("-1").andUnitidIsNull();
			} else if (userType == 0) {
				example.or().andParenModuleEqualTo("-1")
						.andExpandXmlLessThanOrEqualTo("1").andUnitidEqualTo(
								strUnitId);
				List<C_V_Sys_Unit_Module> unitModuleList = mapperM
						.selectByExample(example);
				exampleG.or().andUserSysNameEqualTo(
						SessionFactory.getSessionUserId());
				List<C_V_Sys_GroupInfo> groupInfoList = mapperG
						.selectByExample(exampleG);
				for (C_V_Sys_GroupInfo groupInfo : groupInfoList) {
					exampleGM.or().andGroupIdEqualTo(groupInfo.getGroupId());
					List<C_T_Sys_Group_Module> groupModuleList = mapperGM.selectByExample(exampleGM);
					for(C_T_Sys_Group_Module gm : groupModuleList){
						example.clear();
						example.or().andModuleIdEqualTo(gm.getModuleId());
						List<C_V_Sys_Unit_Module> list = mapperM.selectByExample(example);
						for(C_V_Sys_Unit_Module m :list){
							for(C_V_Sys_Unit_Module um :unitModuleList){
								if(m.getModuleDescription().indexOf(um.getModuleDescription())>0){
									unitModuleList.add(um);
								}
							}
						}
						
					}
				}

			}
			unitModuleList = mapperM.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			exampleG = null;
			example = null;
		}
		return unitModuleList;

	}

}
