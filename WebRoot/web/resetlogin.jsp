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

<title>�ޱ����ĵ�</title>
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
          <td width="21%" align="left"><span class="STYLE1">�û�����</span></td>
          <td width="79%" align="left">
            <input type="text" id="userenm"  name="userenm" style="width:106px;" value="<%=uename %>" readOnly style="background-color:#E6E6E6" />
          </td>
        </tr>
        <tr>
          <td align="left" class="STYLE1">�ܡ��룺</td>
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
		
		var sencods="6.1das";//JQuery��ʱ��ÿ��61�����һ��,����ʱ��session����ʱ���һ��
		var sessionUrl="sessionInfo.action";//session���ٺ���õ�ajax��ȡ�û������������������� 
		var usernameString="userenm";//�����󵯳����û����ı���id
		var pwdString="pwd";//�����󵯳��������ı���id
		var formSerializeString="#update";//���������ĵ�½�����form��id
		var resetSessionUrl="resetSessionInfomation.action";//���������ĵ�½������ȷ����ť�����������û�session�����ҽ���
		 </script>		
</body>
</html>
