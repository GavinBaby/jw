package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_User;
import com.jw.baseframe.model.C_V_Sys_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_UserMapper {
    int countByExample(@Param("example") C_V_Sys_UserExample example);

    int deleteByExample(@Param("example") C_V_Sys_UserExample example);

    int insert(@Param("record") C_V_Sys_User record);

    int insertSelective(@Param("record") C_V_Sys_User record);

    List<C_V_Sys_User> selectByExample(@Param("example") C_V_Sys_UserExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_User record, @Param("example") C_V_Sys_UserExample example);

    int updateByExample(@Param("record") C_V_Sys_User record, @Param("example") C_V_Sys_UserExample example);
}