package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_Todotree;
import com.jw.baseframe.model.C_V_Flow_TodotreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_TodotreeMapper {
    int countByExample(@Param("example") C_V_Flow_TodotreeExample example);

    int deleteByExample(@Param("example") C_V_Flow_TodotreeExample example);

    int insert(@Param("record") C_V_Flow_Todotree record);

    int insertSelective(@Param("record") C_V_Flow_Todotree record);

    List<C_V_Flow_Todotree> selectByExample(@Param("example") C_V_Flow_TodotreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_Todotree record, @Param("example") C_V_Flow_TodotreeExample example);

    int updateByExample(@Param("record") C_V_Flow_Todotree record, @Param("example") C_V_Flow_TodotreeExample example);
}