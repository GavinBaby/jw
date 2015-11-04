package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Donematters;
import com.jw.baseframe.model.C_T_Sys_DonemattersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_DonemattersMapper {
    int countByExample(@Param("example") C_T_Sys_DonemattersExample example);

    int deleteByExample(@Param("example") C_T_Sys_DonemattersExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Donematters record);

    int insertSelective(@Param("record") C_T_Sys_Donematters record);

    List<C_T_Sys_Donematters> selectByExample(@Param("example") C_T_Sys_DonemattersExample example);

    C_T_Sys_Donematters selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Donematters record, @Param("example") C_T_Sys_DonemattersExample example);

    int updateByExample(@Param("record") C_T_Sys_Donematters record, @Param("example") C_T_Sys_DonemattersExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Donematters record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Donematters record);
}