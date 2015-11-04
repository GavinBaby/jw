<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<html xmlns:v="urn:schemas-microsoft-com:vml">
	<HEAD>
		<title>办公自动化系统</title>
		<META NAME="Author" CONTENT="JinWang">
		<META NAME="Keywords" CONTENT="JMOWebFlowBuilder">
		<link href="../../css/flow/style.css" type=text/css rel=stylesheet>
    	<script type="text/javascript" src="../../js/jquery1.6.2.js"></script> 
    	<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script type="text/javascript" src="../../js/flow/contextMenu/context.js"></script>
		<script type="text/javascript" src="../../js/flow/jmowebflow.js"></script>
		<script type="text/javascript" src="../../js/flow/function.js"></script>
		<script type="text/javascript" src="../../js/flow/movestep.js"></script>
		<script type="text/javascript" src="../../js/JwCommon.js"></script>
		<base target="_self" />
		<STYLE>
v\:* {
	Behavior: url(#default#VML)
}
.btntools {
	color: #000000;
	BACKGROUND-COLOR: #D7E8F8;
	border-color: #8BC0EA;
	BORDER-BOTTOM: 1px ridge;
	BORDER-LEFT: #ffffff 1px ridge;
	BORDER-RIGHT: 1px ridge;
	BORDER-TOP: #ffffff 1px ridge;
	FONT-SIZE: 12px;
	HEIGHT: 14pt
}
</STYLE>
	</HEAD>

	<BODY scroll="auto">
		<s:form id="update" name="update" >
			<INPUT TYPE="hidden" id="FlowXML" name="FlowXML"
				onpropertychange='if(AUTODRAW) redrawVML();'>
			<TABLE border=0>
				<s:hidden id="xmlValue" name="xmlValue"></s:hidden>
				<s:hidden id="fdCurrnetDocFlow" name="fdCurrnetDocFlow"></s:hidden>
				<s:hidden id="flowId" name="flowId"></s:hidden>
				<TR>
					<TD width="900" height="450">
						<TABLE cellspacing="0" cellpadding="0" class="panel_style">

							<TR>
								<TD colspan=2 width="800" height="450"
									onclick="cleancontextMenu(); return false;"
                                    oncontextmenu="flowContextMenu();return false;"
									valign=top align=left>
									<v:group ID="FlowVML"
										style="left:14;top:37;width:800px;height:500px;position:absolute;"
										coordsize="2000,2000">
									</v:group>

								</TD>
							</TR>
						</TABLE>
					</TD>
				</TR>
				<TR>
					<TD valign=top align=center>

						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td width="52" align="center" class="btntools">
									<table width="40" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td height="4"></td>
										</tr>
										<tr>
											<td align="center">
												<a id="back" href="#" style="cursor: hand;">关
													闭</a>
											</td>
										</tr>
									</table>
								</td>

								<td align="center" width="10"></td>

								<td width="52" align="center" class="btntools">
									<table width="40" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td height="4"></td>
										</tr>
										<tr>
											<td align="center">
												<a id="save" href="#" style="cursor: hand;">保
													存</a>
											</td>
										</tr>
									</table>
								</td>

							</tr>
						</table>

					</TD>
				</TR>
			</TABLE>
		</s:form>
<SCRIPT type="text/javascript">
	$(function() {
		$("#FlowXML").val($("#xmlValue").val());
		$("#save").click(function(e) {
			//判断流程是否有效
			if (JudgeFlowIsValidity() == 0) {
				//流程无效！
				return false;
			}
			$("#xmlValue").val($("#FlowXML").val());
			
			var params = $("#update").serialize();	
			$.ajax( {
				url : "workflowengine/FlowAllInfoUptata.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : callback,
				error : ajaxError
			});
		
		});
		
		$("#back").click(function(e) {
			closeBox();
		});
		
	});	
	function callback(data) {
		ajaxMessage(data,9);
	}
</SCRIPT>
	</BODY>
</HTML>
