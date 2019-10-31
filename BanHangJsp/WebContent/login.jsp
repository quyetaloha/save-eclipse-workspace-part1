<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param.e!=null }">
		<p>Tai khoan hoc mat khau khong dung</p>
	</c:if>

	<form action="/user/listUser.jsp" method="post">
		<table>
			<tr>
				<td>
					Username:
				</td>
				<td>
					<input type="text" name="username">
				</td>
			</tr>
			<tr>
				<td>
					password:
				</td>
				<td>
					<input type="password" name="password">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Đăng nhập">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>