
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
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module05020100"></jtag:jlevel>
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
									<s:form id="searchData" name="searchData" action="AddressBook_unitgridLoad_grid.action" theme="simple" method="post"
										cssClass="jNice">
										<s:hidden id="flag" name="flag" />
										<table width="100%" border="0" cellpadding="0" cellspacing="0"
											class="content">
											<tr>
												<td width="8%" align="right">
													��λ��
												</td>
												<td width="10%" align="left">
													<s:textfield id="unitNameS" name="unitNameS" maxlength="50" theme="simple"/>
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
						<s:form id="update" cssClass="jNice">
							<s:hidden id="categoryIdS" name="categoryIdS" />
							<table width="98%" border="0" cellspacing="0" cellpadding="0" class="content">
								<tr>
									<td width="5%" align="right">
										 ���ࣺ
									</td>
									<td align="left" width="10%">
										<s:if test="flag=='gr'">
											<jtag:jbutton id="new" value="�� ��" editCondition="*" />
											<jtag:jbutton id="delete" value="ɾ ��" editCondition="*" />
										</s:if>
										<s:if test="flag=='dw'">
										 <jtag:jsl id="toPersonAddressBoook"
											list="listAddressBookgetPersonAddressBook"		
											name="toPersonAddressBoook" listKey="uuid" listValue="maintainName" editCondition="*"
											headerKey="" headerValue="--��ѡ��--" cssStyle="width:98%" ></jtag:jsl>	
										</s:if>
									</td>
									<td width="1%">&nbsp;</td>
									<td align="left">
										<s:if test="flag=='dw'">
											<jtag:jbutton id="add" value="��ӵ�����ͨѶ¼" editCondition="*" />
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
		<div data-options="region:'west',border:false,split:false,title:'��λ����'"
			style="width: 200px; overflow:hidden;"
			align="left">
						
				<ul id="modttree" class="tree"></ul>
		</div>
		<div data-options="region:'center',border:false">
				<table id="list"></table>
		</div>
	</body>
	<SCRIPT type="text/javascript">	
	function getUnitAddressData(id){
		var temp='';
		var rows = $('#'+id).datagrid('getChecked');
		for(var i=0;i<rows.length;i++){
			if (temp != "") {
						temp = temp + "," + rows[i].userSysName;
			} else {
					temp = rows[i].userSysName;
			}
		}
		return temp;
	}
	
	$(function() {
		$("#search").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$("#add").click(function(e) {
			var toPersonAddressBoook = $("#toPersonAddressBoook").combobox('getValue');
			var checkedIds = getUnitAddressData("list");
			var categoryIdS = $('#toPersonAddressBoook').combobox("getValue");
			
			if(toPersonAddressBoook!=''){
				if (checkedIds == '') {
					art.dialog.alert("����ѡ�м�¼��");
					return;
				}
				art.dialog.confirm('��ȷ����ӵ�����ͨѶ¼ ?', 
					function(){
						var params = {
								checkedIds : checkedIds
						};
						
						jQuery.ajax( {
							url : "publicinformation/AddressBook_persondetailsUpdate_ajax.action?flag=toPerson"+"&categoryIdS="+categoryIdS,
							type : "POST",
							data : params,
							dataType : "json",
							success : function(data){
								art.dialog.tips("��ӳɹ���",2).lock();
							}
						});
					}, 
					function(){
						art.dialog.tips("��ȡ����",1);
					}
				);
			}else{
				art.dialog.alert("��ѡ��Ҫ��ӵķ��࣡");
			}
		});
		
		$('#list').datagrid( {
			url : 'AddressBook_unitgridLoad_grid.action',
			columns:[[  
						{field:'userName',
						 title:'����',
						 width: 10,
						 align:'center',
						 formatter:function(value,data){    
		                    return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/AddressBook_unitdetailsLoad.action?userSysName='+data.userSysName+'\',\'��λͨѶ¼��ϸ\',600,315)">'+data.userName+'</a></span>'; 
		       		     }
						},{
						 field:'positionName',
						 title:'ְ��',
						 width: 15,
						 align:'center'
					    },{
						 field:'officephone',
						 title:'�칫�ҵ绰',
						 width:15,
						 align:'center'
			       		},{
							field:'mobilephone',
							 title:'�ƶ��绰',
							 width: 15,
							 align:'center'
						},{
							field:'virtualphone',
							 title:'�����',
							 width: 15,
							 align:'center'
						}
						/*,{
				       	 field:'qrCode',
						 title:'��ά��',
						 width:15,
						 align:'center',
						 formatter:function(value,data){    
		                    return '<span style="color:red"><a href="javascript:openNew(\'common/QrCode_detailsLoad.action?mainDocId='+data.userSysName+'\',\'��ά��\',160,160)">����</a></span>'; 
		       		     }
						
						}
						*/
		       		]]
		       		
		});
		 $('#modttree').tree({
				animate:true,
				url : 'publicinformationjax/AddressBook_getUnitTree_treegrid.action',
				loadFilter: function(rows){
		 			return treeConvert(rows);  
				},
				onClick:function(node){
			 		var mainDocId = node.id;
			 		$query = {mainDocId:mainDocId};
				 	$('#list').datagrid('load', $query);
			    }

			});

		 $('#toPersonAddressBoook').combobox({
			 	width: 120,
				panelHeight : 130
		 });

	});
	
</SCRIPT>
</html>


