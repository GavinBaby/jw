package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_DeptWorkManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_DeptWorkManageMapper {
    int countByExample(@Param("example") B_V_Ufp_DeptWorkManageExample example);

    int deleteByExample(@Param("example") B_V_Ufp_DeptWorkManageExample example);

    int insert(@Param("record") B_V_Ufp_DeptWorkManage record);

    int insertSelective(@Param("record") B_V_Ufp_DeptWorkManage record);

    List<B_V_Ufp_DeptWorkManage> selectByExample(@Param("example") B_V_Ufp_DeptWorkManageExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_DeptWorkManage record, @Param("example") B_V_Ufp_DeptWorkManageExample example);

    int updateByExample(@Param("record") B_V_Ufp_DeptWorkManage record, @Param("example") B_V_Ufp_DeptWorkManageExample example);
}