
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
					<s:if test="flag == 'db'">
						<jtag:jlevel moduleId="module03020100"></jtag:jlevel>
					</s:if>
					<s:if test="flag == 'dy'">
						<jtag:jlevel moduleId="module03020200"></jtag:jlevel>
					</s:if>
					<s:if test="flag == 'zb'">
						<jtag:jlevel moduleId="module03020300"></jtag:jlevel>
					</s:if>
					<s:if test="flag == 'ywc'">
						<jtag:jlevel moduleId="module03020400"></jtag:jlevel>
					</s:if>
				</tr>
			</table>
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
						<s:form id="searchData" name="searchData" theme="simple"
							cssClass="jNice">

							<s:hidden id="flag" name="flag"></s:hidden>
							<s:hidden id="moduleYear" name="moduleYear" />
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="8%" align="right">
										���⣺
									</td>
									<td width="10%" align="left">
										<s:textfield id="fileinTitleS" name="fileinTitleS"
											theme="simple" maxlength="500" />
									</td>
									<td width="8%" align="right">
										��ݣ�
									</td>
									<td width="10%" align="left">
										<s:if test="moduleYear != null">
										${moduleYear}
									</s:if>
										<s:else>
											<jtag:jtl id="fileinYearS" cssClass="Wdate"
												name="fileinYearS"
												onclick="WdatePicker({readOnly:true,dateFmt:'yyyy'})"
												editCondition="*" maxlength="50" cssStyle="width:98%"></jtag:jtl>
										</s:else>
									</td>
									<td width="1%">
										&nbsp;
									</td>

									<td align="left">
										&nbsp;
										<input id="serach" type="button" value="�� ѯ" />
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
							<jtag:jbutton id="new" value="�� ��" editCondition="*" />
							<jtag:jbutton id="delete" value="ɾ ��" editCondition="*" />
							<jtag:jbutton id="gwdr" value="���ĵ���" editCondition="*" />
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
		//alert($("#flag").val());
		var flag = $("#flag").val();  
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$("#new").click(function(e) {
			openNew("documentmanagement/FileIn_detailsLoad.action", "�������ĵ�");
		});
		$("#gwdr").click(function(e) {
			art.dialog.alert("���ܿ�����...");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("documentmanagement/FileIn_detailsDelete_ajax.action");
		});
		$('#list').datagrid( {
			url : 'FileIn_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
						{field:'registeredTime',
						 title:'�Ǽ�����',
						 width:10,
						 align:'center'
					},{
						field:'fileinTypeid',
						title:'���ı��',
						width:15,
						align:'center',
						formatter:function(value,data){       
			                 return data.fileinTypename+"��"+data.fileinYear+"��"+"��"+data.fileinSerial+"��"; 
			       		}
					 },{
						 field:'fileinTitle',
						 title:'����',
						 align:'left',
						 width:35,
						 formatter:function(value,data){   
							  
		                    return '<span style="color:red"><a href="javascript:openNew(\'documentmanagement/FileIn_detailsLoad.action?mainDocId='+data.uuid+'\',\'�������ĵ�\')" title="'+value+'">'+data.fileinTitle+'</a></span>'; 
		       		    }
		       		 },{
			       		 field:'urgency',
						 title:'����',
						 width:10,
						 align:'center',
						 formatter:function(value,data){    
							 if(data.urgency=="1"){
								 return '<span style="color:black">һ��</span>'; 
							 }else if(data.urgency=="2"){
								 return '<span style="color:black">����</span>'; 
							 }else if(data.urgency=="3"){
								 return '<span style="color:black">�ؼ�</span>'; 
							 }
		       		     }
				      },{
					     field:'curTacheName',
						 title:'��ǰ����',
						 width:10,
						 align:'center',
						 formatter:function(value,data){    
							 if(data.curTacheName=="���"){
								 return '<span style="color:red">���</span>'; 
							 }else{
								 return data.curTacheName;
							 }
	       		         }				
					  },{
						 field:'tacheTransactorBackupShow',
						 title:'��ǰ������',
						 width:15,
						 align:'center',
						 formatter:function(value,data){
                             return '<a title="'+value+'">'+value+'</a>';
                         }
					  },{
						 field:'�ղ�',
						 title:'�ղ�',
						 width:5,
						 align:'center',
							 formatter:function(value,data){     
			                    return '<span style="color:red"><a href="javascript:saveUrl(\'documentmanagement/FileIn_favorites_ajax.action?mainDocId='+data.uuid+'\');"><img src="../../images/gird/girdadd.gif"/></a></span>'; 
			       		    }
					}			 				  
		   	]],
		   	onLoadSuccess:function(data){
			headAlign(this);
			if(flag=='ywc'){			
				$('#list').datagrid('hideColumn',"tacheTransactorBackupShow");//��������ɹ�ʱ���������ض�Ӧ��
				$('#list').datagrid('hideColumn',"curTacheName");//��������ɹ�ʱ���������ض�Ӧ��
			}
		}
		});
	});
	function saveUrl(url){
		art.dialog.open('documentmanagement/FavoriteFile_typeLoad.action', {
		    title: '�ղ����ѡ��',
		    cancel: true,
		    lock:true,
		    height:100,
		    id:'FavoriteFileType',
		    button: 
		    [
				{
				    name: '�ղ�',
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
	                 name: 'ȡ��',
	                 callback: function () {
	                     return false;
	                 }
	             }
	         ]
		});
	}
</SCRIPT>
</html>