<%@ page contentType="text/html;charset=GBK"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>OA系统</title>

</head>
<%
	String moduleId = request.getParameter("moduleId");
	if (moduleId==null) moduleId ="";
	if (moduleId.equals("")) moduleId="module01000000";
 %>
<frameset rows="101,*" cols="*" framespacing="0" frameborder="no" border="0" scrolling="no">
	<frame  id="top" name="top" src="TopMenuLoad.action"  scrolling="no" noresize="noresize" />
	<frameset  id="mainFrame" rows="*" cols="179,9,*,9" framespacing="0" frameborder="no" border="0">
		<frame  id="Tree" name="Tree" src="LeftmainLoad.action?moduleId=<%=moduleId %>" scrolling="no" noresize="noresize"/>
		<frame  id="Switch" name="Switch" src="switch.jsp"  scrolling="no" noresize="noresize"/>
		<frameset  id="rightFrame" rows="9,*,9" cols="*" framespacing="0" frameborder="no" border="0">
			<frame  id="leftTop" name=""leftTop"" src="leftTop.jsp"  scrolling="no" noresize="noresize"/>
			<frame  id="List" name="List" src=""  scrolling="no" noresize="noresize"/>
			<frame  id="leftBottom" name="leftBottom" src="leftBottom.jsp"  scrolling="no" noresize="noresize"/>
		</frameset>
		
		<frame  id="Right" name="Right" src="right.jsp" scrolling="no" noresize="noresize"/>
	</frameset>
</frameset>
<noframes>
浏览器不支持框架
</noframes>
</html>
