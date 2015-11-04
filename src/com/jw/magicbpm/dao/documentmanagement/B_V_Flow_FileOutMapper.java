package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_V_Flow_FileOut;
import com.jw.magicbpm.model.documentmanagement.B_V_Flow_FileOutExample;
import com.jw.magicbpm.model.documentmanagement.B_V_Flow_FileOutWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Flow_FileOutMapper {
    int countByExample(@Param("example") B_V_Flow_FileOutExample example);

    int deleteByExample(@Param("example") B_V_Flow_FileOutExample example);

    int insert(@Param("record") B_V_Flow_FileOutWithBLOBs record);

    int insertSelective(@Param("record") B_V_Flow_FileOutWithBLOBs record);

    List<B_V_Flow_FileOutWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_V_Flow_FileOutExample example);

    List<B_V_Flow_FileOut> selectByExample(@Param("example") B_V_Flow_FileOutExample example);

    int updateByExampleSelective(@Param("record") B_V_Flow_FileOutWithBLOBs record, @Param("example") B_V_Flow_FileOutExample example);

    int updateByExampleWithBLOBs(@Param("record") B_V_Flow_FileOutWithBLOBs record, @Param("example") B_V_Flow_FileOutExample example);

    int updateByExample(@Param("record") B_V_Flow_FileOut record, @Param("example") B_V_Flow_FileOutExample example);
}