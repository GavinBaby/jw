package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_LeadWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_LeadWorkManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_LeadWorkManageMapper {
    int countByExample(@Param("example") B_T_Ufp_LeadWorkManageExample example);

    int deleteByExample(@Param("example") B_T_Ufp_LeadWorkManageExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_LeadWorkManage record);

    int insertSelective(@Param("record") B_T_Ufp_LeadWorkManage record);

    List<B_T_Ufp_LeadWorkManage> selectByExample(@Param("example") B_T_Ufp_LeadWorkManageExample example);

    B_T_Ufp_LeadWorkManage selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_LeadWorkManage record, @Param("example") B_T_Ufp_LeadWorkManageExample example);

    int updateByExample(@Param("record") B_T_Ufp_LeadWorkManage record, @Param("example") B_T_Ufp_LeadWorkManageExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_LeadWorkManage record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_LeadWorkManage record);
}