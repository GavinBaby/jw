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
					<s:if test="flag == 'db'" >
					<jtag:jlevel moduleId="module03010100"></jtag:jlevel>
					</s:if>
					<s:if test="flag == 'dy'" >
					<jtag:jlevel moduleId="module03010200"></jtag:jlevel>
					</s:if>
					<s:if test="flag == 'zb'" >
					<jtag:jlevel moduleId="module03010300"></jtag:jlevel>
					</s:if>
					<s:if test="flag == 'ywc'" >
					<jtag:jlevel moduleId="module03010400"></jtag:jlevel>
					</s:if>
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
									<s:form id="searchData" name="searchData" action="FileOut_listLoad.action" theme="simple" method="post"
										cssClass="jNice">
										<s:hidden id="flag" name="flag" />
										<s:hidden id="moduleYear" name="moduleYear" />
										<table width="100%" border="0" cellpadding="0" cellspacing="0"
											class="content">
											<tr>
												<td width="8%" align="right">
													标题：
												</td>
												<td width="10%" align="left">
													<s:textfield id="titleS" name="titleS" theme="simple"/>
												</td>
												<td width="8%" align="right">
													年份：
												</td>
												<td width="10%" align="left">
												<s:if test="moduleYear != null">
													${moduleYear}
												</s:if>
												<s:else>
													<jtag:jtl id="yearS" name="yearS" editCondition="*" readonly="true" 
														onclick="WdatePicker({dateFmt:'yyyy'});" cssStyle="width:98%"></jtag:jtl>
												</s:else>
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
			openNew("documentmanagement/FileOut_detailsLoad.action","公文发文单",882,2515);
		});
		$("#delete").click(function(e) {
			deleteDateAjax("documentmanagement/FileOut_detailsDelete_ajax.action");
		});
	
		
		$('#list').datagrid( {
			url : 'FileOut_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
						{field:'fileoutDraftDate',
						 title:'拟稿日期',
						 width: 10,
						 align:'center'
						},{
						 field:'recordtypeName',
						 title:'发文文号',
						 width: 15,
						 align:'center',
						 formatter:function(value,data){       
		                    return data.recordtypeName+"〔"+data.fileoutYear+"〕"+data.fileoutSerial+"号"; 
		       		     }
					    },{
						 field:'fileoutTitle',
						 title:'标题',
						 width:35,
						 formatter:function(value,data){    
		                    return '<span style="color:red"><a href="javascript:openNew(\'documentmanagement/FileOut_detailsLoad.action?mainDocId='+data.uuid+'\',\'公文发文单\',882,2515)" title="'+value+'">'+data.fileoutTitle+'</a></span>'; 
		       		     }
			       		},{
				       	 field:'fileoutUrgency',
						 title:'缓急',
						 width:10,
						 align:'center'
						},{
							field:'tacheTransactorBackupShow',
							 title:'当前处理人',
							 width: 10,
							 align:'center',
						     formatter:function(value,data){
							     return '<a title="'+value+'">'+value+'</a>';
							 }
						},{
							field:'curTacheName',
							 title:'当前环节',
							 width: 10,
							 align:'center',
							 formatter:function(value,data){    
								 if(data.curTacheName=="完成"){
									 return '<span style="color:red">完成</span>'; 
								 }else{
									 return data.curTacheName;
								 }
		       		      }
						},{
							field:'fileoutIspublish',
							title:'收 藏',
							width: 10,
							align:'center',
							formatter:function(value,data){    
							 	return '<span style="color:red"><a href="javascript:saveUrl(\'documentmanagement/FileOut_favorites_ajax.action?'+"mainDocId="+data.uuid+'\');" ><img src="../../images/gird/girdadd.gif"/></a></span>';
		       		    	}
						}
		       		]]
		});
	});

	function saveUrl(url){
		art.dialog.open('documentmanagement/FavoriteFile_typeLoad.action', {
		    title: '收藏类别选择',
		    cancel: true,
		    lock:true,
		    height:100,
		    id:'FavoriteFileType',
		    button: 
		    [
				{
				    name: '收藏',
				    callback: function () {
						var iframe = this.iframe.contentWindow;
						var type = iframe.document.getElementById('favoriteFileType').value;
						$.ajax( {
							url : url+"&favoriteFileType="+type,
							type : "POST",
							dataType : "json",
							success:function(data){
					    	    var errMsg = data.errMsg;
					    	    art.dialog.alert(errMsg).unlock();
							}
						});
						this.close();
				       	return false;
				    }
				},
	             {
	                 name: '取消',
	                 callback: function () {
	                     return false;
	                 }
	             }
	         ]
		});
	}
</SCRIPT>
</html>


