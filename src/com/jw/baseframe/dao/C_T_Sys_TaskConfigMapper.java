package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_TaskConfig;
import com.jw.baseframe.model.C_T_Sys_TaskConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_TaskConfigMapper {
    int countByExample(@Param("example") C_T_Sys_TaskConfigExample example);

    int deleteByExample(@Param("example") C_T_Sys_TaskConfigExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_TaskConfig record);

    int insertSelective(@Param("record") C_T_Sys_TaskConfig record);

    List<C_T_Sys_TaskConfig> selectByExample(@Param("example") C_T_Sys_TaskConfigExample example);

    C_T_Sys_TaskConfig selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_TaskConfig record, @Param("example") C_T_Sys_TaskConfigExample example);

    int updateByExample(@Param("record") C_T_Sys_TaskConfig record, @Param("example") C_T_Sys_TaskConfigExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_TaskConfig record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_TaskConfig record);
}