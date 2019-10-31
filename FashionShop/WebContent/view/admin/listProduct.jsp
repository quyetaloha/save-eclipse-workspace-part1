<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách sản phẩm</title>
<link href="<c:url value='/admin/css/bootstrap.min.css'/>"
	rel="stylesheet">
<link href="<c:url value='/admin/css/datepicker3.css'/>"
	rel="stylesheet">
<link href="<c:url value='/admin/css/styles.css'/>" rel="stylesheet">
</head>
<body>
	<jsp:include page="/view/admin/giaodien/header.jsp"></jsp:include>
	<jsp:include page="/view/admin/giaodien/menuLeft.jsp"></jsp:include>
	<div>
		<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
			<div class="row">
				<ol class="breadcrumb">
					<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
					<li class="active">Product</li>
				</ol>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Product</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Danh sách sản phẩm</div>
						<div class="panel-body">
							<c:url value="/admin/product/add" var="addProductUrl"></c:url>
							<a href="${addProductUrl }">Thêm</a>
							<table border="1">
								<tr>
									<th>ID</th>
									<th>Tên sản phẩm</th>
									<th>Link Image</th>
									<th>Giá Mua</th>
									<th>Giá Bán</th>
									<th>Nhà sản xuất</th>
									<th>Năm sản xuất</th>
									<th>Thông tin</th>
									<th colspan="3">Tùy chọn</th>
								</tr>
								<c:forEach items="${listProduct}" var="p">
									<tr>
										<td>${p.idProduct}</td>
										<td>${p.nameProduct}</td>
										<td>${p.image}</td>
										<td>${p.giaMua}</td>
										<td>${p.giaBan}</td>
										<td>${p.nhaSanXuat}</td>
										<td>${p.namSanXuat}</td>
										<td>${p.thongTin}</td>
										<td><c:url
												value="/admin/product/listDanhMuc?idProduct=${p.idProduct }"
												var="listDanhMucUrl"></c:url><a href="${listDanhMucUrl }">Xem
												Danh Mục</a></td>
										<td><c:url
												value="/admin/product/edit?idProduct=${p.idProduct }"
												var="editProductUrl"></c:url><a href="${editProductUrl }">Sửa</a></td>
										<td><c:url
												value="/admin/product/delete?idProduct=${p.idProduct }"
												var="deleteProductUrl"></c:url><a
											href="${deleteProductUrl }">Xóa</a></td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/view/admin/giaodien/footer.jsp"></jsp:include>
	<jsp:include page="/view/admin/giaodien/footer.jsp"></jsp:include>
	<script src="<c:url value='/admin/js/jquery-1.11.1.min.js'/>"></script>
	<script src="<c:url value='/admin/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/admin/js/chart.min.js'/>"></script>
	<script src="<c:url value='/admin/js/chart-data.js'/>"></script>
	<script src="<c:url value='/admin/js/easypiechart.js'/>"></script>
	<script src="<c:url value='/admin/js/easypiechart-data.js'/>"></script>
	<script src="<c:url value='/admin/js/bootstrap-datepicker.js'/>"></script>
	<script>
		$('#calendar').datepicker({});
		!function($) {
			$(document)
					.on(
							"click",
							"ul.nav li.parent > a > span.icon",
							function() {
								$(this).find('em:first').toggleClass(
										"glyphicon-minus");
							});
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function() {
			if ($(window).width() > 768)
				$('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function() {
			if ($(window).width() <= 767)
				$('#sidebar-collapse').collapse('hide')
		})
	</script>
</body>
</html>