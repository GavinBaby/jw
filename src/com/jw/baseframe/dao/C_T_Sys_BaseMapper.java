package com.jw.baseframe.dao;

import java.util.Map;

 
public interface C_T_Sys_BaseMapper {

	/**
	* Update语句从CUDTemplate类中生成
	* @param obj
	*/
	public void isDeleteUpdate(Map<String, Object> map);
	/**
	* Delete语句从CUDTemplate类中生成
	* @param obj
	*/
	public void factDelete(Map<String, Object> map);
	
	
}
