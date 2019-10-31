<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="background-color: #E0F8F7">
<% 
try{
	
	session.getAttribute("currentSessionUser");
	out.println("<span>ban da dang nhap</span>"
	+"<div align='center'><a href='CapNhatSach.jsp' ><button style='width: 150px;height: 50px'>Cập nhật sách</button></a>"
	+"</div><div align='center' style='padding-top: 5px'>"+
	"<a href='ThemSach.jsp'><button style='width: 150px;height: 50px'>Thêm Sách</button></a></div>"
	+"<div align=center style='padding-top: 3px'>"
	+"<a><button id ='bt' style='width: 80px;height: 30px'>"
	+"Logout</button></a>"
	+"</div>"		
			
			);	
}

catch(Exception e){
	out.println("<span>ban chua dang nhap</span>");
	
}
%>
<!-- 	<div align="center">
		<a href="CapNhatSach.jsp" ><button style="width: 150px;height: 50px">Cập nhật sách</button></a>
	</div>
	<div align="center" style="padding-top: 5px">
		<a href="ThemSach.jsp"><button style="width: 150px;height: 50px">Thêm Sách</button></a>
	</div>
	<div align=center style="padding-top: 3px">
		<a href="DangNhap.jsp"><button style="width: 80px;height: 30px">Logout</button></a>
	</div> -->
<script type="text/javascript">
var btn=document.getelementbyID('#bt');
btn.onclick(<% session.invalidate();%>)
</script>
</body>
</html>