package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Usertree;
import com.jw.baseframe.model.C_V_Sys_UsertreeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_UsertreeMapper {
    int countByExample(@Param("example") C_V_Sys_UsertreeExample example);

    int deleteByExample(@Param("example") C_V_Sys_UsertreeExample example);

    int insert(@Param("record") C_V_Sys_Usertree record);

    int insertSelective(@Param("record") C_V_Sys_Usertree record);

    List<C_V_Sys_Usertree> selectByExample(@Param("example") C_V_Sys_UsertreeExample example);
    
    List<C_V_Sys_Usertree> selectRoleUserByMap(Map<String, Object> map);
    
    List<C_V_Sys_Usertree> selectGroupUserByMap(Map<String, Object> map);
    
    List<C_V_Sys_Usertree> selectMailUserByMap(Map<String, Object> map);
    
    List<C_V_Sys_Usertree> selectTacheUserByMap(Map<String, Object> map);

    int updateByExampleSelective(@Param("record") C_V_Sys_Usertree record, @Param("example") C_V_Sys_UsertreeExample example);

    int updateByExample(@Param("record") C_V_Sys_Usertree record, @Param("example") C_V_Sys_UsertreeExample example);
}