<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
        <title>CartItem</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="<c:url value='/static/images/icons/favicon.png'/>"/>
        <link href="<c:url value='/static/css/bootstrap.min.css'/>" rel="stylesheet">
        <link href="<c:url value='/static/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css" />
        <link href="<c:url value='/static/css/style.css" rel="stylesheet'/>">
        <link href="<c:url value='/static/fonts/antonio-exotic/stylesheet.css'/>" rel="stylesheet">
        <link rel="stylesheet" href="<c:url value='/static/css/lightbox.min.css'/>">
        <link href="<c:url value='/static/css/responsive.css'/>" rel="stylesheet">
        <script src="<c:url value='/static/js/jquery.min.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/static/js/bootstrap.min.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/static/js/lightbox-plus-jquery.min.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/static/js/instafeed.min.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/static/js/custom.js'/>" type="text/javascript"></script>
    </head>
<body>
	<jsp:include page="/view/giaodien/header.jsp"></jsp:include>
	<jsp:include page="/view/giaodien/banner.jsp"></jsp:include>
	<div>
		<h2>Giỏ hàng</h2>
		<table border="1">
			<tr>
				<th>STT</th>
				<th>Tên sản phẩm</th>
				<th>Số lượng</th>
				<th>Đơn giá</th>
				<th>Thành tiền</th>
				<th>Tùy chọn</th>
			</tr>
			<c:forEach items="${sessionScope.carts}" var="cartItem"
				varStatus="status">
				<tr>
					<c:url var="updateCartUrl" value="/update-cart" />
					<form action="${updateCartUrl}" method="post">
						<input type="hidden" value="${cartItem.idProduct}"
							name="idProduct" />
						<td>${status.count}</td>
						<td><a
							href="<c:url value='/chi-tiet-san-pham?idProduct=${cartItem.idProduct}'/>">${cartItem.nameProduct}</a></td>
						<td><input type="number" value="${cartItem.quantity}"
							name="quantity" /></td>
						<td>${cartItem.unitPrice}</td>
						<td>${cartItem.unitPrice * cartItem.quantity}</td>
						<td><a
							href="<c:url value='/remove-cart?idProduct=${cartItem.idProduct}'/>">Xoa</a>
							<button type="submit">Cap nhat</button></td>
					</form>
				</tr>
			</c:forEach>

			<c:if test="${empty sessionScope.carts}">
				<tr>
					<td colspan="6">Khong co san pham trong gio hang</td>
				</tr>
			</c:if>
		</table>
		<c:if test="${not empty sessionScope.carts}">
			<a href="<c:url value='/member/make-order'/>">Thanh toán</a>
		</c:if>
	</div>
	<jsp:include page="/view/giaodien/footer.jsp"></jsp:include>
</body>
</html>