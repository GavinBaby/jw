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
								<jtag:jbutton value="�ᵽ��ǰ" onclick="firstData();" editCondition="*"/>
								&nbsp;&nbsp;
								<jtag:jbutton value="����һλ" onclick="upData();" editCondition="*"/>
								&nbsp;&nbsp;
								<jtag:jbutton value="����һλ" onclick="downData();" editCondition="*"/>
								&nbsp;&nbsp;
								<jtag:jbutton value="�ᵽ���" onclick="lastData();" editCondition="*"/>
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
                        <!-- ���ؿ����� ��ʼ  -->
				        <s:hidden id="checkedIds" name="checkedIds" />
				        <s:hidden id="tableName" name="tableName" />
				        <s:hidden id="sort" name="sort" />
				        <!-- ���ؿ����� ���� -->
					<table width="98%" border="0" cellspacing="0" cellpadding="0" >
						<tr>
							<td align="center"> 
								<jtag:jbutton id="save" value="�� ��" editCondition="*" />
								<jtag:jbutton id="back" value="�� ��" editCondition="*"/>
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
		//----�����ĵ�����
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true)
				selectCount++;
		}
		//ȷ��ֻѡ����ѡ����һ���ĵ�
		if (selectCount != 1) {
			alert("��ѡ��һ���ĵ��������ƻ�����")
			return;
		}
		//����ʱ����ѡ���һ�ĵ�
		if (fm.options[0].selected == true) {
			alert("��һ���ĵ����������ƣ�")
			return;
		}
		iNum = fm.selectedIndex;
		//����ǰ�ĵ�����һ�ĵ����н���
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		fm.options[iNum].text = fm.options[iNum - 1].text;
		fm.options[iNum].value = fm.options[iNum - 1].value;
		fm.options[iNum - 1].text = text;
		fm.options[iNum - 1].value = value;
		//���ĵ�ID���浽��
		getAllUnid(iNum - 1);
	}
	function downData() {
		//----�����ĵ�����
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true)
				selectCount++;
		}
		//ȷ��ֻѡ����ѡ����һ���ĵ�
		if (selectCount != 1) {
			alert("��ѡ��һ���ĵ��������ƻ�����")
			return;
		}
		//����ʱ����ѡ������ĵ�
		if (fm.options[count - 1].selected == true) {
			alert("�Ѿ������һ���ĵ������������ƣ�")
			return;
		}
		iNum = fm.selectedIndex;
		//����ǰ�ĵ�����һ�ĵ����н���
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		fm.options[iNum].text = fm.options[iNum + 1].text;
		fm.options[iNum].value = fm.options[iNum + 1].value;
		fm.options[iNum + 1].text = text;
		fm.options[iNum + 1].value = value;
		//���ĵ�ID���浽��
		getAllUnid(iNum + 1);
	}

	function firstData() {
		//----��Ϊ��һ��
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true) {
				selectCount++;
			}
		}
		//ȷ��ֻѡ����ѡ����һ���ĵ�
		if (selectCount != 1) {
			alert("��ѡ��һ���ĵ��������ƻ�����");
			return;
		}
		//����ʱ����ѡ���һ�ĵ�
		if (fm.options[0].selected == true) {
			alert("�Ѿ��ǵ�һ���ĵ���");
			return;
		}
		iNum = fm.selectedIndex;
		//����ǰ�ĵ�����һ�ĵ����н���
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		for ( var i = iNum; i > 0; i--) {
			fm.options[i].text = fm.options[i - 1].text;
			fm.options[i].value = fm.options[i - 1].value;
		}
		fm.options[0].text = text;
		fm.options[0].value = value;
		//���ĵ�ID���浽��
		getAllUnid(0);
	}

	function lastData() {
		//----��Ϊ���һ��
		//text:�ı���value;ֵ��count��������selectCount:ѡ����Ŀ��iNum��ѡ�еı��
		var text, value, count, selectCount, iNum;
		var fm = document.getElementById("id");
		count = fm.options.length;
		selectCount = 0;
		for ( var i = 0; i < count; i++) {
			if (fm.options[i].selected == true) {
				selectCount++;
			}
		}
		//ȷ��ֻѡ����ѡ����һ���ĵ�
		if (selectCount != 1) {
			alert("��ѡ��һ���ĵ��������ƻ�����");
			return;
		}
		//����ʱ����ѡ���һ�ĵ�
		if (fm.options[count - 1].selected == true) {
			alert("�Ѿ������һ���ĵ���");
			return;
		}
		iNum = fm.selectedIndex;
		//����ǰ�ĵ�����һ�ĵ����н���
		text = fm.options[iNum].text;
		value = fm.options[iNum].value;
		for ( var i = iNum; i < count - 1; i++) {
			fm.options[i].text = fm.options[i + 1].text;
			fm.options[i].value = fm.options[i + 1].value;
		}
		fm.options[count - 1].text = text;
		fm.options[count - 1].value = value;
		//���ĵ�ID���浽��
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


