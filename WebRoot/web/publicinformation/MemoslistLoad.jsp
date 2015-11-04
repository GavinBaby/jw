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
					<jtag:jlevel moduleId="module05030000"></jtag:jlevel>
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
							action="Memos_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<td width="80px" align="right">
										���ݣ�
									</td>
									<td width="20%" align="left">
										<s:textfield id="memosS" name="memosS" theme="simple"
											maxlength="500" cssStyle="width:98%;" />
									</td>
									<td width="80px" align="right">
										����ʱ�䣺
									</td>
									<td width="10%">
										<s:textfield id="arrangeTimeSS" name="arrangeTimeSS"
											theme="simple" maxlength="50" cssStyle="width:95%;"
											cssClass="wdate"
											onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'arrangeTimeES\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
									</td>
									<td width="12%" align="left">
										��&nbsp;
										<s:textfield id="arrangeTimeES" name="arrangeTimeES"
											theme="simple" maxlength="50" cssStyle="width:80%;"
											cssClass="wdate"
											onclick="WdatePicker({minDate:'#F{$dp.$D(\\'arrangeTimeSS\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
									</td>
									<td width="80px" align="right">
										���ѷ�ʽ��
									</td>
									<td width="10%">
										<jtag:jsl id="remindTypeS"
											list="#{'1':'����Ϣ','2':'��������','1,2':'ȫѡ'}" name="remindTypeS"
											listKey="key" listValue="value" editCondition="*"
											headerKey="" headerValue="--��ѡ��--" cssStyle="width:98%;"></jtag:jsl>
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
		$("#new").click(function(e) {
			openNew("publicinformation/Memos_detailsLoad.action","����¼�Ǽǵ�");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("publicinformation/Memos_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Memos_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),	
			columns : [ [ {
				field : 'registeredTime',
				title : '�Ǽ�ʱ��',
				width : 15,
				align : 'center'
			}, {
				field : 'arrangeTime',
				title : '����ʱ��',
				width : 15,
				align : 'center'
			}, {
				field : 'memos',
				title : '����',
				width : 40,
				align : 'left',
				 formatter:function(value,data){   
                return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/Memos_detailsLoad.action?mainDocId='+data.uuid+'\',\'����¼�Ǽǵ�\'\)">'+data.memos+'</a></span>'; 
   		    }
			},{
				field : 'remindType',
				title : '���ѷ�ʽ',
				width : 15,		
				align : 'center',	
					formatter:function(value,data){    
				 if(data.remindType=="1"){
					 return '<span style="color:black">����Ϣ</span>'; 
				 }else if(data.remindType=="2"){
					 return '<span style="color:black">��������</span>'; 
				 }else if(data.remindType=="1,2"){
					 return '<span style="color:black">����Ϣ,��������</span>'; 
				 }
  		     }			
			},{
				field : 'remindTime',
				title : '����ʱ��',
				width : 15,		
				align : 'center'	
			}
			] ],
			onLoadSuccess:function(data){
			headAlign(this);
				}
		});	
	});
	$('#remindTypeS').combobox( {
		width: 85,
		required:false,
		panelHeight : 83
	});

</SCRIPT>
</html>
