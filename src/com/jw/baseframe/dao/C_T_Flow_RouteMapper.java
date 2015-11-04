package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Flow_Route;
import com.jw.baseframe.model.C_T_Flow_RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Flow_RouteMapper {
    int countByExample(@Param("example") C_T_Flow_RouteExample example);

    int deleteByExample(@Param("example") C_T_Flow_RouteExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Flow_Route record);

    int insertSelective(@Param("record") C_T_Flow_Route record);

    List<C_T_Flow_Route> selectByExample(@Param("example") C_T_Flow_RouteExample example);

    C_T_Flow_Route selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Flow_Route record, @Param("example") C_T_Flow_RouteExample example);

    int updateByExample(@Param("record") C_T_Flow_Route record, @Param("example") C_T_Flow_RouteExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Flow_Route record);

    int updateByPrimaryKey(@Param("record") C_T_Flow_Route record);
}