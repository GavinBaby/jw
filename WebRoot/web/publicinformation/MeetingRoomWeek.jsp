<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%@ page import="com.jw.magicbpm.action.publicinformation.MeetingRoomAction" %>
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
		<div data-options="region:'north',border:false"
			style="height: 70px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module14040000"></jtag:jlevel>
				</tr>
			</table>
			<s:form cssClass="jNice">
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
				<td height="10"></td><td height="7"></td></tr><tr>
					<td width="25"></td><td>
					 <jtag:jbutton id="new" value="预 定" editCondition="*" />
					</td>
				</tr>
			</table>
			</s:form>
		</div>
		<div data-options="region:'center',border:false">		
			<s:form id="update" name="update" action="" method="POST" theme="simple" class="jNice">
                <table width="98%" border="0" cellspacing="0" cellpadding="0" align="right">
                 <tr>
                   <td>
                    <div style="TEXT-ALIGN: center;width:100%; line-height:30px; COLOR: #235881; FONT-WEIGHT: bold;">
                    <s:date name="date[0]" format="yyyy-MM-dd" /> 至 <s:date name="date[6]" format="yyyy-MM-dd" />会议室使用情况
                   </div>
                   <div style="width:100%;height:100%;overflow:auto;overflow-x:hidden;">
                                <%MeetingRoomAction modl=new MeetingRoomAction(); %>
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="table11" class="biaodan">
                                        <tr align="center" height="35px">
                                            <td width="15%" class="ziduan" style="TEXT-ALIGN: center;">会议室</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周一</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周二</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周三</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周四</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周五</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周六</td>
                                            <td width="12%" class="ziduan" style="TEXT-ALIGN: center;">周日</td>
                                        </tr>
                                        <s:iterator value="list_WeekMeeting" id="meetingWeek" status="index">
                                        <tr>
                                            <s:if test="#index.index==0">
                                                <s:iterator value="#meetingWeek" id="meetingRoomName" status="nameIndex">
                                                    <s:if test="#nameIndex.index==0">
                                                        <td width="10%" align="left" >${meetingRoomName}&nbsp;</td>
                                                    </s:if>
                                                    <s:else>
                                                        <td align="left" >${meetingRoomName}&nbsp;</td>
                                                    </s:else>
                                                </s:iterator>
                                            </s:if>
                                            <s:else>
                                                <s:iterator value="#meetingWeek" id="meetingRoomName" status="nameIndex">
                                                    <td width="10%" align="left" >${meetingRoomName}&nbsp;</td>
                                                </s:iterator>
                                            </s:else>
                                        </tr>
                                        </s:iterator>
                                    </table>
                                  </div>
                                </TD>
                                <TD width="20%"  align="left" valign="top">
                                <div align="center">
                                <table width="185px" border="0" cellspacing="0" cellpadding="0" align="center"><tr><td width="50" align="center"><img src="../../images/s_dzrl.gif"/></td>
                                <td><font  style="line-height:30px; COLOR: #235881; FONT-WEIGHT: bold;">电子日历</font></td></tr></table>
                                 <div id="div1"></div>
                                </div>
                                </TD>
                            </tr>
                    </TABLE>
                </s:form>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
        $("#new").click(function(e) {
            openNew("publicinformation/Meetingservice_detailsLoad.action?flag=0","会议室申请");
        });
    });
    var ls_start='<s:date name="date[0]" format="yyyy-MM-dd"/>';
    window.onload=function rili(){
        //var userid=document.getElementById("userId").value;
        //alert(userid);
        WdatePicker({eCont:'div1',disabledDays:[0,2,3,4,5,6],startDate:ls_start,onpicked:function(dp){
            window.location.href = "MeetingRoom_Week.action?workDate="+dp.cal.getDateStr();
        }});
    }
</SCRIPT>
</html>
