package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_SYS_AdviceDocSyn;
import com.jw.baseframe.model.C_T_SYS_AdviceDocSynExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_SYS_AdviceDocSynMapper {
    int countByExample(@Param("example") C_T_SYS_AdviceDocSynExample example);

    int deleteByExample(@Param("example") C_T_SYS_AdviceDocSynExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_SYS_AdviceDocSyn record);

    int insertSelective(@Param("record") C_T_SYS_AdviceDocSyn record);

    List<C_T_SYS_AdviceDocSyn> selectByExample(@Param("example") C_T_SYS_AdviceDocSynExample example);

    C_T_SYS_AdviceDocSyn selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_SYS_AdviceDocSyn record, @Param("example") C_T_SYS_AdviceDocSynExample example);

    int updateByExample(@Param("record") C_T_SYS_AdviceDocSyn record, @Param("example") C_T_SYS_AdviceDocSynExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_SYS_AdviceDocSyn record);

    int updateByPrimaryKey(@Param("record") C_T_SYS_AdviceDocSyn record);
}