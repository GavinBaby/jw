package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Sy_Module_Usertree;
import com.jw.baseframe.model.C_V_Sys_Sy_Module_UsertreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_Sy_Module_UsertreeMapper {
    int countByExample(@Param("example") C_V_Sys_Sy_Module_UsertreeExample example);

    int deleteByExample(@Param("example") C_V_Sys_Sy_Module_UsertreeExample example);

    int insert(@Param("record") C_V_Sys_Sy_Module_Usertree record);

    int insertSelective(@Param("record") C_V_Sys_Sy_Module_Usertree record);

    List<C_V_Sys_Sy_Module_Usertree> selectByExample(@Param("example") C_V_Sys_Sy_Module_UsertreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Sy_Module_Usertree record, @Param("example") C_V_Sys_Sy_Module_UsertreeExample example);

    int updateByExample(@Param("record") C_V_Sys_Sy_Module_Usertree record, @Param("example") C_V_Sys_Sy_Module_UsertreeExample example);
}