<%@ page contentType="text/html;charset=GBK"%>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title> </title>
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
		<style>
.navPoint {
	COLOR: white;
	CURSOR: hand;
	FONT-FAMILY: Webdings;
	FONT-SIZE: 9pt
}
</style>
		<link href="../css/css.css" rel="stylesheet" type="text/css" />
	</head>

	<body style="overflow: hidden">
		<table width="100%" height="100%" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="9" width=9 valign="middle" class="mid" onclick=switchSysBar();>
					<SPAN class=navPoint id=switchPoint ><img
							src="../images/toleft.gif" name="img1" width=9 height=52 id=img1 alt=¹Ø±Õ/´ò¿ª×óÀ¸>
					</SPAN>
				</td>
			</tr>
		</table>
	</body>
	<script>
	function switchSysBar() {
		  if (parent.mainFrame.cols=="0,9,*,9"){
             parent.mainFrame.cols="179,9,*,9"
             document.all("img1").src = "../images/toleft.gif";
           }
        else{
            parent.mainFrame.cols="0,9,*,9"
           	document.all("img1").src = "../images/toright.gif";
          }
		
	}
</script>
</html>
