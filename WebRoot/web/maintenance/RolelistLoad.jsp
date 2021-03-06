
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
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01010500"></jtag:jlevel>
				</tr>
			</table>

			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="10">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="Role_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										角色名称：
									</td>
									<td width="20%" align="left">
										<s:textfield id="roleName" name="roleName" theme="simple"
											maxlength="50" />
									</td>
									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="查 询" />
									</td>
								</tr>
							</table>
						</s:form>
					</td>
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
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(function(e) {
			openNew("maintenance/Role_detailsLoad.action", "新建");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/Role_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Role_gridLoad_grid.action',
			queryParams:getQueryParams("searchData"),
			columns : [ [ {
				field : 'sort',
				title : '排序号',
				width : 10,
				align : 'center'
			}, {
				field : 'roleId',
				title : '角色编号',
				width : 20,
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Role_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.roleId+'</a>'; 
				}
			}, {
				field : 'roleName',
				title : '角色名称',
				width : 50,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Role_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.roleName+'</a>';
				}
			}, {
				field : 'userLook',
				title : '人员',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'common/UserSelect_listLoad.action?isSglSel=1&userSelRa=1&submitAction=../maintenance/Role_selUserUpdate_ajax.action?roleId=' +data.uuid + '&selUserAction=../maintenance/Role_selUserList_treegrid.action?roleId=' +data.uuid + '\',\'人员选择\',490,400)">'+"人员"+'</a>';
				}
			}, {
				field : 'isFlowShow',
				title : '流程中是否显示',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return (value == '1') ? '显示' : '不显示';
				}
			} ] ]

		});
	});
</SCRIPT>
</html>


