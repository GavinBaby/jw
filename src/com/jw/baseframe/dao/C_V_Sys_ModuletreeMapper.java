package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Moduletree;
import com.jw.baseframe.model.C_V_Sys_ModuletreeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_ModuletreeMapper {
    int countByExample(@Param("example") C_V_Sys_ModuletreeExample example);

    int deleteByExample(@Param("example") C_V_Sys_ModuletreeExample example);

    int insert(@Param("record") C_V_Sys_Moduletree record);

    int insertSelective(@Param("record") C_V_Sys_Moduletree record);

    List<C_V_Sys_Moduletree> selectByExample(@Param("example") C_V_Sys_ModuletreeExample example);
    
    List<C_V_Sys_Moduletree> selectGroupModuleByMap(Map<String, Object> map);

    int updateByExampleSelective(@Param("record") C_V_Sys_Moduletree record, @Param("example") C_V_Sys_ModuletreeExample example);

    int updateByExample(@Param("record") C_V_Sys_Moduletree record, @Param("example") C_V_Sys_ModuletreeExample example);
}