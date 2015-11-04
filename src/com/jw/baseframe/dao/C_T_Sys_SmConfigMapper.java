package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_SmConfig;
import com.jw.baseframe.model.C_T_Sys_SmConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_SmConfigMapper {
    int countByExample(@Param("example") C_T_Sys_SmConfigExample example);

    int deleteByExample(@Param("example") C_T_Sys_SmConfigExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_SmConfig record);

    int insertSelective(@Param("record") C_T_Sys_SmConfig record);

    List<C_T_Sys_SmConfig> selectByExample(@Param("example") C_T_Sys_SmConfigExample example);

    C_T_Sys_SmConfig selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_SmConfig record, @Param("example") C_T_Sys_SmConfigExample example);

    int updateByExample(@Param("record") C_T_Sys_SmConfig record, @Param("example") C_T_Sys_SmConfigExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_SmConfig record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_SmConfig record);
}