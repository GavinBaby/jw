<#assign jtag=JspTaglibs["/WEB-INF/tld/jtag.tld"] />
<#assign text="${detailsJson}" />
<#assign data=text?eval />

<html>
	<head>
		<@jtag.jhead />
	</head>
	<body>
	<table width="350px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">

					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<@jtag.jlevel moduleId="${moduleId}"></@jtag.jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="webformajax/WebFormGenerat_detailsUpdate.action" method="POST"
						class="jNice">
						<@s.hidden id="mainDocId" name="mainDocId"></@s.hidden>
						<@s.hidden id="webFormId" name="webFormId"></@s.hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<@jtag.jbutton id="save" value="±£ ´æ" editCondition="*" />
									<@jtag.jbutton id="back" value="·µ »Ø" editCondition="*" />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="${data.width}" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
						<#list data.trs as trs>
						<tr>
						<#list trs.tds as td>
						<TD width="${td.width}" align="${td.align}" colspan="${td.colspan}" class="${td.class}">
						<#list td.tags as tags>
						<#switch tags.type>
							<#case "lable">
						    	${tags.text}
						    	<#break>
							<#case "jtl">
						    	<@jtag.jtl id="${tags.id}" name="objDetails.${tags.id}"
										editCondition="${tags.editcondition}" maxlength="${tags.maxlength}" cssStyle="${tags.cssstyle}"></@jtag.jtl>
						    	<#break>
						    <#case "jtal">
						    	<@jtag.jtl id="${tags.id}" name="objDetails.${tags.id}"
										editCondition="${tags.editcondition}" maxlength="${tags.maxlength}" cssStyle="${tags.cssstyle}"></@jtag.jtl>
						    	<#break>
							<#default>
						</#switch>
						</#list>
						</TD>
						</#list>
						</tr>
						</#list>
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
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
				var params = $("#update").serialize();
				$.ajax( {
					url : "webformajax/WebFormGenerat_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});

		$("#back").click(function(e) {
			closeBox();
		});
	});
	function callback(data) {
		ajaxMessage(data, 1);
	}
</SCRIPT>
</html>