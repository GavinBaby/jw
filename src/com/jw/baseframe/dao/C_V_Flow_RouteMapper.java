package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_Route;
import com.jw.baseframe.model.C_V_Flow_RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_RouteMapper {
    int countByExample(@Param("example") C_V_Flow_RouteExample example);

    int deleteByExample(@Param("example") C_V_Flow_RouteExample example);

    int insert(@Param("record") C_V_Flow_Route record);

    int insertSelective(@Param("record") C_V_Flow_Route record);

    List<C_V_Flow_Route> selectByExample(@Param("example") C_V_Flow_RouteExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_Route record, @Param("example") C_V_Flow_RouteExample example);

    int updateByExample(@Param("record") C_V_Flow_Route record, @Param("example") C_V_Flow_RouteExample example);
}