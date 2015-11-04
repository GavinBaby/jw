package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Todomatters;
import com.jw.baseframe.model.C_V_Sys_TodomattersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_TodomattersMapper {
    int countByExample(@Param("example") C_V_Sys_TodomattersExample example);

    int deleteByExample(@Param("example") C_V_Sys_TodomattersExample example);

    int insert(@Param("record") C_V_Sys_Todomatters record);

    int insertSelective(@Param("record") C_V_Sys_Todomatters record);

    List<C_V_Sys_Todomatters> selectByExample(@Param("example") C_V_Sys_TodomattersExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Todomatters record, @Param("example") C_V_Sys_TodomattersExample example);

    int updateByExample(@Param("record") C_V_Sys_Todomatters record, @Param("example") C_V_Sys_TodomattersExample example);
}