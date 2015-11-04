package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia_Class;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia_ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Materia_ClassMapper {
    int countByExample(@Param("example") B_T_Ufp_Materia_ClassExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Materia_ClassExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Materia_Class record);

    int insertSelective(@Param("record") B_T_Ufp_Materia_Class record);

    List<B_T_Ufp_Materia_Class> selectByExample(@Param("example") B_T_Ufp_Materia_ClassExample example);

    B_T_Ufp_Materia_Class selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Materia_Class record, @Param("example") B_T_Ufp_Materia_ClassExample example);

    int updateByExample(@Param("record") B_T_Ufp_Materia_Class record, @Param("example") B_T_Ufp_Materia_ClassExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Materia_Class record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Materia_Class record);
}