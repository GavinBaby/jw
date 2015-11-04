package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Flow_Meetingservice;
import com.jw.magicbpm.model.publicinformation.B_V_Flow_MeetingserviceExample;
import com.jw.magicbpm.model.publicinformation.B_V_Flow_MeetingserviceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Flow_MeetingserviceMapper {
    int countByExample(@Param("example") B_V_Flow_MeetingserviceExample example);

    int deleteByExample(@Param("example") B_V_Flow_MeetingserviceExample example);

    int insert(@Param("record") B_V_Flow_MeetingserviceWithBLOBs record);

    int insertSelective(@Param("record") B_V_Flow_MeetingserviceWithBLOBs record);

    List<B_V_Flow_MeetingserviceWithBLOBs> selectByExampleWithBLOBs(@Param("example") B_V_Flow_MeetingserviceExample example);

    List<B_V_Flow_Meetingservice> selectByExample(@Param("example") B_V_Flow_MeetingserviceExample example);

    int updateByExampleSelective(@Param("record") B_V_Flow_MeetingserviceWithBLOBs record, @Param("example") B_V_Flow_MeetingserviceExample example);

    int updateByExampleWithBLOBs(@Param("record") B_V_Flow_MeetingserviceWithBLOBs record, @Param("example") B_V_Flow_MeetingserviceExample example);

    int updateByExample(@Param("record") B_V_Flow_Meetingservice record, @Param("example") B_V_Flow_MeetingserviceExample example);
}