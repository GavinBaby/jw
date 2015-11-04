<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.io.*,com.jw.baseframe.util.FileTools"%>
<%
	String fileName=request.getParameter("fileName");
	int lastIndex = fileName.lastIndexOf("\\");
	String saveFileName = fileName.substring(lastIndex,fileName.length());  
	String up_file = this.getServletContext().getRealPath("/uploadFile")+"\\"+fileName.substring(0,lastIndex);
	FileTools.mkdirs(up_file);
	DiskFileItemFactory factory = new DiskFileItemFactory();
	factory.setSizeThreshold(4096);
	ServletFileUpload upload = new ServletFileUpload(factory);
	upload.setFileSizeMax(419430400);
	try{			
		List<?> fileItems = upload.parseRequest(request);
		Iterator<?> it = fileItems.iterator();
		while(it.hasNext()){
			FileItem item = (FileItem)it.next();
				if(!item.isFormField()){
						if(saveFileName != null) {
							item.write(new File(up_file+saveFileName));
						}
				}
		}
	}catch(Exception e){
		response.sendRedirect("../frame.jsp");
	}	
%>