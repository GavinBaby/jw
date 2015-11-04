package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Equipuse;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_EquipuseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Meeting_EquipuseMapper {
    int countByExample(@Param("example") B_T_Ufp_Meeting_EquipuseExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Meeting_EquipuseExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Meeting_Equipuse record);

    int insertSelective(@Param("record") B_T_Ufp_Meeting_Equipuse record);

    List<B_T_Ufp_Meeting_Equipuse> selectByExample(@Param("example") B_T_Ufp_Meeting_EquipuseExample example);

    B_T_Ufp_Meeting_Equipuse selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Meeting_Equipuse record, @Param("example") B_T_Ufp_Meeting_EquipuseExample example);

    int updateByExample(@Param("record") B_T_Ufp_Meeting_Equipuse record, @Param("example") B_T_Ufp_Meeting_EquipuseExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Meeting_Equipuse record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Meeting_Equipuse record);
}