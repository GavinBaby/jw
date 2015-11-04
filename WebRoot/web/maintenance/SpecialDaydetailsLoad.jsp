
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
								当前位置：公文管理 &gt;&gt; 收文管理 &gt;&gt;
								<span class="blue_12">子栏目一</span>
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
									<jtag:jbutton id="save" value="保 存" editCondition="*" />
									<jtag:jbutton id="back" value="返 回" editCondition="*" />
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
									年份：
								</td>
								<td width="30%">
									<jtag:jsl id="isHaveSms" list="#{0:'禁用',1:'启用'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>
								</td>
								<td width="20%" class="ziduan">
									类别：
								</td>
								<td width="30%">
									<jtag:jsl id="isHaveSms" list="#{0:'禁用',1:'启用'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>
								</td>
								
							</tr>
							<tr>
								<td class="ziduan">
									安排：
								</td>
								<td colspan="3">
								从
								<jtag:jsl id="isHaveSms" list="#{0:'禁用',1:'启用'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>月
									<jtag:jtl id="sort" name="c_T_Sys_Module.sort"
										editCondition="*" maxlength="50" />日
										至<jtag:jsl id="isHaveSms" list="#{0:'禁用',1:'启用'}"
                                        name="c_T_Sys_Module.isHaveSms" listKey="key"
                                        listValue="value" editCondition="*" cssStyle="width:90%"/>月
                                    <jtag:jtl id="sort" name="c_T_Sys_Module.sort"
                                        editCondition="*" maxlength="50" />日
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


	
	var zTreeNodes;//树所有节点集合
	var treeIdString="pModuleTree";//树节点id字符串
	var inputIdObj = $("#pModuleName");//输入框Id对象
	var intoUrl = "NavigationTree.action?moduleType="+moduleType;//调用的url
	var menuContentObj= $("#menuContent");//树节点id所在的div的id对象
	var treeIdObj = $("#pModuleTree");//树节点id对象 
	var chooseButtonId = "selectModlue";//选择按钮所在链接的id
	var menuContentId = "menuContent";//树节点id所在的div的id
	var cssChooseMenuContentId = "#menuContent";//树节点id所在的div的id选择器形式的字符串 
	var clickPidInfo = "只能选择子标题...";//点击父节点时跳出的提示信息
	
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


