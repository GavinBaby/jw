package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_SYS_OfficialDocFileSyn;
import com.jw.baseframe.model.C_T_SYS_OfficialDocFileSynExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_SYS_OfficialDocFileSynMapper {
    int countByExample(@Param("example") C_T_SYS_OfficialDocFileSynExample example);

    int deleteByExample(@Param("example") C_T_SYS_OfficialDocFileSynExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_SYS_OfficialDocFileSyn record);

    int insertSelective(@Param("record") C_T_SYS_OfficialDocFileSyn record);

    List<C_T_SYS_OfficialDocFileSyn> selectByExample(@Param("example") C_T_SYS_OfficialDocFileSynExample example);

    C_T_SYS_OfficialDocFileSyn selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_SYS_OfficialDocFileSyn record, @Param("example") C_T_SYS_OfficialDocFileSynExample example);

    int updateByExample(@Param("record") C_T_SYS_OfficialDocFileSyn record, @Param("example") C_T_SYS_OfficialDocFileSynExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_SYS_OfficialDocFileSyn record);

    int updateByPrimaryKey(@Param("record") C_T_SYS_OfficialDocFileSyn record);
}