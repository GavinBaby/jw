package com.jw.nboa.dao.purchase;

import com.jw.nboa.model.purchase.P_Info_Detail;
import com.jw.nboa.model.purchase.P_Info_DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P_Info_DetailMapper {
    int countByExample(@Param("example") P_Info_DetailExample example);

    int deleteByExample(@Param("example") P_Info_DetailExample example);

    int insert(@Param("record") P_Info_Detail record);

    int insertSelective(@Param("record") P_Info_Detail record);

    List<P_Info_Detail> selectByExample(@Param("example") P_Info_DetailExample example);

    int updateByExampleSelective(@Param("record") P_Info_Detail record, @Param("example") P_Info_DetailExample example);

    int updateByExample(@Param("record") P_Info_Detail record, @Param("example") P_Info_DetailExample example);
}