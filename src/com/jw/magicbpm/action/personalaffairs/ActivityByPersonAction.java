package com.jw.magicbpm.action.personalaffairs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.bean.BeanLocator;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.util.GUID;
import com.jw.magicbpm.dao.personalaffairs.B_T_Ufp_Person_ActivityMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Ufp_Person_ActivityMapper;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_Person_Activity;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_Person_ActivityExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Person_Activity;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Person_ActivityExample;

public class ActivityByPersonAction extends JwBaseAction implements
		JwBaseActionI {

	/**
	 * ���˹�����־
	 * 
	 * 2013��02-21
	 */
	private static final long serialVersionUID = -2509510123333233597L;

	// ÿ����ϸ��Ϣ
	private String detailsString;
	// ��־��¼ID
	private String id;
	// ��־��¼��ʼʱ��
	private String start;
	// ��־��¼
	private String title;
	// �����ƻ����
	private String plannig;
	// ��־��¼����ʱ��
	private String end;
	// ��־��¼�Ƿ�ȫ����ʾ
	private String allDay;
	// ��־ִ�в���
	private String actiontype;
	// ��־һ�ܻ��ܱ�
	private List<B_V_Ufp_Person_Activity> list_B_V_Ufp_Person_Activity;
	// һ�ܿ�ʼʱ��
	private String StartTime;
	// һ�ܽ���ʱ��
	private String EndTime;
	// ��ʼ��ʱ��
	private String[] time;
	@Resource
	private B_T_Ufp_Person_ActivityMapper mapperPA;
	@Resource
	private B_V_Ufp_Person_ActivityMapper mapperPAV;

	/**
	 * ɾ��
	 */
	public String detailsDelete() {
		mapperPA.deleteByPrimaryKey(id);
		return SUCCESS;
	}
	/**
	 * ��ϸ��Ϣ
	 */
	public String detailsLoad() {
		allPermission = "*";
		return SUCCESS;

	}
	/**
	 * ��־��ϸ�첽����
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public String detailsLoadjax() throws Exception {
		List<Map> listMap = null;
		detailsString = null;
		ActivityByWeekdoSql dosql = null;
		allPermission = "*";
		SqlSessionFactory obj = null;
		SqlSession sqlSession = null;
		try {
			obj = (SqlSessionFactory)BeanLocator.getService("sqlSessionFactory");
			// ����mybatis��SqlSession
			sqlSession = obj.openSession();
			dosql = new ActivityByWeekdoSql(sqlSession);
			listMap = dosql.doQuery("select * from B_T_UFP_PERSON_ACTIVITY");
			detailsString = listMap.toString();
			dosql.closeConn();
			detailsString = detailsString.replace("=", ":");
			detailsString = detailsString.replace("START_TIME", "start");
			detailsString = detailsString.replace("END_TIME", "end");
			detailsString = detailsString.replace("TITLE", "title");
			detailsString = detailsString.replace("ID", "id");
			detailsString = detailsString.replace("PLANNIG", "plannig");
			detailsString = detailsString.replace("ALLDAY", "allDay");
			detailsString = detailsString.replace("'false'", "false");
			detailsString = detailsString.replace("BACKGROUNDCOLOR",
					"backgroundColor");
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			listMap = null;
			dosql = null;
			obj = null;
			if(sqlSession!=null){
				sqlSession.close();
				sqlSession = null;
			}
		}
		return SUCCESS;
	}

	/**
	 * ��־�������޸�
	 */
	public String detailsUpdate() throws Exception {
		String returnMsg = "";
		B_T_Ufp_Person_Activity b_T_Uft_Activity = null;
		try {
			b_T_Uft_Activity = new B_T_Ufp_Person_Activity();
			if (actiontype.equals("edit")) {
				if (title != null && !"".equals(title)) {
					b_T_Uft_Activity.setUuid(id);
					b_T_Uft_Activity.setId(id);
					b_T_Uft_Activity.setTitle(title);
				} else if (start != null && !"".equals(start)) {
					if (end != null && !"".equals(end)) {
						b_T_Uft_Activity.setUuid(id);
						b_T_Uft_Activity.setId(id);
						start = start.replaceAll("-", "/");
						end = end.replaceAll("-", "/");
						b_T_Uft_Activity.setStartTime(start);
						b_T_Uft_Activity.setEndTime(end);
						b_T_Uft_Activity.setYears(start.substring(0, 4));
						b_T_Uft_Activity.setWeekofyear(String
								.valueOf(getWeekOfYear(start)));
						b_T_Uft_Activity.setDayofweek(String
								.valueOf(getDayOfWeek(start)));
						b_T_Uft_Activity.setStartofweek(getFirstOfWeek(start));
						b_T_Uft_Activity.setEndofweek(getLastOfWeek(start));
					} else {
						b_T_Uft_Activity.setUuid(id);
						b_T_Uft_Activity.setId(id);
						start = start.replaceAll("-", "/");
						b_T_Uft_Activity.setStartTime(start);
						b_T_Uft_Activity.setEndTime(start);
						b_T_Uft_Activity.setYears(start.substring(0, 4));
						b_T_Uft_Activity.setWeekofyear(String
								.valueOf(getWeekOfYear(start)));
						b_T_Uft_Activity.setDayofweek(String
								.valueOf(getDayOfWeek(start)));
						b_T_Uft_Activity.setStartofweek(getFirstOfWeek(start));
						b_T_Uft_Activity.setEndofweek(getLastOfWeek(start));
					}
				}
				if (plannig != null && !"".equals(plannig)) {
					b_T_Uft_Activity.setUuid(id);
					b_T_Uft_Activity.setId(id);
					b_T_Uft_Activity.setPlannig(plannig);
				}
				b_T_Uft_Activity.setUserId(SessionFactory.getSessionUserId());
				b_T_Uft_Activity.setDeptId(SessionFactory.getSessionDeptId());
				mapperPA.updateByPrimaryKeySelective(b_T_Uft_Activity);
			} else if (actiontype.equals("save")) {
				if (id == null) {
					id = new GUID().toString();
				}
				b_T_Uft_Activity.setUuid(id);
				b_T_Uft_Activity.setId(id);
				b_T_Uft_Activity.setTitle(title);
				b_T_Uft_Activity.setPlannig(plannig);
				b_T_Uft_Activity.setAllday(allDay);
				start = start.replaceAll("-", "/");
				end = end.replaceAll("-", "/");
				b_T_Uft_Activity.setStartTime(start);
				b_T_Uft_Activity.setEndTime(end);
				b_T_Uft_Activity.setYears(start.substring(0, 4));
				b_T_Uft_Activity.setWeekofyear(String
						.valueOf(getWeekOfYear(start)));
				b_T_Uft_Activity.setStartofweek(getFirstOfWeek(start));
				b_T_Uft_Activity.setEndofweek(getLastOfWeek(start));
				b_T_Uft_Activity.setDayofweek(String
						.valueOf(getDayOfWeek(start)));
				b_T_Uft_Activity.setUserId(SessionFactory.getSessionUserId());
				b_T_Uft_Activity.setDeptId(SessionFactory.getSessionDeptId());
				mapperPA.insertSelective(b_T_Uft_Activity);
			}
			sucessMessage(returnMsg);

		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			b_T_Uft_Activity = null;
		}
		return SUCCESS;
	}

	/**
	 * �������ڼ������ڵڼ���
	 * 
	 * @param date
	 *            ��ʽ yyyy-MM-dd
	 * @throws ParseException
	 */
	private int getWeekOfYear(String date) throws Exception {

		SimpleDateFormat df = null;
		try {
			df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // ����ÿ�ܵĵ�һ��Ϊ����һ
			// cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// ÿ�ܴ���һ��ʼ
			cal.setMinimalDaysInFirstWeek(1); // ����ÿ������Ϊ1��
			cal.setTime(df.parse(date.substring(0, 10)));
			return cal.get(Calendar.WEEK_OF_YEAR);
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			df = null;
		}
	}

	/**
	 * �������ڼ����������ڼ�
	 * 
	 * @param date
	 *            ��ʽ yyyy-MM-dd
	 * @throws ParseException
	 */
	private int getDayOfWeek(String date) throws Exception {
		SimpleDateFormat df = null;
		try {
			df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // ����ÿ�ܵĵ�һ��Ϊ����һ
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// ÿ�ܴ���һ��ʼ
			cal.setMinimalDaysInFirstWeek(1); // ����ÿ������Ϊ1��
			cal.setTime(df.parse(date.substring(0, 10)));
			return cal.get(Calendar.DAY_OF_WEEK);
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			df = null;
		}
	}

	/**
	 * �������ڼ��㱾�ܵ�һ��
	 * 
	 * @param date
	 *            ��ʽ yyyy-MM-dd
	 * @throws ParseException
	 */
	private String getFirstOfWeek(String date) throws Exception {
		SimpleDateFormat df = null;
		try {
			df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // ����ÿ�ܵĵ�һ��Ϊ����һ
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// ÿ�ܴ���һ��ʼ
			cal.setMinimalDaysInFirstWeek(1); // ����ÿ������Ϊ1��
			cal.setTime(df.parse(date.substring(0, 10)));
			int day = cal.get(Calendar.DAY_OF_WEEK) - 1;
			if (day != 0)
				cal.add(Calendar.DATE, 1 - day);
			else
				cal.add(Calendar.DATE, -6);
			Date newDate = null;
			newDate = cal.getTime();
			return df.format(newDate);
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			df = null;
		}
	}

	/**
	 * �������ڼ��㱾�����һ��
	 * 
	 * @param date
	 *            ��ʽ yyyy-MM-dd
	 * @throws ParseException
	 */
	private String getLastOfWeek(String date) throws Exception {
		SimpleDateFormat df = null;
		try {
			df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // ����ÿ�ܵĵ�һ��Ϊ����һ
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// ÿ�ܴ���һ��ʼ
			cal.setMinimalDaysInFirstWeek(1); // ����ÿ������Ϊ1��
			cal.setTime(df.parse(date.substring(0, 10)));
			int day = cal.get(Calendar.DAY_OF_WEEK) - 1;
			if (day != 0)
				cal.add(Calendar.DATE, 7 - day);
			else
				cal.add(Calendar.DATE, 1);
			Date newDate = null;
			newDate = cal.getTime();
			return df.format(newDate);
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			df = null;
		}
	}

	/**
	 *  Grid���ݼ���
	 */
	public String gridLoad() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	/**
	 *  list���ݼ���
	 */
	@SuppressWarnings("deprecation")
	public String listLoad() throws Exception {
		allPermission = "*";
		B_V_Ufp_Person_ActivityExample example = null;
		B_T_Ufp_Person_ActivityExample exampleT = null;
		SimpleDateFormat sdf = null;
		try {
			example = new B_V_Ufp_Person_ActivityExample();
			exampleT = new B_T_Ufp_Person_ActivityExample();
			// ��ʼ��ʱ�� Start
			sdf = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			Date newDate = null;
			if (StartTime == null || "".equals(StartTime)) {
				newDate = new Date();

				int day = newDate.getDay();

				if (day != 0)
					cal.add(Calendar.DATE, 1 - day);
				else
					cal.add(Calendar.DATE, -6);

				newDate = cal.getTime();
				StartTime = sdf.format(newDate);
			} else {
				newDate = sdf.parse(StartTime);
				cal.set(newDate.getYear() + 1900, newDate.getMonth(), newDate
						.getDate());
			}

			time = new String[7];
			for (int i = 0; i < time.length; i++) {
				newDate = cal.getTime();
				time[i] = sdf.format(newDate);
				cal.add(Calendar.DATE, 1);
			}
			StartTime = time[0];
			cal.add(Calendar.DATE, -1);
			newDate = cal.getTime();
			EndTime = sdf.format(newDate);
			// ��ʼ��ʱ��end

			// ȡ���꣬�ڼ���
			example.or().andStartofweekEqualTo(StartTime);
			list_B_V_Ufp_Person_Activity = mapperPAV.selectByExample(example);

			// �����б���
			for (int j = 0; j < list_B_V_Ufp_Person_Activity.size(); j++) {

				for (int i = 0; i < time.length; i++) {
					exampleT.clear();
					exampleT.or().andStartTimeLike(
							"%" + time[i].replaceAll("-", "/") + "%")
							.andUserIdEqualTo(
									list_B_V_Ufp_Person_Activity.get(j)
											.getUserId());
					List<B_T_Ufp_Person_Activity> list_B_T_Ufp_Person_Activity = new ArrayList<B_T_Ufp_Person_Activity>();
					list_B_T_Ufp_Person_Activity = mapperPA
							.selectByExample(exampleT);
					String Activity = "";
					for (int k = 0; k < list_B_T_Ufp_Person_Activity.size(); k++) {
						Activity = Activity
								+ list_B_T_Ufp_Person_Activity.get(k)
										.getTitle() + "\r\n";
					}
					if (0 == i) {
						list_B_V_Ufp_Person_Activity.get(j).setMonday(Activity);
					} else if (1 == i) {
						list_B_V_Ufp_Person_Activity.get(j)
								.setTuesday(Activity);
					} else if (2 == i) {
						list_B_V_Ufp_Person_Activity.get(j).setWednesday(
								Activity);
					} else if (3 == i) {
						list_B_V_Ufp_Person_Activity.get(j).setThursday(
								Activity);
					} else if (4 == i) {
						list_B_V_Ufp_Person_Activity.get(j).setFriday(Activity);
					} else if (5 == i) {
						list_B_V_Ufp_Person_Activity.get(j).setSaturday(
								Activity);
					} else if (6 == i) {
						list_B_V_Ufp_Person_Activity.get(j).setSunday(Activity);
					}
				}
			}
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			example = null;
			exampleT = null;
			sdf = null;
		}
		return SUCCESS;
	}

	//--------------------------------get set ����----------------------------
	public String getDetailsString() {
		return detailsString;
	}

	public void setDetailsString(String detailsString) {
		this.detailsString = detailsString;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getAllDay() {
		return allDay;
	}

	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}

	public String getActiontype() {
		return actiontype;
	}

	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}

	public String getPlannig() {
		return plannig;
	}

	public void setPlannig(String plannig) {
		this.plannig = plannig;
	}

	public List<B_V_Ufp_Person_Activity> getList_B_V_Ufp_Person_Activity() {
		return list_B_V_Ufp_Person_Activity;
	}

	public void setList_B_V_Ufp_Person_Activity(
			List<B_V_Ufp_Person_Activity> listBVUfpPersonActivity) {
		list_B_V_Ufp_Person_Activity = listBVUfpPersonActivity;
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

}