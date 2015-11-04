package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_Content;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_ContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Mail_ContentMapper {
    int countByExample(@Param("example") B_T_Ufp_Mail_ContentExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Mail_ContentExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Mail_Content record);

    int insertSelective(@Param("record") B_T_Ufp_Mail_Content record);

    List<B_T_Ufp_Mail_Content> selectByExampleWithBLOBs(@Param("example") B_T_Ufp_Mail_ContentExample example);

    List<B_T_Ufp_Mail_Content> selectByExample(@Param("example") B_T_Ufp_Mail_ContentExample example);

    B_T_Ufp_Mail_Content selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Mail_Content record, @Param("example") B_T_Ufp_Mail_ContentExample example);

    int updateByExampleWithBLOBs(@Param("record") B_T_Ufp_Mail_Content record, @Param("example") B_T_Ufp_Mail_ContentExample example);

    int updateByExample(@Param("record") B_T_Ufp_Mail_Content record, @Param("example") B_T_Ufp_Mail_ContentExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Mail_Content record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") B_T_Ufp_Mail_Content record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Mail_Content record);
}