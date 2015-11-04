package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_User;
import com.jw.baseframe.model.C_T_Sys_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_UserMapper {
    int countByExample(@Param("example") C_T_Sys_UserExample example);

    int deleteByExample(@Param("example") C_T_Sys_UserExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_User record);

    int insertSelective(@Param("record") C_T_Sys_User record);

    List<C_T_Sys_User> selectByExample(@Param("example") C_T_Sys_UserExample example);

    C_T_Sys_User selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_User record, @Param("example") C_T_Sys_UserExample example);

    int updateByExample(@Param("record") C_T_Sys_User record, @Param("example") C_T_Sys_UserExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_User record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_User record);
}