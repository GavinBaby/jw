
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
					<jtag:jlevel moduleId="module01030200"></jtag:jlevel>
				</tr>
			</table>

			<table width="100%" height="10" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="Module_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="7%" align="right">
										ģ�����ƣ�
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="moduleNameS" name="moduleNameS"
											editCondition="*" maxlength="100" />
									</td>
									<td width="7%" align="right">
										ģ�����ͣ�
									</td>
									<td width="20%" align="left">
										<jtag:jsl id="moduleTypeS"
											list="#{0:'==��ѡ��==',1:'����ģ��',2:'������ģ��',3:'����'}"
											name="moduleTypeS" listKey="key" listValue="value"
											editCondition="*" cssStyle="width:90%" />
									</td>

									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="�� ѯ" />
									</td>
								</tr>
							</table>

						</s:form>
					</td>
				</tr>
			</table>
			<s:form cssClass="jNice">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="�� ��" editCondition="*" />
							<jtag:jbutton id="delete" value="ɾ ��" editCondition="*" />
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
			</s:form>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(function(e) {
			openNew("maintenance/Module_detailsLoad.action","�½�");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/Module_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$.post('Module_gridLoad_treegrid.action', getQueryParams("searchData"),function(data){
				$('#list').treegrid('loadData',data);
			},'json');
		});
		$('#list').treegrid( {
			url : 'Module_gridLoad_treegrid.action',
			queryParams:getQueryParams("searchData"),
			rownumbers: true,
			animate:true,
			singleSelect : false,
			draggable:true,
			  idField:'id', 
              parentField:'pId',
              treeField:'id',  
              frozenColumns:null,
			columns : [ [ {
				field : 'id',
				title : 'ģ����',
				width : 30,
				align : 'center'
			}, {
				field : 'moduleName',
				title : 'ģ������',
				width : 20,
				formatter : function(value, data) {
				 return '<a href="javascript:openNew(\'maintenance/Module_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.moduleName+'</a>';
				}
			}, {
				field : 'moduleType',
				title : 'ģ�����',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					if (value == "1") {
						return "����ģ��";
					} else if (value == "2") {
						return "������ģ��";
					} else if (value == "3") {
						return "����";
					}
				}
			}, {
				field : 'isLogicDelete',
				title : '�߼�ɾ��',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return (value == '1') ? '����' : '������';
				}
			}, {
				field : 'isHaveSms',
				title : '����ģ��',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return (value == '1') ? '����' : '������';
				}
			}, {
				field : 'isHaveMsg',
				title : '��ʱ��Ϣ',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return (value == '1') ? '����' : '������';
				}
			}, {
				field : 'action',
                title : 'ɾ��',
                width : 10,
                align : 'center',
                formatter : function(value, data) {
               		return '<a href="javascript:deleteDateSingle(\'maintenance/Module_detailsDelete_ajax.action\',\''+data.id+'\')"><img src="../../images/delete.png"/></a>';
                }
            }
			] ],

			loadFilter: function(data){
	        	var opt = $(this).data().treegrid.options;  
	      		var idFiled,textFiled,parentField;  
	      		if (opt.parentField) {  
	      			idFiled = opt.idFiled || 'id';  
	      			textFiled = opt.textField || 'text';  
	      			parentField = opt.parentField;  
	      			var i,  l,  treeData = [],  tmpMap = [];  
	      			for (i = 0, l = data.length; i < l; i++) {  
	      				tmpMap[data[i][idFiled]] = data[i];  
	      			}  
	      			for (i = 0, l = data.length; i < l; i++) {  
	      				if (tmpMap[data[i][parentField]] && data[i][idFiled] != data[i][parentField]) {  
	      					if (!tmpMap[data[i][parentField]]['children'])  
	      						tmpMap[data[i][parentField]]['children'] = [];  
	      						data[i]['text'] = data[i][textFiled];  
	      						tmpMap[data[i][parentField]]['children'].push(data[i]);  
	      				 } else {  
	      						data[i]['text'] = data[i][textFiled];  
	      						treeData.push(data[i]);  
	      				 }  
	      			}  
	      			return treeData;  
	      		}  
	      		return data;
	     }  
		});
	});
</SCRIPT>
</html>


