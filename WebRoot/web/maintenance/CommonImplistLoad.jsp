
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<jtag:jhead />
	</head>
	<body>

		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01040100"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/" method="POST"
						class="jNice">
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="导  入" editCondition="*" />
									<jtag:jbutton id="test" value="测试" editCondition="*" />
								</td>
								<td>
									
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<tr>
								<td  class="ziduan">
									附&nbsp;&nbsp;&nbsp;&nbsp;件：
								</td>
								<td colspan='3'>
									<jtag:jupload id="upload1" moduleId="module05020000" mainId="11111111111111" editCondition="#" />	
								</td>
								
							</tr>
							<tr>
								<td  class="ziduan">
									导&nbsp;&nbsp;&nbsp;&nbsp;入：
								</td>
								<td colspan='3'>
								<!--  文件路径 "\"已用"#"代替  -->
									<s:hidden id="fileName" name="fileName"></s:hidden>
									<jtag:jimport id="upload3" editCondition="*" />	
								</td>
								
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									开&nbsp;始&nbsp;行：
								</td>
								<td width="30%">
									<jtag:jtl id="start" name="start"
											editCondition="*" maxlength="100" />
								</td>
								<td width="20%" class="ziduan">
									结&nbsp;束&nbsp;行：
								</td>
								<td width="30%">
									<jtag:jtl id="end" name="end"
											editCondition="*" maxlength="100" />
								</td>
								
							</tr>
							<tr>
								<td  class="ziduan">
									图片上传：
								</td>
								<td  colspan='3'>
									<jtag:jimage id="upload2" moduleId="module05010000" imageH="170" imageW="150"
                                        mainId="mainDocId" editCondition="*" />	
								</td>
								
							</tr>
							<tr>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="17">
							<tr>
								<td></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$('#upload3').uploadify(new importObject("upload3","fileName","30MB","*.xls")); 
		$('#upload2').uploadify(new imageObject("upload2",false,"1","30MB","*.jpg;*.gif;")); 
		$('#upload1').uploadify(new uploadObject("upload1",true,"1","30MB","")); 
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if($("#fileName").val()==''){
				art.dialog.alert("请先上传文件！")
				return;
			}
			if (returnIsValid) {
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/CommonImp_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});
		$("#test").click(function(e) {
			openNew("maintenance/CommonImp_detailsLoad.action","新建");
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}
		
		$("#start,#end").validatebox({
			required:true,
			validType:"number"
		});
	});
</SCRIPT>
</html>


