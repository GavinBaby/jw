package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Maintain;
import com.jw.baseframe.model.C_T_Sys_MaintainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_MaintainMapper {
    int countByExample(@Param("example") C_T_Sys_MaintainExample example);

    int deleteByExample(@Param("example") C_T_Sys_MaintainExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Maintain record);

    int insertSelective(@Param("record") C_T_Sys_Maintain record);

    List<C_T_Sys_Maintain> selectByExample(@Param("example") C_T_Sys_MaintainExample example);

    C_T_Sys_Maintain selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Maintain record, @Param("example") C_T_Sys_MaintainExample example);

    int updateByExample(@Param("record") C_T_Sys_Maintain record, @Param("example") C_T_Sys_MaintainExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Maintain record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Maintain record);
}