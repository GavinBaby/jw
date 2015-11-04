package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_Filein_Serial;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_Filein_SerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Filein_SerialMapper {
    int countByExample(@Param("example") B_T_Ufp_Filein_SerialExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Filein_SerialExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Filein_Serial record);

    int insertSelective(@Param("record") B_T_Ufp_Filein_Serial record);

    List<B_T_Ufp_Filein_Serial> selectByExample(@Param("example") B_T_Ufp_Filein_SerialExample example);

    B_T_Ufp_Filein_Serial selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Filein_Serial record, @Param("example") B_T_Ufp_Filein_SerialExample example);

    int updateByExample(@Param("record") B_T_Ufp_Filein_Serial record, @Param("example") B_T_Ufp_Filein_SerialExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Filein_Serial record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Filein_Serial record);
}