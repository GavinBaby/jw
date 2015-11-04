package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Unit;
import com.jw.baseframe.model.C_T_Sys_UnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_UnitMapper {
    int countByExample(@Param("example") C_T_Sys_UnitExample example);

    int deleteByExample(@Param("example") C_T_Sys_UnitExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Unit record);

    int insertSelective(@Param("record") C_T_Sys_Unit record);

    List<C_T_Sys_Unit> selectByExample(@Param("example") C_T_Sys_UnitExample example);

    C_T_Sys_Unit selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Unit record, @Param("example") C_T_Sys_UnitExample example);

    int updateByExample(@Param("record") C_T_Sys_Unit record, @Param("example") C_T_Sys_UnitExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Unit record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Unit record);
}