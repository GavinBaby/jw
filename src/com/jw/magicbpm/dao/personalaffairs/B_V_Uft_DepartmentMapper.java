package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Uft_Department;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Uft_DepartmentMapper {
    int countByExample(@Param("example") B_V_Uft_DepartmentExample example);

    int deleteByExample(@Param("example") B_V_Uft_DepartmentExample example);

    int insert(@Param("record") B_V_Uft_Department record);

    int insertSelective(@Param("record") B_V_Uft_Department record);

    List<B_V_Uft_Department> selectByExample(@Param("example") B_V_Uft_DepartmentExample example);

    int updateByExampleSelective(@Param("record") B_V_Uft_Department record, @Param("example") B_V_Uft_DepartmentExample example);

    int updateByExample(@Param("record") B_V_Uft_Department record, @Param("example") B_V_Uft_DepartmentExample example);
}