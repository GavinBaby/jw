
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
		<s:hidden id="moduleId" name="moduleId"></s:hidden>
		
		<div data-options="region:'north',border:false"
			style="height: 260px; overflow: hidden;" align="left">
			
			<font color="#0000FF" style="FONT-SIZE: 12pt; FONT-FAMILY: ����;">
			��ѡ����Ҫ�߰����Ա��
			</font>
			
				<table id="list">
			</table>
			
		</div>
		<div data-options="region:'center',border:false">
			<table width="98%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td align="center">
						<jtag:jbutton id="ok" value="ȷ ��" editCondition="*" />
						<jtag:jbutton id="back" value="�� ��" editCondition="*" />
					</td>
				</tr>
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#ok").click(function(e) {
		
			var checkedIds = getDeleteData("list");
			if (checkedIds == '') {
				art.dialog.alert("����ѡ�м�¼��");
				return;
			}
			var ls_Separator3 = "#";
			var nextTacheInfo = "4" + ls_Separator3 + "1"
				+ ls_Separator3 + checkedIds + ls_Separator3 +"false"+ ls_Separator3+"false"+ ls_Separator3+"false"+ ls_Separator3+"false"+ ls_Separator3 ;
			art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
			art.dialog.opener.saveDoc();
			art.dialog.alert("�߰�ɹ���");
			closeBox();
		});
		$("#back").click(function(e) {
			closeBox();
		});
		$('#list').datagrid( {
			url : 'Urge_gridLoad_grid.action?mainDocId=' + $("#mainDocId").val() + "&moduleId=" + $("#moduleId").val(),
			pagination:false,
			columns : [ [ {
				field : 'userName',
				title : 'δ������Ա',
				width : 50
			}
			] ]

		});
	});
</SCRIPT>
</html>


