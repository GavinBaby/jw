<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="java.util.*" language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String fileName = UUID.randomUUID().toString() + ".doc";
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
	<head>			
		<jtag:jhead/>
</head>		
<body onLoad="openD();">
		<table width="880px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
						<td width="40" align="center">
                        <jtag:jlevel moduleId="module03030100"></jtag:jlevel>          
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
						<tr>
							<TD width="12%" class="ziduan">
								公文标题：
	                       </td>
	                       <td   colspan='3' width="38%" align="center">
	                       &nbsp;${b_T_Ufp_FilesBase.documentbaseTitle}
	                       </td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<object id="TANGER_OCX" classid="clsid:C9BC4DFF-4248-4a3c-8A49-63A7D317F404" codebase="OfficeControl.cab#version=5,0,1,1" width="98%" height="1500">
										<param name="ProductCaption" value="宁波金网">
										<param name="ProductKey" value="FAFFEC82441CE03C6FB5BE1BEBB1406B614898E1">
										<SPAN STYLE="color: red">该网页需要控件浏览.浏览器无法装载所需要的文档控件.请检查浏览器选项中的安全设置.</SPAN>
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
		<s:hidden id="documentbaseFilepath" name="documentbaseFilepath"></s:hidden>
		<!-- 隐藏表单提交NTKO文件信息 -->
		<div style="display: none;">
			<form id="uploadForm" method="post" action="upload.jsp" enctype="multipart/form-data">
				<input type="file" name="myfile" />
			</form>
		</div>
	</body>
	<SCRIPT type="text/javascript">	
	function initOCX(){		
	   	TANGER_OCX.IsResetToolbarsOnOpen =false;
		TANGER_OCX.Statusbar = false;
		TANGER_OCX.ToolBar = false;
		TANGER_OCX.TitleBar = false;
		TANGER_OCX.Menubar=false;
		TANGER_OCX.IsResetToolbarsOnOpen=false;
		TANGER_OCX.IsShowEditMenu = false;
		TANGER_OCX.IsShowToolMenu = false;
		TANGER_OCX.IsShowHelpMenu = false;
		TANGER_OCX.IsShowInsertMenu = false;
		TANGER_OCX.IsShowEditMenu = false;
		TANGER_OCX.FileNew = false;
		TANGER_OCX.FileOpen = false;
		TANGER_OCX.FileClose = false;
		TANGER_OCX.FileSave = true;
		TANGER_OCX.FileSaveAs = true;
		TANGER_OCX.FilePrint = false;
		TANGER_OCX.FilePrintPreview = false;
		TANGER_OCX.FilePageSetup = false;
		TANGER_OCX.FileProperties = false;  	
	}

	function openD(){
		initOCX();
		var documentbaseFilepath = $("#documentbaseFilepath").val();
		if(documentbaseFilepath!=""){
			var filepath ="<%=basePath%>uploadFile/"+documentbaseFilepath;
			TANGER_OCX.OpenFromURL(filepath,null,"Word.Document");
	        TANGER_OCX.ActiveDocument.TrackRevisions = true;
	        TANGER_OCX.ActiveDocument.ShowRevisions = false;	
		}else{
			TANGER_OCX.CreateNew("Word.Document");
		}
	}  
</SCRIPT>
</html>
