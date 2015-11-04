package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_T_Flow_Withdramal;
import com.jw.baseframe.model.C_T_Flow_WithdramalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_T_Flow_WithdramalMapper {
    int countByExample(@Param("example") C_T_Flow_WithdramalExample example);

    int deleteByExample(@Param("example") C_T_Flow_WithdramalExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") C_T_Flow_Withdramal record);

    int insertSelective(@Param("record") C_T_Flow_Withdramal record);

    List<C_T_Flow_Withdramal> selectByExample(@Param("example") C_T_Flow_WithdramalExample example);

    C_T_Flow_Withdramal selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") C_T_Flow_Withdramal record, @Param("example") C_T_Flow_WithdramalExample example);

    int updateByExample(@Param("record") C_T_Flow_Withdramal record, @Param("example") C_T_Flow_WithdramalExample example);

    int updateByPrimaryKeySelective(@Param("record") C_T_Flow_Withdramal record);

    int updateByPrimaryKey(@Param("record") C_T_Flow_Withdramal record);
}