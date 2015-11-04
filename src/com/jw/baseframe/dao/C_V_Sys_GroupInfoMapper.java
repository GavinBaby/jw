package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_GroupInfo;
import com.jw.baseframe.model.C_V_Sys_GroupInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_GroupInfoMapper {
    int countByExample(@Param("example") C_V_Sys_GroupInfoExample example);

    int deleteByExample(@Param("example") C_V_Sys_GroupInfoExample example);

    int insert(@Param("record") C_V_Sys_GroupInfo record);

    int insertSelective(@Param("record") C_V_Sys_GroupInfo record);

    List<C_V_Sys_GroupInfo> selectByExample(@Param("example") C_V_Sys_GroupInfoExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_GroupInfo record, @Param("example") C_V_Sys_GroupInfoExample example);

    int updateByExample(@Param("record") C_V_Sys_GroupInfo record, @Param("example") C_V_Sys_GroupInfoExample example);
}