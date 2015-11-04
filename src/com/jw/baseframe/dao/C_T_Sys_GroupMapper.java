package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Group;
import com.jw.baseframe.model.C_T_Sys_GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_GroupMapper {
    int countByExample(@Param("example") C_T_Sys_GroupExample example);

    int deleteByExample(@Param("example") C_T_Sys_GroupExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Group record);

    int insertSelective(@Param("record") C_T_Sys_Group record);

    List<C_T_Sys_Group> selectByExample(@Param("example") C_T_Sys_GroupExample example);

    C_T_Sys_Group selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Group record, @Param("example") C_T_Sys_GroupExample example);

    int updateByExample(@Param("record") C_T_Sys_Group record, @Param("example") C_T_Sys_GroupExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Group record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Group record);
}