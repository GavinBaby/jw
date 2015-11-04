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
		<s:hidden id="flag" name="flag"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 125px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<s:if test='flag=="0"'>
						<jtag:jlevel moduleId="module14010000"></jtag:jlevel>
					</s:if>
					<s:elseif test='flag=="1"'>
						<jtag:jlevel moduleId="module14020000"></jtag:jlevel>
					</s:elseif>
					<s:elseif test='flag=="2"'>
                        <jtag:jlevel moduleId="module14030000"></jtag:jlevel>
                    </s:elseif>
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
							action="Meetingservice_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<s:hidden id="flag" name="flag" />
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<s:if test='flag=="1"'>
                                        <td width="80px" align="right">
                                                                                                                    ����ʱ�䣺
                                        </td>
                                        <td width="13%">
                                            <s:textfield id="begindate" name="begindate" theme="simple"
                                                maxlength="50" cssStyle="width:95%;" cssClass="wdate"
                                                onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'enddate\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
                                        </td>
                                        <td width="15%" align="left">
                                                                                                                        ��&nbsp;
                                            <s:textfield id="enddate" name="enddate" theme="simple"
                                                maxlength="50" cssStyle="width:82%;" cssClass="wdate"
                                                onclick="WdatePicker({minDate:'#F{$dp.$D(\\'begindate\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
                                        </td>
                                    </s:if>
                                    <s:else>
                                        <td width="80px" align="right">
                                                                                                                        Ԥ�����ڣ�
                                        </td>
                                        <td width="13%">
                                            <s:textfield id="begindate" name="begindate"
                                                theme="simple" maxlength="50" cssStyle="width:95%;"
                                                cssClass="wdate"
                                                onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'enddate\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
                                        </td>
                                        <td width="15%" align="left">
                                                                                                                         ��&nbsp;
                                            <s:textfield id="enddate" name="enddate"
                                                theme="simple" maxlength="50" cssStyle="width:82%;"
                                                cssClass="wdate"
                                                onclick="WdatePicker({minDate:'#F{$dp.$D(\\'begindate\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
                                        </td>
                                    </s:else>
									<td width="80px" align="right">
										�����ˣ�
									</td>
									<td width="10%">
										<s:textfield id="applicantperson" name="applicantperson" theme="simple"
											maxlength="50" cssStyle="width:98%;" />
									</td>
									<td width="80px" align="right">
                                                                                                            ���벿�ţ�
                                    </td>
                                    <td width="10%">
                                        <s:textfield id="deptname" name="deptname" theme="simple"
                                            maxlength="50" cssStyle="width:98%;" />
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
		var flag = $('#flag').val();
		$("#new").click(function(e) {
			openNew("publicinformation/Meetingservice_detailsLoad.action","����������");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("publicinformation/Meetingservice_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Meetingservice_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns : [ [ {
                field : 'starttime',
                title : '����ʱ��',
                width : 25,
                align : 'center',
                formatter:function(value,data){   
                return data.starttime+'��'+data.endtime; 
                }
            },{
				field : 'applicantperson',
				title : '������',
				width : 12,
				align : 'center',
				 formatter:function(value,data){   
                return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/Meetingservice_detailsLoad.action?mainDocId='+data.uuid+'&flag='+flag+'\',\'����������\')">'+data.applicantperson+'</a></span>'; 
               }
			}, {
				field : 'deptname',
				title : '����',
				width : 15,
				align : 'center'
			}, {
				field : 'contact',
				title : '�ֻ�����',
				width : 15,
				align : 'left'
			}, {
				field : 'applicanttime',
				title : 'Ԥ������',
				width : 15,
				align : 'center'
			}, {
                field : 'meetingroomName',
                title : '������',
                width : 15,
                align : 'center'
            }, {
                field : 'updateTime',
                title : '����ʱ��',
                width : 15,
                align : 'center'
            }, {
                field : 'sltime',
                title : 'ȡ��ʱ��',
                width : 15,
                align : 'center',
                formatter:function(value,data){   
                return data.updateTime; 
                }
            },{
				field:'curTacheName',
				title:'��ǰ����',
				width:15,
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
				align:'center'}
			] ],
		   	onLoadSuccess:function(data){
			headAlign(this);
			if(flag=='0'){			
				$('#list').datagrid('hideColumn',"meetingroomName");//��������ɹ�ʱ���������ض�Ӧ��
				$('#list').datagrid('hideColumn',"sltime");//��������ɹ�ʱ���������ض�Ӧ��
				$('#list').datagrid('hideColumn',"updateTime");//��������ɹ�ʱ���������ض�Ӧ��
			}else if(flag=='1'){
                $('#list').datagrid('hideColumn',"sltime");//��������ɹ�ʱ���������ض�Ӧ��
		    }else if(flag=='2'){
		    	$('#list').datagrid('hideColumn',"meetingroomName");//��������ɹ�ʱ���������ض�Ӧ��
		    	$('#list').datagrid('hideColumn',"updateTime");//��������ɹ�ʱ���������ض�Ӧ��
		    }
		}
		});	
	});
</SCRIPT>
</html>
