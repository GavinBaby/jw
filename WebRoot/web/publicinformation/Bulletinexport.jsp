<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>

<%
    String strExpFileName = new String("查看情况".getBytes("GBk"), "8859_1");
    response.setHeader("Content-Disposition","attachment;filename="+strExpFileName+".doc");    
    response.setCharacterEncoding("GBK");              
%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>



<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>办公自动化系统</title>  
		<base target="_self">
		
			
		<style>
</style>
	</head>
<body>
        <center><h3>通知公告查看情况</h3></center>
        <!--返回保存按钮结束 -->
            <table width="100%" border="1" cellpadding="0" cellspacing="0" class="TableFrame">
              <tr valign="top">
                <td  align="left" valign="middle" width="100%" colspan="4">通知公告标题:<s:property value="rdtitle" /></td>
              </tr>
             <s:iterator value="list_B_T_Ufp_RoundReading" id="roundreading" status="index">
                <tr valign="top">
                  <td class="Tdcell" align="center" valign="middle" width="15%" >查看人</td>
                 
                  <td class="Tdcell" width="35%" ><s:property value="roundreadingPerson"/></td>
                  <td class="Tdcell" align="center" valign="middle" width="15%" >查看时间</td>
                 
                  <td class="Tdcell" width="35%" ><s:property value="createTime.substring(0,10)"/></td>
                </tr>
			  </s:iterator>
            </table>
 
</body>
	
</html>


