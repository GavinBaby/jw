package com.jw.baseframe.dao;

import java.util.List;
import java.util.Map;

import com.jw.baseframe.model.C_T_Sys_BaseSelect;

 
public interface C_T_Sys_BaseSelectMapper {

	   List<C_T_Sys_BaseSelect> selectByExample(Map<String, Object> map);
	
	   int countByExample(Map<String, Object> map);
	   
	   String getUpdateTime(Map<String, Object> map);
	   
}
