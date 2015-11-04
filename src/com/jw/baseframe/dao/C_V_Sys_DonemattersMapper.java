package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Donematters;
import com.jw.baseframe.model.C_V_Sys_DonemattersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_DonemattersMapper {
    int countByExample(@Param("example") C_V_Sys_DonemattersExample example);

    int deleteByExample(@Param("example") C_V_Sys_DonemattersExample example);

    int insert(@Param("record") C_V_Sys_Donematters record);

    int insertSelective(@Param("record") C_V_Sys_Donematters record);

    List<C_V_Sys_Donematters> selectByExample(@Param("example") C_V_Sys_DonemattersExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Donematters record, @Param("example") C_V_Sys_DonemattersExample example);

    int updateByExample(@Param("record") C_V_Sys_Donematters record, @Param("example") C_V_Sys_DonemattersExample example);
}