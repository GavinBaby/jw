package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Person_Activity;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Person_ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_Person_ActivityMapper {
    int countByExample(@Param("example") B_V_Ufp_Person_ActivityExample example);

    int deleteByExample(@Param("example") B_V_Ufp_Person_ActivityExample example);

    int insert(@Param("record") B_V_Ufp_Person_Activity record);

    int insertSelective(@Param("record") B_V_Ufp_Person_Activity record);

    List<B_V_Ufp_Person_Activity> selectByExample(@Param("example") B_V_Ufp_Person_ActivityExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Person_Activity record, @Param("example") B_V_Ufp_Person_ActivityExample example);

    int updateByExample(@Param("record") B_V_Ufp_Person_Activity record, @Param("example") B_V_Ufp_Person_ActivityExample example);
}