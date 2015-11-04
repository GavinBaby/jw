package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_UserTacheTree;
import com.jw.baseframe.model.C_V_Flow_UserTacheTreeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_UserTacheTreeMapper {
    int countByExample(@Param("example") C_V_Flow_UserTacheTreeExample example);

    int deleteByExample(@Param("example") C_V_Flow_UserTacheTreeExample example);

    int insert(@Param("record") C_V_Flow_UserTacheTree record);

    int insertSelective(@Param("record") C_V_Flow_UserTacheTree record);
    
    List<C_V_Flow_UserTacheTree> selectTacheUserTreeByMap(Map<String, Object> map);

    List<C_V_Flow_UserTacheTree> selectByExample(@Param("example") C_V_Flow_UserTacheTreeExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_UserTacheTree record, @Param("example") C_V_Flow_UserTacheTreeExample example);

    int updateByExample(@Param("record") C_V_Flow_UserTacheTree record, @Param("example") C_V_Flow_UserTacheTreeExample example);
}