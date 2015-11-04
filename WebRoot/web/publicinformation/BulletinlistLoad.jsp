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
			style="height: 125px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<s:if test='type=="1"'>
						<jtag:jlevel moduleId="module05010100"></jtag:jlevel>
					</s:if>
					<s:elseif test='type=="2"'>
						<jtag:jlevel moduleId="module05010200"></jtag:jlevel>
					</s:elseif>
					<s:elseif test='type=="3"'>
						<jtag:jlevel moduleId="module05010300"></jtag:jlevel>
					</s:elseif>
					<s:else>
						<jtag:jlevel moduleId="module05010400"></jtag:jlevel>
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
							action="Bulletin_gridLoad_grid" theme="simple" method="post"
							cssClass="jNice">
							<s:hidden id="type" name="type"></s:hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<td width="60px" align="right">
										标题：
									</td>
									<td width="12%" align="left">
										<s:textfield id="titleS" name="titleS" theme="simple"
											maxlength="200" cssStyle="width:98%;" />
									</td>
									<s:if test='type=="1"'>
										<td width="80px" align="right">
											登记时间：
										</td>
										<td width="13%">
											<s:textfield id="regdateSS" name="regdateSS" theme="simple"
												maxlength="50" cssStyle="width:95%;" cssClass="wdate"
												onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'regdateES\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
										<td width="15%" align="left">
											至&nbsp;
											<s:textfield id="regdateES" name="regdateES" theme="simple"
												maxlength="50" cssStyle="width:82%;" cssClass="wdate"
												onclick="WdatePicker({minDate:'#F{$dp.$D(\\'regdateSS\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
									</s:if>
									<s:if test='type=="2"'>
										<td width="80px" align="right">
											发布时间：
										</td>
										<td width="13%">
											<s:textfield id="publishdateSS" name="publishdateSS"
												theme="simple" maxlength="50" cssStyle="width:95%;"
												cssClass="wdate"
												onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'publishdateES\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
										<td width="15%" align="left">
											至&nbsp;
											<s:textfield id="publishdateES" name="publishdateES"
												theme="simple" maxlength="50" cssStyle="width:82%;"
												cssClass="wdate"
												onclick="WdatePicker({minDate:'#F{$dp.$D(\\'publishdateSS\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
									</s:if>
									<s:if test='type=="3"'>
										<td width="80px" align="right">
											撤销时间：
										</td>
										<td width="13%">
											<s:textfield id="canceldateSS" name="canceldateSS"
												theme="simple" maxlength="50" cssStyle="width:95%;"
												cssClass="wdate"
												onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'canceldateES\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
										<td width="15%" align="left">
											至&nbsp;
											<s:textfield id="canceldateES" name="canceldateES"
												theme="simple" maxlength="50" cssStyle="width:82%;"
												cssClass="wdate"
												onclick="WdatePicker({minDate:'#F{$dp.$D(\\'canceldateSS\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
									</s:if>
									<s:if test='type=="4"'>
										<td width="80px" align="right">
											过期时间：
										</td>
										<td width="13%">
											<s:textfield id="endshowdateSS" name="endshowdateSS"
												theme="simple" maxlength="50" cssStyle="width:95%;"
												cssClass="wdate"
												onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'endshowdateES\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
										<td width="15%" align="left">
											至&nbsp;
											<s:textfield id="endshowdateES" name="endshowdateES"
												theme="simple" maxlength="50" cssStyle="width:82%;"
												cssClass="wdate"
												onclick="WdatePicker({minDate:'#F{$dp.$D(\\'endshowdateSS\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
										</td>
									</s:if>
									<td width="2%">
										&nbsp;
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
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
		</div>			
		<div data-options="region:'center',border:false">		
			<table id="list"></table>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var type = $("#type").val();  
		$("#new").click(function(e) {
			openNew("publicinformation/Bulletin_detailsLoad.action","通知公告",682,500);
		});
		$("#delete").click(function(e) {
			deleteDateAjax("publicinformation/Bulletin_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Bulletin_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns : [ [ {
				field : 'regdate',
				title : '登记时间',
				width : 15,
				align : 'center'
			}, {
				field : 'publishdate',
				title : '发布日期',
				width : 15,
				align : 'center'
			},{
				field : 'canceldate',
				title : '撤销日期',
				width : 15,
				align : 'center'
			},{
				field : 'endshowdate',
				title : '过期日期',
				width : 15,
				align : 'center'
			},{
				field : 'userName',
				title : '登记人',
				width : 15,
				align : 'center'
			},{
				field : 'title',
				title : '标题',
				width : 40,
				align : 'left',
				 formatter:function(value,data){   
                return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/Bulletin_detailsLoad.action?mainDocId='+data.uuid+'\',\'通知公告\',682,500)" title="'+value+'">'+data.title+'</a></span>'; 
   		    }	
			}
			] ],
			onLoadSuccess:function(data){
			headAlign(this);
			if(type=='1'){			
				$('#list').datagrid('hideColumn',"publishdate");//数据载入成功时触发，隐藏对应列
				$('#list').datagrid('hideColumn',"canceldate");//数据载入成功时触发，隐藏对应列
				$('#list').datagrid('hideColumn',"endshowdate");//数据载入成功时触发，隐藏对应列	
			} else
			if(type=='2'){
				$('#list').datagrid('hideColumn',"regdate");
				$('#list').datagrid('hideColumn',"canceldate");
			}else
			if(type=='3'){
				$('#list').datagrid('hideColumn',"regdate");
				$('#list').datagrid('hideColumn',"publishdate");
				$('#list').datagrid('hideColumn',"endshowdate");
		     } 
			else{
				$('#list').datagrid('hideColumn',"regdate");
				$('#list').datagrid('hideColumn',"publishdate");
				$('#list').datagrid('hideColumn',"canceldate");
				}
		}
		});	
	});
</SCRIPT>
</html>