package com.jw.baseframe.util;

/**
 * 
* @ClassName: Constants 
* @Description: 用于存放公共常量的类
* @author 董明
* @date 2011-7-16 上午09:54:50 
*
 */
public class Constants {

	public final static String DISP_OPERATION_SUCCESSFUL ="文件保存成功！";
	public final static String DISP_EDIT_CONFLICTS = "在您编辑时已经有人编辑并保存了此文档，请重新打开后再编辑！";
	
	public final static String G_S_COMPART1 = ","; // 列表的分隔符（第一级）
	public final static String G_S_COMPART2 = "+"; // 列表的分隔符（第二级）
	public final static String G_S_COMPART3 = "#"; // 列表的分隔符（第三级）
	public final static String G_S_COMPART4 = "*"; // 列表的分隔符（第四级）
	public final static String G_S_GROUPTAG = "@"; // 岗位标记
	
	public final static String G_S_BTN_NEXT = "next"; // 下一步按钮
	public final static String G_S_BTN_SAVE ="save";  //保存按钮
	public final static String G_S_BTN_SHOWFLOW = "showflow"; //流程显示按钮
	public final static String G_S_BTN_WITHDRAMAL="withdramal"; // 退回按钮
	public final static String G_S_BTN_DRAWBACK="drawback";  // 收回按钮
	public final static String G_S_BTN_URGE = "urge";// 催办按钮
	
	public final static String G_S_LINE_SEPARATOR = System.getProperty("line.separator"); //java 通用行分隔符,Linux下是\n,而Windows下是\r\n
	public final static String G_S_FILE_SEPARATOR = System.getProperty("file.separator"); //java 通用文件分隔符（在 UNIX 系统中是“/”）
	public final static String G_S_PATH_SEPARATOR = System.getProperty("path.separator"); //java 通用路径分隔符（在 UNIX 系统中是“:”）
	
	//ACTION层产生的异常错误码
	public final static int ACTION_EXCEPTION_CODE = -10000;
	//用户操作错误码
	public final static int USER_FAILED_CODE = -10001;
	//用户操作成功代码
	public final static int USER_SUCCESS_CODE = 10001;
	
	//常用消息
	public final static String DELETE_SUCCESSFUL_MSG ="删除成功！";
	
	public final static String DELETE_FAILED_MSG ="删除失败！";
	
	public final static String UPDATE_SUCCESSFUL_MSG ="更新成功！";
	
	public final static String UPDATE_FAILED_MSG ="更新失败！";
	
	public final static String SAVE_SUCCESSFUL_MSG ="保存成功！";
	
	public final static String SAVE_FAILED_MSG ="保存失败！";
	
	public final static String PUBLISH_SUCCESSFUL_MSG ="发布成功！";
	
	public final static String PUBLISH_FAILED_MSG ="发布失败！";
	
	public final static String CANCEL_SUCCESSFUL_MSG ="撤消成功！";
	
	public final static String CANCEL_FAILED_MSG ="撤消失败！";
	
	//模块ID
	public final static String MOUDLE_ID_UNIT = "module01010100";
	public final static String MOUDLE_ID_DEPARTMENT = "module01010200";
	public final static String MOUDLE_ID_USER = "module01010300";
	public final static String MOUDLE_ID_GROUP = "module01010400";
	public final static String MOUDLE_ID_ROLE = "module01010500";
	public final static String MOUDLE_ID_PLURALISM = "module01010600";
	public final static String MOUDLE_ID_MANAGEMENTLEADER = "module01010700";
	public final static String MOUDLE_ID_FLOWINFOR = "module01020100";
	public final static String MOUDLE_ID_SYSTEMINFOR = "module01030100";
	public final static String MOUDLE_ID_MODULE = "module01030200";
	public final static String MOUDLE_ID_PHRASE = "module01030300";
	public final static String MOUDLE_ID_IPLIMIT = "module01030400";
	public final static String MOUDLE_ID_LOGININFORLOG = "module01030500";
	public final static String MOUDLE_ID_OPERATIONINFORLOG = "module01030600";
	public final static String MOUDLE_ID_ERRORLOGINFOR = "module01030700";
	public final static String MOUDLE_ID_MAINTAINSHOW = "module01030800";
	public final static String MOUDLE_ID_USERFLOW = "module01020200";
	public final static String MOUDLE_ID_UNITMODULE = "module01031000";
	public final static String MOUDLE_ID_DBSY = "module04000000";
}
