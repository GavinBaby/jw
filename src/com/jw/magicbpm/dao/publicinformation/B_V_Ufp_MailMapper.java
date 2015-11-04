package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Mail;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_MailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_MailMapper {
    int countByExample(@Param("example") B_V_Ufp_MailExample example);

    int deleteByExample(@Param("example") B_V_Ufp_MailExample example);

    int insert(@Param("record") B_V_Ufp_Mail record);

    int insertSelective(@Param("record") B_V_Ufp_Mail record);

    List<B_V_Ufp_Mail> selectByExampleWithBLOBs(@Param("example") B_V_Ufp_MailExample example);

    List<B_V_Ufp_Mail> selectByExample(@Param("example") B_V_Ufp_MailExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Mail record, @Param("example") B_V_Ufp_MailExample example);

    int updateByExampleWithBLOBs(@Param("record") B_V_Ufp_Mail record, @Param("example") B_V_Ufp_MailExample example);

    int updateByExample(@Param("record") B_V_Ufp_Mail record, @Param("example") B_V_Ufp_MailExample example);
}