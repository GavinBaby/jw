
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<jtag:jhead />
		<script type="text/javascript" src="../../js/ztree/selectMenu.js"></script>
	</head>
	<body>

		<table width="900px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<td width="40" align="center">
								<img src="../../images/dqwz_tb.gif" width="15" height="15" />
							</td>
							<td align="left" class="gray_12">
								��ǰλ�ã����Ĺ��� &gt;&gt; ���Ĺ��� &gt;&gt;
								<span class="blue_12">����Ŀһ</span>
							</td>
						</tr>
					</table>
					<form class="jNice">
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="�� ��" editCondition="*" />
									<jtag:jbutton id="back" value="�� ��" editCondition="*" />
								</td>
								<td>

								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<tr>
								<td width="20%" class="ziduan">
									��ݣ�
								</td>
								<td width="30%">
									<jtag:jsl id="isHaveSms" list="#{0:'����',1:'����'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>
								</td>
								<td width="20%" class="ziduan">
									���
								</td>
								<td width="30%">
									<jtag:jsl id="isHaveSms" list="#{0:'����',1:'����'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>
								</td>
								
							</tr>
							<tr>
								<td class="ziduan">
									���ţ�
								</td>
								<td colspan="3">
								��
								<jtag:jsl id="isHaveSms" list="#{0:'����',1:'����'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>��
									<jtag:jtl id="sort" name="c_T_Sys_Module.sort"
										editCondition="*" maxlength="50" />��
										��<jtag:jsl id="isHaveSms" list="#{0:'����',1:'����'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>��
                                    <jtag:jtl id="sort" name="c_T_Sys_Module.sort"
                                        editCondition="*" maxlength="50" />��
								</td>
								
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="17">
							<tr>
								<td></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">


	
	var zTreeNodes;//�����нڵ㼯��
	var treeIdString="pModuleTree";//���ڵ�id�ַ���
	var inputIdObj = $("#pModuleName");//�����Id����
	var intoUrl = "NavigationTree.action?moduleType="+moduleType;//���õ�url
	var menuContentObj= $("#menuContent");//���ڵ�id���ڵ�div��id����
	var treeIdObj = $("#pModuleTree");//���ڵ�id���� 
	var chooseButtonId = "selectModlue";//ѡ��ť�������ӵ�id
	var menuContentId = "menuContent";//���ڵ�id���ڵ�div��id
	var cssChooseMenuContentId = "#menuContent";//���ڵ�id���ڵ�div��idѡ������ʽ���ַ��� 
	var clickPidInfo = "ֻ��ѡ���ӱ���...";//������ڵ�ʱ��������ʾ��Ϣ
	
	selectMenu(zTreeNodes,treeIdString,inputIdObj,intoUrl,menuContentObj,treeIdObj,chooseButtonId,menuContentId,cssChooseMenuContentId,clickPidInfo);
		
	$(document).ready(function() {
		$("#back").bind("click", back);
		$("#save").bind("click", save);
		$("#selectModlue").bind("click", showMenu);
	});

	function back() {
		parent.$("#wBox").close();
	}

	function save() {

	}
</SCRIPT>
</html>


