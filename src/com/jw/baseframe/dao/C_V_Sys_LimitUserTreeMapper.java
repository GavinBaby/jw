package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Sys_LimitUserTree;
import com.jw.baseframe.model.C_V_Sys_LimitUserTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Sys_LimitUserTreeMapper {
    int countByExample(@Param("example") C_V_Sys_LimitUserTreeExample example);

    int deleteByExample(@Param("example") C_V_Sys_LimitUserTreeExample example);

    int insert(@Param("record") C_V_Sys_LimitUserTree record);

    int insertSelective(@Param("record") C_V_Sys_LimitUserTree record);

    List<C_V_Sys_LimitUserTree> selectByExample(@Param("example") C_V_Sys_LimitUserTreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Sys_LimitUserTree record, @Param("example") C_V_Sys_LimitUserTreeExample example);

    int updateByExample(@Param("record") C_V_Sys_LimitUserTree record, @Param("example") C_V_Sys_LimitUserTreeExample example);
}