package com.jw.magicbpm.dao.personalaffairs;

import com.jw.magicbpm.model.personalaffairs.B_V_Flow_Dept_Work;
import com.jw.magicbpm.model.personalaffairs.B_V_Flow_Dept_WorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Flow_Dept_WorkMapper {
    int countByExample(@Param("example") B_V_Flow_Dept_WorkExample example);

    int deleteByExample(@Param("example") B_V_Flow_Dept_WorkExample example);

    int insert(@Param("record") B_V_Flow_Dept_Work record);

    int insertSelective(@Param("record") B_V_Flow_Dept_Work record);

    List<B_V_Flow_Dept_Work> selectByExample(@Param("example") B_V_Flow_Dept_WorkExample example);

    int updateByExampleSelective(@Param("record") B_V_Flow_Dept_Work record, @Param("example") B_V_Flow_Dept_WorkExample example);

    int updateByExample(@Param("record") B_V_Flow_Dept_Work record, @Param("example") B_V_Flow_Dept_WorkExample example);
}