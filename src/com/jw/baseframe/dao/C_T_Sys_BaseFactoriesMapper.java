package com.jw.baseframe.dao;

import java.util.List;
import java.util.Map;

import com.jw.baseframe.model.C_T_Sys_BaseFactories;


 
public interface C_T_Sys_BaseFactoriesMapper {

	   List<C_T_Sys_BaseFactories> selectByExample(Map<String, Object> map);
	   
}
