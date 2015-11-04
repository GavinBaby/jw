package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Flow_Tache_Field;
import com.jw.baseframe.model.C_T_Flow_Tache_FieldExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface C_T_Flow_Tache_FieldMapper {
    int countByExample(@Param("example") C_T_Flow_Tache_FieldExample example);

    int deleteByExample(@Param("example") C_T_Flow_Tache_FieldExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Flow_Tache_Field record);

    int insertSelective(@Param("record") C_T_Flow_Tache_Field record);

    List<C_T_Flow_Tache_Field> selectByExample(@Param("example") C_T_Flow_Tache_FieldExample example);

    C_T_Flow_Tache_Field selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Flow_Tache_Field record, @Param("example") C_T_Flow_Tache_FieldExample example);

    int updateByExample(@Param("record") C_T_Flow_Tache_Field record, @Param("example") C_T_Flow_Tache_FieldExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Flow_Tache_Field record);

    int updateByPrimaryKey(@Param("record") C_T_Flow_Tache_Field record);
    
    void updateTacheFieldName(Map<String, Object> map);
    
    
}