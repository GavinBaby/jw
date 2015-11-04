package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_File_Transmission;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_File_TransmissionExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_File_TransmissionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_File_TransmissionMapper {
    int countByExample(@Param("example") B_T_Ufp_File_TransmissionExample example);

    int deleteByExample(@Param("example") B_T_Ufp_File_TransmissionExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_File_TransmissionWithBLOBs record);

    int insertSelective(@Param("record") B_T_Ufp_File_TransmissionWithBLOBs record);

    List<B_T_Ufp_File_TransmissionWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_T_Ufp_File_TransmissionExample example);

    List<B_T_Ufp_File_Transmission> selectByExample(@Param("example") B_T_Ufp_File_TransmissionExample example);

    B_T_Ufp_File_TransmissionWithBLOBs selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_File_TransmissionWithBLOBs record, @Param("example") B_T_Ufp_File_TransmissionExample example);

    int updateByExampleWithBLOBs(@Param("record") B_T_Ufp_File_TransmissionWithBLOBs record, @Param("example") B_T_Ufp_File_TransmissionExample example);

    int updateByExample(@Param("record") B_T_Ufp_File_Transmission record, @Param("example") B_T_Ufp_File_TransmissionExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_File_TransmissionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") B_T_Ufp_File_TransmissionWithBLOBs record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_File_Transmission record);
}