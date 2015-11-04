package com.jw.baseframe.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import java.util.GregorianCalendar;

/**
 * 
 * @author Administrator
 * 
 */
	
public class DateTools {
	
	private static Date nowDate=null;
	
    public DateTools() {
    }

    public static String getServerDateTime() {
    	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			String time =df.format(new Date()) +" "+ System.nanoTime(); 
    	return time;
        }
    /**
     * 取得系统时间
     * 
     * @param Kind
     *            返回值的类型 1: yyyyMMdd 2: yyyy/MM/dd 3: hhmmss 4: hh:mm:ss
     *            5:yyyyMMdd hhmmss 6: yyyy/MM/dd hh:mm:ss 7:
     *            yyyy/MM/dd|hh:mm:ss 8: yyyyMMddhhmmss 9: yyyy-MM-dd 10:
     *            yyyy-MM-dd hh:mm:ss 11:yyyy年MM月dd日 12:yyyy 13:MMdd
     * @return 系统时间
     * @throws Exception
     *             异常
     */
    public static String getServerDateTime(int Kind) {
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	Date currentTime = new java.util.Date();
	String strDate = formatter.format(currentTime);
	StringTokenizer token = new StringTokenizer(strDate, "-");
	String year = token.nextToken();
	String month = token.nextToken();
	String day = token.nextToken();
	String hh = token.nextToken();
	String mm = token.nextToken();
	String ss = token.nextToken();
	String strServerDateTime = "";
	switch (Kind) {
	case 1:
	    strServerDateTime = year + month + day;
	    break;
	case 2:
	    strServerDateTime = year + "/" + month + "/" + day;
	    break;
	case 3:
	    strServerDateTime = hh + mm + ss;
	    break;
	case 4:
	    strServerDateTime = hh + ":" + mm + ":" + ss;
	    break;
	case 5:
	    strServerDateTime = year + month + day + " " + hh + mm + ss;
	    break;
	case 6:
	    strServerDateTime = year + "/" + month + "/" + day + " " + hh + ":"
		    + mm + ":" + ss;
	    break;
	case 7:
	    strServerDateTime = year + "/" + month + "/" + day + "|" + hh + ":"
		    + mm + ":" + ss;
	    break;
	case 8:
	    strServerDateTime = year + month + day + hh + mm + ss;
	    break;
	case 9:
	    strServerDateTime = year + "-" + month + "-" + day;
	    break;
	case 10:
	    strServerDateTime = year + "-" + month + "-" + day + " " + hh + ":"
		    + mm + ":" + ss;
	    break;
	case 11:
	    strServerDateTime = year + "年" + month + "月" + day + "日";
	    break;
	case 12:
	    strServerDateTime = year;
	    break;
	case 13:
	    strServerDateTime = month + day;
	    break;
	case 14:
	    strServerDateTime = hh;
	    break;
	case 15:
	    strServerDateTime = year + month;
	    break;
	case 16:
	    strServerDateTime = hh + ":"+ mm;
	    break;
	case 17:
	    strServerDateTime = month;
	    break;
	default:
	    break;
	}
	return strServerDateTime;
    }

    /**
     * 取得某个日期段的开始日期
     * 
     * @param Kind
     *            返回值的类型 1: 今天 2: 昨天 3: 明天 4: 本周 5: 上周 6: 下周 7: 本月 8: 上月 9: 下月
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getDateFrom(int kind) {
	if (kind == 1) { // 今天
	    return getTodayFrom();
	}
	if (kind == 2) { // 昨天
	    return getYestodayFrom();
	}
	if (kind == 3) { // 明天
	    return getNextdayFrom();
	}
	if (kind == 4) { // 本周
	    return getWeekFrom();
	}
	if (kind == 5) { // 上周
	    return getPreWeekFrom();
	}
	if (kind == 6) { // 下周
	    return getNextWeekFrom();
	}
	if (kind == 7) { // 本月
	    return getMonthFrom();
	}
	if (kind == 8) { // 上月
	    return getPreMonthFrom();
	}
	if (kind == 9) { // 下月
	    return getNextMonthFrom();
	}
	return "";
    }

    /**
     * 取得某个日期段的结束日期
     * 
     * @param Kind
     *            返回值的类型 1: 今天 2: 昨天 3: 明天 4: 本周 5: 上周 6: 下周 7: 本月 8: 上月 9: 下月
     * @return 结束日期 格式：yyyy-MM-dd "23:59:59"
     */
    public static String getDateTo(int kind) {
	if (kind == 1) { // 今天
	    return getTodayTo();
	}
	if (kind == 2) { // 昨天
	    return getYestodayTo();
	}
	if (kind == 3) { // 明天
	    return getNextdayTo();
	}
	if (kind == 4) { // 本周
	    return getWeekTo();
	}
	if (kind == 5) { // 上周
	    return getPreWeekTo();
	}
	if (kind == 6) { // 下周
	    return getNextWeekTo();
	}
	if (kind == 7) { // 本月
	    return getMonthTo();
	}
	if (kind == 8) { // 上月
	    return getPreMonthTo();
	}
	if (kind == 9) { // 下月
	    return getNextMonthTo();
	}
	return "";
    }
    
