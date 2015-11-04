package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_Tache_Roleuser;
import com.jw.baseframe.model.C_V_Flow_Tache_RoleuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_Tache_RoleuserMapper {
    int countByExample(@Param("example") C_V_Flow_Tache_RoleuserExample example);

    int deleteByExample(@Param("example") C_V_Flow_Tache_RoleuserExample example);

    int insert(@Param("record") C_V_Flow_Tache_Roleuser record);

    int insertSelective(@Param("record") C_V_Flow_Tache_Roleuser record);

    List<C_V_Flow_Tache_Roleuser> selectByExample(@Param("example") C_V_Flow_Tache_RoleuserExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_Tache_Roleuser record, @Param("example") C_V_Flow_Tache_RoleuserExample example);

    int updateByExample(@Param("record") C_V_Flow_Tache_Roleuser record, @Param("example") C_V_Flow_Tache_RoleuserExample example);
}