package com.jw.baseframe.util;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {
	
	 /**
	  * MD5加密
	  *
	 */
	public String MD5Encrypt(String inStr) {  
	  
	    MessageDigest md = null;  
	    String outStr = null;  
	    try {   

	     md = MessageDigest.getInstance("MD5");
	     byte[] digest = md.digest(inStr.getBytes());
	     //
	     outStr = bytetoString(digest);
	    }
	    catch (NoSuchAlgorithmException nsae) {
	     nsae.printStackTrace();
	    }
	    return outStr;
	} 

	public String bytetoString(byte[] digest) {  

	    String str = "";  
	    String tempStr = "";  
	    for (int i = 1; i < digest.length; i++) {   
	    	tempStr = (Integer.toHexString(digest[i] & 0xff));   
	    	if (tempStr.length() == 1) {
	    		str = str + "0" + tempStr;
	    	}
	    	else {
	    		str = str + tempStr;   
	    	}
	    }
	    return str.toLowerCase();

	}
	
	 /**
	  * 读取文件修改时间
	  *
	 */
	public String getModifiedTime(File f){
		Calendar cal = Calendar.getInstance();
		long time = f.lastModified();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		cal.setTimeInMillis(time);
		return formatter.format(cal.getTime());
		//return cal.getTime();
	}
	
	/**
	   * 字符串转换为java.util.Date<br>
	   * 支持格式为 yyyy.MM.dd G 'at' hh:mm:ss z 如 '2002-1-1 AD at 22:10:59 PSD'<br>
	   * yy/MM/dd HH:mm:ss 如 '2002/1/1 17:55:00'<br>
	   * yy/MM/dd HH:mm:ss pm 如 '2002/1/1 17:55:00 pm'<br>
	   * yy-MM-dd HH:mm:ss 如 '2002-1-1 17:55:00' <br>
	   * yy-MM-dd HH:mm:ss am 如 '2002-1-1 17:55:00 am' <br>
	   * @param time String 字符串<br>
	   * @return Date 日期<br>
	   */
	public static Date stringToDate(String time){
	    SimpleDateFormat formatter;
	    int tempPos=time.indexOf("AD") ;
	    time=time.trim() ;
	    formatter = new SimpleDateFormat ("yyyy.MM.dd G 'at' hh:mm:ss z");
	    if(tempPos>-1){
	      time=time.substring(0,tempPos)+
	           "公元"+time.substring(tempPos+"AD".length());//china
	      formatter = new SimpleDateFormat ("yyyy.MM.dd G 'at' hh:mm:ss z");
	    }
	    tempPos=time.indexOf("-");
	    if(tempPos>-1&&(time.indexOf(" ")<0)){
	      formatter = new SimpleDateFormat ("yyyyMMddHHmmssZ");
	    }
	    else if((time.indexOf("/")>-1) &&(time.indexOf(" ")>-1)){
	      formatter = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
	    }
	    else if((time.indexOf("-")>-1) &&(time.indexOf(" ")>-1)){
	      formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
	    }
	    else if((time.indexOf("/")>-1) &&(time.indexOf("am")>-1) ||(time.indexOf("pm")>-1)){
	      formatter = new SimpleDateFormat ("yyyy-MM-dd KK:mm:ss a");
	    }
	    else if((time.indexOf("-")>-1) &&(time.indexOf("am")>-1) ||(time.indexOf("pm")>-1)){
	      formatter = new SimpleDateFormat ("yyyy-MM-dd KK:mm:ss a");
	    }
	    ParsePosition pos = new ParsePosition(0);
	    java.util.Date ctime = formatter.parse(time, pos);

	    return ctime;
	}
}
