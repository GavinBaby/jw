<%@ page contentType="text/html;charset=GBK"%>
<%
String uename = request.getParameter("usr");
 %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		<script type="text/javascript" src="../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script type="text/javascript" src="../js/artDialog/iframeTools.source.js"></script>
						<script src="../js/jquery1.6.2.js"></script>
		<script src="../js/userLock/jquery.timer.min.js"></script>
		<script src="../js/userLock/lockScreen.js"></script>	

<title>无标题文档</title>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
-->
</style>
</head>

<body>
<table width="300" height="153" border="0" cellpadding="0" cellspacing="0" background="../images/xtsp_bg.gif">
  <tr>
    <td align="center" valign="top">
      <table width="100%" height="34" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
      <form id="update" name="update" method="post">
  
      <table width="80%" height="60" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="21%" align="left"><span class="STYLE1">用户名：</span></td>
          <td width="79%" align="left">
            <input type="text" id="userenm"  name="userenm" style="width:106px;" value="<%=uename %>" readOnly style="background-color:#E6E6E6" />
          </td>
        </tr>
        <tr>
          <td align="left" class="STYLE1">密　码：</td>
          <td align="left">
            <input type="password"  id="pwd" name="pwd" style="width:106px;" onkeydown="var key = window.event.keyCode;if(key==13) document.getElementById('btn').click();" />
          </td>
        </tr>
      </table>
      </form>
      <table width="60%" height="30" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td align="center" valign="bottom"><img src="../images/xtsp_qd.gif" width="80" height="24" onclick="javascript:updateData();"/></td>
        </tr>
      </table>
    </td>
  </tr>
</table>
		<script language="javascript">
		
		var sencods="6.1das";//JQuery计时器每个61秒调用一次,设置时比session销毁时间大一秒
		var sessionUrl="sessionInfo.action";//session销毁后调用的ajax获取用户名，并触发锁屏函数 
		var usernameString="userenm";//锁屏后弹出的用户名文本框id
		var pwdString="pwd";//锁屏后弹出的密码文本框id
		var formSerializeString="#update";//锁屏弹出的登陆画面的form表单id
		var resetSessionUrl="resetSessionInfomation.action";//锁屏弹出的登陆画面点击确定按钮后重新设置用户session，并且解锁
		 </script>		
</body>
</html>
