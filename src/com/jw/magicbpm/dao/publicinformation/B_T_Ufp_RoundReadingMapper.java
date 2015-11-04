package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_RoundReading;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_RoundReadingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_RoundReadingMapper {
    int countByExample(@Param("example") B_T_Ufp_RoundReadingExample example);

    int deleteByExample(@Param("example") B_T_Ufp_RoundReadingExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_RoundReading record);

    int insertSelective(@Param("record") B_T_Ufp_RoundReading record);

    List<B_T_Ufp_RoundReading> selectByExample(@Param("example") B_T_Ufp_RoundReadingExample example);

    B_T_Ufp_RoundReading selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_RoundReading record, @Param("example") B_T_Ufp_RoundReadingExample example);

    int updateByExample(@Param("record") B_T_Ufp_RoundReading record, @Param("example") B_T_Ufp_RoundReadingExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_RoundReading record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_RoundReading record);
}