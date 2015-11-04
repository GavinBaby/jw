package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Uft_Activity;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Uft_ActivityMapper {
    int countByExample(@Param("example") B_V_Uft_ActivityExample example);

    int deleteByExample(@Param("example") B_V_Uft_ActivityExample example);

    int insert(@Param("record") B_V_Uft_Activity record);

    int insertSelective(@Param("record") B_V_Uft_Activity record);

    List<B_V_Uft_Activity> selectByExample(@Param("example") B_V_Uft_ActivityExample example);

    int updateByExampleSelective(@Param("record") B_V_Uft_Activity record, @Param("example") B_V_Uft_ActivityExample example);

    int updateByExample(@Param("record") B_V_Uft_Activity record, @Param("example") B_V_Uft_ActivityExample example);
}