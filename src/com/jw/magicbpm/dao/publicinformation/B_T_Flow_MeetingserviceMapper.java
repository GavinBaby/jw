package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Flow_Meetingservice;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_MeetingserviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Flow_MeetingserviceMapper {
    int countByExample(@Param("example") B_T_Flow_MeetingserviceExample example);

    int deleteByExample(@Param("example") B_T_Flow_MeetingserviceExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Flow_Meetingservice record);

    int insertSelective(@Param("record") B_T_Flow_Meetingservice record);

    List<B_T_Flow_Meetingservice> selectByExample(@Param("example") B_T_Flow_MeetingserviceExample example);

    B_T_Flow_Meetingservice selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Flow_Meetingservice record, @Param("example") B_T_Flow_MeetingserviceExample example);

    int updateByExample(@Param("record") B_T_Flow_Meetingservice record, @Param("example") B_T_Flow_MeetingserviceExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Flow_Meetingservice record);

    int updateByPrimaryKey(@Param("record") B_T_Flow_Meetingservice record);
}