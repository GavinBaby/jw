package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Operational_Infor;
import com.jw.baseframe.model.C_T_Sys_Operational_InforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_Operational_InforMapper {
    int countByExample(@Param("example") C_T_Sys_Operational_InforExample example);

    int deleteByExample(@Param("example") C_T_Sys_Operational_InforExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Operational_Infor record);

    int insertSelective(@Param("record") C_T_Sys_Operational_Infor record);

    List<C_T_Sys_Operational_Infor> selectByExample(@Param("example") C_T_Sys_Operational_InforExample example);

    C_T_Sys_Operational_Infor selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Operational_Infor record, @Param("example") C_T_Sys_Operational_InforExample example);

    int updateByExample(@Param("record") C_T_Sys_Operational_Infor record, @Param("example") C_T_Sys_Operational_InforExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Operational_Infor record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Operational_Infor record);
}