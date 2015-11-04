package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Managementleader;
import com.jw.baseframe.model.C_T_Sys_ManagementleaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_ManagementleaderMapper {
    int countByExample(@Param("example") C_T_Sys_ManagementleaderExample example);

    int deleteByExample(@Param("example") C_T_Sys_ManagementleaderExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Managementleader record);

    int insertSelective(@Param("record") C_T_Sys_Managementleader record);

    List<C_T_Sys_Managementleader> selectByExample(@Param("example") C_T_Sys_ManagementleaderExample example);

    C_T_Sys_Managementleader selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Managementleader record, @Param("example") C_T_Sys_ManagementleaderExample example);

    int updateByExample(@Param("record") C_T_Sys_Managementleader record, @Param("example") C_T_Sys_ManagementleaderExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Managementleader record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Managementleader record);
}