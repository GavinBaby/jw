package com.jw.magicbpm.action.publicinformation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.webform.CustomRowMapper;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.dao.publicinformation.B_T_Flow_MeetingserviceMapper;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Meeting_RoominfoMapper;
import com.jw.magicbpm.dao.publicinformation.B_V_Flow_Meeting_OneweekuseMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_Meetingservice;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_MeetingserviceExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Roominfo;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_RoominfoExample;
import com.jw.magicbpm.model.publicinformation.B_V_Flow_Meeting_Oneweekuse;
import com.jw.magicbpm.model.publicinformation.B_V_Flow_Meeting_OneweekuseExample;
public class MeetingRoomAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * ��������ҹ���action
	 */
	private static final long serialVersionUID = 1L;

	//�����������ϸ��Ϣ
	private List<B_T_Ufp_Meeting_Roominfo> list_B_T_Ufp_Meeting_Roominfo;
	//һ�ܻ�����Ԥ�����
	private List<B_V_Flow_Meeting_Oneweekuse> list_B_V_Flow_Meeting_Oneweekuse;
	//��ҳ��id
	private String parUId;
	//��ҳ��name
	private String parUName;
	//����ID
	private String meetingserviceId;
	//����ʼʱ��
	private String starttime;
	//�������ʱ��
	private String endtime;
	//һ�ܻ�����ʹ�����ʱ��
	private String workDate;
	// ��������
	private Date[] date;
	//���һ��ʹ�ü�¼
	private List<String[]> list_WeekMeeting;
	int temp=0;
	// ����������б������ݶ���
	private List<Object> objList;
	
	@Resource
	B_T_Ufp_Meeting_RoominfoMapper mapperME;
	@Resource
	B_T_Flow_MeetingserviceMapper mapperMS;
	@Resource
	B_V_Flow_Meeting_OneweekuseMapper mapperMO;
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * ������ѡ��
	 * @return
	 * @throws Exception
	 */
	public String Select()throws Exception{
		
		B_T_Ufp_Meeting_RoominfoExample example = new B_T_Ufp_Meeting_RoominfoExample();
		example.or().andIsDeleteEqualTo(0);
		example.setOrderByClause(" sort asc");
		list_B_T_Ufp_Meeting_Roominfo = mapperME.selectByExample(example);
		
		//�ų���Ԥ��������
		B_T_Flow_MeetingserviceExample exampleM = new B_T_Flow_MeetingserviceExample();
		if (meetingserviceId != null&& !"".equals(meetingserviceId)) {
			exampleM.or().andStatusNotEqualTo("2")
			.andUuidEqualTo(meetingserviceId).andStarttimeBetween(starttime, endtime);
			exampleM.or().andStatusNotEqualTo("2")
			.andUuidEqualTo(meetingserviceId).andEndtimeBetween(starttime, endtime);// �ų���ǰ��¼ID
		} else {
			exampleM.or().andStatusNotEqualTo(
					"2").andStarttimeBetween(starttime, endtime);
			exampleM.or().andStatusNotEqualTo(
					"2").andEndtimeBetween(starttime, endtime);
		}
		List<B_T_Flow_Meetingservice> list_Ser = mapperMS.selectByExample(exampleM);
		int length = list_B_T_Ufp_Meeting_Roominfo.size();
		for(int i=length;i>0;i--){
			for(B_T_Flow_Meetingservice tmp:list_Ser){
				if(tmp.getMeetingroomId().equals(list_B_T_Ufp_Meeting_Roominfo.get(i-1).getUuid())){
					list_B_T_Ufp_Meeting_Roominfo.remove(i-1);
					break;
				}
			}
		}
		return SUCCESS;
	}
	
	/**
	 * ���������ͳ��
	 * @return
	 * @throws Exception
	 */
	public String Useroom()throws Exception{
		StringBuffer  sbSQL = new StringBuffer();
		
		sbSQL.append("select c.MEETINGROOM_NAME,decode(d.sumr,null,0,d.sumr) as sumr,decode(d.sumn,null,0,d.sumn) as sumn from B_T_UFP_MEETING_ROOMINFO c ");
		sbSQL.append(" left join ");
		sbSQL.append(" (select b.MEETINGROOM_ID,count(b.MEETINGROOM_ID) as sumr,sum(b.RESERVATIONNUM) as sumn from B_T_FLOW_MEETINGUSEINFO b ");
		sbSQL.append(" left join B_T_FLOW_MEETINGSERVICE a ");
		sbSQL.append(" on b.MEETINGSERVICE_ID = a.UUID where a.STATUS='1' ");
		if(StringTools.isNotNullAndHasValue(starttime)){
			sbSQL.append(" and a.STARTTIME>='"+starttime+" 00:00:00' ");
		}
		if(StringTools.isNotNullAndHasValue(endtime)){
			sbSQL.append(" and a.ENDTIME<='"+endtime+" 23:59:00' ");
		}
		sbSQL.append(" group by b.MEETINGROOM_ID) d ");
		sbSQL.append(" on c.UUID = d.MEETINGROOM_ID where c.IS_DELETE=0 order by c.SORT ");
		
		objList = jdbcTemplate.query(sbSQL.toString(), CustomRowMapper.newInstance());
		
		// ��ʽ��result һ��Ҫ��JSONObject
		result = CommonLogic.getResult(total, objList);
		
		return SUCCESS;
	}
	
	/**
	 * �������ͳ��
	 * @return
	 * @throws Exception
	 */
	public String Usedept()throws Exception{
		StringBuffer  sbSQL = new StringBuffer();
		
		sbSQL.append("select c.DEPT_NAME,decode(d.sumr,null,0,d.sumr) as sumr,decode(d.sumn,null,0,d.sumn) as sumn from C_T_SYS_DEPARTMENT c ");
		sbSQL.append(" left join ");
		sbSQL.append(" (select a.DEPTNAME,count(b.MEETINGROOM_ID) as sumr,sum(b.RESERVATIONNUM) as sumn from B_T_FLOW_MEETINGUSEINFO b ");
		sbSQL.append(" left join B_T_FLOW_MEETINGSERVICE a ");
		sbSQL.append(" on b.MEETINGSERVICE_ID = a.UUID where a.STATUS='1' ");
		if(StringTools.isNotNullAndHasValue(starttime)){
			sbSQL.append(" and a.STARTTIME>='"+starttime+" 00:00:00' ");
		}
		if(StringTools.isNotNullAndHasValue(endtime)){
			sbSQL.append(" and a.ENDTIME<='"+endtime+" 23:59:00' ");
		}
		sbSQL.append(" group by a.DEPTNAME) d ");
		sbSQL.append(" on c.DEPT_NAME = d.DEPTNAME where c.IS_DELETE=0 order by c.SORT ");
		
		objList = jdbcTemplate.query(sbSQL.toString(), CustomRowMapper.newInstance());
		
		// ��ʽ��result һ��Ҫ��JSONObject
		result = CommonLogic.getResult(total, objList);
		return SUCCESS;
	}
	
	
	
	/**
	 * ������һ�����ͳ��
	 */
	public String Week()throws Exception{

		Calendar cal = Calendar.getInstance();
		date = new Date[7];//��ǰһ�ܵ���������
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		Date tempDate = null;
		if(workDate != null)
		{
			tempDate =  format.parse(workDate);
		}
		if (tempDate == null) {
			Date newDate = new Date();
			int day = newDate.getDay();
			cal.add(Calendar.DATE, 1 - day);
			newDate = cal.getTime();
			tempDate = newDate;
		} else {
			int day = tempDate.getDay();
			cal.setTime(tempDate);
			cal.add(Calendar.DATE, 1 - day);
			tempDate = cal.getTime();
		}
		cal.set(tempDate.getYear() + 1900, tempDate.getMonth(), tempDate.getDate() - 1);
		for (int i = 0; i < 7; i++) {
			cal.add(Calendar.DATE, 1);
			date[i] = cal.getTime();
		}
		
		// ---�����Ҽ���
		B_T_Ufp_Meeting_RoominfoExample example1 = new B_T_Ufp_Meeting_RoominfoExample();
		example1.or().andIsDeleteEqualTo(0);
		example1.setOrderByClause(" sort asc,MEETINGROOM_NAME asc");
		list_B_T_Ufp_Meeting_Roominfo = mapperME.selectByExample(example1);
		// ---�����Ҽ��ؽ���

		B_V_Flow_Meeting_OneweekuseExample example = new B_V_Flow_Meeting_OneweekuseExample();
		B_V_Flow_Meeting_OneweekuseExample.Criteria criteria = example.createCriteria();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		criteria.andYmdtimeGreaterThanOrEqualTo(sdf.format(date[0]));
		criteria.andYmdtimeLessThanOrEqualTo(sdf.format(date[6]));
		//����������������򣨱��룩��ͬһ�������ң�������������
		example.setOrderByClause("sort asc,MEETINGROOM_NAME asc");
		//�ó���ǰ���ܵ�Ԥ�����
		list_B_V_Flow_Meeting_Oneweekuse=mapperMO.selectByExample(example);
		list_WeekMeeting = new ArrayList<String[]>();
		B_V_Flow_Meeting_Oneweekuse b_V_Flow_Meeting_Oneweekuse;
		String[] meetingWeek = new String[8];//ÿ�������ҳ���Ϊ8������˻�����������һ������
		String[] meetingDetail = new String[8];//������ϸ��Ϣ
		
		//ѭ��������
		for(int k=0;k<list_B_T_Ufp_Meeting_Roominfo.size();k++){
			//����һ������������meetingRoomName��ֵ
			String meetingRoomName =list_B_T_Ufp_Meeting_Roominfo.get(k).getMeetingroomName();
			meetingWeek[0]=meetingRoomName;
			meetingDetail[0] = meetingRoomName;
			/*
			 * list_B_V_Flow_Meeting_OneWeekUse�еļ�¼���������������������
			 * �����ǰ������������һ��������������ͬ����˵����һ���������Ѿ�ѭ�����ˣ�
			 * ����һ��������һ��ʹ��������뵽list_WeekMeeting�У����ſ��Խ�����
			 * һ�������ҵ�ѭ����
			 */
			for(int i=temp;i<list_B_V_Flow_Meeting_Oneweekuse.size();i++){
				b_V_Flow_Meeting_Oneweekuse=list_B_V_Flow_Meeting_Oneweekuse.get(i);
				if(!meetingRoomName.equals(b_V_Flow_Meeting_Oneweekuse.getMeetingroomName())){
					temp=i;//
					break;
				}
				meetingRoomName=b_V_Flow_Meeting_Oneweekuse.getMeetingroomName();
				//�������ڼ���Ӧ�÷���λ��
				int t = getIndex(b_V_Flow_Meeting_Oneweekuse.getYmdtime());
				if(t>8){
					continue;
				}
				//��message�������������������λ��t
				if(meetingWeek[t] != null && !"".equals(meetingWeek[t])) {
					meetingWeek[t] = meetingWeek[t]+b_V_Flow_Meeting_Oneweekuse.getStarttime()+"~"+b_V_Flow_Meeting_Oneweekuse.getEndtime()+"��Ԥ��";
					meetingDetail[t] = meetingDetail[t]+b_V_Flow_Meeting_Oneweekuse.getStarttime()+"~"+b_V_Flow_Meeting_Oneweekuse.getEndtime()+"��Ԥ��";
					
				}else{
					meetingWeek[t] =b_V_Flow_Meeting_Oneweekuse.getStarttime()+"~"+b_V_Flow_Meeting_Oneweekuse.getEndtime()+"��Ԥ��";
				}
			}
			list_WeekMeeting.add(meetingWeek);//���˲�����ӵ�list��
			meetingWeek = new String[8];//�����֮��Ϊ���������¿���һ���ռ䣬������newһ��
		}
		return SUCCESS;
	}
	
	/**
	 * 	�������ڼ��������λ��
	 * 	@param dateTime ����
	 * */
	public int getIndex(String dateTime) throws Exception{
		int i = 0;
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd"); 
		Calendar cal = Calendar.getInstance();
		cal.setTime(simple.parse(dateTime));
		int day = cal.get(Calendar.DAY_OF_WEEK)-1;//ȡ�����ڼ�
		if(day == 0){//���������죬����7
			day = 7;
		}
		i = day;
		return i;
	} 
	
	/**
	 * ɾ������
	 */
	public String detailsDelete()throws Exception {
			return SUCCESS;
	}

	/**
	 * ��ϸ�������
	 * 
	 */
	public String detailsLoad()throws Exception {
		return SUCCESS;
	}

	
	/**
	 * ����/��������
	 */
	public String detailsUpdate()throws Exception {
		return SUCCESS;
	}
	
	/**
	 * �б������
	 */
	public String listLoad() {
		return SUCCESS;
	}
		
	/**
	 * Grid���ݼ���
	 */
	public String gridLoad() throws Exception {
		return SUCCESS;
	}
	//==============================get/set==============================

	public String getParUId() {
		return parUId;
	}

	public List<B_T_Ufp_Meeting_Roominfo> getList_B_T_Ufp_Meeting_Roominfo() {
		return list_B_T_Ufp_Meeting_Roominfo;
	}

	public void setList_B_T_Ufp_Meeting_Roominfo(
			List<B_T_Ufp_Meeting_Roominfo> listBTUfpMeetingRoominfo) {
		list_B_T_Ufp_Meeting_Roominfo = listBTUfpMeetingRoominfo;
	}

	public void setParUId(String parUId) {
		this.parUId = parUId;
	}

	public String getParUName() {
		return parUName;
	}

	public void setParUName(String parUName) {
		this.parUName = parUName;
	}

	public String getMeetingserviceId() {
		return meetingserviceId;
	}

	public void setMeetingserviceId(String meetingserviceId) {
		this.meetingserviceId = meetingserviceId;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public List<B_V_Flow_Meeting_Oneweekuse> getList_B_V_Flow_Meeting_Oneweekuse() {
		return list_B_V_Flow_Meeting_Oneweekuse;
	}

	public void setList_B_V_Flow_Meeting_Oneweekuse(
			List<B_V_Flow_Meeting_Oneweekuse> listBVFlowMeetingOneweekuse) {
		list_B_V_Flow_Meeting_Oneweekuse = listBVFlowMeetingOneweekuse;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public Date[] getDate() {
		return date;
	}

	public void setDate(Date[] date) {
		this.date = date;
	}

	public List<String[]> getList_WeekMeeting() {
		return list_WeekMeeting;
	}

	public void setList_WeekMeeting(List<String[]> listWeekMeeting) {
		list_WeekMeeting = listWeekMeeting;
	}
	
}
