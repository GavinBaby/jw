<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html> 
	<head>			
		<jtag:jhead/>
	</head>
	<body >
		<table width="830px" height="100%" border="0" cellpadding="0"
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
								��ǰ���ڣ�
								<s:property value="curTacheName" />
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
						action="documentmanagement/FileIn_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="jsonResult" name="jsonResult"></s:hidden>
						<s:hidden id="curTacheId" name="curTacheId"></s:hidden>
						<s:hidden id="nextTacheInfo" name="nextTacheInfo"></s:hidden>
						<s:hidden id="allPermission" name="allPermission"></s:hidden>
						<s:hidden id="moduleId" name="moduleId"></s:hidden>
						<s:hidden id="uuid" name="b_T_Flow_FileIn.uuid"></s:hidden>
						<s:hidden id="noteFieldId" name="noteFieldId"></s:hidden>
						<s:hidden id="note" name="note"></s:hidden>
						<s:hidden id="newFileIds" name="newFileIds"></s:hidden>
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
						<s:hidden id="isFinished" name="isFinished"></s:hidden>
						<table width="99%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="�� ��"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="next" value="��һ��"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="withdramal" value="�˻�"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="drawback" value="�ջ�"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="urge" value="�߰�"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="showflow" value="�鿴������Ϣ"
										editCondition="%{allPermission}" />
									<s:if test='isFinished==true'>
										<jtag:jbutton id="tobase" value="����"
											editCondition="*" />
									</s:if>
									<jtag:jbutton id="back" value="�� ��" editCondition="*" />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="99%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<TR>
								<TD width="12%" align="center" class="ziduan">
									<b>���ı�ţ� </b>
								</TD>
								<TD width="37%" align="left" colspan="3">
									<jtag:jsl id="fileinTypeid" list="list_Filein_Typename"
										name="b_T_Flow_FileIn.fileinTypeid" listKey="maintainId"
										listValue="maintainName" editCondition="%{allPermission}"
										headerKey="" headerValue="---��ѡ��---" cssStyle="width:30%;"></jtag:jsl>
									��
									<jtag:jtl id="fileinYear" cssClass="Wdate"
										name="b_T_Flow_FileIn.fileinYear"
										onclick="WdatePicker({onpicked:function(){getserial();},readOnly:true,dateFmt:'yyyy'})"
										editCondition="%{allPermission}" maxlength="50"
										cssStyle="width:16%"></jtag:jtl>
									�� ��
									<jtag:jtl id="fileinSerial" name="b_T_Flow_FileIn.fileinSerial"
										editCondition="%{allPermission}" maxlength="10"
										cssStyle="width:19%"></jtag:jtl>
									��
								</TD>
								<TD width="12%" align="center" class="ziduan">
									<b>�������ڣ� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jtl id="fileinTime" name="b_T_Flow_FileIn.fileinTime"
										cssClass="Wdate" editCondition="%{allPermission}"
										cssStyle="width:96%"
										onclick="WdatePicker({onpicked:function(){fileDateValidate()},readOnly:true,dateFmt:'yyyy-MM-dd'})"></jtag:jtl>
								</TD>
							</TR>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>��&nbsp;��&nbsp;�ˣ� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jtl id="registeredUser"
										name="b_T_Flow_FileIn.registeredUser" editCondition="#"
										maxlength="50" readonly="true" cssStyle="width:90%"></jtag:jtl>
								</TD>
								<TD width="12%" align="center" class="ziduan">
									<b>�Ǽ����ڣ� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jtl id="registeredTime"
										name="b_T_Flow_FileIn.registeredTime" editCondition="#"
										readonly="true" maxlength="19" cssStyle="width:90%"></jtag:jtl>
								</TD>
								
									<TD width="12%" align="center" class="ziduan">
									<b>�а����ޣ� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jtl id="deadline" name="b_T_Flow_FileIn.deadline"
										cssClass="Wdate" editCondition="%{allPermission}"
										maxlength="19" cssStyle="width:96%"
										onclick="WdatePicker({onpicked:function(){fileDateValidate()},readOnly:true,dateFmt:'yyyy-MM-dd'})"></jtag:jtl>
								</TD>
							</tr>
							<tr>
							<TD width="12%" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;���� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jsl id="urgency" list="#{'1':'һ��','2':'����','3':'�ؼ�'}"
										name="b_T_Flow_FileIn.urgency" listKey="key" listValue="value"
										editCondition="%{allPermission}" headerKey=""
										headerValue="--��ѡ��--" cssStyle="width:98%;"></jtag:jsl>
								</TD>
								<TD width="12%" align="center" class="ziduan">
									<b>ҳ&nbsp;&nbsp;&nbsp;&nbsp;���� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jtl id="pages" name="b_T_Flow_FileIn.pages"
										editCondition="%{allPermission}" maxlength="10"
										cssStyle="width:98%"></jtag:jtl>
								</TD>
								<TD width="12%" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;���� </b>
								</TD>
								<TD width="20%" align="left">
									<jtag:jtl id="copies" name="b_T_Flow_FileIn.copies"
										editCondition="%{allPermission}" maxlength="10"
										cssStyle="width:96%"></jtag:jtl>
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;�⣺ </b>
								</TD>

								<TD width="84%" colspan="5" align="left">
									<jtag:jtl id="fileinTitle" name="b_T_Flow_FileIn.fileinTitle"
										editCondition="%{allPermission}" maxlength="500"
										cssStyle="width:99%"></jtag:jtl>
								</TD>
							</tr>
								<tr>
									<TD width="12%" align="center" class="ziduan">
										<b>�����ĺţ� </b>
									</TD>
									<TD width="37%" align="left" colspan="3">
										<jtag:jtl id="symbol" name="b_T_Flow_FileIn.symbol"
											editCondition="%{allPermission}" maxlength="500"
											cssStyle="width:145px"></jtag:jtl>
										��
										<jtag:jtl id="symbolYear" name="b_T_Flow_FileIn.symbolYear"
											editCondition="%{allPermission}" maxlength="10" cssStyle="width:16%"></jtag:jtl>
										�� ��
										<jtag:jtl id="symbolNo" name="b_T_Flow_FileIn.symbolNo"
											editCondition="%{allPermission}" maxlength="50"
											cssStyle="width:19%"></jtag:jtl>
										��
									</TD>
									<TD width="12%" align="center" class="ziduan">
										<b>���Ļ��أ� </b>
									</TD>
									<TD width="20%" align="left" >
										<jtag:jtl id="authorities" name="b_T_Flow_FileIn.authorities"
											editCondition="%{allPermission}" maxlength="500"
											cssStyle="width:94%"></jtag:jtl>
									</TD>
								</tr>
								<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>��ʽ�ļ��� </b>
								</TD>

								<TD width="80%" colspan="5" align="left">
									<jtag:jupload id="upload1" moduleId="module03020000"
										mainId="b_T_Flow_FileIn.uuid" editCondition="%{allPermission}" />
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;���� </b>
								</TD>

								<TD width="80%" colspan="5" align="left">
									<jtag:jupload id="upload2" moduleId="module03020000"
										mainId="b_T_Flow_FileIn.uuid" editCondition="%{allPermission}" />
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;ע�� </b>
								</TD>

								<TD width="87%" colspan="5" align="left">
									<jtag:jtal id="remarks" name="b_T_Flow_FileIn.remarks"
										editCondition="%{allPermission}"
										cssStyle="width:99%;height:50px" rows="15" cols="80"></jtag:jtal>
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>�칫������</b>
									<div>
										<b>��죺 </b>
									</div>
								</TD>
								<TD width="87%" colspan="5" align="left">
									<jtag:jnote id="officeTodo" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileIn.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:99%;height:50px" rows="15" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="bgszrnb" value="ǩ�����"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>�쵼��ʾ��</b>
								</TD>
								<TD width="87%" colspan="5" align="left">
									<jtag:jnote id="directorMark" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileIn.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:99%;height:50px" rows="15" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="jldpy" value="ǩ�����"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									<b>�������� </b>
								</TD>
								<TD width="87%" colspan="5" align="left">
									<jtag:jnote id="blfkMark" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileIn.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:99%;height:50px" rows="15" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="blfkyj" value="ǩ�����"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</TD>
							</tr>
							<tr>
								<td width="12%" class="ziduan">
									���������
								</td>
								<td width="87%" colspan=5>
										<jtag:jreadinfo id="readinfo"  isReaded="1" mainId="${b_T_Flow_FileIn.uuid}"/>
								</td>
							</tr>
							<tr>
								<td width="12%" class="ziduan">
									δ�������
								</td>
								<td width="87%" colspan=5>
										<jtag:jreadinfo id="readinfo2"  isReaded="0" mainId="${b_T_Flow_FileIn.uuid}"/>
								</td>
							</tr>
						</TABLE>
					</s:form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');			
			if (returnIsValid == false) {
				return false;
			}	
			saveDoc();
		});
		$("#tobase").click(function(e) {
			var mainDocId = $("#mainDocId").val();
			var params = {mainDocId:mainDocId}
			jQuery.ajax( {
				url : "documentmanagement/FileIn_filebaseIn_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : function(data){ajaxMessage(data, 99);}
			});
		});
		$('#upload1').uploadify(new uploadObject("upload1",true,5,"","")); 
		$('#upload2').uploadify(new uploadObject("upload2",true,5,"","")); 
		$("#back").click(function(e) {
			closeBox();
		});	
		flowButInit($("#moduleId").val(),$("#mainDocId").val(),"update");	
		$('#fileinTypeid').combobox( {
			width: 145,
			required:true,
			panelHeight : 125,
			onSelect: function(){
			getserial();
		}
		});	
		$('#fileinYear').validatebox( {
			required : true
		});
		$("#fileinTitle,#fileinTime,#fileinSerial,#deadline").validatebox({
			required:true
		});
		$('#remarks').validatebox( {
			validType : 'length[0,500]',
			invalidMessage : '�������500�֣�'
		});
		$('#urgency').combobox( {
			width: 147,
			required:false,
			panelHeight : 83
		});	
		$('#pages,#copies,#symbolYear,#symbolNo,#fileinSerial').validatebox( {
			validType:"number"
		});
		$("#jldpy").click(function(e) {
			selectPhrase('directorMark');
		});
		$("#bgszrnb").click(function(e) {
			selectPhrase('officeTodo');
		});
		$("#blfkyj").click(function(e) {
			selectPhrase('blfkMark');
		});
		
	});
	
	//ȡ��ˮ��
    function getserial(){
  	 var typeid = $('#fileinTypeid').combobox("getValue");	
		var year = $("#fileinYear").val();
		
		$.ajax( {
			url : "documentmanagementajax/FileIn_getserial_ajax.action?fileinTypeid="+typeid+"&fileinYear="+year,
			type : "POST",	
			dataType : "json",
			success : callbackcar
		});
    }
   //�ص���ֵ
	function callbackcar(data){
		var json = eval("(" + data.jsonResult + ")");
		if(json.length!=0){
			for(var j in json){
				if(j>-1){
					var fileinSerial=json[j]['fileinSerial'];
						$('#fileinSerial').attr("value",fileinSerial)
						}
			}
		}
	}
	function fileDateValidate(){
		var deadline = $("#deadline").val();
		var fileinTime = $("#fileinTime").val();
		if(deadline!=""&&fileinTime!=""){
			if(deadline<fileinTime){
				art.dialog.alert("�а�����Ӧ������������").unlock();
				$("#deadline").attr("value","");
				$("#deadline").focus();
			}
		}
	}
	
	function saveDoc() {			
		var params = $("#update").serialize();
		lockBox();
		jQuery.ajax( {
			url : "documentmanagement/FileIn_detailsUpdate_ajax.action",
			type : "POST",
			data : params,
			dataType : "json",
			success : callback
		});
	}
	function callback(data) {
		ajaxMessage(data, 1);
	}
</SCRIPT>
</html>