package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Pluralism;
import com.jw.baseframe.model.C_V_Sys_PluralismExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_PluralismMapper {
    int countByExample(@Param("example") C_V_Sys_PluralismExample example);

    int deleteByExample(@Param("example") C_V_Sys_PluralismExample example);

    int insert(@Param("record") C_V_Sys_Pluralism record);

    int insertSelective(@Param("record") C_V_Sys_Pluralism record);

    List<C_V_Sys_Pluralism> selectByExample(@Param("example") C_V_Sys_PluralismExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Pluralism record, @Param("example") C_V_Sys_PluralismExample example);

    int updateByExample(@Param("record") C_V_Sys_Pluralism record, @Param("example") C_V_Sys_PluralismExample example);
}