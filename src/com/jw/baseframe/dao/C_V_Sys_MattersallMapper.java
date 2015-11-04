package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Mattersall;
import com.jw.baseframe.model.C_V_Sys_MattersallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_MattersallMapper {
    int countByExample(@Param("example") C_V_Sys_MattersallExample example);

    int deleteByExample(@Param("example") C_V_Sys_MattersallExample example);

    int insert(@Param("record") C_V_Sys_Mattersall record);

    int insertSelective(@Param("record") C_V_Sys_Mattersall record);

    List<C_V_Sys_Mattersall> selectByExample(@Param("example") C_V_Sys_MattersallExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Mattersall record, @Param("example") C_V_Sys_MattersallExample example);

    int updateByExample(@Param("record") C_V_Sys_Mattersall record, @Param("example") C_V_Sys_MattersallExample example);
}