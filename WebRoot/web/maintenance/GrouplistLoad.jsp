
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
					<jtag:jlevel moduleId="module01010400"></jtag:jlevel>
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
							action="Group_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										Ⱥ�����ƣ�
									</td>
									<td width="20%" align="left">
										<s:textfield id="GroupNameS" name="GroupNameS" theme="simple"
											maxlength="50" />
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
			<table id="list">
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(function(e) {
			openNew("maintenance/Group_detailsLoad.action", "�½�");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/Group_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Group_gridLoad_grid.action',
			queryParams:getQueryParams("searchData"),
			columns : [ [ {
				field : 'sort',
				title : '�����',
				width : 10,
				align : 'center'
			}, {
				field : 'groupId',
				title : 'Ⱥ����',
				width : 10,
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Group_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.groupId+'</a>'; 
				}
			}, {
				field : 'groupName',
				title : 'Ⱥ������',
				width : 15,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Group_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.groupName+'</a>';
				}
			}, {
				field : 'groupType',
				title : 'Ⱥ�����',
				width : 10,
				align : 'center',
				formatter:function(value,data){
				return (value=='1')?'����Ȩ�޿���':'��ťȨ�޿���';}
			}, {
				field : 'userLook',
				title : '��Ա',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'common/UserSelect_listLoad.action?isSglSel=1&userSelRa=1&submitAction=../maintenance/Group_selUserUpdate_ajax.action?groupId=' +data.uuid + '&selUserAction=../maintenance/Group_selUserList_treegrid.action?groupId=' +data.uuid + '\',\'��Աѡ��\')">'+"��Ա"+'</a>';
				}
			}, {
				field : 'roleLook',
				title : '��ɫ',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'common/RoleSelect_listLoad.action?isSglSel=1&roleSelRa=1&submitAction=../maintenance/Group_selRoleUpdate_ajax.action&groupId=' +data.uuid + '\',\'��ɫѡ��\')">'+"��ɫ"+'</a>';
				}
			},  {
				field : 'moduleLook',
				title : 'ģ��',
				width : 10,
				align : 'center',
				formatter : function(value, data) {
				return '<a href="javascript:openNew(\'common/ModuleSelect_listLoad.action?moduleSelRa=1&submitAction=../maintenance/Group_selModuleUpdate_ajax.action?groupId=' +data.uuid + '&selModuleAction=../maintenance/Group_selModuleList_treegrid.action?groupId=' +data.uuid + '\',\'ģ��ѡ��\')">'+"ģ��"+'</a>';
				}
			}, {
				field : 'remark',
				title : '��ע',
				width : 25,	
				align : 'center',
				formatter : function(value, data) {
	                return '<a title="'+value+'">'+value+'</a>';
	                }
			} ] ]

		});
	});
</SCRIPT>
</html>


