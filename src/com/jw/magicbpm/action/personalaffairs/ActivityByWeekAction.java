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
	 * 领导日程
	 * 
	 * 2013—1-15
	 */
	private static final long serialVersionUID = -2509510123333233597L;

	// 每月详细信息
	private String detailsString;
	// 日志记录ID
	private String id;
	// 日志记录开始时间
	private String start;
	// 日志记录
	private String title;
	// 工作计划情况
	private String plannig;
	// 日志记录结束时间
	private String end;
	// 日志记录是否全体显示
	private String allDay;
	// 日志执行操作
	private String actiontype;
	// 日志一周汇总表
	private List<B_V_Uft_Activity> list_B_V_Uft_Activity;
	// 领导权限
	private List<B_V_Ufp_LeadWorkManage> list_B_V_Ufp_LeadWorkManage;
	// 一周开始时间
	private String startTime;
	// 一周结束时间
	private String EndTime;
	// 初始化时间
	private String[] time;
	// 新建权限
	private String allPermission;
	// 领导
	private String leadname;
	// 一周工作汇总列表查询条件
	//工作安排汇总查询条件
	//开始时间
	private String yearmonthday;
	//结束时间
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
	 * 删除
	 */
	public String detailsDelete() {
		mapperA.deleteByPrimaryKey(id);
		return SUCCESS;
	}

	/**
	 * 详细信息加载
	 */
	public String detailsLoad() throws Exception {
		allPermission = "*";
		B_V_Ufp_LeadWorkManageExample example = null;
		try {
			// 领导
			example = new B_V_Ufp_LeadWorkManageExample();
			example.or().andUserSysNameEqualTo(
					SessionFactory.getSessionUserId());
			example.setOrderByClause("sort asc");
			list_B_V_Ufp_LeadWorkManage = mapperLWMV.selectByExample(example);
			//add to youjh 默认的是登陆的领导账号
			leadname = SessionFactory.getSessionUserId();
		} catch (Exception e) {
			throw e;
		} finally {// 释放资源
			example = null;
		}
		return SUCCESS;
	}

	/**
	 * 领导详细信息异步加载
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
			// 创建mybatis的SqlSession
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
		} finally {// 释放资源
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
	 * 新增及修改
	 */
	public String detailsUpdate() throws Exception {
		// 取得数据连接
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
		} finally {// 释放资源
			b_T_Uft_Activity = null;
		}
		return SUCCESS;
	}

	/**
	 * 根据日期计算属于第几周
	 * 
	 * @param date
	 *            格式 yyyy-MM-dd
	 * @throws ParseException
	 */
	private int getWeekOfYear(String date) throws Exception {

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // 设置每周的第一天为星期一
			// cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// 每周从周一开始
			cal.setMinimalDaysInFirstWeek(1); // 设置每周最少为1天
			cal.setTime(df.parse(date.substring(0, 10)));
			return cal.get(Calendar.WEEK_OF_YEAR);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 根据日期计算属于星期几
	 * 
	 * @param date
	 *            格式 yyyy-MM-dd
	 * @throws ParseException
	 */
	private int getDayOfWeek(String date) throws Exception {

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // 设置每周的第一天为星期一
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// 每周从周一开始
			cal.setMinimalDaysInFirstWeek(1); // 设置每周最少为1天
			cal.setTime(df.parse(date.substring(0, 10)));
			return cal.get(Calendar.DAY_OF_WEEK);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 根据日期计算本周第一天
	 * 
	 * @param date
	 *            格式 yyyy-MM-dd
	 * @throws ParseException
	 */
	private String getFirstOfWeek(String date) throws Exception {

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // 设置每周的第一天为星期一
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// 每周从周一开始
			cal.setMinimalDaysInFirstWeek(1); // 设置每周最少为1天
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
	 * 根据日期计算本周最后一天
	 * 
	 * @param date
	 *            格式 yyyy-MM-dd
	 * @throws ParseException
	 */
	private String getLastOfWeek(String date) throws Exception {

		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setFirstDayOfWeek(Calendar.MONDAY); // 设置每周的第一天为星期一
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);// 每周从周一开始
			cal.setMinimalDaysInFirstWeek(1); // 设置每周最少为1天
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
	 * Grid数据加载
	 */
	public String gridLoad() {
		return SUCCESS;
	}

	/**
	 * list数据加载
	 */
	public String listLoad() throws Exception {
		allPermission = "*";
		B_V_Uft_ActivityExample example = null;
		B_T_Uft_ActivityExample exampleT = null;
		B_T_Ufp_LeadWorkManageExample exampleL = null;
		SimpleDateFormat sdf = null;
		try {
			example = new B_V_Uft_ActivityExample();
			// 初始化时间 Start
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
			// 初始化时间end

			// 取得年，第几周
			example.or().andStartofweekEqualTo(startTime);
			list_B_V_Uft_Activity = mapperAV.selectByExample(example);

			// 存入列表中
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

			// begin权限部门的取得
			exampleL = new B_T_Ufp_LeadWorkManageExample();
			exampleL.or().andUserSysNameEqualTo(
					SessionFactory.getSessionUserId());
			exampleL.setOrderByClause("sort asc");
			List<B_T_Ufp_LeadWorkManage> list_B_T_Ufp_DeptWorkManage = mapperLWM
					.selectByExample(exampleL);
			// end
			// 判断是否有权限
			if (list_B_T_Ufp_DeptWorkManage.size() > 0) {
				allPermission = "*";
			} else {
				allPermission = "#";
			}
		} catch (Exception e) {
			throw e;
		} finally {// 释放资源
			example = null;
			exampleT = null;
			exampleL = null;
			sdf = null;
		}
		return SUCCESS;
	}

	/**
	 * 汇总页面
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
			//add to youjh 日期查询条件
			if (StringTools.isNotNullAndHasValue(yearmonthday)) {
				criteria.andStartofweekGreaterThanOrEqualTo(yearmonthday);
			}
			if (StringTools.isNotNullAndHasValue(yearmonthdayend)) {
				criteria.andEndofweekLessThanOrEqualTo(yearmonthdayend);
			}
			// 记录条数的记录
			total = mapperASV.countByExample(example);

			// 分页
			example.or().setLimitValue(getRowStart(), getRowEnd());

			example.setOrderByClause("STARTOFWEEK desc");

			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperASV
					.selectByExample(example));
			;

			// begin权限部门的取得
			exampleLWM = new B_T_Ufp_LeadWorkManageExample();
			exampleLWM.or().andUserSysNameEqualTo(
					SessionFactory.getSessionUserId());
			exampleLWM.setOrderByClause("sort asc");
			List<B_T_Ufp_LeadWorkManage> list_B_T_Ufp_DeptWorkManage = mapperLWM
					.selectByExample(exampleLWM);
			// end
			// 判断是否有权限
			if (list_B_T_Ufp_DeptWorkManage.size() > 0) {
				allPermission = "*";
			} else {
				allPermission = "#";
			}
		} catch (Exception e) {
			throw e;
		} finally {// 释放资源
			example = null;
			exampleLWM = null;
		}
		return SUCCESS;
	}

	//-------------------------get set 方法----------------------------------
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
