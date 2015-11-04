package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_File;
import com.jw.baseframe.model.C_T_Sys_FileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_FileMapper {
    int countByExample(@Param("example") C_T_Sys_FileExample example);

    int deleteByExample(@Param("example") C_T_Sys_FileExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_File record);

    int insertSelective(@Param("record") C_T_Sys_File record);

    List<C_T_Sys_File> selectByExample(@Param("example") C_T_Sys_FileExample example);

    C_T_Sys_File selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_File record, @Param("example") C_T_Sys_FileExample example);

    int updateByExample(@Param("record") C_T_Sys_File record, @Param("example") C_T_Sys_FileExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_File record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_File record);
}