package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Materia;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_MateriaExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_MateriaWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_MateriaMapper {
    int countByExample(@Param("example") B_V_Ufp_MateriaExample example);

    int deleteByExample(@Param("example") B_V_Ufp_MateriaExample example);

    int insert(@Param("record") B_V_Ufp_MateriaWithBLOBs record);

    int insertSelective(@Param("record") B_V_Ufp_MateriaWithBLOBs record);

    List<B_V_Ufp_MateriaWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_V_Ufp_MateriaExample example);

    List<B_V_Ufp_Materia> selectByExample(@Param("example") B_V_Ufp_MateriaExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_MateriaWithBLOBs record, @Param("example") B_V_Ufp_MateriaExample example);

    int updateByExampleWithBLOBs(@Param("record") B_V_Ufp_MateriaWithBLOBs record, @Param("example") B_V_Ufp_MateriaExample example);

    int updateByExample(@Param("record") B_V_Ufp_Materia record, @Param("example") B_V_Ufp_MateriaExample example);
}