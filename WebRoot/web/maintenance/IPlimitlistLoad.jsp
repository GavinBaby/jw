
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
					<jtag:jlevel moduleId="module01030700"></jtag:jlevel>
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
							action="Errorloginfor_gridLoad_grid.action" theme="simple"
							method="post" cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">

									</td>
									<td width="20%" align="left">

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
		$('#list').datagrid( {
			url : 'Errorloginfor_gridLoad_grid.action',
			columns : [ [ {
				field : 'moduleId',
				title : '异常发生模块',
				width : fixWidthTable(0.2),
				align : 'center'
			}, {
				field : 'erroeType',
				title : '异常类型',
				width : fixWidthTable(0.2)
			}, {
				field : 'createUser',
				title : '操作用户',
				width : fixWidthTable(0.1),
				align : 'center'
			}, {
				field : 'createTime',
				title : '发生时间',
				width : fixWidthTable(0.1),
				align : 'center'
			}, {
				field : 'errorIp',
				title : '发生电脑IP',
				width : fixWidthTable(0.1),
				align : 'center'
			}, {
				field : 'deptName',
				title : '详细情况',
				width : fixWidthTable(0.3),
				align : 'center'
			} ] ]

		});

	});
</SCRIPT>
</html>


