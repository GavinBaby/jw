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
     * ȡ��ϵͳʱ��
     * 
     * @param Kind
     *            ����ֵ������ 1: yyyyMMdd 2: yyyy/MM/dd 3: hhmmss 4: hh:mm:ss
     *            5:yyyyMMdd hhmmss 6: yyyy/MM/dd hh:mm:ss 7:
     *            yyyy/MM/dd|hh:mm:ss 8: yyyyMMddhhmmss 9: yyyy-MM-dd 10:
     *            yyyy-MM-dd hh:mm:ss 11:yyyy��MM��dd�� 12:yyyy 13:MMdd
     * @return ϵͳʱ��
     * @throws Exception
     *             �쳣
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
	    strServerDateTime = year + "��" + month + "��" + day + "��";
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
     * ȡ��ĳ�����ڶεĿ�ʼ����
     * 
     * @param Kind
     *            ����ֵ������ 1: ���� 2: ���� 3: ���� 4: ���� 5: ���� 6: ���� 7: ���� 8: ���� 9: ����
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getDateFrom(int kind) {
	if (kind == 1) { // ����
	    return getTodayFrom();
	}
	if (kind == 2) { // ����
	    return getYestodayFrom();
	}
	if (kind == 3) { // ����
	    return getNextdayFrom();
	}
	if (kind == 4) { // ����
	    return getWeekFrom();
	}
	if (kind == 5) { // ����
	    return getPreWeekFrom();
	}
	if (kind == 6) { // ����
	    return getNextWeekFrom();
	}
	if (kind == 7) { // ����
	    return getMonthFrom();
	}
	if (kind == 8) { // ����
	    return getPreMonthFrom();
	}
	if (kind == 9) { // ����
	    return getNextMonthFrom();
	}
	return "";
    }

    /**
     * ȡ��ĳ�����ڶεĽ�������
     * 
     * @param Kind
     *            ����ֵ������ 1: ���� 2: ���� 3: ���� 4: ���� 5: ���� 6: ���� 7: ���� 8: ���� 9: ����
     * @return �������� ��ʽ��yyyy-MM-dd "23:59:59"
     */
    public static String getDateTo(int kind) {
	if (kind == 1) { // ����
	    return getTodayTo();
	}
	if (kind == 2) { // ����
	    return getYestodayTo();
	}
	if (kind == 3) { // ����
	    return getNextdayTo();
	}
	if (kind == 4) { // ����
	    return getWeekTo();
	}
	if (kind == 5) { // ����
	    return getPreWeekTo();
	}
	if (kind == 6) { // ����
	    return getNextWeekTo();
	}
	if (kind == 7) { // ����
	    return getMonthTo();
	}
	if (kind == 8) { // ����
	    return getPreMonthTo();
	}
	if (kind == 9) { // ����
	    return getNextMonthTo();
	}
	return "";
    }
    
    /**
     * ���ݴ���������,�Լ�X�õ�X��������
     * 
     * @return ���� ��ʽ��yyyy-MM-dd
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
     * ȡ���ϸ��µĿ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ���¸��µĿ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ���ϸ��µĽ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ���¸��µĽ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�ñ��µĿ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�ñ��µĽ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�����ܵĿ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�����ܵĽ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�ñ��ܵĿ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�ñ��ܵĽ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�����ܵĿ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ�����ܵĽ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
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
     * ȡ������Ŀ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getYestodayFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, -1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * ȡ������Ľ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getYestodayTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, -1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * ȡ�ý���Ŀ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getTodayFrom() {
	String Last = "00:00:00";
	String now = new SimpleDateFormat("yyyy-MM-dd")
		.format(new java.util.Date());
	return now + " " + Last;
    }

    /**
     * ȡ�ý���Ľ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getTodayTo() {
	String Last = "23:59:59";
	String now = new SimpleDateFormat("yyyy-MM-dd")
		.format(new java.util.Date());
	return now + " " + Last;
    }

    /**
     * ȡ������Ŀ�ʼ����
     * 
     * @return ��ʼ���� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getNextdayFrom() {
	String Last = "00:00:00";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, +1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * ȡ������Ľ�������
     * 
     * @return �������� ��ʽ��yyyy-MM-dd 00:00:00
     */
    public static String getNextdayTo() {
	String Last = "23:59:59";
	GregorianCalendar cal = new GregorianCalendar();
	cal.add(GregorianCalendar.DAY_OF_YEAR, +1);
	return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) + " "
		+ Last;
    }

    /**
     * ȡ��2��ʱ���֮���ʱ��������λΪ��
     * 
     * @param stratTime
     *            ��ʼʱ�� ��ʽ����Ϊ"HH:MM"
     * @param endTime
     *            ����ʱ�� ��ʽ����Ϊ"HH:MM"
     * @return ����ķ�����
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
     * ȡ��2�����ڵ�֮������ڼ������λΪ��
     * 
     * @param stratDate
     *            ��ʼ����
     * @param endDate
     *            ��������
     * @return ���������
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
     * �ж��Ƿ�Ϊ����
     * 
     * @param dateValue
     *            ��Ҫ�жϵ�����
     * @return true�������� false����������
     * @throws ParseException
     */
    public static boolean isLeapYear(String dateValue) throws ParseException {

	/**
	 * ��ϸ��ƣ� 1.��400���������꣬���� 2.���ܱ�4������������ 3.�ܱ�4����ͬʱ���ܱ�100������������
	 * 4.�ܱ�4����ͬʱ�ܱ�100������������
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
     * ���ַ��͵�����ת��Ϊ�����͵�����
     * 
     * @param dateValue
     *            ��Ҫת�����ַ���
     * @return �����͵�����
     * @throws ParseException
     */
    public static Date strToDate(String dateValue) throws ParseException {
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	return format.parse(dateValue);
    }

    /**
     * �ж�2�������Ƿ���ͬһ������
     * 
     * @param dateOne
     *            ����1
     * @param dateTwo
     *            ����2
     * @return true����ͬһ������ false������ͬһ������
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
	    // ���12�µ����һ�ܺ�������һ�ܵĻ������һ�ܼ���������ĵ�һ��
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
     * ȡ������Ϊ������ȵĵڼ���
     * 
     * @param dateValue
     *            ��Ҫ�жϵ�����
     * @return ���+����
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
     * ���һ���������ڵ��ܵ����ڼ������ڣ���Ҫ�ҳ�2011��2��3�������ܵ�����һ�Ǽ���
     * 
     * @param dateValue
     *            ����
     * @param numWeek
     *            ���ڵ��ܵ����ڼ�
     * @return ���� ��ʽ��"yyyy-MM-dd"
     * @throws ParseException
     */
    public static String getWeek(String dateValue, String numWeek)
	    throws ParseException {
	// ��ת��Ϊʱ��
	Date dd = strToDate(dateValue);
	Calendar c = Calendar.getInstance();
	c.setTime(dd);
	if (numWeek.equals("1")) // ��������һ���ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	else if (numWeek.equals("2")) // �������ڶ����ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
	else if (numWeek.equals("3")) // �������������ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
	else if (numWeek.equals("4")) // �������������ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
	else if (numWeek.equals("5")) // �������������ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
	else if (numWeek.equals("6")) // �������������ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
	else if (numWeek.equals("0")) // �������������ڵ�����
	    c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
	return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }

    /**
     * ����һ�����ڣ��������ֵ����ڼ�
     * 
     * @param dateValue
     *            ����
     * @return ���ֵ����ڼ� 1=������ 7=����������������
     * @throws ParseException
     */
    public static String getWeek(String dateValue) throws ParseException {
	// ��ת��Ϊʱ��
	Date date = strToDate(dateValue);
	Calendar c = Calendar.getInstance();
	c.setTime(date);
	// int hour=c.get(Calendar.DAY_OF_WEEK);
	// hour�д�ľ������ڼ��ˣ��䷶Χ 1~7
	// 1=������ 7=����������������
	return new SimpleDateFormat("EEEE").format(c.getTime());
    }

    /**
     * ����һ�����ڣ����������ڼ�
     * 
     * @param dateValue
     *            ����
     * @return �����ַ��͵����ڼ�
     * @throws ParseException
     */
    public static String getWeekStr(String sdate) throws ParseException {
	String str = "";
	str = getWeek(sdate);
	if ("1".equals(str)) {
	    str = "������";
	} else if ("2".equals(str)) {
	    str = "����һ";
	} else if ("3".equals(str)) {
	    str = "���ڶ�";
	} else if ("4".equals(str)) {
	    str = "������";
	} else if ("5".equals(str)) {
	    str = "������";
	} else if ("6".equals(str)) {
	    str = "������";
	} else if ("7".equals(str)) {
	    str = "������";
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
    	    strServerDateTime = year + "��" + month + "��" + day + "��";
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
    	String returnString="δ֪";
    	switch(nowDate.getDay()){
    		case 0:returnString="������";break;
    		case 1:returnString="����һ";break;
    		case 2:returnString="���ڶ�";break;
    		case 3:returnString="������";break;
    		case 4:returnString="������";break;
    		case 5:returnString="������";break;
    		case 6:returnString="������";break;
    		default:break;
    	}
    	return returnString;
    }

}
