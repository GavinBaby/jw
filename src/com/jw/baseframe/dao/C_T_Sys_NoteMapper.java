package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Note;
import com.jw.baseframe.model.C_T_Sys_NoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_NoteMapper {
    int countByExample(@Param("example") C_T_Sys_NoteExample example);

    int deleteByExample(@Param("example") C_T_Sys_NoteExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Note record);

    int insertSelective(@Param("record") C_T_Sys_Note record);

    List<C_T_Sys_Note> selectByExampleWithBLOBs(@Param("example") C_T_Sys_NoteExample example);

    List<C_T_Sys_Note> selectByExample(@Param("example") C_T_Sys_NoteExample example);

    C_T_Sys_Note selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Note record, @Param("example") C_T_Sys_NoteExample example);

    int updateByExampleWithBLOBs(@Param("record") C_T_Sys_Note record, @Param("example") C_T_Sys_NoteExample example);

    int updateByExample(@Param("record") C_T_Sys_Note record, @Param("example") C_T_Sys_NoteExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Note record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") C_T_Sys_Note record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Note record);
}