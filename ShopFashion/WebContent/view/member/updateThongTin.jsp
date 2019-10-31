<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update thông tin</title>
</head>
<body>
	<jsp:include page="/view/giaodien/header.jsp"></jsp:include>
	<jsp:include page="/view/giaodien/banner.jsp"></jsp:include>
	<div>
		<c:url value="/member/update-thong-tin" var="updateThongTinUrl"></c:url>
		<form action="${updateThongTinUrl }" method="post">
			<input type="text" name="name" value="${user.name }"/>
			<input type="password" name="password1" placeholder="Nhập mật khẩu cũ"/>
			<input type="password" name="password2" placeholder="Nhập mật khẩu mới"/>
			<input type="password" name="password3" placeholder="Nhập lại mật khẩu"/>
			<input type="text" name="add" value="${user.add }"/>
			<input type="text" name="phone" value="${user.phone }"/>
			<button type="submit">Update</button>
		</form>
	</div>
	<jsp:include page="/view/giaodien/footer.jsp"></jsp:include>
</body>
</html>