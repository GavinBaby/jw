package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Bulletin;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_BulletinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_BulletinMapper {
    int countByExample(@Param("example") B_V_Ufp_BulletinExample example);

    int deleteByExample(@Param("example") B_V_Ufp_BulletinExample example);

    int insert(@Param("record") B_V_Ufp_Bulletin record);

    int insertSelective(@Param("record") B_V_Ufp_Bulletin record);

    List<B_V_Ufp_Bulletin> selectByExampleWithBLOBs(@Param("example") B_V_Ufp_BulletinExample example);

    List<B_V_Ufp_Bulletin> selectByExample(@Param("example") B_V_Ufp_BulletinExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Bulletin record, @Param("example") B_V_Ufp_BulletinExample example);

    int updateByExampleWithBLOBs(@Param("record") B_V_Ufp_Bulletin record, @Param("example") B_V_Ufp_BulletinExample example);

    int updateByExample(@Param("record") B_V_Ufp_Bulletin record, @Param("example") B_V_Ufp_BulletinExample example);
}