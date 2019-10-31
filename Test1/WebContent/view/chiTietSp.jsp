<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
        <title>Chi Tiết Sản Phẩm</title>
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
	<div>
		<div>
			<img alt="" src="${product.image}">
			<div>
				<p>Tên SP: ${product.nameProduct}</p>
				<p>Nhà SX: ${product.nhaSanXuat}</p>
				<p>Năm SX: ${product.namSanXuat}</p>
				<p>Thông Tin: ${product.thongTin}</p>
				<p>Giá: ${product.giaBan} VNĐ</p>
				<button><a href="<c:url value='/add-cart?idProduct=${product.idProduct}'/>">Thêm vào giỏ hàng</a></button>
			</div>
		</div>
	</div>
	<jsp:include page="/view/giaodien/footer.jsp"></jsp:include>
</body>
</html>