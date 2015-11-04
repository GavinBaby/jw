package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_Navigationnotes;
import com.jw.baseframe.model.C_V_Sys_NavigationnotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_NavigationnotesMapper {
    int countByExample(@Param("example") C_V_Sys_NavigationnotesExample example);

    int deleteByExample(@Param("example") C_V_Sys_NavigationnotesExample example);

    int insert(@Param("record") C_V_Sys_Navigationnotes record);

    int insertSelective(@Param("record") C_V_Sys_Navigationnotes record);

    List<C_V_Sys_Navigationnotes> selectByExample(@Param("example") C_V_Sys_NavigationnotesExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_Navigationnotes record, @Param("example") C_V_Sys_NavigationnotesExample example);

    int updateByExample(@Param("record") C_V_Sys_Navigationnotes record, @Param("example") C_V_Sys_NavigationnotesExample example);
}