
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
		<div data-options="region:'north',border:false"
			style="height: 70px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module05010000"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<form id="searchData" name="searchData" action="" method="POST"
				class="jNice">
				<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
				<s:hidden id="roundreadingId"
					name="B_T_Ufp_RoundReading.roundreadingId"></s:hidden>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
				</table>
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="back" value="返 回" editCondition="*" />
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
			</form>
		</div>
		<div data-options="region:'center',border:false">		
			<table id="list"></table>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var param = {
				mainDocId : jQuery("#mainDocId").val()
		}
		$('#list').datagrid( {
			url : 'Bulletin_readedgridLoad_grid.action',
			queryParams : param,
			frozenColumns: [[{ 
				field: 'deleteFlag', 
				checkbox: false,
				width : '0'
			}]],
			columns : [ [ {
				field : 'roundreadingPerson',
				title : '阅读人员',
				width : 30,
				align : 'center'
			}, {
				field : 'roundreadingTime',
				title : '阅读时间',
				width : 30,
				align : 'center'
			}	
			] ]
		});		
		function callback(data) {
			ajaxMessage(data, 3);
		}
		$("#back").click(function(e) {
			closeBox();
		});
	});	
</SCRIPT>
</html>


