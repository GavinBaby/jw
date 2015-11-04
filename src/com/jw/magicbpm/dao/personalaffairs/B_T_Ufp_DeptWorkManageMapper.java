package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_DeptWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_DeptWorkManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_DeptWorkManageMapper {
    int countByExample(@Param("example") B_T_Ufp_DeptWorkManageExample example);

    int deleteByExample(@Param("example") B_T_Ufp_DeptWorkManageExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_DeptWorkManage record);

    int insertSelective(@Param("record") B_T_Ufp_DeptWorkManage record);

    List<B_T_Ufp_DeptWorkManage> selectByExample(@Param("example") B_T_Ufp_DeptWorkManageExample example);

    B_T_Ufp_DeptWorkManage selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_DeptWorkManage record, @Param("example") B_T_Ufp_DeptWorkManageExample example);

    int updateByExample(@Param("record") B_T_Ufp_DeptWorkManage record, @Param("example") B_T_Ufp_DeptWorkManageExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_DeptWorkManage record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_DeptWorkManage record);
}