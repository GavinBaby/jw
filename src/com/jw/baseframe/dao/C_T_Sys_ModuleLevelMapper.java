package com.jw.baseframe.dao;

import java.util.List;
import java.util.Map;

import com.jw.baseframe.model.C_T_Sys_ModuleLevel;

 
public interface C_T_Sys_ModuleLevelMapper {

	   List<C_T_Sys_ModuleLevel> selectByExample(Map<String, Object> map);
	  
}
