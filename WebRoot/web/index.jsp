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
     <li><a href="javascript:void(0)" onclick="clrcookie()">重置布局</a></li>
     <s:iterator value="listC_V_Sys_Navigationnotes" status="index">
	   <li><a href="javascript:setUrl('${moduleId}')" >${moduleName}</a></li>	   	       	  
	 </s:iterator>
	 </ul>
	</div>
	</div>
   </div>
   <div class="xinxi"><form name="logout" action="logout.action" method="post" target="_top"><font class="blue">${userName}</font>，欢迎您!<font class="red xhx" style="cursor:hand" onclick="javascript:logout.submit();">退出</font></form></div></span></span>
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
 
	<div id="bottom">技术支持 宁波金网信息产业有限公司</div>
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
//@Mr.Think***变量
var $cur = 1;
//初始化显示的版面
var $i = 8;
//每版显示数
var $len = $('.navlink>ul>li').length;
//计算列表总长度(个数)
var $pages = Math.ceil($len / $i);
//计算展示版面数量
var $w = $('.navbox').width();
//取得展示区外围宽度
var $showbox = $('.navlink');
var $num = $('span.num li');
var $pre = $('span.toleft');
var $next = $('span.toright');
//@Mr.Think***向前滚动
$pre.click(function(){
if (!$showbox.is(':animated')) {  
//判断展示区是否动画
if ($cur == 1) {   
//在第一个版面时,再向前滚动到最后一个版面
$showbox.animate({left: '-=' + $w * ($pages - 1)}, 500); 
//改变left值,切换显示版面,500(ms)为滚动时间,下同
$cur = $pages; 
//初始化版面为最后一个版面
}
else {
$showbox.animate({left: '+=' + $w}, 500); 
//改变left值,切换显示版面
$cur--; 
//版面累减
}
$num.eq($cur - 1).addClass('numcur').siblings().removeClass('numcur'); 
//为对应的版面数字加上高亮样式,并移除同级元素的高亮样式
}
});

//@Mr.Think***向后滚动
$next.click(function(){
if (!$showbox.is(':animated')) {
//判断展示区是否动画
if ($cur == $pages) {
//在最后一个版面时,再向后滚动到第一个版面
$showbox.animate({left: 0}, 500); 
//改变left值,切换显示版面,500(ms)为滚动时间,下同
$cur = 1; //初始化版面为第一个版面
}
else {
$showbox.animate({left: '-=' + $w}, 500);
//改变left值,切换显示版面
$cur++; 
//版面数累加
}
//$num.eq($cur - 1).addClass('numcur').siblings().removeClass('numcur'); 
//为对应的版面数字加上高亮样式,并移除同级元素的高亮样式
}
});

//@Mr.Think***数字点击事件
$num.click(function(){
if (!$showbox.is(':animated')) { 
//判断展示区是否动画
var $index = $num.index(this); 
//索引出当前点击在列表中的位置值
$showbox.animate({left: '-' + ($w * $index)}, 500); 
//改变left值,切换显示版面,500(ms)为滚动时间
$cur = $index + 1; 
//初始化版面值,这一句可避免当滚动到第三版时,点击向后按钮,出面空白版.index()取值是从0开始的,故加1
$(this).addClass('numcur').siblings().removeClass('numcur'); 
//为当前点击加上高亮样式,并移除同级元素的高亮样式
}
});
})

	   	</script>
	   	
<script language="javascript">		
		var sencods="6.1das";//JQuery计时器每个61秒调用一次,设置时比session销毁时间大一秒
		var sessionUrl="sessionInfo.action";//session销毁后调用的ajax获取用户名，并触发锁屏函数 
		var usernameString="userenm";//锁屏后弹出的用户名文本框id
		var pwdString="pwd";//锁屏后弹出的密码文本框id
		var formSerializeString="#update";//锁屏弹出的登陆画面的form表单id
		var resetSessionUrl="resetSessionInfomation.action";//锁屏弹出的登陆画面点击确定按钮后重新设置用户session，并且解锁
		var curusername =  '<s:property value="sysusername"/>';
		var lock = '<s:property value="canLockScreen"/>';
		
		//锁屏窗口可以弹出来，但边上的遮罩弄不出来
		//if (lock=="1")
		//onoffLockScreen(sencods,sessionUrl,usernameString,pwdString,formSerializeString,resetSessionUrl,curusername);
		
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

function showDetailes(src)
{
alert();
		$('#showDetails')[0].src=src; 
		$('#openRoleDiv').dialog('open');

}

</script>

	
	
	
</html>

