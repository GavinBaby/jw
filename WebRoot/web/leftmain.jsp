<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
	<head>
		<script type="text/javascript" src="../js/jquery1.6.2.js"></script>
		<script type="text/javascript" src="../js/menu_min.js"></script>
		<link rel="stylesheet" type="text/css" href="../css/menu-css.css">
		<script type="text/javascript">
		
		</script>
	</head>

<body>
<s:hidden id="moduleId"  name="moduleId"></s:hidden>
<s:hidden id="modulePath"  name="modulePath"></s:hidden>

<div class="menu">
  ${leftMenu}
</div>
</body>
<script type="text/javascript">
var leftMenu='${leftMenu}';
if(leftMenu==null||leftMenu==''){
	
	var str= new Array();
	var str='${modulePath}'.split("->");
	for (i=0;i<str.length ;i++ ){
		var moduleId = str[i];
	}
	
}else{
	$mId = $("#moduleId").val();
	var end=leftMenu.indexOf('" id="'+$mId+'" target="List">');
	var start;
	var notStart;
	var startIndex=0;
	if(end!=-1){
		start=leftMenu.indexOf('<a id="'+$mId+'" href="',0);
		parent.frames['List'].window.location.href=leftMenu.substring(start+29,end);
	}else{
		startIndex=leftMenu.indexOf('<a id="'+$mId+'" href="',0);
		while(true){
			start=leftMenu.indexOf('" href="',startIndex);
			notStart=leftMenu.indexOf('" href="#">',startIndex);
			if(start!=notStart||start==-1){
				break;
			}else{
				startIndex=start+1;
			}
		}
		if(start!=-1){
			end = leftMenu.indexOf('" id="',start);
			parent.frames['List'].window.location.href=leftMenu.substring(start+8,end);
			var mend = leftMenu.indexOf('" href="'+leftMenu.substring(start+8,end));
			$("#moduleId").val(leftMenu.substring(mend-14,mend));
		}
	}
}
$(function() {
	 $(".menu ul li").menu();
	 expand();
});
function  expand(){
	$mId = $("#moduleId").val();

	$("#"+$mId).parentsUntil( $("body").find("ul").eq(0), "li" ).each(function(index,el){
		if($(el).children("a").attr("id") != $mId){
			$(el).children("a").attr("class","active");
			$(el).children("ul").attr("style","display: block;");
		}
	});
	
	//$("#"+$mId).parent("li").parents("li").childrens("a").addClass("active");
	//$("#"+$mId).parent("li").parents("li").childrens("ul").attr("style","display: block;");
}
</script>

</html>