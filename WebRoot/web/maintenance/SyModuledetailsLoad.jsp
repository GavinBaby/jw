
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

		<table width="900px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01030900"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="maintenanceajax/SyModule_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Sy_Module.uuid"></s:hidden>
						
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存" editCondition="*" />
									<input type="button" id="back" value="返 回" />
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
								<td width="15%" class="ziduan">
									模块编号：
								</td>
								<td width="18%">
									<jtag:jtl id="moduleId" name="c_T_Sys_Sy_Module.moduleId"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
								<td width="15%" class="ziduan">
									模块名：
								</td>
								<td width="19%">
									<jtag:jtl id="moduleTitle" name="c_T_Sys_Sy_Module.moduleTitle"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
								<td width="15%" class="ziduan">
									模块位置：
								</td>
								<td width="18%">
									<jtag:jsl id="moduleType" list="#{'L':'左侧','C':'居中','R':'右侧'}"
										name="c_T_Sys_Sy_Module.moduleType" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Sy_Module.sort"
										editCondition="*" maxlength="5" cssStyle="width:145px"/>
								</td>
								<td class="ziduan">
									标题样式：
								</td>
								<td>
									<jtag:jtl id="moduleTitleCss" name="c_T_Sys_Sy_Module.moduleTitleCss" 
										editCondition="*" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									头部样式：
								</td>
								<td>
									<jtag:jtl id="moduleHeaderCss" name="c_T_Sys_Sy_Module.moduleHeaderCss"
										editCondition="*" maxlength="50" cssStyle="width:145px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									内容样式：
								</td>
								<td>
									<jtag:jtl id="moduleBodyCss" name="c_T_Sys_Sy_Module.moduleBodyCss"
										editCondition="*" maxlength="50" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									模块图标样式：
								</td>
								<td>
									<jtag:jtl id="moduleIconCss" name="c_T_Sys_Sy_Module.moduleIconCss" 
										editCondition="*" maxlength="50" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									模块显示高度：
								</td>
								<td>
									<jtag:jtl id="moduleHeight" name="c_T_Sys_Sy_Module.moduleHeight"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									模块图标路径：
								</td>
								<td colspan="5">
									<jtag:jtl id="moduleIconImg" name="c_T_Sys_Sy_Module.moduleIconImg" 
										editCondition="*" cssStyle="width:735px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									模块更多链接：
								</td>
								<td colspan="5">
									<jtag:jtl id="moduleMoreLink" name="c_T_Sys_Sy_Module.moduleMoreLink" 
										editCondition="*" cssStyle="width:735px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									模块内容链接：
								</td>
								<td colspan="3">
									<jtag:jtl id="moduleContentLink" name="c_T_Sys_Sy_Module.moduleContentLink" 
										editCondition="*" cssStyle="width:440px" >
										 </jtag:jtl>
								</td>
								<td class="ziduan">
									内容链接模式：
								</td>
								<td>
									<jtag:jsl id="moduleContentLinktype" list="#{0:'包含',1:'嵌入'}"
										name="c_T_Sys_Sy_Module.moduleContentLinktype" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px"/>
								</td>
							</tr>
							<tr>	
								<td class="ziduan">
									是否默认显示：
								</td>
								<td>
									<jtag:jsl id="moduleCheck"  list="#{0:'否',1:'是'}" 
										name="c_T_Sys_Sy_Module.moduleCheck"  listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px"/>
								</td>
								<td class="ziduan">
									&nbsp;
								</td>
								<td>
									&nbsp;
								</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>

						</table>
					</s:form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		
		<div style="display:none">
		模块显示宽度：<jtag:jtl id="moduleWidth" name="c_T_Sys_Sy_Module.moduleWidth"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
									
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid == false) {
				return false;
			}
			var params = $("#update").serialize();
			lockBox();
			$.ajax( {
				url : "maintenance/SyModule_detailsUpdate_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : callback,
				error : ajaxError
			});
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
			closeBox();
		});

		var treeStr = eval($('#selectModuleJson').attr("value"));
		$('#pModuleName').combotree();
		$('#pModuleName').combotree('loadData', treeStr);
		
		$('#moduleDescription').textareaCount( {
			'maxCharacterSize' : 2000
		});
		
		$("#moduleId,#moduleName").validatebox( {
			required : true
		});
		
		$('#sort').numberbox({
			min:0,
			required : true
		});  
		
		$('#isHaveSms,#isWork,#isLogicDelete').combobox( {
			panelHeight : 42
		});
		
		$('#moduleType').combobox( {
			panelHeight : 63
		});
	});
</SCRIPT>
</html>


