package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_SYS_OfficialDocSyn;
import com.jw.baseframe.model.C_T_SYS_OfficialDocSynExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_SYS_OfficialDocSynMapper {
    int countByExample(@Param("example") C_T_SYS_OfficialDocSynExample example);

    int deleteByExample(@Param("example") C_T_SYS_OfficialDocSynExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_SYS_OfficialDocSyn record);

    int insertSelective(@Param("record") C_T_SYS_OfficialDocSyn record);

    List<C_T_SYS_OfficialDocSyn> selectByExample(@Param("example") C_T_SYS_OfficialDocSynExample example);

    C_T_SYS_OfficialDocSyn selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_SYS_OfficialDocSyn record, @Param("example") C_T_SYS_OfficialDocSynExample example);

    int updateByExample(@Param("record") C_T_SYS_OfficialDocSyn record, @Param("example") C_T_SYS_OfficialDocSynExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_SYS_OfficialDocSyn record);

    int updateByPrimaryKey(@Param("record") C_T_SYS_OfficialDocSyn record);
}