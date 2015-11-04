package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Menu;
import java.util.List;
import java.util.Map;

public interface C_V_Sys_MenuMapper {

	List<C_V_Sys_Menu> supperAdminSelectByExample(Map<String, Object> map);

	List<C_V_Sys_Menu> adminSelectByExample(Map<String, Object> map);

	List<C_V_Sys_Menu> otherSelectByExample(Map<String, Object> map);

}