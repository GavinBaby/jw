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
														<a href="#" onclick="javascript:SetCookie('jwlockscreen','1');art.dialog.open('resetlogin.jsp?usr=<s:property value="userSysName" />',{title: '����',lock:true,drag: false,focus: 'pwd',cancel:false}, false);"
														>������Ļ</a>
													</td>
													<td width="23" align="left">
														<img src="../images/yhzl.gif" width="21" height="21" />
													</td>
													<td width="70" align="left">
														<a href="#" onclick="javascript:art.dialog.open('maintenance/User_detailInformation.action',{title: '�û�����',resize:false,lock:true,id:'user_inf'}, false);"
														>�û�����</a>
													</td>
													<td width="23" align="left">
														<img src="../images/mimaxg.gif" width="19" height="22" />
													</td>
													<td width="70" align="left">
														<a href="#" onclick="javascript:art.dialog.open('maintenance/User_passwordLoad.action',{title: '�����޸�',resize:false,lock:true,id:'user_inf'}, false);"
														>�����޸�</a>
													</td>
													<td width="23" align="left">
														<img src="../images/zxyh.gif" width="19" height="22" />
													</td>
													<td width="70" align="left">
														<a href="#" onclick="openNew('common/OnlineAction.action','�����û��б�');"
														>�����û�</a>
													</td>
													<td width="23" align="left">
														<img src="../images/tcpt.gif" width="18" height="18" />
													</td>
													<td width="70" align="left">
														<form name="logout" action="logout.action" method="post" target="_top">
														<a href="#" onclick="javascript:logout.submit();"														
														>�˳�ϵͳ</a>
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
					<a href="javascript:gotoHome()" >��ҳ</a>
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
					<span class="blue_12"><s:property value="userName" /> </span>����ӭ����½��
				</td>
				<td width="20">
					&nbsp;
				</td>
			</tr>
		</table>
	</body>
	<script language="javascript">
	function setUrl(moduleId) {
	    //ע:��frameset��ҳ�棬�����ܵ�frameʱ�����ܰ������ܰ���������Ӧ��������С��frame��λ������
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
	
	 function SetCookie(name,value)//����������һ����cookie�����ӣ�һ����ֵ  
	 {  
		var Days = 3650; //�� cookie �������� 3650 ��  
		var exp = new Date();    //new Date("December 31, 9998");  
		exp.setTime(exp.getTime() + Days*24*60*60*1000);  
		document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();  
	 }  

	function getCookie(name)//ȡcookies����          
	{  
		var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));  
		if(arr != null) return unescape(arr[2]); return "";  
	}  

	function showscreen()
	{		
		if (getCookie('jwlockscreen')=="1")
			art.dialog.open('resetlogin.jsp?usr=<s:property value="userSysName" />',{title: '����',lock:true,drag: false,focus: 'pwd',cancel:false}, false);
	}
</script>
</html>
