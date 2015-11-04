package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Meeting_Equipuse;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Meeting_EquipuseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_Meeting_EquipuseMapper {
    int countByExample(@Param("example") B_V_Ufp_Meeting_EquipuseExample example);

    int deleteByExample(@Param("example") B_V_Ufp_Meeting_EquipuseExample example);

    int insert(@Param("record") B_V_Ufp_Meeting_Equipuse record);

    int insertSelective(@Param("record") B_V_Ufp_Meeting_Equipuse record);

    List<B_V_Ufp_Meeting_Equipuse> selectByExample(@Param("example") B_V_Ufp_Meeting_EquipuseExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Meeting_Equipuse record, @Param("example") B_V_Ufp_Meeting_EquipuseExample example);

    int updateByExample(@Param("record") B_V_Ufp_Meeting_Equipuse record, @Param("example") B_V_Ufp_Meeting_EquipuseExample example);
}