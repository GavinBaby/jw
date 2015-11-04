package com.jw.baseframe.dao;

import java.util.List;
import java.util.Map;

import com.jw.baseframe.model.C_T_Sys_BasePortlet;

 
public interface C_T_Sys_BasePortletMapper {

	   List<C_T_Sys_BasePortlet> selectByExample(Map<String, Object> map);
	
	   int countByExample(Map<String, Object> map);
	   
}
