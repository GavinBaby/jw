package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Maintain_Show;
import com.jw.baseframe.model.C_T_Sys_Maintain_ShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_Maintain_ShowMapper {
    int countByExample(@Param("example") C_T_Sys_Maintain_ShowExample example);

    int deleteByExample(@Param("example") C_T_Sys_Maintain_ShowExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Maintain_Show record);

    int insertSelective(@Param("record") C_T_Sys_Maintain_Show record);

    List<C_T_Sys_Maintain_Show> selectByExample(@Param("example") C_T_Sys_Maintain_ShowExample example);

    C_T_Sys_Maintain_Show selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Maintain_Show record, @Param("example") C_T_Sys_Maintain_ShowExample example);

    int updateByExample(@Param("record") C_T_Sys_Maintain_Show record, @Param("example") C_T_Sys_Maintain_ShowExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Maintain_Show record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Maintain_Show record);
}