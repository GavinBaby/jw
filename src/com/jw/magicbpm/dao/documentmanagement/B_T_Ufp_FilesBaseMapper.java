package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FilesBase;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FilesBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_FilesBaseMapper {
    int countByExample(@Param("example") B_T_Ufp_FilesBaseExample example);

    int deleteByExample(@Param("example") B_T_Ufp_FilesBaseExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_FilesBase record);

    int insertSelective(@Param("record") B_T_Ufp_FilesBase record);

    List<B_T_Ufp_FilesBase> selectByExample(@Param("example") B_T_Ufp_FilesBaseExample example);

    B_T_Ufp_FilesBase selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_FilesBase record, @Param("example") B_T_Ufp_FilesBaseExample example);

    int updateByExample(@Param("record") B_T_Ufp_FilesBase record, @Param("example") B_T_Ufp_FilesBaseExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_FilesBase record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_FilesBase record);
}