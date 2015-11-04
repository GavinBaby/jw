package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Logininfo;
import com.jw.baseframe.model.C_V_Sys_LogininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_LogininfoMapper {
    int countByExample(@Param("example") C_V_Sys_LogininfoExample example);

    int deleteByExample(@Param("example") C_V_Sys_LogininfoExample example);

    int insert(@Param("record") C_V_Sys_Logininfo record);

    int insertSelective(@Param("record") C_V_Sys_Logininfo record);

    List<C_V_Sys_Logininfo> selectByExample(@Param("example") C_V_Sys_LogininfoExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Logininfo record, @Param("example") C_V_Sys_LogininfoExample example);

    int updateByExample(@Param("record") C_V_Sys_Logininfo record, @Param("example") C_V_Sys_LogininfoExample example);
}