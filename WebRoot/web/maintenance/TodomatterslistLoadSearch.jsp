
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
			style="height: 138px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module04030100"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" height="10" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 0px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="Module_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="biaodan">
								<tr>
									
									<td width="10%" class="ziduan" >
										发送日期：
									</td>
									<td width="15%"  >
										<jtag:jtl id="sendTimes" name="sendTimes" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
											cssClass="Wdate" editCondition="*" maxlength="100"  cssStyle="width:90%" />
									</td>
									<td width="10%" align ='center'>
										&nbsp;&nbsp;&nbsp;至
									</td>
									<td width="15%" >
										<jtag:jtl id="sendTimee" name="sendTimee" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
											cssClass="Wdate" editCondition="*" maxlength="100"  cssStyle="width:90%" />
									</td>
									<td width="10%" class="ziduan">
										发&nbsp;送&nbsp;人：
									</td>
									<td  width="15%"  align="left">
										<jtag:jtl id="sendUser" name="sendUser"
											editCondition="*" maxlength="100"  cssStyle="width:90%"  />
									</td>
									
								</tr>
								<tr>
									<td  class="ziduan">
										标&nbsp;&nbsp;&nbsp;&nbsp;题：
									</td>
									<td  colspan="4">
										<jtag:jtl id="title"  name="title"
											editCondition="*" maxlength="100"  cssStyle="width:96%" />
									</td>
									<td >
										<input id="serach" type="button" value="查 询" />
									</td>
								</tr>
							</table>

						</s:form>
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
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Todomatters_gridLoadSearch_grid.action',
			frozenColumns: null,
			columns : [ [{
				field : 'title',
				title : '标题',
				width : 40,
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\''+data.url+'\')">'+data.title+'</a>'; 
				}
			}, {
				field : 'userName',
				title : '发送人',
				width : 20,
				align : 'center'
			}, {
				field : 'priorities',
				title : '缓急',
				width : 10,
				align : 'center'
			}, {
				field : 'moduleName',
				title : '模块名称',
				width : 30,
				align : 'center'
			}
			
			] ]

		});
		 treeBind('modttree','../maintenance/Todomatters_getModTree_treegrid.action');
		 $('#modttree').tree({
				animate:true,
				onClick:function(node){
			 		var moduleName = node.text;
			 		
			 		moduleName = decodeURIComponent(moduleName);
			 		$query = {moduleName:moduleName};
				 	$('#list').datagrid('load', $query);
				}
			});
	});
</SCRIPT>
</html>


