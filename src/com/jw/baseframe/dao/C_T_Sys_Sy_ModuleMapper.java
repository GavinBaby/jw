package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Sy_Module;
import com.jw.baseframe.model.C_T_Sys_Sy_ModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_Sy_ModuleMapper {
    int countByExample(@Param("example") C_T_Sys_Sy_ModuleExample example);

    int deleteByExample(@Param("example") C_T_Sys_Sy_ModuleExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Sy_Module record);

    int insertSelective(@Param("record") C_T_Sys_Sy_Module record);

    List<C_T_Sys_Sy_Module> selectByExample(@Param("example") C_T_Sys_Sy_ModuleExample example);

    C_T_Sys_Sy_Module selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Sy_Module record, @Param("example") C_T_Sys_Sy_ModuleExample example);

    int updateByExample(@Param("record") C_T_Sys_Sy_Module record, @Param("example") C_T_Sys_Sy_ModuleExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Sy_Module record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Sy_Module record);
}