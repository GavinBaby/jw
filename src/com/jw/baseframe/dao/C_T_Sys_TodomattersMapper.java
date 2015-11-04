package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Todomatters;
import com.jw.baseframe.model.C_T_Sys_TodomattersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_TodomattersMapper {
    int countByExample(@Param("example") C_T_Sys_TodomattersExample example);

    int deleteByExample(@Param("example") C_T_Sys_TodomattersExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Todomatters record);

    int insertSelective(@Param("record") C_T_Sys_Todomatters record);

    List<C_T_Sys_Todomatters> selectByExample(@Param("example") C_T_Sys_TodomattersExample example);

    C_T_Sys_Todomatters selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Todomatters record, @Param("example") C_T_Sys_TodomattersExample example);

    int updateByExample(@Param("record") C_T_Sys_Todomatters record, @Param("example") C_T_Sys_TodomattersExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Todomatters record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Todomatters record);
}