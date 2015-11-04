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
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.dao.personalaffairs.B_T_Ufp_LeadWorkManageMapper;
import com.jw.magicbpm.dao.personalaffairs.B_T_Uft_ActivityMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Ufp_LeadWorkManageMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Uft_ActivityMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Uft_ActivitySummerMapper;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_LeadWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_LeadWorkManageExample;
import com.jw.magicbpm.model.personalaffairs.B_T_Uft_Activity;
import com.jw.magicbpm.model.personalaffairs.B_T_Uft_ActivityExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManage;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_LeadWorkManageExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_Activity;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_ActivityExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Uft_ActivitySummerExample;

public class ActivityByWeekAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * �쵼�ճ�
	 * 
	 * 2013��1-15
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
	private List<B_V_Uft_Activity> list_B_V_Uft_Activity;
	// �쵼Ȩ��
	private List<B_V_Ufp_LeadWorkManage> list_B_V_Ufp_LeadWorkManage;
	// һ�ܿ�ʼʱ��
	private String startTime;
	// һ�ܽ���ʱ��
	private String EndTime;
	// ��ʼ��ʱ��
	private String[] time;
	// �½�Ȩ��
	private String allPermission;
	// �쵼
	private String leadname;
	// һ�ܹ��������б��ѯ����
	//�������Ż��ܲ�ѯ����
	//��ʼʱ��
	private String yearmonthday;
	//����ʱ��
	private String yearmonthdayend;
	@Resource
	private B_T_Uft_ActivityMapper mapperA;
	@Resource
	private B_V_Uft_ActivityMapper mapperAV;
	@Resource
	private B_V_Ufp_LeadWorkManageMapper mapperLWMV;
	@Resource
	private B_T_Ufp_LeadWorkManageMapper mapperLWM;
	@Resource
	private B_V_Uft_ActivitySummerMapper mapperASV;

	/**
	 * ɾ��
	 */
	public String detailsDelete() {
		mapperA.deleteByPrimaryKey(id);
		return SUCCESS;
	}

	/**
	 * ��ϸ��Ϣ����
	 */
	public String detailsLoad() throws Exception {
		allPermission = "*";
		B_V_Ufp_LeadWorkManageExample example = null;
		try {
			// �쵼
			example = new B_V_Ufp_LeadWorkManageExample();
			example.or().andUserSysNameEqualTo(
					SessionFactory.getSessionUserId());
			example.setOrderByClause("sort asc");
			list_B_V_Ufp_LeadWorkManage = mapperLWMV.selectByExample(example);
			//add to youjh Ĭ�ϵ��ǵ�½���쵼�˺�
			leadname = SessionFactory.getSessionUserId();
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			example = null;
		}
		return SUCCESS;
	}

	/**
	 * �쵼��ϸ��Ϣ�첽����
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public String detailsLoadjax() throws Exception {
		List<Map> listMap = null;
		detailsString = null;
		allPermission = "*";
		ActivityByWeekdoSql dosql = null;
		 SqlSessionFactory obj = null;
		 SqlSession sqlSession = null;
		try {
			obj = (SqlSessionFactory)BeanLocator.getService("sqlSessionFactory");
			// ����mybatis��SqlSession
			sqlSession = obj.openSession();
			dosql = new ActivityByWeekdoSql(sqlSession);
			listMap = dosql.doQuery("select * from B_T_UFT_ACTIVITY");
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
			if (sqlSession != null) {
				sqlSession.close();
				sqlSession = null;
			}
		}
		return SUCCESS;
	}

	/**
	 * �������޸�
	 */
	public String detailsUpdate() throws Exception {
		// ȡ����������
		String returnMsg = "";
		B_T_Uft_Activity b_T_Uft_Activity = null;
		try {
			b_T_Uft_Activity = new B_T_Uft_Activity();
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
				b_T_Uft_Activity.setUserId(leadname);
				b_T_Uft_Activity.setDeptId(SessionFactory.getSessionDeptId());
				mapperA.updateByPrimaryKeySelective(b_T_Uft_Activity);
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
				b_T_Uft_Activity.setUserId(leadname);
				b_T_Uft_Activity.setDeptId(SessionFactory.getSessionDeptId());
				mapperA.insertSelective(b_T_Uft_Activity);

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

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // ����ÿ�ܵĵ�һ��Ϊ����һ
			// cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// ÿ�ܴ���һ��ʼ
			cal.setMinimalDaysInFirstWeek(1); // ����ÿ������Ϊ1��
			cal.setTime(df.parse(date.substring(0, 10)));
			return cal.get(Calendar.WEEK_OF_YEAR);
		} catch (Exception e) {
			throw e;
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

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // ����ÿ�ܵĵ�һ��Ϊ����һ
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// ÿ�ܴ���һ��ʼ
			cal.setMinimalDaysInFirstWeek(1); // ����ÿ������Ϊ1��
			cal.setTime(df.parse(date.substring(0, 10)));
			return cal.get(Calendar.DAY_OF_WEEK);
		} catch (Exception e) {
			throw e;
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

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
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

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
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
		}
	}

	/**
	 * Grid���ݼ���
	 */
	public String gridLoad() {
		return SUCCESS;
	}

	/**
	 * list���ݼ���
	 */
	public String listLoad() throws Exception {
		allPermission = "*";
		B_V_Uft_ActivityExample example = null;
		B_T_Uft_ActivityExample exampleT = null;
		B_T_Ufp_LeadWorkManageExample exampleL = null;
		SimpleDateFormat sdf = null;
		try {
			example = new B_V_Uft_ActivityExample();
			// ��ʼ��ʱ�� Start
			sdf = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			Date newDate = null;
			if (startTime == null || "".equals(startTime)) {
				newDate = new Date();
				int day = newDate.getDay();
				
				if (day != 0)
					cal.add(Calendar.DATE, 1 - day);
				else
					cal.add(Calendar.DATE, -6);

				newDate = cal.getTime();
				startTime = sdf.format(newDate);
			} else {
				newDate = sdf.parse(startTime);
				cal.set(newDate.getYear() + 1900, newDate.getMonth(), newDate
						.getDate());
			}
			time = new String[7];
			for (int i = 0; i < time.length; i++) {
				newDate = cal.getTime();
				time[i] = sdf.format(newDate);
				cal.add(Calendar.DATE, 1);
			}
			startTime = time[0];
			cal.add(Calendar.DATE, -1);
			newDate = cal.getTime();
			EndTime = sdf.format(newDate);
			// ��ʼ��ʱ��end

			// ȡ���꣬�ڼ���
			example.or().andStartofweekEqualTo(startTime);
			list_B_V_Uft_Activity = mapperAV.selectByExample(example);

			// �����б���
			for (int j = 0; j < list_B_V_Uft_Activity.size(); j++) {

				exampleT = new B_T_Uft_ActivityExample();

				for (int i = 0; i < time.length; i++) {
					exampleT.clear();
					exampleT.or().andStartTimeLike(
							"%" + time[i].replaceAll("-", "/") + "%")
							.andUserIdEqualTo(
									list_B_V_Uft_Activity.get(j).getUserId());
					List<B_T_Uft_Activity> list_B_T_Uft_Activity = new ArrayList<B_T_Uft_Activity>();
					list_B_T_Uft_Activity = mapperA.selectByExample(exampleT);
					String Activity = "";
					for (int k = 0; k < list_B_T_Uft_Activity.size(); k++) {
						Activity = Activity
								+ list_B_T_Uft_Activity.get(k).getTitle()
								+ "\r\n";
					}
					if (0 == i) {
						list_B_V_Uft_Activity.get(j).setMonday(Activity);
					} else if (1 == i) {
						list_B_V_Uft_Activity.get(j).setTuesday(Activity);
					} else if (2 == i) {
						list_B_V_Uft_Activity.get(j).setWednesday(Activity);
					} else if (3 == i) {
						list_B_V_Uft_Activity.get(j).setThursday(Activity);
					} else if (4 == i) {
						list_B_V_Uft_Activity.get(j).setFriday(Activity);
					} else if (5 == i) {
						list_B_V_Uft_Activity.get(j).setSaturday(Activity);
					} else if (6 == i) {
						list_B_V_Uft_Activity.get(j).setSunday(Activity);
					}
				}
			}

			// beginȨ�޲��ŵ�ȡ��
			exampleL = new B_T_Ufp_LeadWorkManageExample();
			exampleL.or().andUserSysNameEqualTo(
					SessionFactory.getSessionUserId());
			exampleL.setOrderByClause("sort asc");
			List<B_T_Ufp_LeadWorkManage> list_B_T_Ufp_DeptWorkManage = mapperLWM
					.selectByExample(exampleL);
			// end
			// �ж��Ƿ���Ȩ��
			if (list_B_T_Ufp_DeptWorkManage.size() > 0) {
				allPermission = "*";
			} else {
				allPermission = "#";
			}
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			example = null;
			exampleT = null;
			exampleL = null;
			sdf = null;
		}
		return SUCCESS;
	}

	/**
	 * ����ҳ��
	 * @return
	 * @throws Exception
	 */
	public String summerListLoad() throws Exception {
		allPermission = "*";
		B_V_Uft_ActivitySummerExample example = null;
		B_T_Ufp_LeadWorkManageExample exampleLWM = null;
		try {
			example = new B_V_Uft_ActivitySummerExample();
			B_V_Uft_ActivitySummerExample.Criteria criteria = example.createCriteria();
			//add to youjh ���ڲ�ѯ����
			if (StringTools.isNotNullAndHasValue(yearmonthday)) {
				criteria.andStartofweekGreaterThanOrEqualTo(yearmonthday);
			}
			if (StringTools.isNotNullAndHasValue(yearmonthdayend)) {
				criteria.andEndofweekLessThanOrEqualTo(yearmonthdayend);
			}
			// ��¼�����ļ�¼
			total = mapperASV.countByExample(example);

			// ��ҳ
			example.or().setLimitValue(getRowStart(), getRowEnd());

			example.setOrderByClause("STARTOFWEEK desc");

			// ��ʽ��result һ��Ҫ��JSONObject
			result = CommonLogic.getResult(total, mapperASV
					.selectByExample(example));
			;

			// beginȨ�޲��ŵ�ȡ��
			exampleLWM = new B_T_Ufp_LeadWorkManageExample();
			exampleLWM.or().andUserSysNameEqualTo(
					SessionFactory.getSessionUserId());
			exampleLWM.setOrderByClause("sort asc");
			List<B_T_Ufp_LeadWorkManage> list_B_T_Ufp_DeptWorkManage = mapperLWM
					.selectByExample(exampleLWM);
			// end
			// �ж��Ƿ���Ȩ��
			if (list_B_T_Ufp_DeptWorkManage.size() > 0) {
				allPermission = "*";
			} else {
				allPermission = "#";
			}
		} catch (Exception e) {
			throw e;
		} finally {// �ͷ���Դ
			example = null;
			exampleLWM = null;
		}
		return SUCCESS;
	}

	//-------------------------get set ����----------------------------------
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

	public List<B_V_Uft_Activity> getList_B_V_Uft_Activity() {
		return list_B_V_Uft_Activity;
	}

	public void setList_B_V_Uft_Activity(
			List<B_V_Uft_Activity> listBVUftActivity) {
		list_B_V_Uft_Activity = listBVUftActivity;
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public List<B_V_Ufp_LeadWorkManage> getList_B_V_Ufp_LeadWorkManage() {
		return list_B_V_Ufp_LeadWorkManage;
	}

	public void setList_B_V_Ufp_LeadWorkManage(
			List<B_V_Ufp_LeadWorkManage> listBVUfpLeadWorkManage) {
		list_B_V_Ufp_LeadWorkManage = listBVUfpLeadWorkManage;
	}

	public String getLeadname() {
		return leadname;
	}

	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}

	public String getYearmonthday() {
		return yearmonthday;
	}

	public void setYearmonthday(String yearmonthday) {
		this.yearmonthday = yearmonthday;
	}

	public String getYearmonthdayend() {
		return yearmonthdayend;
	}

	public void setYearmonthdayend(String yearmonthdayend) {
		this.yearmonthdayend = yearmonthdayend;
	}

}
