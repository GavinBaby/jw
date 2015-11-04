package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Login_Log;
import com.jw.baseframe.model.C_V_Sys_Login_LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_Login_LogMapper {
    int countByExample(@Param("example") C_V_Sys_Login_LogExample example);

    int deleteByExample(@Param("example") C_V_Sys_Login_LogExample example);

    int insert(@Param("record") C_V_Sys_Login_Log record);

    int insertSelective(@Param("record") C_V_Sys_Login_Log record);

    List<C_V_Sys_Login_Log> selectByExample(@Param("example") C_V_Sys_Login_LogExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Login_Log record, @Param("example") C_V_Sys_Login_LogExample example);

    int updateByExample(@Param("record") C_V_Sys_Login_Log record, @Param("example") C_V_Sys_Login_LogExample example);
}