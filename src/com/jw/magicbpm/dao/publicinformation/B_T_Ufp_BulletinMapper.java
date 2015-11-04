package com.jw.magicbpm.dao.publicinformation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Bulletin;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_BulletinExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_BulletinWithBLOBs;

public interface B_T_Ufp_BulletinMapper {
    int countByExample(@Param("example") B_T_Ufp_BulletinExample example);

    int deleteByExample(@Param("example") B_T_Ufp_BulletinExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Bulletin record);

    int insertSelective(@Param("record") B_T_Ufp_Bulletin record);

    List<B_T_Ufp_BulletinWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_T_Ufp_BulletinExample example);

    List<B_T_Ufp_Bulletin> selectByExample(@Param("example") B_T_Ufp_BulletinExample example);

    B_T_Ufp_BulletinWithBLOBs selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_BulletinWithBLOBs record, @Param("example") B_T_Ufp_BulletinExample example);

    int updateByExampleWithBLOBs(@Param("record") B_T_Ufp_BulletinWithBLOBs record, @Param("example") B_T_Ufp_BulletinExample example);

    int updateByExample(@Param("record") B_T_Ufp_Bulletin record, @Param("example") B_T_Ufp_BulletinExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_BulletinWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") B_T_Ufp_BulletinWithBLOBs record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Bulletin record);
}