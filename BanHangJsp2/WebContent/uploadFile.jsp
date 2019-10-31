<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String url="";
	DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
	diskFileItemFactory.setRepository(new File("D:/eclipse-workspace/BanHangJsp/WebContent"));
	ServletFileUpload fileUpload=new ServletFileUpload(diskFileItemFactory);
	List<FileItem> fileItems=fileUpload.parseRequest(request);
	for(FileItem fileItem:fileItems){
		//kiem tra fileitem co phai o trong form khong?
		if(!fileItem.isFormField()){
			if(fileItem.getFieldName().equals("file")){
				File file=new File("D:/eclipse-workspace/BanHangJsp/WebContent/image/"+fileItem.getName());
				fileItem.write(file);
				url="/BanHangJsp/image/"+fileItem.getName();
			}
		}
	}
	
%>

	<img  src="<%=url%>">
</body>
</html>