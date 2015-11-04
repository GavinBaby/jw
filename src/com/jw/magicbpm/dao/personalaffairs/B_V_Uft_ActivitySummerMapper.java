package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Uft_ActivitySummer;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_ActivitySummerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Uft_ActivitySummerMapper {
    int countByExample(@Param("example") B_V_Uft_ActivitySummerExample example);

    int deleteByExample(@Param("example") B_V_Uft_ActivitySummerExample example);

    int insert(@Param("record") B_V_Uft_ActivitySummer record);

    int insertSelective(@Param("record") B_V_Uft_ActivitySummer record);

    List<B_V_Uft_ActivitySummer> selectByExample(@Param("example") B_V_Uft_ActivitySummerExample example);

    int updateByExampleSelective(@Param("record") B_V_Uft_ActivitySummer record, @Param("example") B_V_Uft_ActivitySummerExample example);

    int updateByExample(@Param("record") B_V_Uft_ActivitySummer record, @Param("example") B_V_Uft_ActivitySummerExample example);
}