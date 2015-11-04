package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_SYS_AdviceUserSyn;
import com.jw.baseframe.model.C_T_SYS_AdviceUserSynExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_SYS_AdviceUserSynMapper {
    int countByExample(@Param("example") C_T_SYS_AdviceUserSynExample example);

    int deleteByExample(@Param("example") C_T_SYS_AdviceUserSynExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_SYS_AdviceUserSyn record);

    int insertSelective(@Param("record") C_T_SYS_AdviceUserSyn record);

    List<C_T_SYS_AdviceUserSyn> selectByExample(@Param("example") C_T_SYS_AdviceUserSynExample example);

    C_T_SYS_AdviceUserSyn selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_SYS_AdviceUserSyn record, @Param("example") C_T_SYS_AdviceUserSynExample example);

    int updateByExample(@Param("record") C_T_SYS_AdviceUserSyn record, @Param("example") C_T_SYS_AdviceUserSynExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_SYS_AdviceUserSyn record);

    int updateByPrimaryKey(@Param("record") C_T_SYS_AdviceUserSyn record);
}