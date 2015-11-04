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
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		 <link href="../../css/css.css" rel="stylesheet" type="text/css"/>
    
    <!-- 框架通用js引用 --> 
    <script type="text/javascript" src="../../js/JwCommon.js"></script>
    <script type="text/javascript" src="../../js/jquery1.6.2.js"></script> 
    	
	<!-- jNice插件js/css引用 -->
	<link rel="stylesheet" type="text/css" href="../../css/jNice/jNice.css">
	<script type="text/javascript" src="../../js/jNice/jquery.jNice.js"></script>

   

		<script type="text/javascript">
	
</script>
	</head>



	<body>

		<table height="99%" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<td width="40" align="center">
								<img src="../../images/dqwz_tb.gif" width="15" height="15" />
							</td>
							<td align="left" class="gray_12">
								日志记录
							</td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update" action="" method="POST" Class="jNice">
						<table width="99%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<input type="button" id="save" value="确 认"/>
									<input type="button" id="back" value="取 消"  />
									<input type="button" id="delete" value="删 除"  />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="99%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<tr>
								<td  class="ziduan">
									<div style="float:left;">工作计划情况</div> 
								</td>	
							</tr>
											
							<tr>			
								<TD width="100%"  align="left">
									<textarea id="plannig" name="plannig"  cols="51" rows="6"
										  onfocus="if(this.value=='在这里输入...'){this.value='';}" onblur="if(this.value==''){this.value='在这里输入...';}"
										></textarea>
								</TD>
							</tr>
							<tr>
								<td  class="ziduan" >
									<div style="float:left;">工作实际情况</div>
								</td>	
							</tr>
							<tr>
								
								<TD width="100%"  align="left">
									<textarea  id="nr" name="nr" cols="51" rows="6"
										  onfocus="if(this.value=='在这里输入...'){this.value='';}" onblur="if(this.value==''){this.value='在这里输入...';}"
										></textarea> 
								</TD>
							</tr>								
						</TABLE>
					</form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">
	var title=window.dialogArguments;
	if(null==title[0]){
		 document.getElementById("nr").setAttribute("value","在这里输入...");
	}else{
		 document.getElementById("nr").setAttribute("value",title[0]);
	}
	if(null==title[1]){
		 document.getElementById("plannig").setAttribute("value","");
	}else{
		 document.getElementById("plannig").setAttribute("value",title[1]);
	}
   
	$(function() {
		$("#save").click(function(e) {
			var title=new Array();
			if (""==document.getElementById('plannig').value || document.getElementById('plannig').value == '在这里输入...') {
				 title[1] ="无";
			 }else{
				 title[1] =document.getElementById('plannig').value;
			 }

			if (""==document.getElementById('nr').value || document.getElementById('nr').value == '在这里输入...') {
				 title[0] ="无";
			 }else{
				 title[0] =document.getElementById('nr').value; 
			 }

			if ((""==document.getElementById('plannig').value || document.getElementById('plannig').value == '在这里输入...')&&(""==document.getElementById('nr').value || document.getElementById('nr').value == '在这里输入...')){
				window.close();
			} else {
				window.returnValue = title;	 		 
				window.close();	
			}
		});

		$("#back").click(function(e) {
			window.returnValue=title;
			window.close();
		});

		$("#delete").click(function(e) {
			window.close();
		});
	});
	
</SCRIPT>
</html>
