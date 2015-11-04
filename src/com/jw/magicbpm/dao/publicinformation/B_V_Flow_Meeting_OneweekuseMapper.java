package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Flow_Meeting_Oneweekuse;
import com.jw.magicbpm.model.publicinformation.B_V_Flow_Meeting_OneweekuseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Flow_Meeting_OneweekuseMapper {
    int countByExample(@Param("example") B_V_Flow_Meeting_OneweekuseExample example);

    int deleteByExample(@Param("example") B_V_Flow_Meeting_OneweekuseExample example);

    int insert(@Param("record") B_V_Flow_Meeting_Oneweekuse record);

    int insertSelective(@Param("record") B_V_Flow_Meeting_Oneweekuse record);

    List<B_V_Flow_Meeting_Oneweekuse> selectByExample(@Param("example") B_V_Flow_Meeting_OneweekuseExample example);

    int updateByExampleSelective(@Param("record") B_V_Flow_Meeting_Oneweekuse record, @Param("example") B_V_Flow_Meeting_OneweekuseExample example);

    int updateByExample(@Param("record") B_V_Flow_Meeting_Oneweekuse record, @Param("example") B_V_Flow_Meeting_OneweekuseExample example);
}