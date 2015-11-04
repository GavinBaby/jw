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
	<body onload="tableRowsAdd('table11',0)">
	   <div style='width:800px;overflow:scroll'>
		<table width="100%" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<s:if test='flag==0'>
	                        <td width="40" align="center">
                                <img src="../../images/dqwz_tb.gif" width="15" height="15" />
                            </td>
                            <td align="left" class="gray_12">
                                                                                                     当前环节：
                                <s:property value="curTacheName" />
                            </td>
		                    </s:if>
		                    <s:elseif test='flag==1'>
		                        <jtag:jlevel moduleId="module14020000"></jtag:jlevel>
		                    </s:elseif>
		                    <s:elseif test='flag==2'>
		                        <jtag:jlevel moduleId="module14030000"></jtag:jlevel>
		                    </s:elseif>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="publicinformation/Meetingservice_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="flag" name="flag"></s:hidden>
						<s:hidden id="uuid" name="b_T_Flow_Meetingservice.uuid"></s:hidden>
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="status" name="b_T_Flow_Meetingservice.status"></s:hidden>
						<s:hidden id="registrant" name="b_T_Flow_Meetingservice.registrant"></s:hidden>
						<s:hidden id="jsonResult" name="jsonResult"></s:hidden>
                        <s:hidden id="curTacheId" name="curTacheId"></s:hidden>
                        <s:hidden id="nextTacheInfo" name="nextTacheInfo"></s:hidden>
                        <s:hidden id="allPermission" name="allPermission"></s:hidden>
                        <s:hidden id="moduleId" name="moduleId"></s:hidden>
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
						<s:hidden id="isFinished" name="isFinished"></s:hidden>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
								    <jtag:jbutton id="save" value="保 存"
                                        editCondition="%{allPermission}" />
                                    <s:if test="curTacheId=='tache0001'">
									<jtag:jbutton id="next" value="提 交"
										editCondition="%{allPermission}" />
									</s:if>
									<jtag:jbutton id="reser" value="受 理"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="cancel" value="取 消"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="back" value="返 回" editCondition="*" />
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
								<td width="14%" class="ziduan">
									申&nbsp;请&nbsp;人：
								</td>
								<td width="45%">
									<jtag:jtl id="applicantperson" name="b_T_Flow_Meetingservice.applicantperson"
										editCondition="%{allPermission}" maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="14%" class="ziduan">
									预定日期：
								</td>
								<TD width="25%" align="left">
									<jtag:jtl id="applicanttime" name="b_T_Flow_Meetingservice.applicanttime"
										editCondition="#" maxlength="50" cssStyle="width:90%"></jtag:jtl>
								</TD>
							</tr>
							<tr>
								<td width="14%" class="ziduan">
									会务人数：
								</td>
								<td width="45%">
								    <jtag:jtl id="reservationnum" name="b_T_Flow_Meetingservice.reservationnum"
                                        editCondition="%{allPermission}" maxlength="50" cssStyle="width:98%"></jtag:jtl>
								</td>
								<td width="14%" class="ziduan">
									手机号码：
								</td>
								<td width="25%">
									<jtag:jtl id="contact" name="b_T_Flow_Meetingservice.contact"
                                        editCondition="%{allPermission}" maxlength="50" cssStyle="width:98%"></jtag:jtl>
								</td>
							</tr>
							<tr>
                                <td width="14%" class="ziduan">
                                                                                                 会务起止时间：
                                </td>
                                <td width="45%" >
                                    <jtag:jtl id="starttime" name="b_T_Flow_Meetingservice.starttime" theme="simple"
                                        maxlength="50" cssStyle="width:45%;" cssClass="wdate" editCondition="%{allPermission}"
                                        onclick="WdatePicker({minDate:'#F{$dp.$D(\\'endtime\\',{H:-%H})}',maxDate:'#F{$dp.$D(\\'endtime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd HH:mm'})" />至
                                    <jtag:jtl id="endtime" name="b_T_Flow_Meetingservice.endtime" theme="simple"
                                        maxlength="50" cssStyle="width:45%;" cssClass="wdate" editCondition="%{allPermission}"
                                        onclick="WdatePicker({minDate:'#F{$dp.$D(\\'starttime\\')}',maxDate:'#F{$dp.$D(\\'starttime\\',{H:23-%H})}',readOnly:true,dateFmt:'yyyy-MM-dd HH:mm'})" />
                                </td>
                                <td width="14%" class="ziduan">
                                                                                                申请部门：
                                </td>
                                <td width="25%">
                                    <jtag:jtl id="deptname" name="b_T_Flow_Meetingservice.deptname"
                                        editCondition="#" maxlength="50" cssStyle="width:90%"></jtag:jtl>
                                </td>
                            </tr>
                            <tr>
                                <td width="14%" class="ziduan">
                                                                                                 横幅名称：
                                </td>
                                <td width="85%" colspan="3">
                                    <jtag:jtl id="meetingtitle" name="b_T_Flow_Meetingservice.meetingtitle"
                                        editCondition="%{allPermission}" maxlength="200" cssStyle="width:90%"></jtag:jtl>
                                </td>
                            </tr>
							<tr>
								<td width="14%" class="ziduan">
									意向会议室：
								</td>
								<TD width="85%" colspan="3" align="left" style="vertical-align:middle;">
									<s:hidden id="meetingroomId" name="b_T_Flow_Meetingservice.meetingroomId" />
                                    <jtag:jtl id="meetingroomName"
                                        name="b_T_Flow_Meetingservice.meetingroomName" cssStyle="width:86%;vertical-align:middle;"
                                        editCondition="%{allPermission}" readonly="true" ></jtag:jtl>
                                    <jtag:jbutton id="idselect" value="选择" editCondition="%{allPermission}" />	
							</tr>
							<tr>
								<TD width="14%" align="center" class="ziduan">
									会场设备：
								</TD>
								<TD width="85%" colspan="3" align="left">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" id="table11" class="biaodan">
	                                <s:hidden name="b_T_Flow_Meetingservice.meetingdemand" id="SelectEqips" />
	                                <s:hidden name="index" id="index1" />
	                                        <tr align="center" >
	                                            <td width="45%"><p align="center">设备名称</p></td>
	                                            <td width="32%"><p align="center">需求数量</p></td>
	                                            <td width="21%">
												<jtag:jbutton id="equipselect" value="选 择"
													editCondition="%{allPermission}"/>
												&nbsp;</td>
	                                        </tr>
	                                </table>
								</TD>
							</tr>
							<tr>
								<td width="14%" class="ziduan">
									特殊要求：
								</td>
								<td width="85%" colspan="3" align="left">
								    <jtag:jtal id="specialrequire"
                                        name="b_T_Flow_Meetingservice.specialrequire"
                                        editCondition="%{allPermission}"
                                        cssStyle="width:98%;height:60" cols="100" />
								</td>
							</tr>
							<tr>
                                <td width="14%" class="ziduan">
                                                                                                备&nbsp;&nbsp;&nbsp;&nbsp;注：
                                </td>
                                <td width="85%" colspan="3" align="left">
                                    <jtag:jtal id="remark"
                                        name="b_T_Flow_Meetingservice.remark"
                                        editCondition="%{allPermission}"
                                        cssStyle="width:98%;height:60" cols="100" />
                                </td>
                            </tr>
						</table>
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
		</div>
	</body>
	<SCRIPT type="text/javascript">
	function start(){
		var starttime = $("#starttime").val();
		var start = 0
		if(starttime!=""){
			start = starttime.substr(11,12);
		    return starttime.substr(11,12);
		}else{
			return start;
		}
	}
	function end(){
        var endtime = $("#endtime").val();
        var end = 0;
        if(endtime!=""){
            end = endtime.substr(11,12);
            return endtime.substr(11,12);
        }else{
        	return end;
        }
    }
	$(function() {
		$("#equipselect").click(function(e) {
			MeetingEqipsSelect('table11')
        });
		$("#save").click(function(e) {
			if($("#flag").val()!=1&&$("#flag").val()!=2){
			    $("#flag").attr("value",0);
			}
			update();
		});
		$("#reser").click(function(e) {
			$("#flag").attr("value",1);
            var returnIsValid = $('#update').form('validate');
            if (returnIsValid == false) {
                return false;
            }
            openNew("workflowengine/NextLoad.action?moduleId=" + $("#moduleId").val()
                    + "&mainDocId=" + $("#mainDocId").val(), "流程选项", 650, 320);
		           
		});
		$("#cancel").click(function(e) {
			$("#flag").attr("value",2);
            var returnIsValid = $('#update').form('validate');
            if (returnIsValid == false) {
                return false;
            }
            openNew("workflowengine/NextLoad.action?moduleId=" + $("#moduleId").val()
                    + "&mainDocId=" + $("#mainDocId").val(), "流程选项", 650, 320);
		});
		flowButInit($("#moduleId").val(),$("#mainDocId").val(),"update");
		function update() {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid == false) {
				return false;
			}
			var params = $("#update").serialize();
			lockBox();
			jQuery
					.ajax( {
						url : "publicinformation/Meetingservice_detailsUpdate_ajax.action",
						type : "POST",
						data : params,
						dataType : "json",
						success : callback
					});
		}
		function callback(data) {
		    ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
            closeBox();
        }); 
		$('#contact').validatebox( {
            validType : "mobile"
        });
		$('#title,#reservationnum,#contact,#starttime,#endtime,#meetingroomName').validatebox( {
			required : true
		});
		$("#idselect").click(function(e) {
			var starttime = jQuery("#starttime").val();
			var endtime = jQuery("#endtime").val();
	        var meetingserviceId = jQuery("#uuid").val();
	        if(starttime==""){
	            alert("请先选择会务开始时间！");
	        }else if(endtime==""){
                alert("请先选择会务结束时间！");
            }else{
	            openNew("publicinformation/MeetingRoom_Select.action?parUId=meetingroomId&parUName=meetingroomName&meetingserviceId="+meetingserviceId+"&starttime="+starttime+"&endtime="+endtime,"会议室选择");
	        }
		});
	});

	var total;
    var slen = 0;
    
    var index1=document.getElementById("index1");
    var tr=document.getElementById("table11").getElementsByTagName("tr");
    index1.value=tr.length-1;
    
    function MeetingEqipsSelect(tableId,obj) {
        var SelectEqips = jQuery("#SelectEqips").attr("value");
        openNew("publicinformation/MeetingEquipments_Select.action?SelectEqips="
                        + encodeURI(encodeURI(SelectEqips)), "会议设备选择");
    }
    function tableRowsAdd(tableId, obj) {
        deleteAllRows("table11");
        total = 0;
        slen = 0;
        var goods = document.getElementById("SelectEqips").value;
        if (goods != "") {
            var goodlist = goods.split('@');
            var goodinfo = "";

            for ( var i = 0; i < goodlist.length; i++) {

                if (goodlist[i] != "") {
                    addResumeRowLast(goodlist[i], tableId, slen, goodlist.length,
                            obj);
                }
            }
        }
    }
    function addResumeRowLast(goods, tableId, ind, len, obj) {

        var initTR = document.getElementById(tableId).getElementsByTagName("tr");
        var posrow = initTR.length;
        if (obj == 1) {
            addPrintRow(goods, document.getElementById(tableId), posrow, ind, len);
        } else {
            addResumeRow(goods, document.getElementById(tableId), posrow, ind, len);
        }
    }

    function addResumeRow(goods, tableId, rowindex, ind, len) {

        var goods = goods.split(',');
        var index = document.getElementById("index");
        var newRow = tableId.insertRow(rowindex);

        var strings = "<p class=MsoNormal align=center style='text-align:center'><span "
            + "style='font-size:12.0pt;font-family:楷体_GB2312'>";
        var str = "</span></p>";
        
        var newCell = newRow.insertCell();
        newCell.innerHTML = strings+goods[1]
                + '&nbsp;<input type="hidden" name="list_B_V_Ufp_Meeting_Equipuse['
                + index.value + '].equipmentId" value="' + goods[0] + '">'+str;


        var newCell = newRow.insertCell();
        newCell.innerHTML = strings+goods[2]
                + '&nbsp;<input type="hidden"  name="list_B_V_Ufp_Meeting_Equipuse['
                + index.value + '].equipmentNum" value=' + goods[2] + '>'+str;

        var newCell = newRow.insertCell();
        newCell.innerHTML = "&nbsp";

        index.value++;
    }
    function addPrintRow(goods, tableId, rowindex, ind, len) {

        var goods = goods.split(',');
        var index = document.getElementById("index");
        var newRow = tableId.insertRow(rowindex);    

        var strings = "<p class=MsoNormal align=center style='text-align:center'><span "
                + "style='font-size:9.0pt;font-family:楷体_GB2312'>";
        var str = "</span></p>";
        var newCell = newRow.insertCell();
        newCell.innerHTML = strings + goods[1] + str;

        
        var newCell = newRow.insertCell();
        newCell.innerHTML = strings + goods[2] + str;

        var newCell = newRow.insertCell();
        newCell.innerHTML = "&nbsp";

        index.value++;
        
    }
    function IsNullToInt(obj) {
        var re = 0;
        if (obj == null || obj == "" || isNaN(obj))
            return false;
        else {
            re = parseInt(obj);
        }
        return re;
    }
    function IsNullToFloat(obj) {
        var re = 0;
        if (obj == null || obj == "" || isNaN(obj))
            return false;
        else {
            re = parseFloat(obj);
        }
        return re;
    }
    // 制保留2位小数，如：2，会在2后面补上00.即2.00
    function toDecimal2(x) {
        var f = parseFloat(x);
        if (isNaN(f)) {
            return '';
        }
        var f = Math.round(x * 100) / 100;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 2) {
            s += '0';
        }
        return s;
    }
    function deleteAllRows(obj) {// 删除table除表头的行
        var table = document.getElementById(obj);
        var len = table.rows.length;
        for ( var i = 1; i < len && len > 0; i++) {
            table.deleteRow(1);
        }
    }

	
</SCRIPT>
</html>