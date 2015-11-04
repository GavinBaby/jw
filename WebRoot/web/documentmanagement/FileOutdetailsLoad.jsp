<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="java.util.*" language="java" pageEncoding="GBK"%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<jtag:jhead />
	</head>
	<body onLoad="openD();">
		<table width="865px" height="100%" border="0" cellpadding="0"
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
						action="documentmanagement/FileOut_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						 <s:hidden id="fileName" name="fileName"></s:hidden>
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="curTacheId" name="curTacheId"></s:hidden>
						<s:hidden id="nextTacheInfo" name="nextTacheInfo"></s:hidden>
						<s:hidden id="allPermission" name="allPermission"></s:hidden>
						<s:hidden id="moduleId" name="moduleId"></s:hidden>
						<s:hidden id="uuid" name="b_T_Flow_FileOut.uuid"></s:hidden>
						<s:hidden id="fileSavePath" name="fileSavePath"></s:hidden>
						<s:hidden id="noteFieldId" name="noteFieldId"></s:hidden>
						<s:hidden id="note" name="note"></s:hidden>
						<s:hidden id="newFileIds" name="newFileIds"></s:hidden>
						<s:hidden id="fileoutContenturl"
							name="b_T_Flow_FileOut.fileoutContenturl"></s:hidden>
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
						<s:hidden id="fileSeparator" name="fileSeparator"></s:hidden>
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
									<s:if test="isFinished==true">
										<jtag:jbutton id="tobase" value="����" editCondition="*" />
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
						<table width="99%" height="660" border="0" cellpadding="0"
							cellspacing="0" class="biaodan">
							<tr>
								<td height="31" width="17%" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;�ţ� </b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jsl id="fileoutRecordtypeid" list="list_FileRecordType"
										name="b_T_Flow_FileOut.fileoutRecordtypeid" listKey="uuid"
										listValue="recordtypeName" editCondition="%{allPermission}"
										headerKey="" headerValue="--��ѡ��--" cssStyle="width:20%"></jtag:jsl>
									��
									<jtag:jtl id="fileoutYear" name="b_T_Flow_FileOut.fileoutYear"
										editCondition="%{allPermission}" readonly="true"
										onclick="WdatePicker({dateFmt:'yyyy'});" cssStyle="width:10%"></jtag:jtl>
									�� ��&nbsp;
									<jtag:jtl id="fileoutSerial"
										name="b_T_Flow_FileOut.fileoutSerial"
										editCondition="%{allPermission}" maxlength="10"
										cssStyle="width:13%"></jtag:jtl>
									��
								</td>
							</tr>
							<tr>
								<td height="124" rowspan="2" align="center" class="ziduan">
									<b>ǩ&nbsp;&nbsp;&nbsp;&nbsp;���� </b>
								</td>
								<td height="124" width="22%" rowspan="2" align="left">
									<jtag:jnote id="issue" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileOut.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:200px" rows="60" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="issueidea" value="ǩ�����"
										cssClass="btn1_mouseout"
										onmouseover="this.className='btn1_mouseover'"
										onmouseout="this.className='btn1_mouseout'"
										onmousedown="this.className='btn1_mousedown'"
										onmouseup="this.className='btn1_mouseup'"
										onclick="selectPhrase('headoffice')"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</td>
								<td height="62" width="15%" class="ziduan">
									<b>�ֹ��쵼��ˣ� </b>
								</td>
								<td height="62" colspan="4" align="left">
									<jtag:jnote id="fgldaudio" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileOut.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:80px" rows="25" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="fgldaudioidea" value="ǩ�����"
										cssClass="btn1_mouseout"
										onmouseover="this.className='btn1_mouseover'"
										onmouseout="this.className='btn1_mouseout'"
										onmousedown="this.className='btn1_mousedown'"
										onmouseup="this.className='btn1_mouseup'"
										onclick="selectPhrase('headoffice')"
										editCondition="%{allPermission}">
									</jtag:jbutton>

								</td>
							</tr>
							<tr>
								<td height="62" width="12%" align="center" class="ziduan">
									<b>�칫�Һ˸壺 </b>
								</td>
								<td height="62" colspan="4" align="left">
									<jtag:jnote id="officeaudio" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileOut.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:80px" rows="25" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="officeaudioidea" value="ǩ�����"
										cssClass="btn1_mouseout"
										onmouseover="this.className='btn1_mouseover'"
										onmouseout="this.className='btn1_mouseout'"
										onmousedown="this.className='btn1_mousedown'"
										onmouseup="this.className='btn1_mouseup'"
										onclick="selectPhrase('headoffice')"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</td>
							</tr>
							<tr>
								<td rowspan="4" align="center" class="ziduan">
									<b>���Ż�ǩ�� </b>
								</td>
								<td rowspan="4" align="left">
									<jtag:jnote id="deptaudio" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileOut.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:160px" rows="60" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="deptaudioidea" value="ǩ�����"
										cssClass="btn1_mouseout"
										onmouseover="this.className='btn1_mouseover'"
										onmouseout="this.className='btn1_mouseout'"
										onmousedown="this.className='btn1_mousedown'"
										onmouseup="this.className='btn1_mouseup'"
										onclick="selectPhrase('headoffice')"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</td>
								<td height="62" width="12%" align="center" class="ziduan">
									<b>���Ҹ����ˣ� </b>
								</td>
								<td colspan="4" align="center">
									<jtag:jnote id="csfzraudio" mouduleId="${moduleId}"
										mainId="${b_T_Flow_FileOut.uuid}" tacheId="${curTacheId}"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:60px" rows="25" cols="80"
										readonly="true"></jtag:jnote>
									<jtag:jbutton id="csfzraudioidea" value="ǩ�����"
										cssClass="btn1_mouseout"
										onmouseover="this.className='btn1_mouseover'"
										onmouseout="this.className='btn1_mouseout'"
										onmousedown="this.className='btn1_mousedown'"
										onmouseup="this.className='btn1_mouseup'"
										onclick="selectPhrase('headoffice')"
										editCondition="%{allPermission}">
									</jtag:jbutton>
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>�����̶ȣ� </b>
								</td>
								<td height="31" width="13%" align="center">
									<jtag:jsl id="fileoutUrgency" list="list_FileoutUrgency"
										name="b_T_Flow_FileOut.fileoutUrgency" listKey="maintainId"
										listValue="maintainName" editCondition="%{allPermission}"
										headerKey="" headerValue="--��ѡ��--" cssStyle="width:98%"></jtag:jsl>
								</td>
								<td height="31" colspan="2" width="10%" align="center"
									class="ziduan">
									<b>��&nbsp;&nbsp;���� </b>
								</td>
								<td height="31" width="15%" align="center">
									<jtag:jsl id="fileoutSecretlevel" list="#{'1':'һ��','2':'����'}"
										name="b_T_Flow_FileOut.fileoutSecretlevel" listKey="key"
										listValue="value" editCondition="%{allPermission}"
										headerKey="" headerValue="--��ѡ��--" cssStyle="width:98%"></jtag:jsl>
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>������ʽ�� </b>
								</td>
								<td height="31" colspan="4" align="center">
									<jtag:jsl id="fileoutIspublish"
										list="#{'1':'����','2':'������','3':'�����빫��'}"
										name="b_T_Flow_FileOut.fileoutIspublish" listKey="key"
										listValue="value" editCondition="%{allPermission}"
										headerKey="" headerValue="--��ѡ��--" cssStyle="width:99%"></jtag:jsl>
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;��&nbsp;�ˣ� </b>
								</td>
								<td height="31" colspan="4" align="center">
									<jtag:jtl id="fileoutDrafter"
										name="b_T_Flow_FileOut.fileoutDrafter"
										editCondition="%{allPermission}" maxlength="50"
										cssStyle="width:99%" />
								</td>
							</tr>

							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;�⣺ </b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jtl id="fileoutTitle"
										name="b_T_Flow_FileOut.fileoutTitle"
										editCondition="%{allPermission}" maxlength="500"
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��ʽ�ļ���</b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jupload id="upload1" moduleId="module03010000"
										mainId="b_T_Flow_FileOut.uuid"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="changeZSNTKO" cssClass="btn1_mouseout"
										value="NTKO��ʽ���ϴ�" editCondition="%{allPermission}">
									</jtag:jbutton>
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;����</b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jupload id="upload2" moduleId="module03010000"
										mainId="b_T_Flow_FileOut.uuid"
										editCondition="%{allPermission}" />

								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;�ͣ�</b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jtl id="fileoutDeptmentmain"
										name="b_T_Flow_FileOut.fileoutDeptmentmain"
										editCondition="%{allPermission}" maxlength="500"
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;�ͣ� </b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jtl id="fileoutCarboncopy"
										name="b_T_Flow_FileOut.fileoutCarboncopy"
										editCondition="%{allPermission}" maxlength="500"
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;��&nbsp;�ʣ�</b>
								</td>
								<td height="31" colspan="6" align="left">
									<jtag:jtl id="fileoutSubjectwords"
										name="b_T_Flow_FileOut.fileoutSubjectwords"
										editCondition="%{allPermission}" maxlength="500"
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>��&nbsp;&nbsp;&nbsp;&nbsp;�֣�</b>
								</td>
								<td height="31" align="left">
									<jtag:jtl id="fileoutDraft"
										name="b_T_Flow_FileOut.fileoutDraft"
										editCondition="%{allPermission}" maxlength="200"
										cssStyle="width:98%" />
								</td>
								<td height="31" colspan="2" align="center" class="ziduan">
									<b>У&nbsp;&nbsp;&nbsp;&nbsp;�ԣ�</b>
								</td>
								<td height="31" colspan="3" align="center">
									<jtag:jtl id="fileoutChecker"
										name="b_T_Flow_FileOut.fileoutChecker"
										editCondition="%{allPermission}" maxlength="50"
										cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td height="31" align="center" class="ziduan">
									<b>ӡ&nbsp;&nbsp;&nbsp;&nbsp;����</b>
								</td>
								<td height="31" align="left">
									<jtag:jtl id="fileoutPortions"
										name="b_T_Flow_FileOut.fileoutPortions"
										editCondition="%{allPermission}" maxlength="10"
										cssStyle="width:98%" />
								</td>
								<td height="31" colspan="2" align="center" class="ziduan">
									<b>ӡ��ʱ�䣺</b>
								</td>
								<td height="31" colspan="3" align="center">
									<jtag:jtl id="fileoutPrintdate"
										name="b_T_Flow_FileOut.fileoutPrintdate"
										editCondition="%{allPermission}" onclick="WdatePicker();"
										maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
						</table>
						<div id="showhj">
							<span class="opinfo" onClick="">[�ĵ�����]</span>
							<center>
								<jtag:jbutton id="showHJ" cssClass="op" value="��ʾ�ۼ�"
									editCondition="*">

								</jtag:jbutton>
								<jtag:jbutton id="hideHJ" cssClass="op" value="���غۼ�"
									editCondition="*">

								</jtag:jbutton>

							</center>

						</div>
					</s:form>
					<object id="TANGER_OCX"
						classid="clsid:C9BC4DFF-4248-4a3c-8A49-63A7D317F404"
						codebase="OfficeControl.cab#version=5,0,1,1" width="98%"
						height="1500">
						<param name="ProductCaption" value="��������">
						<param name="ProductKey"
							value="FAFFEC82441CE03C6FB5BE1BEBB1406B614898E1">
						<SPAN STYLE="color: red">����ҳ��Ҫ�ؼ����.������޷�װ������Ҫ���ĵ��ؼ�.���������ѡ���еİ�ȫ����.</SPAN>
					</object>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<!-- ���ر��ύNTKO�ļ���Ϣ -->
		<div style="display: none;">
			<form id="uploadForm" method="post" action="upload.jsp"
				enctype="multipart/form-data">
				<input type="file" name="myfile" />
			</form>
		</div>
	</body>
	<SCRIPT type="text/javascript">	
	function initOCX(){		
	   	TANGER_OCX.IsResetToolbarsOnOpen = true;
        TANGER_OCX.Statusbar = true;
        TANGER_OCX.ToolBar = true;
        TANGER_OCX.TitleBar = true;
        TANGER_OCX.Menubar = true;
        TANGER_OCX.IsResetToolbarsOnOpen = true;
        TANGER_OCX.IsShowEditMenu = true;
        TANGER_OCX.IsShowToolMenu = true;
        TANGER_OCX.IsShowHelpMenu = true;
        TANGER_OCX.IsShowInsertMenu = true;
        TANGER_OCX.IsShowEditMenu = true;
        TANGER_OCX.FileNew = true;
        TANGER_OCX.FileOpen = true;
        TANGER_OCX.FileClose = true;
        TANGER_OCX.FileSave = true;
        TANGER_OCX.FileSaveAs = true;
        TANGER_OCX.FilePrint = true;
        TANGER_OCX.FilePrintPreview = true;
        TANGER_OCX.FilePageSetup = true;
        TANGER_OCX.FileProperties = true;
	}

	function openD(){
		initOCX();
		var mainDocId = $("#mainDocId").val();
		if(mainDocId!=""){
		 try{
			var Contenturl = $("#fileoutContenturl").val();
			Contenturl = Contenturl.replace(/\\/g,'/');     //2015-9-15�޸ģ�youjh
			var filepath ="<%=basePath%>uploadFile/"+Contenturl;
			TANGER_OCX.OpenFromURL(filepath,null,"Word.Document");
	        TANGER_OCX.ActiveDocument.TrackRevisions = true;
	        TANGER_OCX.ActiveDocument.ShowRevisions = false;
	        }catch(e){
                if(fileoutContenturl.indexOf(".docx")>-1){
                    art.dialog.alert("���ĵ��ɸ߰汾word�༭/����������װ��word�汾�޷��򿪡�");
                }
            }	
		}else{
			TANGER_OCX.CreateNew("Word.Document");
		}
	}  

	function saveToLocal(filename){
		var fileSavePath = $("#fileSavePath").val()+filename;
		$("#fileoutContenturl").attr("value",fileSavePath);
		TANGER_OCX.SaveToURL("upload.jsp?fileName="+fileSavePath,"myfile","","","uploadForm");//���ύ�Ĵ���ҳ�棬�����FILE�� NAME,���գ����գ�����ID
    	if(jQuery("#curTacheId").attr("value")=="tache0008"||jQuery("#curTacheId").attr("value")=="tache0007")
    	{
    		   var HJfileSavePath = $("#fileSavePath").val()+"HJ"+filename;
    		   TANGER_OCX.SaveToURL("upload.jsp?fileName="+HJfileSavePath,"myfile","","","uploadForm");//���ύ�Ĵ���ҳ�棬�����FILE�� NAME,���գ����գ�����ID
    	}
	}
	
	function saveDoc() {
		var fileName = $("#fileName").val();
		saveToLocal(fileName);
		var params = $("#update").serialize();
		lockBox();
		jQuery.ajax( {
			url : "documentmanagement/FileOut_detailsUpdate_ajax.action",
			type : "POST",
			data : params,
			dataType : "json",
			success : callback
		});
	}

	function callback(data) {
		ajaxMessage(data, 1);
	}
	$(function() {
		$("#tobase").click(function(e) {
			var mainDocId = $("#mainDocId").val();
			var params = {mainDocId:mainDocId}
			jQuery.ajax( {
				url : "documentmanagement/FileOut_filebaseIn_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : function(data){
					art.dialog.alert("�����ɹ���");
				}
			});
		});
		$('#upload1').uploadify(new uploadObject("upload1",true,5,"",""));
		$('#upload2').uploadify(new uploadObject("upload2",true,5,"",""));
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid == false) {
				return false;
			}
			saveDoc();
		});

		flowButInit($("#moduleId").val(),$("#mainDocId").val(),"update");

		$("#showHJ").click(function(e) {
			 TANGER_OCX.ActiveDocument.ShowRevisions = true; //flagΪtrueΪ��ʾ�ۼ���falseΪ���غۼ���
		});

		$("#hideHJ").click(function(e) {
			 TANGER_OCX.ActiveDocument.ShowRevisions = false; //flagΪtrueΪ��ʾ�ۼ���falseΪ���غۼ���
		});
	   	//NTKO��ʽ�ļ��ϴ�
		$("#changeZSNTKO").click(function(e) {
	   		var returnIsValid = $('#update').form('validate');
	   		if(!returnIsValid){
				return ;
		   	}
	   	   	var fileName = $("#fileName").val();
	   		TANGER_OCX.ActiveDocument.AcceptAllRevisions();//
	   		saveToLocal(fileName);
	   		var fileSavePath = $("#fileSavePath").val()+fileName;
				TANGER_OCX.SaveToURL("upload.jsp?fileName=" + fileSavePath,
						"myfile", "", "", "uploadForm");//���ύ�Ĵ���ҳ�棬�����FILE�� NAME,���գ����գ�����ID
				var params = $("#update").serialize();
				lockBox();
				jQuery.ajax( {
					url : "documentmanagement/FileOut_zswjUpdate_ajax.action?",
					type : "POST",
					data : params,
					dataType : "json",
					success : function(date) {
						update.action = "FileOut_detailsLoad.action";
						update.submit();
					}
				});
			});

		$("#issueidea").click(function(e) {
			selectPhrase('issue');
		});
		$("#fgldaudioidea").click(function(e) {
			selectPhrase('fgldaudio');
		});
		$("#officeaudioidea").click(function(e) {
			selectPhrase('officeaudio');
		});
		$("#deptaudioidea").click(function(e) {
			selectPhrase('deptaudio');
		});
		$("#csfzraudioidea").click(function(e) {
			selectPhrase('csfzraudio');
		});

		$("#back").click(function(e) {
			closeBox();
		});

		$(
				"#fileoutTitle,#fileoutDraft,#fileoutChecker,#fileoutPrintdate,#fileoutDrafter,#fileoutYear")
				.validatebox( {
					required : true
				});

		$('#fileoutRecordtypeid').combobox( {
			width : 130,
			required : true,
			panelHeight : 105
		});
		$('#fileoutUrgency').combobox( {
			width : 100,
			required : true,
			panelHeight : 85
		});
		$('#fileoutSecretlevel').combobox( {
			width : 115,
			required : true,
			panelHeight : 65
		});
		$('#fileoutIspublish').combobox( {
			width : 310,
			required : true,
			panelHeight : 85
		});

		$("#fileoutSerial,#fileoutPortions").validatebox( {
			width : 100,
			required : true,
			validType : "number"
		});

	});
</SCRIPT>
</html>
