package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Sy_Module_User;
import com.jw.baseframe.model.C_T_Sys_Sy_Module_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_Sy_Module_UserMapper {
    int countByExample(@Param("example") C_T_Sys_Sy_Module_UserExample example);

    int deleteByExample(@Param("example") C_T_Sys_Sy_Module_UserExample example);

    int insert(@Param("record") C_T_Sys_Sy_Module_User record);

    int insertSelective(@Param("record") C_T_Sys_Sy_Module_User record);

    List<C_T_Sys_Sy_Module_User> selectByExample(@Param("example") C_T_Sys_Sy_Module_UserExample example);

    int updateByExampleSelective(@Param("record") C_T_Sys_Sy_Module_User record, @Param("example") C_T_Sys_Sy_Module_UserExample example);

    int updateByExample(@Param("record") C_T_Sys_Sy_Module_User record, @Param("example") C_T_Sys_Sy_Module_UserExample example);
}