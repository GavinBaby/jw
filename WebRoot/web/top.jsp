<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<link href="../css/css.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script type="text/javascript" src="../js/artDialog/iframeTools.source.js"></script>		
		<script src="../js/jquery1.6.2.js"></script>
		<script src="../js/userLock/jquery.timer.min.js"></script>
		<script src="../js/JwCommon.js"></script>
		<script src="../js/userLock/lockScreen.js"></script>
	</head>

	<body onload="showscreen()">
		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="top_bg">
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						class="top_left_bg">
						<tr>
							<td>
								<table width="100%" border="0" cellpadding="0" cellspacing="0"
									class="top_right_bg">
									<tr>
										<td width="3%">
											&nbsp;
										</td>
										<td align="left">
											<img src="../images/logo.png" width="343" height="65" />
										</td>
										<td align="right" valign="bottom">
											<table width="372" height="32" border="0" cellpadding="0"
												cellspacing="0" class="white_12">
												<tr>
												    <td width="23" align="left">
														<img src="../images/dqwz_tb.gif" width="21" height="21" />
													</td>
												    <td width="70" align="left">
														<a href="#" onclick="javascript:SetCookie('jwlockscreen','1');art.dialog.open('resetlogin.jsp?usr=<s:property value="userSysName" />',{title: '锁屏',lock:true,drag: false,focus: 'pwd',cancel:false}, false);"
														>锁定屏幕</a>
													</td>
													<td width="23" align="left">
														<img src="../images/yhzl.gif" width="21" height="21" />
													</td>
													<td width="70" align="left">
														<a href="#" onclick="javascript:art.dialog.open('maintenance/User_detailInformation.action',{title: '用户资料',resize:false,lock:true,id:'user_inf'}, false);"
														>用户资料</a>
													</td>
													<td width="23" align="left">
														<img src="../images/mimaxg.gif" width="19" height="22" />
													</td>
													<td width="70" align="left">
														<a href="#" onclick="javascript:art.dialog.open('maintenance/User_passwordLoad.action',{title: '密码修改',resize:false,lock:true,id:'user_inf'}, false);"
														>密码修改</a>
													</td>
													<td width="23" align="left">
														<img src="../images/zxyh.gif" width="19" height="22" />
													</td>
													<td width="70" align="left">
														<a href="#" onclick="openNew('common/OnlineAction.action','在线用户列表');"
														>在线用户</a>
													</td>
													<td width="23" align="left">
														<img src="../images/tcpt.gif" width="18" height="18" />
													</td>
													<td width="70" align="left">
														<form name="logout" action="logout.action" method="post" target="_top">
														<a href="#" onclick="javascript:logout.submit();"														
														>退出系统</a>
														</form>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<table width="100%" height="36" border="0" cellpadding="0"
			cellspacing="0" class="menu_bg" >
			<tr>
				<td width="90" height="12" align="center" class="menu" onclick="chageStyle(this);">
					<a href="javascript:gotoHome()" >首页</a>
				</td>
				<td>
				<table  height="36" border="0" cellpadding="0" cellspacing="0" id="menu"><tr>
				<s:iterator value="listC_V_Sys_Navigationnotes" status="index">
					<td width="90" align="center" class="menu" onclick="chageStyle(this);">
						<a href="javascript:setUrl('${moduleId}')" >${moduleName}</a>
					</td>
				</s:iterator>
				</tr></table>
				</td>
				<td align="right" class="content">
					<span class="blue_12"><s:property value="userName" /> </span>，欢迎您登陆！
				</td>
				<td width="20">
					&nbsp;
				</td>
			</tr>
		</table>
	</body>
	<script language="javascript">
	function setUrl(moduleId) {
	    //注:有frameset的页面，计算总的frame时，不能把这个框架包算进总数里，应当根据最小的frame单位来计算
		parent.frames[1].window.location.href = "LeftmainLoad.action?moduleId=" + moduleId;
	}
	
	function chageStyle(dq){
	   var menu=document.getElementById("menu");
	   var a=menu.getElementsByTagName("td");
	   for(var i=0;i<a.length;i++){
	       a[i].setAttribute("class","menu");
	   }
	   dq.setAttribute("class","menu_xz");
	}
	
	function gotoHome()
	{
		parent.parent.window.location.href = "../web/indexpage.action";
	}
	
	 function SetCookie(name,value)//两个参数，一个是cookie的名子，一个是值  
	 {  
		var Days = 3650; //此 cookie 将被保存 3650 天  
		var exp = new Date();    //new Date("December 31, 9998");  
		exp.setTime(exp.getTime() + Days*24*60*60*1000);  
		document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();  
	 }  

	function getCookie(name)//取cookies函数          
	{  
		var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));  
		if(arr != null) return unescape(arr[2]); return "";  
	}  

	function showscreen()
	{		
		if (getCookie('jwlockscreen')=="1")
			art.dialog.open('resetlogin.jsp?usr=<s:property value="userSysName" />',{title: '锁屏',lock:true,drag: false,focus: 'pwd',cancel:false}, false);
	}
</script>
</html>
