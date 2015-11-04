package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Sys_Phrase;
import com.jw.baseframe.model.C_T_Sys_PhraseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Sys_PhraseMapper {
    int countByExample(@Param("example") C_T_Sys_PhraseExample example);

    int deleteByExample(@Param("example") C_T_Sys_PhraseExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Sys_Phrase record);

    int insertSelective(@Param("record") C_T_Sys_Phrase record);

    List<C_T_Sys_Phrase> selectByExample(@Param("example") C_T_Sys_PhraseExample example);

    C_T_Sys_Phrase selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Sys_Phrase record, @Param("example") C_T_Sys_PhraseExample example);

    int updateByExample(@Param("record") C_T_Sys_Phrase record, @Param("example") C_T_Sys_PhraseExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Sys_Phrase record);

    int updateByPrimaryKey(@Param("record") C_T_Sys_Phrase record);
}