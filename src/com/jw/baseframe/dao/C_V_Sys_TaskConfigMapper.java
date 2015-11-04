package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_TaskConfig;
import com.jw.baseframe.model.C_V_Sys_TaskConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_TaskConfigMapper {
    int countByExample(@Param("example") C_V_Sys_TaskConfigExample example);

    int deleteByExample(@Param("example") C_V_Sys_TaskConfigExample example);

    int insert(@Param("record") C_V_Sys_TaskConfig record);

    int insertSelective(@Param("record") C_V_Sys_TaskConfig record);

    List<C_V_Sys_TaskConfig> selectByExample(@Param("example") C_V_Sys_TaskConfigExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_TaskConfig record, @Param("example") C_V_Sys_TaskConfigExample example);

    int updateByExample(@Param("record") C_V_Sys_TaskConfig record, @Param("example") C_V_Sys_TaskConfigExample example);
}