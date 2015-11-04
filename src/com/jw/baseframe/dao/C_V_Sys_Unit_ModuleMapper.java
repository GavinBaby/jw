package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Unit_Module;
import com.jw.baseframe.model.C_V_Sys_Unit_ModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_Unit_ModuleMapper {
    int countByExample(@Param("example") C_V_Sys_Unit_ModuleExample example);

    int deleteByExample(@Param("example") C_V_Sys_Unit_ModuleExample example);

    int insert(@Param("record") C_V_Sys_Unit_Module record);

    int insertSelective(@Param("record") C_V_Sys_Unit_Module record);

    List<C_V_Sys_Unit_Module> selectByExample(@Param("example") C_V_Sys_Unit_ModuleExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Unit_Module record, @Param("example") C_V_Sys_Unit_ModuleExample example);

    int updateByExample(@Param("record") C_V_Sys_Unit_Module record, @Param("example") C_V_Sys_Unit_ModuleExample example);
}