package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Pluralism;
import com.jw.baseframe.model.C_T_Sys_PluralismExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_PluralismMapper {
    int countByExample(@Param("example") C_T_Sys_PluralismExample example);

    int deleteByExample(@Param("example") C_T_Sys_PluralismExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Pluralism record);

    int insertSelective(@Param("record") C_T_Sys_Pluralism record);

    List<C_T_Sys_Pluralism> selectByExample(@Param("example") C_T_Sys_PluralismExample example);

    C_T_Sys_Pluralism selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Pluralism record, @Param("example") C_T_Sys_PluralismExample example);

    int updateByExample(@Param("record") C_T_Sys_Pluralism record, @Param("example") C_T_Sys_PluralismExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Pluralism record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Pluralism record);
}