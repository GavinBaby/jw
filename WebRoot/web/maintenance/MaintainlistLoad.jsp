
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
		<s:hidden id="moduleIdS" name="moduleIdS"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<td width="40" align="center">
<img src="../../images/dqwz_tb.gif" width="15" height="15" />
</td>
<td align="left" class="gray_12">
当前位置：${levelName}
</td>
				</tr>
			</table>

			<table width="100%" height="10" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="Maintain_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<s:hidden id="showName" name="showName" ></s:hidden>
							<s:hidden id="moduleIdS" name="moduleIdS" ></s:hidden>
							<s:hidden id="mtype" name="mtype" ></s:hidden>
							<s:hidden id="modules" name="modules" ></s:hidden>
							<s:hidden id="actions" name="actions" ></s:hidden>
							<s:hidden id="params" name="params" ></s:hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										${showName}：
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="maintainName" name="maintainName"
											editCondition="*" maxlength="100" />
									</td>
									<td align="left">
										<input id="serach" type="button" value="查 询" />
									</td>
								</tr>
							</table>
						</s:form>
					</td>
				</tr>
			</table>
			<s:form cssClass="jNice">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="新 建" editCondition="*" />
							<jtag:jbutton id="delete" value="删 除" editCondition="*" />
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
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
			var moduleIdS = $("#moduleIdS").val()==null?"":$("#moduleIdS").val();
			var mtype = $("#mtype").val()==null?"":$("#mtype").val();
			var modules = $("#modules").val()==null?"": $("#modules").val();
			var actions = $("#actions").val()==null?"": $("#actions").val();
			var params = $("#params").val()==null?"":$("#params").val();
			openNew("maintenance/Maintain_detailsLoad.action?moduleIdS="+$("#moduleIdS").val()+"&mtype="+mtype+"&modules="+modules+"&actions="+actions+"&params="+params,"新建");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/Maintain_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Maintain_gridLoad_grid.action',
			queryParams:getQueryParams("searchData"),
			columns : [ [ {
				field : 'sort',
				title : '排序号',
				width : 20,
				align : 'center'
			}, {
				field : 'maintainName',
				title : $('#showName').val(),
				width : 30,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Maintain_detailsLoad.action?mainDocId='+data.uuid+'&moduleIdS='+$("#moduleIdS").val()+'\')">'+data.maintainName+'</a>'; 
				}
			}
			] ]
		});
	});
</SCRIPT>
</html>


