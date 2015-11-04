package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_Person_Activity;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_Person_ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Person_ActivityMapper {
    int countByExample(@Param("example") B_T_Ufp_Person_ActivityExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Person_ActivityExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Person_Activity record);

    int insertSelective(@Param("record") B_T_Ufp_Person_Activity record);

    List<B_T_Ufp_Person_Activity> selectByExample(@Param("example") B_T_Ufp_Person_ActivityExample example);

    B_T_Ufp_Person_Activity selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Person_Activity record, @Param("example") B_T_Ufp_Person_ActivityExample example);

    int updateByExample(@Param("record") B_T_Ufp_Person_Activity record, @Param("example") B_T_Ufp_Person_ActivityExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Person_Activity record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Person_Activity record);
}