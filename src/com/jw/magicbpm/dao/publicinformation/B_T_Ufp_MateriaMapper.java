package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_MateriaExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_MateriaWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_MateriaMapper {
    int countByExample(@Param("example") B_T_Ufp_MateriaExample example);

    int deleteByExample(@Param("example") B_T_Ufp_MateriaExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_MateriaWithBLOBs record);

    int insertSelective(@Param("record") B_T_Ufp_MateriaWithBLOBs record);

    List<B_T_Ufp_MateriaWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_T_Ufp_MateriaExample example);

    List<B_T_Ufp_Materia> selectByExample(@Param("example") B_T_Ufp_MateriaExample example);

    B_T_Ufp_MateriaWithBLOBs selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_MateriaWithBLOBs record, @Param("example") B_T_Ufp_MateriaExample example);

    int updateByExampleWithBLOBs(@Param("record") B_T_Ufp_MateriaWithBLOBs record, @Param("example") B_T_Ufp_MateriaExample example);

    int updateByExample(@Param("record") B_T_Ufp_Materia record, @Param("example") B_T_Ufp_MateriaExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_MateriaWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") B_T_Ufp_MateriaWithBLOBs record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Materia record);
}