<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String moduleId = request.getParameter("moduleId");
	if (moduleId==null) moduleId ="";
 %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!-- add to youjh -->
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title><s:property value="SystemName"/></title>
		<script type="text/javascript" src="../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script type="text/javascript" src="../js/artDialog/iframeTools.source.js"></script>
		<script src="../js/jquery1.6.2.js"></script>
		<script src="../js/userLock/jquery.timer.min.js"></script>
		<script src="../js/userLock/lockScreen.js"></script>
		<style>
		* { padding:0; margin:0; }
		html, body { height:100%; border:none 0; }
		#iframe { width:100%; height:100%; border:none 0; }
		</style>
</head>
<body style="overflow-x:hidden;overflow-y:hidden">
<s:hidden id="sysusername" name="sysusername"></s:hidden>
<s:hidden id="canLockScreen" name="canLockScreen"></s:hidden>

<iframe id="iframe" src="frame.jsp?moduleId=<%=moduleId %>"></iframe>

<script language="javascript">		
		var sencods="6.1das";//JQuery计时器每个61秒调用一次,设置时比session销毁时间大一秒
		var sessionUrl="sessionInfo.action";//session销毁后调用的ajax获取用户名，并触发锁屏函数 
		var usernameString="userenm";//锁屏后弹出的用户名文本框id
		var pwdString="pwd";//锁屏后弹出的密码文本框id
		var formSerializeString="#update";//锁屏弹出的登陆画面的form表单id
		var resetSessionUrl="resetSessionInfomation.action";//锁屏弹出的登陆画面点击确定按钮后重新设置用户session，并且解锁
		var curusername =  '<s:property value="sysusername"/>';
		var lock = '<s:property value="canLockScreen"/>';
		
		if (lock=="1")
		onoffLockScreen(sencods,sessionUrl,usernameString,pwdString,formSerializeString,resetSessionUrl,curusername);
		
		function window.onbeforeunload(){
			 checkOut();
		 }
		  //关闭窗口时自动退出
		 function  checkOut(){  
		  var n = window.event.screenX - window.screenLeft;    
          var b = n > document.documentElement.scrollWidth-20;    
          if(b && window.event.clientY < 0 || window.event.altKey){ 
			  var loginName = '<s:property value="sysusername"/>';
			  if(loginName==""){
			    	loginName="useful";
			   }
		       Logout(loginName);   				
		  }
		 }
		//防止用户关闭ie或直接在该页面打开与本应用无关的页面，强制用户做退出登录，但是无法防止用户从任
		//务栏单击右键关闭页面，

		 function  Logout(loginName){
		     try{
		     xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		     }catch(e){
		     xmlHttp = new XMLHttpRequest();
		     }
		     //数据传输,false为异步方式
		     xmlHttp.open("post",'logoutInvalidate.action?userenm='+loginName,true);
		     xmlHttp.send(null);
		 }

</script>
</body>
</html>
