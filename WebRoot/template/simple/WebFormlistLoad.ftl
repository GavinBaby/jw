

<#assign jtag=JspTaglibs["/WEB-INF/tld/jtag.tld"] />

<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<html>
	<head>
		<@jtag.jhead />
	</head>
		<body class="easyui-layout">
		<@s.hidden id="mainDocId" name="mainDocId"></@s.hidden>
		<div data-options="region:'north',border:false"
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<@jtag.jlevel moduleId="${moduleId}"></@jtag.jlevel>
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
						<@s.form id="searchData" name="searchData"
							action="Group_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<@s.hidden id="webFormId" name="webFormId"></@s.hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										群组名称：
									</td>
									<td width="20%" align="left">
										<@s.textfield id="GroupNameS" name="GroupNameS" theme="simple"
											maxlength="50" />
									</td>
									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="查 询" />
									</td>
								</tr>
							</table>
						</@s.form>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<@s.form cssClass="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<@jtag.jbutton id="new" value="新 建" editCondition="*" />
							<@jtag.jbutton id="delete" value="删 除" editCondition="*" />
						</td>
					</tr>
				</table>
			</@s.form>
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
	    var webFormId = $("#webFormId").val();
		$.ajax( {
			url : "webformajax/WebFormGenerat_gridLoad_grid.action?webFormId="+webFormId,
			type : "POST",
			dataType : "json",
			success : showGrid,
			 error: ajaxError
		});
		
		$("#new").click(function(e) {
			openNew("webform/WebFormGenerat_detailsLoad.action?mainTableName="+webFormId,"新建");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("WebFormGenerat_detailsDelete_ajax.action");
		});
	});
		
    //处理返回结果，并显示数据表格  
	function showGrid(data) {  
	    var options = { 
	        rownumbers: true  
	    };  
	    
	    options.columns = eval(data.columns);//把返回的数组字符串转为对象，并赋于datagrid的column属性  
	    var dataGrid = $("#list");  
	    dataGrid.datagrid(options);//根据配置选项，生成datagrid  
	    dataGrid.datagrid("loadData", data.rows); //载入本地json格式的数据  
	}  		
	</SCRIPT>
</html>


