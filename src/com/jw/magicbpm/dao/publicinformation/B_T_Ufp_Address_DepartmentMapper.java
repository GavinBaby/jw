package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_Department;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Address_DepartmentMapper {
    int countByExample(@Param("example") B_T_Ufp_Address_DepartmentExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Address_DepartmentExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Address_Department record);

    int insertSelective(@Param("record") B_T_Ufp_Address_Department record);

    List<B_T_Ufp_Address_Department> selectByExample(@Param("example") B_T_Ufp_Address_DepartmentExample example);

    B_T_Ufp_Address_Department selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Address_Department record, @Param("example") B_T_Ufp_Address_DepartmentExample example);

    int updateByExample(@Param("record") B_T_Ufp_Address_Department record, @Param("example") B_T_Ufp_Address_DepartmentExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Address_Department record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Address_Department record);
}