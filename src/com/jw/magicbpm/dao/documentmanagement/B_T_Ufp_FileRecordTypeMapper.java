package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FileRecordType;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FileRecordTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_FileRecordTypeMapper {
    int countByExample(@Param("example") B_T_Ufp_FileRecordTypeExample example);

    int deleteByExample(@Param("example") B_T_Ufp_FileRecordTypeExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_FileRecordType record);

    int insertSelective(@Param("record") B_T_Ufp_FileRecordType record);

    List<B_T_Ufp_FileRecordType> selectByExample(@Param("example") B_T_Ufp_FileRecordTypeExample example);

    B_T_Ufp_FileRecordType selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_FileRecordType record, @Param("example") B_T_Ufp_FileRecordTypeExample example);

    int updateByExample(@Param("record") B_T_Ufp_FileRecordType record, @Param("example") B_T_Ufp_FileRecordTypeExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_FileRecordType record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_FileRecordType record);
}