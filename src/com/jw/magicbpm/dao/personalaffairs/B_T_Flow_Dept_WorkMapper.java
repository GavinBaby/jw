package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_T_Flow_Dept_Work;
import com.jw.magicbpm.model.personalaffairs.B_T_Flow_Dept_WorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Flow_Dept_WorkMapper {
    int countByExample(@Param("example") B_T_Flow_Dept_WorkExample example);

    int deleteByExample(@Param("example") B_T_Flow_Dept_WorkExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Flow_Dept_Work record);

    int insertSelective(@Param("record") B_T_Flow_Dept_Work record);

    List<B_T_Flow_Dept_Work> selectByExample(@Param("example") B_T_Flow_Dept_WorkExample example);

    B_T_Flow_Dept_Work selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Flow_Dept_Work record, @Param("example") B_T_Flow_Dept_WorkExample example);

    int updateByExample(@Param("record") B_T_Flow_Dept_Work record, @Param("example") B_T_Flow_Dept_WorkExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Flow_Dept_Work record);

    int updateByPrimaryKey(@Param("record") B_T_Flow_Dept_Work record);
}