package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_T_Flow_FileOut;
import com.jw.magicbpm.model.documentmanagement.B_T_Flow_FileOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Flow_FileOutMapper {
    int countByExample(@Param("example") B_T_Flow_FileOutExample example);

    int deleteByExample(@Param("example") B_T_Flow_FileOutExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Flow_FileOut record);

    int insertSelective(@Param("record") B_T_Flow_FileOut record);

    List<B_T_Flow_FileOut> selectByExample(@Param("example") B_T_Flow_FileOutExample example);

    B_T_Flow_FileOut selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Flow_FileOut record, @Param("example") B_T_Flow_FileOutExample example);

    int updateByExample(@Param("record") B_T_Flow_FileOut record, @Param("example") B_T_Flow_FileOutExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Flow_FileOut record);

    int updateByPrimaryKey(@Param("record") B_T_Flow_FileOut record);
}