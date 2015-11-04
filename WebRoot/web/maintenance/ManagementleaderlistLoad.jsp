
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
	<body class="easyui-layout">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 75px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01010700"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<s:form cssClass="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="新 建" editCondition="*" />
							<jtag:jbutton id="delete" value="删 除" editCondition="*" />
						</td>
					</tr>
				</table>
			</s:form>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(function(e) {
			openNew("maintenance/Managementleader_detailsLoad.action", '新建');
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/Managementleader_detailsDelete_ajax.action","systemUserId");
		});
		$('#list').datagrid( {
			url : 'Managementleader_gridLoad_grid.action',
			columns : [ [ {
				field : 'userName',
				title : '分管领导',
				width : 20,
				align : 'center',
				formatter : function(value, data) {
                    return '<a href="javascript:openNew(\'maintenance/Managementleader_detailsLoad.action?systemUserId='+data.systemUserId+'\')">'+data.userName+'</a>'; 
                }
			},  {
				field : 'depnames',
				title : '对应部门',
				width : 50,
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Managementleader_detailsLoad.action?systemUserId='+data.systemUserId+'\')">'+data.depnames+'</a>'; 
				}
			} ] ]

		});
	});
</SCRIPT>
</html>


