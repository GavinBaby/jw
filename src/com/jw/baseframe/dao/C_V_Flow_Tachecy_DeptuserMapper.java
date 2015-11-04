package com.jw.baseframe.dao;

import com.jw.baseframe.model.C_V_Flow_Tachecy_Deptuser;
import com.jw.baseframe.model.C_V_Flow_Tachecy_DeptuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C_V_Flow_Tachecy_DeptuserMapper {
    int countByExample(@Param("example") C_V_Flow_Tachecy_DeptuserExample example);

    int deleteByExample(@Param("example") C_V_Flow_Tachecy_DeptuserExample example);

    int insert(@Param("record") C_V_Flow_Tachecy_Deptuser record);

    int insertSelective(@Param("record") C_V_Flow_Tachecy_Deptuser record);

    List<C_V_Flow_Tachecy_Deptuser> selectByExample(@Param("example") C_V_Flow_Tachecy_DeptuserExample example);

    int updateByExampleSelective(@Param("record") C_V_Flow_Tachecy_Deptuser record, @Param("example") C_V_Flow_Tachecy_DeptuserExample example);

    int updateByExample(@Param("record") C_V_Flow_Tachecy_Deptuser record, @Param("example") C_V_Flow_Tachecy_DeptuserExample example);
}