package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Mail_UnitDeptUserTree;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Mail_UnitDeptUserTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_Mail_UnitDeptUserTreeMapper {
    int countByExample(@Param("example") B_V_Ufp_Mail_UnitDeptUserTreeExample example);

    int deleteByExample(@Param("example") B_V_Ufp_Mail_UnitDeptUserTreeExample example);

    int insert(@Param("record") B_V_Ufp_Mail_UnitDeptUserTree record);

    int insertSelective(@Param("record") B_V_Ufp_Mail_UnitDeptUserTree record);

    List<B_V_Ufp_Mail_UnitDeptUserTree> selectByExample(@Param("example") B_V_Ufp_Mail_UnitDeptUserTreeExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Mail_UnitDeptUserTree record, @Param("example") B_V_Ufp_Mail_UnitDeptUserTreeExample example);

    int updateByExample(@Param("record") B_V_Ufp_Mail_UnitDeptUserTree record, @Param("example") B_V_Ufp_Mail_UnitDeptUserTreeExample example);
}