package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_Attribute;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Mail_AttributeMapper {
    int countByExample(@Param("example") B_T_Ufp_Mail_AttributeExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Mail_AttributeExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Mail_Attribute record);

    int insertSelective(@Param("record") B_T_Ufp_Mail_Attribute record);

    List<B_T_Ufp_Mail_Attribute> selectByExample(@Param("example") B_T_Ufp_Mail_AttributeExample example);

    B_T_Ufp_Mail_Attribute selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Mail_Attribute record, @Param("example") B_T_Ufp_Mail_AttributeExample example);

    int updateByExample(@Param("record") B_T_Ufp_Mail_Attribute record, @Param("example") B_T_Ufp_Mail_AttributeExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Mail_Attribute record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Mail_Attribute record);
}