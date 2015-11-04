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
					<jtag:jlevel moduleId="module08010202"></jtag:jlevel>
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
									<s:form id="searchData" name="searchData" action="DeptWork_detailsLoad.action" theme="simple" method="post"
										cssClass="jNice">
										<table width="100%" border="0" cellpadding="0" cellspacing="0"
											class="content">
											<tr>
												<td width="8%" align="right">
													年月：
												</td>
												<td width="12%" align="left">
													<jtag:jtl id="yearmonth" name="yearmonth" cssStyle="width:100%;vertical-align:middle;" editCondition="*" 
					  										onclick="WdatePicker({dateFmt:'yyyy-MM'})" readonly="true"  ></jtag:jtl> 	
												</td>
												<td width="2%" style="text-align: center;">
													至
												</td>
												<td width="12%" align="left">
													 <jtag:jtl id="yearmonthend" name="yearmonthend" cssStyle="width:100%;vertical-align:middle;" editCondition="*" 
					  									    onclick="WdatePicker({dateFmt:'yyyy-MM'})" readonly="true"  ></jtag:jtl> 
												</td>
												<td width="6%" align="right">
													部门：
												</td>
												<td width="10%" align="left">
													<jtag:jsl cssStyle="width:20%" id="deptid"
														name="deptid" list="DeptList"
														listKey="deptId" listValue="deptName" headerKey=""
														headerValue="--请选择--" editCondition="*" cssStyle="vertical-align:middle;"></jtag:jsl>
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
										<s:if test="xinjian==1">
											<jtag:jbutton id="new" value="新 建" editCondition="%{allPermission}" />
											<jtag:jbutton id="delete" value="删 除" editCondition="%{allPermission}" />
										</s:if>
										&nbsp;&nbsp;
										<jtag:jbutton value="导 出" editCondition="%{allPermission1}" />
										<s:if test="xinjian==1">                                      
                      					&nbsp;&nbsp;
                     					<jtag:jbutton value="导 入" editCondition="%{allPermission1}"/>
										</s:if>
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
			openNew("personalaffairs/DeptWork_detailsLoad.action","部门工作日志详细");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("personalaffairs/DeptWork_detailsDelete_ajax.action");
		});
		
		$('#list').datagrid( {
			url : 'DeptWork_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
						{field:'month',
						 title:'月度工作记录',
						 width: 90,
						 align:'center',
						 formatter:function(value,data){    
		                    return '<span style="color:red"><a href="javascript:openNew(\'personalaffairs/DeptWork_detailsLoad.action?DeptWorkId='+data.uuid+'\',\'部门工作日志详细\')">'+data.deptName+" "+data.year+"年"+data.month+"月度工作记录"+'</a></span>'; 
		       		     }
						}
		       		]]

		});
		
	});
</SCRIPT>
</html>


