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
					<jtag:jlevel moduleId="module08010102"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" id="listData" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td align="center">
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="6"
							style="border: #ccc 1px solid;">
							<tr>
								<td>
									<s:form id="searchData" name="searchData" action="" theme="simple" method="post"
										cssClass="jNice">
										<table width="100%" border="0" cellpadding="0" cellspacing="0"
											class="content">
											<tr>
												<td width="8%" align="right">
													年月日：
												</td>
												<td width="12%" align="left">
													<jtag:jtl id="yearmonthday" name="yearmonthday" cssStyle="width:100%;vertical-align:middle;" editCondition="*" 
					  										onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly="true"  ></jtag:jtl> 	
												</td>
												<td width="2%" style="text-align: center;">
													至
												</td>
												<td width="12%" align="left">
													 <jtag:jtl id="yearmonthdayend" name="yearmonthdayend" cssStyle="width:100%;vertical-align:middle;" editCondition="*" 
					  									    onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly="true"  ></jtag:jtl> 
												</td>	
												<td width="1%">&nbsp;</td>
												<td align="left">
													<input id="search" type="button"  value="查 询" />
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
										<jtag:jbutton id="new" value="新 建" editCondition="%{allPermission}" />	
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
					</td>
				</tr>
			</table>
			</div>
			<div data-options="region:'center',border:false">
				<table id="list"></table>
			</div>

	</body>
	<SCRIPT type="text/javascript">	
	$(function() {
		var flag = $("#flag").val();  
		$("#search").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$("#new").click(function(e) {
			var id = Math.ceil(Math.random()*35);
			openNew("personalaffairs/ActivityByWeek_detailsLoad.action?random="+id,"领导工作安排登记",1000,530,id);
		});	
		$('#list').datagrid( {
			url : 'ActivityByWeek_summerListLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
						{field:'month',
						 title:'每周领导工作汇总时间',
						 width: 90,
						 align:'center',
						 formatter:function(value,data){   
		                    return '<a href="javascript:openNew(\'personalaffairs/ActivityByWeek_listLoad.action?startTime='+data.startofweek+'\',\'一周工作汇总表\',1000,530)">'+"每周领导工作安排汇总从"+data.startofweek+"到"+data.endofweek+'</a>'; 
		       		     }
						}
		       		]]

		});
		
	});
</SCRIPT>
</html>


