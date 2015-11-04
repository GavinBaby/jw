package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Dept_User_Manage;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Dept_User_ManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_Dept_User_ManageMapper {
    int countByExample(@Param("example") B_V_Ufp_Dept_User_ManageExample example);

    int deleteByExample(@Param("example") B_V_Ufp_Dept_User_ManageExample example);

    int insert(@Param("record") B_V_Ufp_Dept_User_Manage record);

    int insertSelective(@Param("record") B_V_Ufp_Dept_User_Manage record);

    List<B_V_Ufp_Dept_User_Manage> selectByExample(@Param("example") B_V_Ufp_Dept_User_ManageExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Dept_User_Manage record, @Param("example") B_V_Ufp_Dept_User_ManageExample example);

    int updateByExample(@Param("record") B_V_Ufp_Dept_User_Manage record, @Param("example") B_V_Ufp_Dept_User_ManageExample example);
}