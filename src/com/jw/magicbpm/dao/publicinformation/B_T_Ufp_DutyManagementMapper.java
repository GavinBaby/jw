package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_DutyManagement;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_DutyManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_DutyManagementMapper {
    int countByExample(@Param("example") B_T_Ufp_DutyManagementExample example);

    int deleteByExample(@Param("example") B_T_Ufp_DutyManagementExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_DutyManagement record);

    int insertSelective(@Param("record") B_T_Ufp_DutyManagement record);

    List<B_T_Ufp_DutyManagement> selectByExample(@Param("example") B_T_Ufp_DutyManagementExample example);

    B_T_Ufp_DutyManagement selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_DutyManagement record, @Param("example") B_T_Ufp_DutyManagementExample example);

    int updateByExample(@Param("record") B_T_Ufp_DutyManagement record, @Param("example") B_T_Ufp_DutyManagementExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_DutyManagement record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_DutyManagement record);
}