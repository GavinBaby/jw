package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManagetree;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManagetreeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_DeptWorkManagetreeMapper {
    int countByExample(@Param("example") B_V_Ufp_DeptWorkManagetreeExample example);

    int deleteByExample(@Param("example") B_V_Ufp_DeptWorkManagetreeExample example);

    int insert(@Param("record") B_V_Ufp_DeptWorkManagetree record);

    int insertSelective(@Param("record") B_V_Ufp_DeptWorkManagetree record);
    
    List<B_V_Ufp_DeptWorkManagetree> selectdeptworkmanagetreeByMap(Map<String, Object> map);

    List<B_V_Ufp_DeptWorkManagetree> selectByExample(@Param("example") B_V_Ufp_DeptWorkManagetreeExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_DeptWorkManagetree record, @Param("example") B_V_Ufp_DeptWorkManagetreeExample example);

    int updateByExample(@Param("record") B_V_Ufp_DeptWorkManagetree record, @Param("example") B_V_Ufp_DeptWorkManagetreeExample example);
}