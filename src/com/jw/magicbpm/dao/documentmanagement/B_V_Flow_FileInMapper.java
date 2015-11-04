package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_V_Flow_FileIn;
import com.jw.magicbpm.model.documentmanagement.B_V_Flow_FileInExample;
import com.jw.magicbpm.model.documentmanagement.B_V_Flow_FileInWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Flow_FileInMapper {
    int countByExample(@Param("example") B_V_Flow_FileInExample example);

    int deleteByExample(@Param("example") B_V_Flow_FileInExample example);

    int insert(@Param("record") B_V_Flow_FileInWithBLOBs record);

    int insertSelective(@Param("record") B_V_Flow_FileInWithBLOBs record);

    List<B_V_Flow_FileInWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_V_Flow_FileInExample example);

    List<B_V_Flow_FileIn> selectByExample(@Param("example") B_V_Flow_FileInExample example);

    int updateByExampleSelective(@Param("record") B_V_Flow_FileInWithBLOBs record, @Param("example") B_V_Flow_FileInExample example);

    int updateByExampleWithBLOBs(@Param("record") B_V_Flow_FileInWithBLOBs record, @Param("example") B_V_Flow_FileInExample example);

    int updateByExample(@Param("record") B_V_Flow_FileIn record, @Param("example") B_V_Flow_FileInExample example);
}