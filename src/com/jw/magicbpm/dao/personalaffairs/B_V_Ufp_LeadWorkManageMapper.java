package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_LeadWorkManageMapper {
    int countByExample(@Param("example") B_V_Ufp_LeadWorkManageExample example);

    int deleteByExample(@Param("example") B_V_Ufp_LeadWorkManageExample example);

    int insert(@Param("record") B_V_Ufp_LeadWorkManage record);

    int insertSelective(@Param("record") B_V_Ufp_LeadWorkManage record);

    List<B_V_Ufp_LeadWorkManage> selectByExample(@Param("example") B_V_Ufp_LeadWorkManageExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_LeadWorkManage record, @Param("example") B_V_Ufp_LeadWorkManageExample example);

    int updateByExample(@Param("record") B_V_Ufp_LeadWorkManage record, @Param("example") B_V_Ufp_LeadWorkManageExample example);
}