package com.jw.baseframe.dao;

import java.util.Map;

 
public interface C_T_Sys_BaseMapper {

	/**
	* Update����CUDTemplate��������
	* @param obj
	*/
	public void isDeleteUpdate(Map<String, Object> map);
	/**
	* Delete����CUDTemplate��������
	* @param obj
	*/
	public void factDelete(Map<String, Object> map);
	
	
}
