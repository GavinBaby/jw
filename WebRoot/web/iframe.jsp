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
		var sencods="6.1das";//JQuery��ʱ��ÿ��61�����һ��,����ʱ��session����ʱ���һ��
		var sessionUrl="sessionInfo.action";//session���ٺ���õ�ajax��ȡ�û������������������� 
		var usernameString="userenm";//�����󵯳����û����ı���id
		var pwdString="pwd";//�����󵯳��������ı���id
		var formSerializeString="#update";//���������ĵ�½�����form��id
		var resetSessionUrl="resetSessionInfomation.action";//���������ĵ�½������ȷ����ť�����������û�session�����ҽ���
		var curusername =  '<s:property value="sysusername"/>';
		var lock = '<s:property value="canLockScreen"/>';
		
		if (lock=="1")
		onoffLockScreen(sencods,sessionUrl,usernameString,pwdString,formSerializeString,resetSessionUrl,curusername);
		
		function window.onbeforeunload(){
			 checkOut();
		 }
		  //�رմ���ʱ�Զ��˳�
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
		//��ֹ�û��ر�ie��ֱ���ڸ�ҳ����뱾Ӧ���޹ص�ҳ�棬ǿ���û����˳���¼�������޷���ֹ�û�����
		//���������Ҽ��ر�ҳ�棬

		 function  Logout(loginName){
		     try{
		     xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		     }catch(e){
		     xmlHttp = new XMLHttpRequest();
		     }
		     //���ݴ���,falseΪ�첽��ʽ
		     xmlHttp.open("post",'logoutInvalidate.action?userenm='+loginName,true);
		     xmlHttp.send(null);
		 }

</script>
</body>
</html>
