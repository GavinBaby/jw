package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_SmSend;
import com.jw.baseframe.model.C_T_Sys_SmSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_SmSendMapper {
    int countByExample(@Param("example") C_T_Sys_SmSendExample example);

    int deleteByExample(@Param("example") C_T_Sys_SmSendExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_SmSend record);

    int insertSelective(@Param("record") C_T_Sys_SmSend record);

    List<C_T_Sys_SmSend> selectByExample(@Param("example") C_T_Sys_SmSendExample example);

    C_T_Sys_SmSend selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_SmSend record, @Param("example") C_T_Sys_SmSendExample example);

    int updateByExample(@Param("record") C_T_Sys_SmSend record, @Param("example") C_T_Sys_SmSendExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_SmSend record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_SmSend record);
}