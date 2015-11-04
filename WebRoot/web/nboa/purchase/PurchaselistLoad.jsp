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
	<s:if test="flagtype==1">
		<div data-options="region:'north',border:false"
			style="height: 85px; overflow: hidden;" align="center">
			</s:if>
			<s:else>
			<div data-options="region:'north',border:false"
            style="height: 125px; overflow: hidden;" align="center">
			</s:else>
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
				    <s:if test="flagtype==1">
				    <jtag:jlevel moduleId="module15000000"></jtag:jlevel>
				    </s:if>
				    <s:else>
					<jtag:jlevel moduleId="module15020000"></jtag:jlevel>
					</s:else>
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
							action="Materia_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<s:hidden id="flagtype" name="flagtype" />
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<!--<td width="80px" align="right">
										资料标题：
									</td>
									<td width="16%" align="left">
										<s:textfield id="materiaTitle" name="materiaTitle" theme="simple"
											maxlength="150" cssStyle="width:98%;" />
									</td>
									--><td width="80px" align="right">
										申请时间：
									</td>
									<td width="10%">
										<s:textfield id="startTime" name="startTime" theme="simple"
											maxlength="50" cssStyle="width:95%;" cssClass="wdate"
											onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'startTime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
									</td>
									<td width="12%" align="left">
										至&nbsp;
										<s:textfield id="endTime" name="endTime" theme="simple"
											maxlength="50" cssStyle="width:82%;" cssClass="wdate"
											onclick="WdatePicker({minDate:'#F{$dp.$D(\\'startTime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
									</td>
									<td align="left">
										&nbsp;
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
			<s:if test="flagtype!=1">
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
			</s:if>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
		</div><!--
		<div data-options="region:'west',split:false,title:'模块类别',border:true"
            style="width: 200px; overflow :   hidden;"
            align="left">
                <ul id="modttree" class="tree"></ul>
        </div>
		--><div data-options="region:'center',border:false">
			<table id="list">
			
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var flagtype = $("#flagtype").val();
		$("#new").click(function(e) {
			openNew("purchase/Purchase_detailsLoad.action","采购详情 ");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("Purchase_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		if(flagtype==1){
            $('#list').datagrid( {
                frozenColumns:null
            });
        }
		$('#list').datagrid( {
			url : 'Purchase_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns : [ [ {
					field : 'uuid',
					title : '申请单',
					align : 'left',
					width : 50,
					formatter:function(value,data){   
                    /*return '<span style="color:red"><a href="javascript:openNew(\'Purchase_detailsLoad.action?mainDocId='+data.uuid+'&flagtype='+flagtype+'\',\'采购详情\')"> </a></span>'; 
                   	*/return '<a href="javascript:openNew(\'purchase/Purchase_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.uuid+'</a>';
                    }
                    
				}, {
                    field : 'applyName',
                    title : '申请人',
                    width : 20,
                    align : 'center'
                }, {
					field : 'applyTime',
					title : '申请时间',
					width : 30,
					align : 'center'
				}
			]]
		});	
	 
	});
</SCRIPT>
</html>

