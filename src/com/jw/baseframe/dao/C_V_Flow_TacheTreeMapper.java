package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_TacheTree;
import com.jw.baseframe.model.C_V_Flow_TacheTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_TacheTreeMapper {
    int countByExample(@Param("example") C_V_Flow_TacheTreeExample example);

    int deleteByExample(@Param("example") C_V_Flow_TacheTreeExample example);

    int insert(@Param("record") C_V_Flow_TacheTree record);

    int insertSelective(@Param("record") C_V_Flow_TacheTree record);

    List<C_V_Flow_TacheTree> selectByExample(@Param("example") C_V_Flow_TacheTreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_TacheTree record, @Param("example") C_V_Flow_TacheTreeExample example);

    int updateByExample(@Param("record") C_V_Flow_TacheTree record, @Param("example") C_V_Flow_TacheTreeExample example);
}