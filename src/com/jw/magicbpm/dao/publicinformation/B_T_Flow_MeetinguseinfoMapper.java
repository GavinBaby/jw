package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Flow_Meetinguseinfo;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_MeetinguseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Flow_MeetinguseinfoMapper {
    int countByExample(@Param("example") B_T_Flow_MeetinguseinfoExample example);

    int deleteByExample(@Param("example") B_T_Flow_MeetinguseinfoExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Flow_Meetinguseinfo record);

    int insertSelective(@Param("record") B_T_Flow_Meetinguseinfo record);

    List<B_T_Flow_Meetinguseinfo> selectByExample(@Param("example") B_T_Flow_MeetinguseinfoExample example);

    B_T_Flow_Meetinguseinfo selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Flow_Meetinguseinfo record, @Param("example") B_T_Flow_MeetinguseinfoExample example);

    int updateByExample(@Param("record") B_T_Flow_Meetinguseinfo record, @Param("example") B_T_Flow_MeetinguseinfoExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Flow_Meetinguseinfo record);

    int updateByPrimaryKey(@Param("record") B_T_Flow_Meetinguseinfo record);
}