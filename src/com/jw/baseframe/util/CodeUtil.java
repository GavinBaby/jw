package com.jw.baseframe.util;

import java.awt.Color;
import java.io.File;
import java.util.Calendar;

public class CodeUtil {
	public static final int TYPE_URL = 1;
	public static final int TYPE_IMG = 2;
	public static final int TYPE_SHOW = 3;
	public static final int TYPE_BEAUTIFY = 4;
	/**
	 * 获取二维码的相对路径
	 * 生成规则为towcodeimg/年/月/日
	 * @return
	 */
	public static String getCodeUrl(){
		return getUrl("twocodeimg");
	}
	/**
	 * 获取二维码logo标记的相对路径
	 * @return
	 */
	public static String getCodeLogoUrl(){
		return getUrl("twocodelogo");
	}
	/**获取二维码图片，文件，视频，音频的相对路径
	 * @return
	 */
	public static String getCodeFileUrl(){
		return getUrl("twocodeFile");
	}
	private static String getUrl(String oppPath){
		Calendar date = Calendar.getInstance();
		StringBuilder path = new StringBuilder(20);
		path.append(oppPath).append(File.separatorChar);
		path.append(date.get(Calendar.YEAR));
		path.append(File.separatorChar);
		path.append(date.get(Calendar.MONTH)+1);
		path.append(File.separatorChar);
		path.append(date.get(Calendar.DATE));
		path.append(File.separatorChar);
		return path.toString();
	}
	/**
	 * 将string转换成Color对象 
	 * 如#FFFFFF可以转换成黑色
	 * @param str
	 * @return
	 */
	public static Color String2Color(String str) {
		int i =  Integer.parseInt(str.substring(1),16);
		return new Color(i);
	}
	/**
	 * 获取系统内唯一访问地址
	 * @param type 类型 1:访问页面地址;2:图片地址;3:展示页面地址
	 * @param uuid
	 * @return
	 */
	public static String getUniqueURL(String uuid,int type){
		String path = null	;
		switch(type){
			case TYPE_URL:
				path = "view";
				break ;
			case TYPE_IMG:
				path = "code";
				break ;
			case TYPE_SHOW :
				path = "show";
				break ;
			case TYPE_BEAUTIFY:
				path = "beautify";
				break ;
		}
		String url = ReadProperties.getPropertiesDataById("weburl")+path+"/"+uuid;
		return url ;
	}
	public static void main(String args[]){
		System.out.println(CodeUtil.getCodeUrl());
	}
}
