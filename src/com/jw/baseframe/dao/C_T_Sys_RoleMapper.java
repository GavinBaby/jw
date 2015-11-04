package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Role;
import com.jw.baseframe.model.C_T_Sys_RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_RoleMapper {
    int countByExample(@Param("example") C_T_Sys_RoleExample example);

    int deleteByExample(@Param("example") C_T_Sys_RoleExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Role record);

    int insertSelective(@Param("record") C_T_Sys_Role record);

    List<C_T_Sys_Role> selectByExample(@Param("example") C_T_Sys_RoleExample example);

    C_T_Sys_Role selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Role record, @Param("example") C_T_Sys_RoleExample example);

    int updateByExample(@Param("record") C_T_Sys_Role record, @Param("example") C_T_Sys_RoleExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Role record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Role record);
}