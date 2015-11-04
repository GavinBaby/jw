package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_Relation;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_RelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Mail_RelationMapper {
    int countByExample(@Param("example") B_T_Ufp_Mail_RelationExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Mail_RelationExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Mail_Relation record);

    int insertSelective(@Param("record") B_T_Ufp_Mail_Relation record);

    List<B_T_Ufp_Mail_Relation> selectByExample(@Param("example") B_T_Ufp_Mail_RelationExample example);

    B_T_Ufp_Mail_Relation selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Mail_Relation record, @Param("example") B_T_Ufp_Mail_RelationExample example);

    int updateByExample(@Param("record") B_T_Ufp_Mail_Relation record, @Param("example") B_T_Ufp_Mail_RelationExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Mail_Relation record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Mail_Relation record);
}