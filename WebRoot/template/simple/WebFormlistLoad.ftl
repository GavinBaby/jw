

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
										Ⱥ�����ƣ�
									</td>
									<td width="20%" align="left">
										<@s.textfield id="GroupNameS" name="GroupNameS" theme="simple"
											maxlength="50" />
									</td>
									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="�� ѯ" />
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
							<@jtag.jbutton id="new" value="�� ��" editCondition="*" />
							<@jtag.jbutton id="delete" value="ɾ ��" editCondition="*" />
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
			openNew("webform/WebFormGenerat_detailsLoad.action?mainTableName="+webFormId,"�½�");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("WebFormGenerat_detailsDelete_ajax.action");
		});
	});
		
    //�����ؽ��������ʾ���ݱ��  
	function showGrid(data) {  
	    var options = { 
	        rownumbers: true  
	    };  
	    
	    options.columns = eval(data.columns);//�ѷ��ص������ַ���תΪ���󣬲�����datagrid��column����  
	    var dataGrid = $("#list");  
	    dataGrid.datagrid(options);//��������ѡ�����datagrid  
	    dataGrid.datagrid("loadData", data.rows); //���뱾��json��ʽ������  
	}  		
	</SCRIPT>
</html>


