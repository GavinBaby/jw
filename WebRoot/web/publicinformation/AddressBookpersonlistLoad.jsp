
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
		<div data-options="region:'north',border:false"
			style="height: 118px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module05020200"></jtag:jlevel>
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
									<s:form id="searchData" name="searchData" action="AddressBook_persongridLoad_grid.action" theme="simple" method="post"
										cssClass="jNice">
										<s:hidden id="flag" name="flag" />
										<s:hidden id="categoryIdS" name="categoryIdS" />
										<table width="100%" border="0" cellpadding="0" cellspacing="0"
											class="content">
											<tr>
												<td width="8%" align="right">
													��λ��
												</td>
												<td width="10%" align="left">
													<s:textfield id="unitNameS" name="unitNameS" maxlength="100" theme="simple"/>
												</td>
												<td width="8%" align="right">
													������
												</td>
												<td width="10%" align="left">
													<s:textfield id="userNameS" name="userNameS" maxlength="50" theme="simple"/>
												</td>
												<td width="1%">&nbsp;</td>
												<td align="left">
													<input id="search" type="button"  value="�� ѯ" />
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
										<s:if test="flag=='gr'">
											<jtag:jbutton id="new" value="�� ��" editCondition="*" />
											<jtag:jbutton id="delete" value="ɾ ��" editCondition="*" />
										</s:if>
										<s:if test="flag=='dw'">
											<jtag:jbutton id="aaa" value="��ӵ�����ͨѶ¼" editCondition="*" />
										</s:if>
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
		$("#search").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$("#new").click(function(e) {
			var categoryIdS = $('#categoryIdS').val();
			openNew("publicinformation/AddressBook_persondetailsLoad.action?categoryIdS="+categoryIdS,"����ͨѶ¼��ϸ",600,400);
		});
		$("#delete").click(function(e) {
			deleteDateAjax("publicinformation/AddressBook_persondetailsDelete_ajax.action");
		});
		
		$('#list').datagrid( {
			url : 'AddressBook_persongridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
						{field:'userName',
						 title:'����',
						 width: 10,
						 align:'center',
						 formatter:function(value,data){    
		                    return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/AddressBook_persondetailsLoad.action?mainDocId='+data.uuid+'\',\'����ͨѶ¼��ϸ\',600,400)">'+data.userName+'</a></span>'; 
		       		     }
						},{
						 field:'positionName',
						 title:'ְ��',
						 width: 15,
						 align:'center'
					    },{
						 field:'officePhone',
						 title:'�칫�ҵ绰',
						 width:15,
						 align:'center'
			       		},{
				       	 field:'homePhone',
						 title:'סլ�绰',
						 width:15,
						 align:'center'
						},{
							field:'mobilePhone',
							 title:'�ƶ��绰',
							 width: 15,
							 align:'center'
						},{
							field:'virtualPhone',
							 title:'�����',
							 width: 15,
							 align:'center'
						}
		       		]]
		       		
		});
		
	});
	
</SCRIPT>
</html>


