package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_TaskTimer;
import com.jw.baseframe.model.C_T_Sys_TaskTimerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_TaskTimerMapper {
    int countByExample(@Param("example") C_T_Sys_TaskTimerExample example);

    int deleteByExample(@Param("example") C_T_Sys_TaskTimerExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_TaskTimer record);

    int insertSelective(@Param("record") C_T_Sys_TaskTimer record);

    List<C_T_Sys_TaskTimer> selectByExample(@Param("example") C_T_Sys_TaskTimerExample example);

    C_T_Sys_TaskTimer selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_TaskTimer record, @Param("example") C_T_Sys_TaskTimerExample example);

    int updateByExample(@Param("record") C_T_Sys_TaskTimer record, @Param("example") C_T_Sys_TaskTimerExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_TaskTimer record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_TaskTimer record);
}