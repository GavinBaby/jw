package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Flow_History_Tache_Info;
import com.jw.baseframe.model.C_T_Flow_History_Tache_InfoExample;
import com.jw.baseframe.model.C_T_Flow_History_Tache_InfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Flow_History_Tache_InfoMapper {
    int countByExample(@Param("example") C_T_Flow_History_Tache_InfoExample example);

    int deleteByExample(@Param("example") C_T_Flow_History_Tache_InfoExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Flow_History_Tache_InfoWithBLOBs record);

    int insertSelective(@Param("record") C_T_Flow_History_Tache_InfoWithBLOBs record);

    List<C_T_Flow_History_Tache_InfoWithBLOBs> selectByExampleWithBLOBs(@Param("example") C_T_Flow_History_Tache_InfoExample example);

    List<C_T_Flow_History_Tache_Info> selectByExample(@Param("example") C_T_Flow_History_Tache_InfoExample example);

    C_T_Flow_History_Tache_InfoWithBLOBs selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Flow_History_Tache_InfoWithBLOBs record, @Param("example") C_T_Flow_History_Tache_InfoExample example);

    int updateByExampleWithBLOBs(@Param("record") C_T_Flow_History_Tache_InfoWithBLOBs record, @Param("example") C_T_Flow_History_Tache_InfoExample example);

    int updateByExample(@Param("record") C_T_Flow_History_Tache_Info record, @Param("example") C_T_Flow_History_Tache_InfoExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Flow_History_Tache_InfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") C_T_Flow_History_Tache_InfoWithBLOBs record);

    int updateByPrimaryKey(@Param("record") C_T_Flow_History_Tache_Info record);
}