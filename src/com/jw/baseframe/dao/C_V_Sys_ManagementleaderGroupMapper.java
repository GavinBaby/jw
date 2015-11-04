package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_ManagementleaderGroup;
import com.jw.baseframe.model.C_V_Sys_ManagementleaderGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_ManagementleaderGroupMapper {
    int countByExample(@Param("example") C_V_Sys_ManagementleaderGroupExample example);

    int deleteByExample(@Param("example") C_V_Sys_ManagementleaderGroupExample example);

    int insert(@Param("record") C_V_Sys_ManagementleaderGroup record);

    int insertSelective(@Param("record") C_V_Sys_ManagementleaderGroup record);

    List<C_V_Sys_ManagementleaderGroup> selectByExample(@Param("example") C_V_Sys_ManagementleaderGroupExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_ManagementleaderGroup record, @Param("example") C_V_Sys_ManagementleaderGroupExample example);

    int updateByExample(@Param("record") C_V_Sys_ManagementleaderGroup record, @Param("example") C_V_Sys_ManagementleaderGroupExample example);
}