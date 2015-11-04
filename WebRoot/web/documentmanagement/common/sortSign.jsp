<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<script type="text/javascript" src="../../js/jquery1.6.2.js"></script>
		<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
        <script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
	</head>
	<body>
		<table width="620px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="98%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="center">
								<jtag:jbutton value="提到最前" onclick="firstData();" editCondition="*"/>
								&nbsp;&nbsp;
								<jtag:jbutton value="上移一位" onclick="upData();" editCondition="*"/>
								&nbsp;&nbsp;
								<jtag:jbutton value="下移一位" onclick="downData();" editCondition="*"/>
								&nbsp;&nbsp;
								<jtag:jbutton value="提到最后" onclick="lastData();" editCondition="*"/>
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
							<td>
								<select id="id" name="C_T_Sys_BaseSort.id"
									style="width: 600px; height: 430px" size="40">
									<s:iterator value="listC_T_Sys_BaseSort">
										<option value="<s:property value ='id'/>"
											<s:if test="c_T_Sys_BaseSort.id == id">
                                                                selected
                                                                </s:if>>
											<s:property value="name" />
										</option>
									</s:iterator>
								</select>
							</td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update"
                        action="SortUpdate.action" method="POST"
                        cssClass="jNice">
                        <!-- 隐藏控制域 开始  -->
				        <s:hidden id="checkedIds" name="checkedIds" />
				        <s:hidden id="tableName" name="tableName" />
				        <s:hidden id="sort" name="sort" />
				        <!-- 隐藏控制域 结束 -->
					<table width="98%" border="0" cellspacing="0" cellpadding="0" >
						<tr>
							<td align="center"> 
								<jtag:jbutton id="save" value="保 存" editCondition="*" />
								<jtag:jbutton id="back" value="关 闭" editCondition="*"/>
							</td>
						</tr>
					</table>
					</s:form>
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">
	function upData() {
		//----进行文档上移
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true)
				selectCount++;
		}
		//确认只选择且选择了一个文档
		if (selectCount != 1) {
			alert("请选择一个文档进行上移或下移")
			return;
		}
		//下移时不能选择第一文档
		if (fm.options[0].selected == true) {
			alert("第一个文档不能再上移！")
			return;
		}
		iNum = fm.selectedIndex;
		//将当前文档和下一文档进行交换
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		fm.options[iNum].text = fm.options[iNum - 1].text;
		fm.options[iNum].value = fm.options[iNum - 1].value;
		fm.options[iNum - 1].text = text;
		fm.options[iNum - 1].value = value;
		//将文档ID保存到域
		getAllUnid(iNum - 1);
	}
	function downData() {
		//----进行文档下移
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true)
				selectCount++;
		}
		//确认只选择且选择了一个文档
		if (selectCount != 1) {
			alert("请选择一个文档进行上移或下移")
			return;
		}
		//下移时不能选择最后文档
		if (fm.options[count - 1].selected == true) {
			alert("已经是最后一个文档，不能再下移！")
			return;
		}
		iNum = fm.selectedIndex;
		//将当前文档和下一文档进行交换
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		fm.options[iNum].text = fm.options[iNum + 1].text;
		fm.options[iNum].value = fm.options[iNum + 1].value;
		fm.options[iNum + 1].text = text;
		fm.options[iNum + 1].value = value;
		//将文档ID保存到域
		getAllUnid(iNum + 1);
	}

	function firstData() {
		//----置为第一个
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true) {
				selectCount++;
			}
		}
		//确认只选择且选择了一个文档
		if (selectCount != 1) {
			alert("请选择一个文档进行上移或下移");
			return;
		}
		//下移时不能选择第一文档
		if (fm.options[0].selected == true) {
			alert("已经是第一个文档！");
			return;
		}
		iNum = fm.selectedIndex;
		//将当前文档和下一文档进行交换
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		for ( var i = iNum; i > 0; i--) {
			fm.options[i].text = fm.options[i - 1].text;
			fm.options[i].value = fm.options[i - 1].value;
		}
		fm.options[0].text = text;
		fm.options[0].value = value;
		//将文档ID保存到域
		getAllUnid(0);
	}

	function lastData() {
		//----置为最后一个
		//text:文本，value;值，count：数量，selectCount:选择数目，iNum：选中的编号
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true) {
				selectCount++;
			}
		}
		//确认只选择且选择了一个文档
		if (selectCount != 1) {
			alert("请选择一个文档进行上移或下移");
			return;
		}
		//下移时不能选择第一文档
		if (fm.options[count - 1].selected == true) {
			alert("已经是最后一个文档！");
			return;
		}
		iNum = fm.selectedIndex;
		//将当前文档和下一文档进行交换
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		for ( var i = iNum; i < count - 1; i++) {
			fm.options[i].text = fm.options[i + 1].text;
			fm.options[i].value = fm.options[i + 1].value;
		}
		fm.options[count - 1].text = text;
		fm.options[count - 1].value = value;
		//将文档ID保存到域
		getAllUnid(count - 1);
	}

	function getAllUnid(iNum) {

		var fm = document.getElementById("id");
		count = fm.options.length;
		var unids = "";
		for ( var i = 0; i < count; i++) {
			if (iNum == i)
				fm.options[i].selected = true;
			else
				fm.options[i].selected = false;
			unids += "," + fm.options[i].value;
		}
		document.getElementById("checkedIds").value = unids;
	}
	$(function() {
		$("#save").click(function(e) {
                var params = $("#update").serialize();
                $.ajax( {
                    url : "SortUpdate.action",
                    type : "POST",
                    data : params,
                    dataType : "json",
                    success : callback,
					error : ajaxError
                });
        });
        function callback(data) {
            ajaxMessage(data, 4);
        }
		$("#back").click(function(e) {
            closeBox();
        });
	})
</SCRIPT>
</html>


