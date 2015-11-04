package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Errorlog_Infor;
import com.jw.baseframe.model.C_T_Sys_Errorlog_InforExample;
import com.jw.baseframe.model.C_T_Sys_Errorlog_InforWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_Errorlog_InforMapper {
    int countByExample(@Param("example") C_T_Sys_Errorlog_InforExample example);

    int deleteByExample(@Param("example") C_T_Sys_Errorlog_InforExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Errorlog_InforWithBLOBs record);

    int insertSelective(@Param("record") C_T_Sys_Errorlog_InforWithBLOBs record);

    List<C_T_Sys_Errorlog_InforWithBLOBs> selectByExampleWithBLOBs(@Param("example") C_T_Sys_Errorlog_InforExample example);

    List<C_T_Sys_Errorlog_Infor> selectByExample(@Param("example") C_T_Sys_Errorlog_InforExample example);

    C_T_Sys_Errorlog_InforWithBLOBs selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Errorlog_InforWithBLOBs record, @Param("example") C_T_Sys_Errorlog_InforExample example);

    int updateByExampleWithBLOBs(@Param("record") C_T_Sys_Errorlog_InforWithBLOBs record, @Param("example") C_T_Sys_Errorlog_InforExample example);

    int updateByExample(@Param("record") C_T_Sys_Errorlog_Infor record, @Param("example") C_T_Sys_Errorlog_InforExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Errorlog_InforWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") C_T_Sys_Errorlog_InforWithBLOBs record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Errorlog_Infor record);
}