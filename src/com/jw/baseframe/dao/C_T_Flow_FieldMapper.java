package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Flow_Field;
import com.jw.baseframe.model.C_T_Flow_FieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Flow_FieldMapper {
    int countByExample(@Param("example") C_T_Flow_FieldExample example);

    int deleteByExample(@Param("example") C_T_Flow_FieldExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Flow_Field record);

    int insertSelective(@Param("record") C_T_Flow_Field record);

    List<C_T_Flow_Field> selectByExample(@Param("example") C_T_Flow_FieldExample example);

    C_T_Flow_Field selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Flow_Field record, @Param("example") C_T_Flow_FieldExample example);

    int updateByExample(@Param("record") C_T_Flow_Field record, @Param("example") C_T_Flow_FieldExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Flow_Field record);

    int updateByPrimaryKey(@Param("record") C_T_Flow_Field record);
}