
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
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
		 
		<script type="text/javascript" src="../../js/JwCommon.js"></script>

	</head>
	<body>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0" class="mid">
			<tr>

				<td align="left" valign="top">
					<table width="100%" height="10" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td></td>
						</tr>
					</table>
					
					<table width="100%" height="470" border="0" cellpadding="0"
						cellspacing="0" bgcolor="#FFFFFF">
						<tr>
							<td align="center" valign="top">
								<table width="100%" height="28" border="0" cellpadding="0"
									cellspacing="0" background="../../images/dqwz_bg.gif">
									<tr>
										<td width="40" align="center">
											<img src="../../images/dqwz_tb.gif" width="15" height="15" />
										</td>
										<td align="left" class="gray_12">
											当前位置：公文管理 &gt;&gt; 收文管理 &gt;&gt;
											<span class="blue_12">子栏目一</span>
										</td>
									</tr>
								</table>
								<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
									<tr>
										<td></td>
									</tr>
								</table>
							<form class="jNice">
									<table width="98%" border="0" cellspacing="0" cellpadding="6"
										style="border: #ccc 1px solid;">
										<tr>
											<td>
												
													<table width="100%" border="0" cellpadding="0"
														cellspacing="0" class="content">
														<tr>
															<td width="7%" align="right">
																模块名称：
															</td>
															<td width="20%" align="left">
																<s:textfield id="moduleNameS" name="moduleNameS"
																	theme="simple" maxlength="50" />
															</td>
																														<td width="1%"></td>
															<td align="left">
																<img src="../../images/an_search.gif" width="67"
																	height="26" />
															</td>
														</tr>
													</table>
												
											</td>
										</tr>
									</table>
									<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
										<tr>
											<td></td>
										</tr>
									</table>
									<table width="98%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td align="left">
												<input id="new" type="submit" value="新 建" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="删 除" />
											</td>							
										</tr>
									</table>
									</form>
									<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
										<tr>
											<td></td>
										</tr>
									</table>
									<table width="98%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td>
											<ec:table retrieveRowsCallback="limit" sortRowsCallback="limit"
                        filterRowsCallback="limit" doPreload="false"
                        items="list_C_T_Sys_Module" var="pres" action="Module_listLoad"
                        batchUpdate="true" editable="false" sortable="true"
                        filterable="false"  useAjax="false"
                        xlsFileName="单位列表.xls" csvFileName="单位列表.csv"
                        pdfFileName="单位列表.pdf" width="100%" listWidth="100%"
                        toolbarContent="navigation|pagejump |export|extend|status"
                        style="table-layout:fixed;">
                        <ec:row recordKey="${pres.uuid}">
                            <ec:column property="rowcount" cell="rowCount" sortable="false"
                                filterOptions="false" title="序号" width="8%"  style="text-align:center"/>
                            <ec:column cell="checkbox" headerCell="checkbox"
                                alias="deleteFlag" value="${pres.uuid}" width="5%"
                                style="text-align:center" viewsAllowed="html" />
                            <ec:column property="sort" filterOptions="false" title="年份"
                                alias="SORT" width="8%"  style="text-align:center"/>
                            <ec:column property="moduleId" filterOptions="false" title="类别"
                                alias="MODULE_ID" width="20%"  style="text-align:center">
                                <a href="javascript:clickButton('${pres.uuid}')">${pres.moduleName}</a>
                            </ec:column>
                             <ec:column property="moduleId" filterOptions="false" title="安排"
                                alias="MODULE_ID" width="40%"  style="text-align:center">
                                <a href="javascript:clickButton('${pres.uuid}')">${pres.moduleName}</a>
                            </ec:column>
                        </ec:row>
                    </ec:table>
												</td>

										</tr>

									</table>
								
							</td>
						</tr>
					</table>
				
				</td>
<td width="10" class="mid"></td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">
	$(document).ready(function(){
		$("#new").bind("click", openNew("maintenance/Module_detailsLoad.action"));
	});
	
	
</SCRIPT>
</html>


