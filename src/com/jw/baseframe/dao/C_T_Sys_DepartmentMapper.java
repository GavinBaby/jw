package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Department;
import com.jw.baseframe.model.C_T_Sys_DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_DepartmentMapper {
    int countByExample(@Param("example") C_T_Sys_DepartmentExample example);

    int deleteByExample(@Param("example") C_T_Sys_DepartmentExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Department record);

    int insertSelective(@Param("record") C_T_Sys_Department record);

    List<C_T_Sys_Department> selectByExample(@Param("example") C_T_Sys_DepartmentExample example);

    C_T_Sys_Department selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Department record, @Param("example") C_T_Sys_DepartmentExample example);

    int updateByExample(@Param("record") C_T_Sys_Department record, @Param("example") C_T_Sys_DepartmentExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Department record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Department record);
}