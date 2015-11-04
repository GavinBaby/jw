package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManagetree;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManagetreeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_LeadWorkManagetreeMapper {
    int countByExample(@Param("example") B_V_Ufp_LeadWorkManagetreeExample example);

    int deleteByExample(@Param("example") B_V_Ufp_LeadWorkManagetreeExample example);

    int insert(@Param("record") B_V_Ufp_LeadWorkManagetree record);

    int insertSelective(@Param("record") B_V_Ufp_LeadWorkManagetree record);
    
    List<B_V_Ufp_LeadWorkManagetree> selectleadworkmanagetreeByMap(Map<String, Object> map);

    List<B_V_Ufp_LeadWorkManagetree> selectByExample(@Param("example") B_V_Ufp_LeadWorkManagetreeExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_LeadWorkManagetree record, @Param("example") B_V_Ufp_LeadWorkManagetreeExample example);

    int updateByExample(@Param("record") B_V_Ufp_LeadWorkManagetree record, @Param("example") B_V_Ufp_LeadWorkManagetreeExample example);
}