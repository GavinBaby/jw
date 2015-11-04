<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<!DOCTYPE html PUBLIC "-//W3C//Dtd XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/Dtd/xhtml1-transitional.dtd">
<html>
	<head>
		<link href="../../css/global.css" rel="stylesheet" type="text/css">
		<link href="../../css/layout.css" rel="stylesheet" type="text/css">
		<link href="../../css/biaodan.css" rel="stylesheet" type="text/css">
		<link href="../../css/mo4css.css" rel="stylesheet" type="text/css">
		<jtag:jhead />
	</head>

	<body>
		<s:form id="update" name="update" method="POST"
			action="withdramalUpdate" theme="simple">
			<TABLE width="100%" border="0" cellpadding="0" cellspacing="0"
				bgcolor="#FFFFFF">
				<TR>
					<s:hidden name="mainDocId" id="mainDocId"></s:hidden>
					<s:hidden name="moduleId" id="moduleId"></s:hidden>
					<td align="center" valign="middle" height="40">
						<b>【流程退回选项】</b>
						<BR>
					</td>
				</TR>
				<TR>
					<td width="100%" height="35" align="center" vAlign="middle"
						noWrap="nowrap" class="Tdcellleft">
						请选择要退回到的环节：
					</td>
				</TR>
				<TR>
					<td vAlign="middle" noWrap="nowrap" align="center"
						class="Tdcellright">
						<jtag:jsl id="withdramalTache"
							name="c_T_Flow_Withdramal.withdramalToTache"
							list="listC_S_Flow_WithdramalList" listKey="tacheId"
							listValue="tacheName" headerKey="" headerValue="--请选择--"
							editCondition="*"
							cssStyle="width:50%"></jtag:jsl>
					</td>
				</TR>
				<TR>
					<td vAlign="middle" nowrap="nowrap" align="center" height="35"
						class="Tdcellleft">

						请输入退办意见：
					</td>
				</TR>
				<TR>
					<td align="center" vAlign="middle" noWrap>
						<jtag:jtal id="withdramalOpinion"
							name="c_T_Flow_Withdramal.withdramalopinion" editCondition="*"
							cssStyle="width:98%;height:100px" rows="15" cols="80"></jtag:jtal>
					</td>
				</TR>
				<TR>
					<td vAlign="middle" noWrap align="center">
						&nbsp;
					</td>
				</TR>
				<TR>
					<td vAlign="middle" noWrap align="center">
						<jtag:jbutton id="save" value="确 定" editCondition="*"
							onclick="updateData()"cssClass="btn4 pbtn1" />
						<jtag:jbutton id="close" value="关 闭" editCondition="*"
							cssClass="btn5 pbtn1" />
					</td>
				</TR>
			</TABLE>
		</s:form>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#close").click(function(){
				closeBox();
			});
			
			
		setTimeout(function(){ 
			art.dialog.data('api').size(400, 300).position('50%','50%');
		}, 10); 
	});
	
	function updateData() {
		if ($("#withdramalTache").find("option:selected").val() == "") {
			alert("请选择退回环节！");
			return false;
		}
		var yn = confirm("是否确定退回？")
		if (yn == false) {
			return false;
		}
		var params = jQuery("#update").serialize();
		$.ajax( {
			url : "Withdramal_detailsUpdate_ajax.action",
			type : "POST",
			data : params,
			dataType : "json",
			success : callbackFun,
			error : ajaxError
		});
	}

	function callbackFun(data) {

		var ls_Separator3 = "#";
		var withdramalTache = $("#withdramalTache").find("option:selected").val();
		var nextTacheInfo = "2" + ls_Separator3 + withdramalTache
				+ ls_Separator3 + ls_Separator3 +"false"+ ls_Separator3+"false"+ ls_Separator3 ;
		art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
		art.dialog.opener.$("#save").click();
		closeBox();
	}
</SCRIPT>
</html>