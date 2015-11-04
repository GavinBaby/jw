package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Sy_Moduletree;
import com.jw.baseframe.model.C_V_Sys_Sy_ModuletreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_Sy_ModuletreeMapper {
    int countByExample(@Param("example") C_V_Sys_Sy_ModuletreeExample example);

    int deleteByExample(@Param("example") C_V_Sys_Sy_ModuletreeExample example);

    int insert(@Param("record") C_V_Sys_Sy_Moduletree record);

    int insertSelective(@Param("record") C_V_Sys_Sy_Moduletree record);

    List<C_V_Sys_Sy_Moduletree> selectByExample(@Param("example") C_V_Sys_Sy_ModuletreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Sy_Moduletree record, @Param("example") C_V_Sys_Sy_ModuletreeExample example);

    int updateByExample(@Param("record") C_V_Sys_Sy_Moduletree record, @Param("example") C_V_Sys_Sy_ModuletreeExample example);
}