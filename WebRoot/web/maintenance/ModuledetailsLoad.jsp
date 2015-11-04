
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
							<jtag:jlevel moduleId="module01030200"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="maintenanceajax/Module_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Module.uuid"></s:hidden>
						<s:hidden id="selectModuleJson" name="selectModuleJson"></s:hidden>
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
									<jtag:jtl id="moduleId" name="c_T_Sys_Module.moduleId"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
								<td width="15%" class="ziduan">
									模块名：
								</td>
								<td width="19%">
									<jtag:jtl id="moduleName" name="c_T_Sys_Module.moduleName"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
								<td width="15%" class="ziduan">
									模块类别：
								</td>
								<td width="18%">
									<jtag:jsl id="moduleType" list="#{1:'流程模块',2:'非流程模块',3:'导航'}"
										name="c_T_Sys_Module.moduleType" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Module.sort"
										editCondition="*" maxlength="5" cssStyle="width:145px"/>
								</td>
								<td class="ziduan">
									指定显示容器：
								</td>
								<td>
									<jtag:jsl id="target" list="#{'':'','List':'List'}"
										name="c_T_Sys_Module.target" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									父模块：
								</td>
								<td>
									<jtag:jtl id="pModuleName" name="c_T_Sys_Module.parenModule" editCondition="*"
										 maxlength="100" cssStyle="width:145px" >
										 </jtag:jtl>
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									短信模块：
								</td>
								<td>
									<jtag:jsl id="isHaveSms" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_Module.isHaveSms" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									即时消息：
								</td>
								<td>
									<jtag:jsl id="isWork" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_Module.isHaveMsg" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									是否逻辑删除：
								</td>
								<td>
									<jtag:jsl id="isLogicDelete" list="#{0:'否',1:'是'}"
										name="c_T_Sys_Module.isLogicDelete" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:145px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									模块链接地址：
								</td>
								<td colspan="5">
									<jtag:jtl id="linkUrl" name="c_T_Sys_Module.linkUrl"
										editCondition="*" maxlength="100" cssStyle="width:735px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									模块图片路径：
								</td>
								<td colspan="5">
									<jtag:jtl id="picUrl" name="c_T_Sys_Module.picUrl"
										editCondition="*" maxlength="100" cssStyle="width:735px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									对应主表名称：
								</td>
								<td>
									<jtag:jtl id="tableName" name="c_T_Sys_Module.tableName"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
								<td class="ziduan">
									表主键对应域ID：
								</td>
								<td>
									<jtag:jtl id="pkId" name="c_T_Sys_Module.pkId"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
								<td class="ziduan">
									标题对应域ID：
								</td>
								<td>
									<jtag:jtl id="titleId" name="c_T_Sys_Module.titleId"
										editCondition="*" maxlength="50" cssStyle="width:145px"/>
								</td>
							</tr>

							<tr>
								<td class="ziduan">
									模块说明：
								</td>
								<td colspan="5">
									<jtag:jtal id="moduleDescription"
										name="c_T_Sys_Module.moduleDescription" editCondition="*"
										cssStyle="width:735px;height:60" cols="100" />
								</td>
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
				url : "maintenance/Module_detailsUpdate_ajax.action",
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

		var treeStr = eval($('#selectModuleJson').attr("value"));
		$("#pModuleName").combotree();
		$("#pModuleName").combotree("loadData", treeStr);
		
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
	function callback(data) {
		ajaxMessage(data, 4);
	}
</SCRIPT>
</html>


