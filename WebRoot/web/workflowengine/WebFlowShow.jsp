<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns:v="urn:schemas-microsoft-com:vml">
<HEAD>
<title>流程显示</title>
<META NAME="Author" CONTENT="JinWang">
<META NAME="Keywords" CONTENT="JMOWebFlowBuilder">
<link href="../../js/flow/style.css" type=text/css rel=stylesheet>
<link href="../../css/biaodan.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../../js/jquery1.6.2.js"></script> 
<script type="text/javascript" src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
<script type="text/javascript" src="../../js/flow/jmowatchwebflow.js"></script>
<script type="text/javascript" src="../../js/flow/function.js"></script>
<script type="text/javascript" src="../../js/JwCommon.js"></script>

<STYLE>
v\:* { Behavior: url(#default#VML) }
.btntools {color: #000000;BACKGROUND-COLOR: #D7E8F8;border-color: #8BC0EA;BORDER-BOTTOM: 1px ridge; BORDER-LEFT: #ffffff 1px ridge; BORDER-RIGHT: 1px ridge; BORDER-TOP: #ffffff 1px ridge; FONT-SIZE: 12px; HEIGHT: 14pt}
</STYLE>
</HEAD>

<BODY scroll="auto">
<INPUT TYPE="hidden" id="FlowXML" name="FlowXML" onpropertychange='if(AUTODRAW) redrawVML();'>
<TABLE border=0>
   <s:hidden id="fdCurrnetDocFlow" name="fdCurrnetDocFlow"></s:hidden>
 <s:hidden id="xmlValue" name="xmlValue"></s:hidden>
<TR>
    <TD width="800">
    <table width='100%' border='0' cellpadding='0' cellspacing='0' bgcolor='#FFFFFF' style='BORDER-left: #9fcaf5 1px solid;BORDER-right: #9fcaf5 1px solid;BORDER-bottom: #9fcaf5 1px solid;'>
<tr>
<td align='center' valign='top'>
<table width='100%' height='30' border='0' cellpadding='0' cellspacing='1' bgcolor='#b8fbfc' background='/jwoa4html/images/ss.gif' style='BORDER-right: #white 1px solid;BORDER-bottom: #9fcaf5 1px solid;BORDER-top: #9fcaf5 1px solid;font-size:14px;'>
<tr>
<td width='15%' class='TdcellHead'><p align='center'>环节名称</td>
<td width='20%' class='TdcellHead'><p align='center'>环节处理人员</td>
<td width='35%' class='TdcellHead'><p align='center'>环节传阅人员</td>
<td width='30%' class='TdcellHead'><p align='center'>处理时间</td></tr>
</table>
<TABLE width='100%'  border='0' cellPadding='0' cellSpacing='0' bgcolor='#FFFFFF' style='font-size:12px;'>
<s:iterator value="listC_V_Flow_History_Tache_Info" id="tachelist" status="index">
<TR onMouseOver="this.className='tr-over'" onMouseOut="this.className='TrList'"  height="20">
<td width='15%' align='center' style='BORDER-right: #9fcaf5 1px solid;BORDER-bottom: #9fcaf5 1px solid;' >&nbsp;<s:property value="tacheName" /></td>
<td width='20%' align='center' style='BORDER-right: #9fcaf5 1px solid;BORDER-bottom: #9fcaf5 1px solid;'>&nbsp;<s:property value="clr" /></td>
<td width='35%' align='center' style='BORDER-right: #9fcaf5 1px solid;BORDER-bottom: #9fcaf5 1px solid;'>&nbsp;<s:property value="cyr" /></td>
<td width='30%' align='center' style='BORDER-bottom: #9fcaf5 1px solid;'>&nbsp;<s:property value="tacheFinishTime" /></td></tr>

</s:iterator>
</table>

    </TD>
</TR> 

<TR>
    <TD width="800" height="550">
    <TABLE cellspacing="0" cellpadding="0" class="panel_style">
        
        <TR>
            <TD colspan=2 width="800" height="550" onclick="return false;" oncontextmenu="return false;" valign=top align=left>
                <v:group ID="FlowVML" style="width:800px;height:550px;position:absolute;" coordsize="2000,2000">
            </v:group>
    
            </TD>
        </TR>
    </TABLE>
    </TD>
</TR>
</TABLE>

<SCRIPT type="text/javascript">
$(function() {
		$("#FlowXML").val($("#xmlValue").val());
		
		$("#back").click(function(e) {
			closeBox();
		});
	});	
</SCRIPT>
</BODY>
</HTML>
