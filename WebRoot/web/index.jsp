<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ page import="java.util.List" %>
<%@ page import="net.sf.json.JSONObject" %>
<%@ page import="com.jw.baseframe.model.C_V_Sys_Logininfo" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>${systemName}</title>
<script type="text/javascript" src="../js/jquery1.6.2.js"></script>
<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>	 
<script type="text/javascript" src="../js/easyui/jquery.portal.js"></script>		
<link rel="stylesheet" href="../css/easyui/default/panelmain.css" type="text/css"></link>		
<link rel="stylesheet" href="../css/cssmain.css" type="text/css"></link>

<script type="text/javascript" src="../js/easyui/jquery.cookie.js"></script>
<script type="text/javascript" src="../js/easyui/jportal.js"></script>
<script type="text/javascript" src="../js/JwCommon.js"></script>	
<script src="../js/artDialog/artDialog.source.portal.js?skin=blue"></script>
	<script src="../js/artDialog/iframeTools.source.js"></script>
	
	<script src="../js/userLock/jquery.timer.min.js"></script>
		<script src="../js/userLock/lockScreen.js"></script>
<style type="text/css">
<!--
.icon-reload{
	background:url('../css/easyui/icons/reload.png') no-repeat;
}
.icon-more{
	background:url('../css/easyui/icons/search.png') no-repeat;
}
-->
</style>
</head>

<body>
<div id="top"></div>
<div id="menu"><span><span>
   <div class="nav"><span class="toleft"></span><span class="toright"></span>
   	<div class="navbox">
   	<div class="navlink">
     <ul>
     <li><a href="javascript:void(0)" onclick="clrcookie()">���ò���</a></li>
     <s:iterator value="listC_V_Sys_Navigationnotes" status="index">
	   <li><a href="javascript:setUrl('${moduleId}')" >${moduleName}</a></li>	   	       	  
	 </s:iterator>
	 </ul>
	</div>
	</div>
   </div>
   <div class="xinxi"><form name="logout" action="logout.action" method="post" target="_top"><font class="blue">${userName}</font>����ӭ��!<font class="red xhx" style="cursor:hand" onclick="javascript:logout.submit();">�˳�</font></form></div></span></span>
</div>
<div style="height:10px; clear:both;"></div>

<div id="content">
<div id="left_content">
  <div id="left_portal">
  <div></div>
  </div>
</div>
<div id="right_content">
  <div id="right_portal">
  <div></div>
  </div>
</div>
</div>
 
	<div id="bottom">����֧�� ����������Ϣ��ҵ���޹�˾</div>
