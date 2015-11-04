package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Flow_Infor;
import com.jw.baseframe.model.C_T_Flow_InforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Flow_InforMapper {
    int countByExample(@Param("example") C_T_Flow_InforExample example);

    int deleteByExample(@Param("example") C_T_Flow_InforExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Flow_Infor record);

    int insertSelective(@Param("record") C_T_Flow_Infor record);

    List<C_T_Flow_Infor> selectByExampleWithBLOBs(@Param("example") C_T_Flow_InforExample example);

    List<C_T_Flow_Infor> selectByExample(@Param("example") C_T_Flow_InforExample example);

    C_T_Flow_Infor selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Flow_Infor record, @Param("example") C_T_Flow_InforExample example);

    int updateByExampleWithBLOBs(@Param("record") C_T_Flow_Infor record, @Param("example") C_T_Flow_InforExample example);

    int updateByExample(@Param("record") C_T_Flow_Infor record, @Param("example") C_T_Flow_InforExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Flow_Infor record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") C_T_Flow_Infor record);

    int updateByPrimaryKey(@Param("record") C_T_Flow_Infor record);
}