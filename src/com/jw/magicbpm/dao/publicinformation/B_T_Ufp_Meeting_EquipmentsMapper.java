package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Equipments;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_EquipmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Meeting_EquipmentsMapper {
    int countByExample(@Param("example") B_T_Ufp_Meeting_EquipmentsExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Meeting_EquipmentsExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Meeting_Equipments record);

    int insertSelective(@Param("record") B_T_Ufp_Meeting_Equipments record);

    List<B_T_Ufp_Meeting_Equipments> selectByExample(@Param("example") B_T_Ufp_Meeting_EquipmentsExample example);

    B_T_Ufp_Meeting_Equipments selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Meeting_Equipments record, @Param("example") B_T_Ufp_Meeting_EquipmentsExample example);

    int updateByExample(@Param("record") B_T_Ufp_Meeting_Equipments record, @Param("example") B_T_Ufp_Meeting_EquipmentsExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Meeting_Equipments record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Meeting_Equipments record);
}