    /**
     * 根据传进的日期,以及X得到X天后的日期
     * 
     * @return 日期 格式：yyyy-MM-dd
     */
    public static String getAfterDate (String date,int several) throws Exception
    {
    	//Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println("Now Date is-->" + sdf.format(now));
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(date));
		long days = several;
		long timeone = cal.getTimeInMillis();
		long result = timeone + days * 24 * 60 * 60 * 1000;
		Date getDate = new Date(result);
		//System.out.println("result time-->" + sdf.format(getDate));
    	return sdf.format(getDate).toString();
    }

    /**
     * 取得上个月的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getPreMonthFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.MONTH, -1);
	int dayofmonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
	cal.add(GregorianCalendar.DAY_OF_YEAR, 1 - dayofmonth);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得下个月的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getNextMonthFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.MONTH, +1);
	int dayofmonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
	cal.add(GregorianCalendar.DAY_OF_YEAR, 1 - dayofmonth);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得上个月的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getPreMonthTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofmonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
	cal.add(GregorianCalendar.DAY_OF_YEAR, 1 - dayofmonth - 1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得下个月的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getNextMonthTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.MONTH, +2);
	int dayofmonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
	cal.add(GregorianCalendar.DAY_OF_YEAR, 1 - dayofmonth - 1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得本月的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getMonthFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofmonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
	cal.add(GregorianCalendar.DAY_OF_YEAR, 1 - dayofmonth);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得本月的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getMonthTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.MONTH, 1);
	int dayofmonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
	cal.add(GregorianCalendar.DAY_OF_YEAR, 1 - dayofmonth - 1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得上周的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getPreWeekFrom() {
	// 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 =
	// Friday, 6 = Saturday
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofweek = cal.get(GregorianCalendar.DAY_OF_WEEK);
	if (dayofweek == GregorianCalendar.SUNDAY) {
	    dayofweek = GregorianCalendar.SUNDAY + 7;
	}
	cal.add(GregorianCalendar.DAY_OF_YEAR, GregorianCalendar.MONDAY
		- dayofweek - 7);

	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得上周的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getPreWeekTo() {
	// 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 =
	// Friday, 6 = Saturday
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofweek = cal.get(GregorianCalendar.DAY_OF_WEEK);
	if (dayofweek == GregorianCalendar.SUNDAY) {
	    dayofweek = GregorianCalendar.SUNDAY + 7;
	}
	cal.add(GregorianCalendar.DAY_OF_YEAR, GregorianCalendar.MONDAY
		- dayofweek + 6 - 7);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得本周的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getWeekTo() {
	// 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 =
	// Friday, 6 = Saturday
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofweek = cal.get(GregorianCalendar.DAY_OF_WEEK);
	if (dayofweek == GregorianCalendar.SUNDAY) {
	    dayofweek = GregorianCalendar.SUNDAY + 7;
	}
	cal.add(GregorianCalendar.DAY_OF_YEAR, GregorianCalendar.MONDAY
		- dayofweek + 6);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得本周的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getWeekFrom() {
	// 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 =
	// Friday, 6 = Saturday
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofweek = cal.get(GregorianCalendar.DAY_OF_WEEK);
	if (dayofweek == GregorianCalendar.SUNDAY) {
	    dayofweek = GregorianCalendar.SUNDAY + 7;
	}
	cal.add(GregorianCalendar.DAY_OF_YEAR, GregorianCalendar.MONDAY
		- dayofweek);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得下周的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getNextWeekFrom() {
	// 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 =
	// Friday, 6 = Saturday
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofweek = cal.get(GregorianCalendar.DAY_OF_WEEK);
	if (dayofweek == GregorianCalendar.SUNDAY) {
	    dayofweek = GregorianCalendar.SUNDAY + 7;
	}
	cal.add(GregorianCalendar.DAY_OF_YEAR, GregorianCalendar.MONDAY
		- dayofweek + 7);

	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得上周的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getNextWeekTo() {
	// 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 =
	// Friday, 6 = Saturday
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	int dayofweek = cal.get(GregorianCalendar.DAY_OF_WEEK);
	if (dayofweek == GregorianCalendar.SUNDAY) {
	    dayofweek = GregorianCalendar.SUNDAY + 7;
	}
	cal.add(GregorianCalendar.DAY_OF_YEAR, GregorianCalendar.MONDAY
		- dayofweek + 6 + 7);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得昨天的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getYestodayFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, -1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得昨天的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getYestodayTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, -1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得今天的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getTodayFrom() {
	String Last = "00:00:00";
	String now = new SimpleDateFormat("yyyy-MM-dd")
		.format(new java.util.Date());
	return now + " " + Last;
    }

    /**
     * 取得今天的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getTodayTo() {
	String Last = "23:59:59";
	String now = new SimpleDateFormat("yyyy-MM-dd")
		.format(new java.util.Date());
	return now + " " + Last;
    }

    /**
     * 取得明天的开始日期
     * 
     * @return 开始日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getNextdayFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, +1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得昨天的结束日期
     * 
     * @return 结束日期 格式：yyyy-MM-dd 00:00:00
     */
    public static String getNextdayTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, +1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * 取得2个时间点之间的时间间隔，单位为分
     * 
     * @param stratTime
     *            开始时间 格式必须为"HH:MM"
     * @param endTime
     *            结束时间 格式必须为"HH:MM"
     * @return 间隔的分钟数
     */
    public static String getTwoHour(String stratTime, String endTime) {
	String[] kk = null;
	String[] jj = null;
	kk = stratTime.split(":");
	jj = endTime.split(":");
	if (Integer.parseInt(kk[0]) < Integer.parseInt(jj[0]))
	    return "0";
	else {
	    double y = Double.parseDouble(kk[0]) + Double.parseDouble(kk[1])
		    / 60;
	    double u = Double.parseDouble(jj[0]) + Double.parseDouble(jj[1])
		    / 60;
	    if ((y - u) > 0)
		return y - u + "";
	    else
		return "0";
	}
    }

    /**
     * 取得2个日期点之间的日期间隔，单位为天
     * 
     * @param stratDate
     *            开始日期
     * @param endDate
     *            结束日期
     * @return 间隔的天数
     */
    public static String getTwoDay(String stratDate, String endDate) {
	SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	long day = 0;
	try {
	    java.util.Date date = myFormatter.parse(stratDate);
	    java.util.Date mydate = myFormatter.parse(endDate);
	    day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
	} catch (Exception e) {
	    return "";
	}
	return day + "";
    }

    /**
     * 判断是否为闰年
     * 
     * @param dateValue
     *            需要判断的日期
     * @return true：是闰年 false：不是闰年
     * @throws ParseException
     */
    public static boolean isLeapYear(String dateValue) throws ParseException {

	/**
	 * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
	 * 4.能被4整除同时能被100整除则不是闰年
	 */
	Date d = strToDate(dateValue);
	GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
	gc.setTime(d);
	int year = gc.get(Calendar.YEAR);
	if ((year % 400) == 0)
	    return true;
	else if ((year % 4) == 0) {
	    if ((year % 100) == 0)
		return false;
	    else
		return true;
	} else
	    return false;
    }

    /**
     * 将字符型的日期转化为日期型的日期
     * 
     * @param dateValue
     *            将要转化的字符串
     * @return 日期型的日期
     * @throws ParseException
     */
    public static Date strToDate(String dateValue) throws ParseException {
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	return format.parse(dateValue);
    }

    /**
     * 判断2个日期是否在同一个星期
     * 
     * @param dateOne
     *            日期1
     * @param dateTwo
     *            日期2
     * @return true：在同一个星期 false：不在同一个星期
     */
    public static boolean isSameWeekDates(Date dateOne, Date dateTwo) {
	Calendar cal1 = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();
	cal1.setTime(dateOne);
	cal2.setTime(dateTwo);
	int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
	if (0 == subYear) {
	    if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2
		    .get(Calendar.WEEK_OF_YEAR))
		return true;
	} else if (1 == subYear && 11 == cal2.get(Calendar.MONTH)) {
	    // 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周
	    if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2
		    .get(Calendar.WEEK_OF_YEAR))
		return true;
	} else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {
	    if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2
		    .get(Calendar.WEEK_OF_YEAR))
		return true;
	}
	return false;
    }

    /**
     * 取得日期为所在年度的第几周
     * 
     * @param dateValue
     *            需要判断的日期
     * @return 年度+周数
     * @throws ParseException
     */
    public static String getSeqWeek(String dateValue) throws ParseException {
	Calendar c = Calendar.getInstance();
	c.setTime(strToDate(dateValue));
	String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));
	if (week.length() == 1)
	    week = "0" + week;
	String year = Integer.toString(c.get(Calendar.YEAR));
	return year + week;
    }

    /**
     * 获得一个日期所在的周的星期几的日期，如要找出2011年2月3日所在周的星期一是几号
     * 
     * @param dateValue
     *            日期
     * @param numWeek
     *            所在的周的星期几
     * @return 日期 格式："yyyy-MM-dd"
     * @throws ParseException
     */
    public static String getWeek(String dateValue, String numWeek)
	    throws ParseException {
	// 再转换为时间
	Date dd = strToDate(dateValue);
	Calendar c = Calendar.getInstance();
	c.setTime(dd);
	if (numWeek.equals("1")) // 返回星期一所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	else if (numWeek.equals("2")) // 返回星期二所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
	else if (numWeek.equals("3")) // 返回星期三所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
	else if (numWeek.equals("4")) // 返回星期四所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
	else if (numWeek.equals("5")) // 返回星期五所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
	else if (numWeek.equals("6")) // 返回星期六所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
	else if (numWeek.equals("0")) // 返回星期日所在的日期
	    c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
	return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }

    /**
     * 根据一个日期，返回数字的星期几
     * 
     * @param dateValue
     *            日期
     * @return 数字的星期几 1=星期日 7=星期六，其他类推
     * @throws ParseException
     */
    public static String getWeek(String dateValue) throws ParseException {
	// 再转换为时间
	Date date = strToDate(dateValue);
	Calendar c = Calendar.getInstance();
	c.setTime(date);
	// int hour=c.get(Calendar.DAY_OF_WEEK);
	// hour中存的就是星期几了，其范围 1~7
	// 1=星期日 7=星期六，其他类推
	return new SimpleDateFormat("EEEE").format(c.getTime());
    }

    /**
     * 根据一个日期，返回是星期几
     * 
     * @param dateValue
     *            日期
     * @return 中文字符型的星期几
     * @throws ParseException
     */
    public static String getWeekStr(String sdate) throws ParseException {
	String str = "";
	str = getWeek(sdate);
	if ("1".equals(str)) {
	    str = "星期日";
	} else if ("2".equals(str)) {
	    str = "星期一";
	} else if ("3".equals(str)) {
	    str = "星期二";
	} else if ("4".equals(str)) {
	    str = "星期三";
	} else if ("5".equals(str)) {
	    str = "星期四";
	} else if ("6".equals(str)) {
	    str = "星期五";
	} else if ("7".equals(str)) {
	    str = "星期六";
	}
	return str;
    }

    public static String DateTostr(Date dateValue,int Kind) throws ParseException {
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");    	
    	String strDate = formatter.format(dateValue);
    	StringTokenizer token = new StringTokenizer(strDate, "-");
    	String year = token.nextToken();
    	String month = token.nextToken();
    	String day = token.nextToken();
    	String hh = token.nextToken();
    	String mm = token.nextToken();
    	String ss = token.nextToken();
    	String strServerDateTime = "";
    	switch (Kind) {
    	case 1:
    	    strServerDateTime = year + month + day;
    	    break;
    	case 2:
    	    strServerDateTime = year + "/" + month + "/" + day;
    	    break;
    	case 3:
    	    strServerDateTime = hh + mm + ss;
    	    break;
    	case 4:
    	    strServerDateTime = hh + ":" + mm + ":" + ss;
    	    break;
    	case 5:
    	    strServerDateTime = year + month + day + " " + hh + mm + ss;
    	    break;
    	case 6:
    	    strServerDateTime = year + "/" + month + "/" + day + " " + hh + ":"
    		    + mm + ":" + ss;
    	    break;
    	case 7:
    	    strServerDateTime = year + "/" + month + "/" + day + "|" + hh + ":"
    		    + mm + ":" + ss;
    	    break;
    	case 8:
    	    strServerDateTime = year + month + day + hh + mm + ss;
    	    break;
    	case 9:
    	    strServerDateTime = year + "-" + month + "-" + day;
    	    break;
    	case 10:
    	    strServerDateTime = year + "-" + month + "-" + day + " " + hh + ":"
    		    + mm + ":" + ss;
    	    break;
    	case 11:
    	    strServerDateTime = year + "年" + month + "月" + day + "日";
    	    break;
    	case 12:
    	    strServerDateTime = year;
    	    break;
    	case 13:
    	    strServerDateTime = month + day;
    	    break;
    	case 14:
    	    strServerDateTime = hh;
    	    break;
    	case 15:
    	    strServerDateTime = year + month;
    	    break;
    	default:
    	    break;
    	}
    	return strServerDateTime;
    }
    
    public static String getWeekDay() {
    	nowDate=new Date();
    	String returnString="未知";
    	switch(nowDate.getDay()){
    		case 0:returnString="星期日";break;
    		case 1:returnString="星期一";break;
    		case 2:returnString="星期二";break;
    		case 3:returnString="星期三";break;
    		case 4:returnString="星期四";break;
    		case 5:returnString="星期五";break;
    		case 6:returnString="星期六";break;
    		default:break;
    	}
    	return returnString;
    }

}
