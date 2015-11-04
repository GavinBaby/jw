package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_T_Flow_FileIn;
import com.jw.magicbpm.model.documentmanagement.B_T_Flow_FileInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Flow_FileInMapper {
    int countByExample(@Param("example") B_T_Flow_FileInExample example);

    int deleteByExample(@Param("example") B_T_Flow_FileInExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Flow_FileIn record);

    int insertSelective(@Param("record") B_T_Flow_FileIn record);

    List<B_T_Flow_FileIn> selectByExample(@Param("example") B_T_Flow_FileInExample example);

    B_T_Flow_FileIn selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Flow_FileIn record, @Param("example") B_T_Flow_FileInExample example);

    int updateByExample(@Param("record") B_T_Flow_FileIn record, @Param("example") B_T_Flow_FileInExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Flow_FileIn record);

    int updateByPrimaryKey(@Param("record") B_T_Flow_FileIn record);
}