package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_UnitModuleTree;
import com.jw.baseframe.model.C_V_Sys_UnitModuleTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_UnitModuleTreeMapper {
    int countByExample(@Param("example") C_V_Sys_UnitModuleTreeExample example);

    int deleteByExample(@Param("example") C_V_Sys_UnitModuleTreeExample example);

    int insert(@Param("record") C_V_Sys_UnitModuleTree record);

    int insertSelective(@Param("record") C_V_Sys_UnitModuleTree record);

    List<C_V_Sys_UnitModuleTree> selectByExample(@Param("example") C_V_Sys_UnitModuleTreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_UnitModuleTree record, @Param("example") C_V_Sys_UnitModuleTreeExample example);

    int updateByExample(@Param("record") C_V_Sys_UnitModuleTree record, @Param("example") C_V_Sys_UnitModuleTreeExample example);
}