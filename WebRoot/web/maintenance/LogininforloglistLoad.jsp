
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
			style="height: 92px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01010200"></jtag:jlevel>
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
							action="Logininforlog_gridLoad_grid.action" theme="simple"
							method="post" cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										登录人员：
									</td>
									<td width="20%" align="left">
										<s:textfield id="deptName" name="deptName" theme="simple"
											maxlength="50" />
									</td>
									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="查 询" />
										<input id="statistics" type="button" value="统 计" />
									</td>
									
							
								</tr>
							</table>
						</s:form>
					</td>
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
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$("#statistics").click(function(e) {
			openNew("maintenance/Charts_loginLogWichDep.action", "统计");
		});
		$('#list').datagrid( {
			url : 'Logininforlog_gridLoad_grid.action',
			frozenColumns: null,
			columns : [ [ {
				field : 'loginUserName',
				title : '登入用户',
				width : 30,
				align : 'center'
			}, {
				field : 'deptName',
				title : '所在部门',
				width : 30
			}, {
				field : 'loginTime',
				title : '登录时间',
				width : 20,
				align : 'center'
			}, {
				field : 'loginIp',
				title : '登录IP',
				width : 20,
				align : 'center'
			} ] ]

		});
	});
</SCRIPT>
</html>


