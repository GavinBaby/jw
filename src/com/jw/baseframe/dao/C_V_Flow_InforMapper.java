package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_Infor;
import com.jw.baseframe.model.C_V_Flow_InforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_InforMapper {
    int countByExample(@Param("example") C_V_Flow_InforExample example);

    int deleteByExample(@Param("example") C_V_Flow_InforExample example);

    int insert(@Param("record") C_V_Flow_Infor record);

    int insertSelective(@Param("record") C_V_Flow_Infor record);

    List<C_V_Flow_Infor> selectByExample(@Param("example") C_V_Flow_InforExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_Infor record, @Param("example") C_V_Flow_InforExample example);

    int updateByExample(@Param("record") C_V_Flow_Infor record, @Param("example") C_V_Flow_InforExample example);
}