<div style="display:none">
<form name="form1" method="post" action="IFrame.action">
<input id="moduleId" name="moduleId" />
</form>
</div>	
</body>
		<script type="text/javascript">
		
		function setUrl(moduleId) {	    
			form1.moduleId.value=moduleId;
			form1.submit();
		}

	   		var panels_left;
			var portal_left;
			
			var panels_right;
			var portal_right;
			
			var id_left="";
			<s:iterator value="list_SyLeft" status="status">
			id_left=id_left+'<s:property value="moduleId"/>';
			<s:if test="#status.last">		
			</s:if>
			<s:else>
			id_left=id_left+',';
			</s:else>
			</s:iterator>
			
			var id_right="";
			<s:iterator value="list_SyRight" status="status">
			id_right=id_right+'<s:property value="moduleId"/>';
			<s:if test="#status.last">		
			</s:if>
			<s:else>
			id_right=id_right+',';
			</s:else>
			</s:iterator>

			$(function(){
				panels_left = [ 
				<s:iterator value="list_SyLeft" status="status">
				{
					id : '<s:property value="moduleId"/>',
					title : '<span class="<s:property value="moduleIconCss"/>"></span><span><s:property value="moduleTitle"/></span>',					
					headerCls : '<s:property value="moduleHeaderCss"/>',	
					bodyCls : '<s:property value="moduleBodyCss"/>',						
					<s:if test="moduleHeight==''">
					</s:if>
					<s:else>
					height : <s:property value="moduleHeight"/>,	
					</s:else>		
					collapsible : true,					
					closable : true,
					<s:if test="moduleContentLinktype=='0'">					
					href : '<s:property value="moduleContentLink"/>',
					</s:if>
					<s:else>
					content : '<iframe id="i_<s:property value="moduleId"/>" src="<s:property value="moduleContentLink"/>" frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" scrolling="no"></iframe>',
					</s:else>
					onClose : function() {					 
					 	$.cookie('portal-state-left', setPortalState('left_portal','<s:property value="moduleId"/>',1), {
							expires : 3650
						});						
					},
					tools: [{ 
					iconCls:'icon-reload', 
					handler:function(){
					<s:if test="moduleContentLinktype=='0'">
					$('#<s:property value="moduleId"/>').panel('refresh');					
					</s:if>
					<s:else>					
					document.getElementById('i_<s:property value="moduleId"/>').src='<s:property value="moduleContentLink"/>';
					</s:else>
					} 
					}
					<s:if test="moduleMoreLink!=''">
					,{ 
					iconCls:'icon-more', 
					handler:function(){location.href='<s:property value="moduleMoreLink"/>';window.event.returnValue = false; } 
					}
					</s:if>
					]					
				}
				<s:if test="#status.last">		
				</s:if>
				<s:else>
				,
				</s:else>
				</s:iterator>
				];
				
				portal_left = $('#left_portal').portal({
					border : false,
					fit:true,
					onStateChange : function() {
						$.cookie('portal-state-left', getPortalState('left_portal',1), {
							expires : 3650
						});
					}								
				});
				var state_left = $.cookie('portal-state-left');
				if (!state_left) {
					state_left = id_left;
				}

				renderPanel(state_left,panels_left,portal_left);
				portal_left.portal('resize');

				
				
				
				panels_right = [ 
				<s:iterator value="list_SyRight" status="status">
				{
					id : '<s:property value="moduleId"/>',
					title : '<span class="<s:property value="moduleIconCss"/>"></span><span><s:property value="moduleTitle"/></span>',					
					headerCls : '<s:property value="moduleHeaderCss"/>',	
					bodyCls : '<s:property value="moduleBodyCss"/>',						
					<s:if test="moduleHeight==''">
					</s:if>
					<s:else>
					height : <s:property value="moduleHeight"/>,	
					</s:else>		
					collapsible : true,					
					closable : true,
					<s:if test="moduleContentLinktype=='0'">					
					href : '<s:property value="moduleContentLink"/>',
					</s:if>
					<s:else>
					content : '<iframe id="i_<s:property value="moduleId"/>" src="<s:property value="moduleContentLink"/>" frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" scrolling="no"></iframe>',
					</s:else>
					onClose : function() {					 
					 	$.cookie('portal-state-right', setPortalState('right_portal','<s:property value="moduleId"/>',1), {
							expires : 3650
						});						
					},
					tools: [{ 
					iconCls:'icon-reload', 
					handler:function(){
					<s:if test="moduleContentLinktype=='0'">
					$('#<s:property value="moduleId"/>').panel('refresh');					
					</s:if>
					<s:else>					
					document.getElementById('i_<s:property value="moduleId"/>').src='<s:property value="moduleContentLink"/>';
					</s:else>
					} 
					}
					<s:if test="moduleMoreLink!=''">
					,{ 
					iconCls:'icon-more', 
					handler:function(){location.href='<s:property value="moduleMoreLink"/>';window.event.returnValue = false; } 
					}
					</s:if>
					]
				}
				<s:if test="#status.last">		
				</s:if>
				<s:else>
				,
				</s:else>
				</s:iterator>
				];
				
				portal_right = $('#right_portal').portal({
					border : false,
					fit:true,
					onStateChange : function() {
						$.cookie('portal-state-right', getPortalState('right_portal',1), {
							expires : 3650
						});
					}
				});
				var state_right = $.cookie('portal-state-right');
				if (!state_right) {
					state_right = id_right;
				}

				renderPanel(state_right,panels_right,portal_right);
				portal_right.portal('resize');

			})

			
