package com.jw.nboa.dao.purchase;

import com.jw.nboa.model.purchase.P_Info;
import com.jw.nboa.model.purchase.P_InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P_InfoMapper {
    int countByExample(@Param("example") P_InfoExample example);

    int deleteByExample(@Param("example") P_InfoExample example);

    int insert(@Param("record") P_Info record);

    int insertSelective(@Param("record") P_Info record);

    List<P_Info> selectByExample(@Param("example") P_InfoExample example);

    int updateByExampleSelective(@Param("record") P_Info record, @Param("example") P_InfoExample example);

    int updateByExample(@Param("record") P_Info record, @Param("example") P_InfoExample example);
}