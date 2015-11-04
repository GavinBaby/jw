
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
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
			style="height: 160px; overflow: hidden;" align="center">

			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module03040300"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 0px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData" theme="simple"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="biaodan">
								<tr>
									
									<td width="15%" class="ziduan" >
										日&nbsp;期&nbsp;段：
									</td>
									<td width="35%"  >
										<jtag:jtl id="fileDateS" name="fileDateS" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
											cssClass="Wdate" editCondition="*" maxlength="100"  cssStyle="width:90%" />
									</td>
									<td width="15%" align ='center' class="ziduan">
										至：
									</td>
									<td width="35%" >
										<jtag:jtl id="fileDateE" name="fileDateE" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
											cssClass="Wdate" editCondition="*" maxlength="100"  cssStyle="width:90%" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="ziduan" >
										公文编号：
									</td>
									<td width="35%"  >
										<jtag:jtl id="fileTypeName" name="fileTypeName" editCondition="*" 
										maxlength="100"  cssStyle="width:65%" />
										<jtag:jtl id="fileTypeNo" name="fileTypeNo" editCondition="*" 
										maxlength="100"  cssStyle="width:20%" />号
									</td>
									<td width="15%" align ='center' class="ziduan">
										文&nbsp;&nbsp;&nbsp;&nbsp;库：
									</td>
									<TD width="35%" align="left">
										<jtag:jsl id="lag" list="#{'fw':'发文','sw':'收文'}"
										name="flag" listKey="key" listValue="value"editCondition="*" cssStyle="width:90%;"></jtag:jsl>
									</TD>
								</tr>
								<tr>
									<td  class="ziduan">
										标&nbsp;&nbsp;&nbsp;&nbsp;题：
									</td>
									<td  colspan="2">
										<jtag:jtl id="title"  name="title"
											editCondition="*" maxlength="100"  cssStyle="width:96%" />
									</td>
									<td width="15%" >
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
		</div>
		<div data-options="region:'center',border:false">		
			<table id="list"></table>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var flag = $("#flag").val();  
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
	
		$('#list').datagrid( {
			url : 'FileBase_searchgridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			frozenColumns: null,
			columns:[[  
				{field:'documentbaseFiledate',
					 title:'文件日期',
					 width:20,
					 align:'center',
					 formatter:function(value,data){  
						 return data.documentbaseFiledate.substring(0,10); 
					 	}
				},
				{field:'documentbaseTitle',
					 title:'标题',
					 align:'center',
					 width:50,
					 formatter:function(value,data){   
						return '<span style="color:red"><a href="javascript:showFilebase(\''+data.documentbaseFilepath+'\',\''+data.documentbaseId+'\');">'+data.documentbaseTitle+'</a></span>'; 
					 }
				},
				{field:'documentbaseLwwh',
					 title:'公文编号',
					 align:'center',
					 width:20,
					 formatter:function(value,data){  
						 return data.documentbaseLwwh+data.documentbaseFwwh;			  }
				},
				{field:'documentbaseMark',
					 title:'备注',
					 align:'center',
					 width:20
				},
				{field:'view',
					 title:'文件查看',
					 align:'center',
					 width:10,
					 formatter:function(value,data){  
						 return '<span style="color:red"><a href="javascript:openNew(\'documentmanagement/FileBase_fileView.action?mainDocId='+data.documentbaseId+'\',\'文件查看\')">'+'查看'+'</a></span>'; 
				  }
				}
		   	]],
		   	onLoadSuccess:function(data){
			headAlign(this);
		}
		});
	});
			//查看附件
	function showFilebase(url,mainDocId){
		if(url.toLocaleLowerCase().indexOf(".tif")>-1||url.toLocaleLowerCase().indexOf(".tiff")>-1){
			openNew("documentmanagement/FileBase_filebaseShowTif.action?mainDocId="+mainDocId, "公文查看",955,555);
		}else if(url.toLocaleLowerCase().indexOf(".doc")>-1){
			openNew("documentmanagement/FileBase_filebaseShowDoc.action?mainDocId="+mainDocId,  "公文查看",900,515);
		}else{
			window.open("<%=basePath%>uploadFile/"+url);
		}
	}
</SCRIPT>
</html>