$(function(){
//@Mr.Think***����
var $cur = 1;
//��ʼ����ʾ�İ���
var $i = 8;
//ÿ����ʾ��
var $len = $('.navlink>ul>li').length;
//�����б��ܳ���(����)
var $pages = Math.ceil($len / $i);
//����չʾ��������
var $w = $('.navbox').width();
//ȡ��չʾ����Χ���
var $showbox = $('.navlink');
var $num = $('span.num li');
var $pre = $('span.toleft');
var $next = $('span.toright');
//@Mr.Think***��ǰ����
$pre.click(function(){
if (!$showbox.is(':animated')) {  
//�ж�չʾ���Ƿ񶯻�
if ($cur == 1) {   
//�ڵ�һ������ʱ,����ǰ���������һ������
$showbox.animate({left: '-=' + $w * ($pages - 1)}, 500); 
//�ı�leftֵ,�л���ʾ����,500(ms)Ϊ����ʱ��,��ͬ
$cur = $pages; 
//��ʼ������Ϊ���һ������
}
else {
$showbox.animate({left: '+=' + $w}, 500); 
//�ı�leftֵ,�л���ʾ����
$cur--; 
//�����ۼ�
}
$num.eq($cur - 1).addClass('numcur').siblings().removeClass('numcur'); 
//Ϊ��Ӧ�İ������ּ��ϸ�����ʽ,���Ƴ�ͬ��Ԫ�صĸ�����ʽ
}
});

//@Mr.Think***������
$next.click(function(){
if (!$showbox.is(':animated')) {
//�ж�չʾ���Ƿ񶯻�
if ($cur == $pages) {
//�����һ������ʱ,������������һ������
$showbox.animate({left: 0}, 500); 
//�ı�leftֵ,�л���ʾ����,500(ms)Ϊ����ʱ��,��ͬ
$cur = 1; //��ʼ������Ϊ��һ������
}
else {
$showbox.animate({left: '-=' + $w}, 500);
//�ı�leftֵ,�л���ʾ����
$cur++; 
//�������ۼ�
}
//$num.eq($cur - 1).addClass('numcur').siblings().removeClass('numcur'); 
//Ϊ��Ӧ�İ������ּ��ϸ�����ʽ,���Ƴ�ͬ��Ԫ�صĸ�����ʽ
}
});

//@Mr.Think***���ֵ���¼�
$num.click(function(){
if (!$showbox.is(':animated')) { 
//�ж�չʾ���Ƿ񶯻�
var $index = $num.index(this); 
//��������ǰ������б��е�λ��ֵ
$showbox.animate({left: '-' + ($w * $index)}, 500); 
//�ı�leftֵ,�л���ʾ����,500(ms)Ϊ����ʱ��
$cur = $index + 1; 
//��ʼ������ֵ,��һ��ɱ��⵱������������ʱ,������ť,����հװ�.index()ȡֵ�Ǵ�0��ʼ��,�ʼ�1
$(this).addClass('numcur').siblings().removeClass('numcur'); 
//Ϊ��ǰ������ϸ�����ʽ,���Ƴ�ͬ��Ԫ�صĸ�����ʽ
}
});
})

	   	</script>
	   	
<script language="javascript">		
		var sencods="6.1das";//JQuery��ʱ��ÿ��61�����һ��,����ʱ��session����ʱ���һ��
		var sessionUrl="sessionInfo.action";//session���ٺ���õ�ajax��ȡ�û������������������� 
		var usernameString="userenm";//�����󵯳����û����ı���id
		var pwdString="pwd";//�����󵯳��������ı���id
		var formSerializeString="#update";//���������ĵ�½�����form��id
		var resetSessionUrl="resetSessionInfomation.action";//���������ĵ�½������ȷ����ť�����������û�session�����ҽ���
		var curusername =  '<s:property value="sysusername"/>';
		var lock = '<s:property value="canLockScreen"/>';
		
		//�������ڿ��Ե������������ϵ�����Ū������
		//if (lock=="1")
		//onoffLockScreen(sencods,sessionUrl,usernameString,pwdString,formSerializeString,resetSessionUrl,curusername);
		
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

function showDetailes(src)
{
alert();
		$('#showDetails')[0].src=src; 
		$('#openRoleDiv').dialog('open');

}

</script>

	
	
	
</html>

