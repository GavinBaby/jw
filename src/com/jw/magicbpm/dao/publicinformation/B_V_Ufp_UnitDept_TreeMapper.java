package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitDept_Tree;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitDept_TreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_UnitDept_TreeMapper {
    int countByExample(@Param("example") B_V_Ufp_UnitDept_TreeExample example);

    int deleteByExample(@Param("example") B_V_Ufp_UnitDept_TreeExample example);

    int insert(@Param("record") B_V_Ufp_UnitDept_Tree record);

    int insertSelective(@Param("record") B_V_Ufp_UnitDept_Tree record);

    List<B_V_Ufp_UnitDept_Tree> selectByExample(@Param("example") B_V_Ufp_UnitDept_TreeExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_UnitDept_Tree record, @Param("example") B_V_Ufp_UnitDept_TreeExample example);

    int updateByExample(@Param("record") B_V_Ufp_UnitDept_Tree record, @Param("example") B_V_Ufp_UnitDept_TreeExample example);
}