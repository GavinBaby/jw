package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Roominfo;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_RoominfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Meeting_RoominfoMapper {
    int countByExample(@Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Meeting_Roominfo record);

    int insertSelective(@Param("record") B_T_Ufp_Meeting_Roominfo record);

    List<B_T_Ufp_Meeting_Roominfo> selectByExampleWithBLOBs(@Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    List<B_T_Ufp_Meeting_Roominfo> selectByExample(@Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    B_T_Ufp_Meeting_Roominfo selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Meeting_Roominfo record, @Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    int updateByExampleWithBLOBs(@Param("record") B_T_Ufp_Meeting_Roominfo record, @Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    int updateByExample(@Param("record") B_T_Ufp_Meeting_Roominfo record, @Param("example") B_T_Ufp_Meeting_RoominfoExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Meeting_Roominfo record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") B_T_Ufp_Meeting_Roominfo record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Meeting_Roominfo record);
}