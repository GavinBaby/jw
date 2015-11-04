
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
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel="stylesheet" href="../../css/cssmain.css" type="text/css"></link>
		<style type="text/css">
#div1 {
	position: absolute;
	width: 100px;
	height: 50px;
	left: 50%;
	top: 50%;
	margin-left: -50px;
	margin-top: -25px;
	border: 0px solid #000
}
</style>
	</head>
	<body style="background: #ffffff">
		<s:if test="listB_T_Ufp_FilesBase.size<=0">
		 <div id="div1">
		<font color="gray"> 暂无可查阅公文</font>
		 </div>  
		</s:if>
		<s:else>
		<table width="98%" border="0" cellspacing="0" cellpadding="0"
			align="center" class="black_12_24">
			<tr>
				<td width="3%" align="center">
					&nbsp;
				</td>
				<td align="left">
					&nbsp;
				</td>
				<td width="10%" align="center">
					&nbsp;
				</td>
			</tr>
				<s:iterator value="listB_T_Ufp_FilesBase" status="list" begin="0" end="%{listB_T_Ufp_FilesBase.size<=4?listB_T_Ufp_FilesBase.size-1:4}">
					<tr>
						<td width="3%" align="center">
							·
						</td>
						<td align="left">
							<a href='javascript:showFilebase("<s:property value='documentbaseFilepath'/>","<s:property value='documentbaseId'/>")' >
							<s:property value="documentbaseTitle" />[<s:property value="documentbaseMark" />]
							</a>
						</td>
						<td width="10%" align="center">

						</td>
					</tr>
				</s:iterator>
		</table>
		</s:else>
	</body>
<SCRIPT type="text/javascript">
	//查看附件
	function showFilebase(url,mainDocId){
		if(url.toLocaleLowerCase().indexOf(".tif")>-1||url.toLocaleLowerCase().indexOf(".tiff")>-1){
			openNew("../documentmanagement/FileBase_filebaseShowTif.action?mainDocId="+mainDocId, "公文查看",955,555);
		}else if(url.toLocaleLowerCase().indexOf(".doc")>-1){
			openNew("../documentmanagement/FileBase_filebaseShowDoc.action?mainDocId="+mainDocId,  "公文查看",900,515);
		}else{
			window.open("<%=basePath%>uploadFile/"+url);
		}
	}
</SCRIPT>
</html>

