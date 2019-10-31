<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sửa sản phẩm</title>

<link href="<c:url value='/admin/css/bootstrap.min.css'/>"
	rel="stylesheet">
<link href="<c:url value='/admin/css/datepicker3.css'/>"
	rel="stylesheet">
<link href="<c:url value='/admin/css/styles.css'/>" rel="stylesheet">
</head>
<body>
	<jsp:include page="/view/admin/giaodien/header.jsp"></jsp:include>
	<jsp:include page="/view//admin/giaodien/menuLeft.jsp"></jsp:include>
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
						<div class="panel-heading">Sửa sản phẩm</div>
						<div class="panel-body">
							<c:url value="/admin/product/edit" var="editProductUrl"></c:url>
							<form action="${editProductUrl}" method="post" enctype="multipart/form-data">
								<input type="hidden" name="idProduct" value="${product.idProduct}" />  <br>
								<input type="text" name="nameProduct" value="${product.nameProduct}" />  <br>
								<label for="avatar">Chọn ảnh:</label> 
								<input type="file" name="fileImage" value=""/> <br>
								<input type="text" name="giaMua" value="${product.giaMua}" />  <br>
								<input type="text" name="giaBan" value="${product.giaBan}" /> <br>
								<p>Chi tiết sản phẩm</p>
								<input type="text" name="nhaSX" value="${product.nhaSanXuat}" /> <br>
								<input type="text" name="namSX" value="${product.namSanXuat}" /> <br>
								<input type="text" name="thongTin" value="${product.thongTin}" /> <br>
								<p>Danh mục sản phẩm</p>
								<c:forEach items="${product.listDanhMuc}" var="dm">
									<input type="checkbox" checked="checked">${dm.nameDanhMuc}
								</c:forEach>
								<p>List danh mục</p>
								<c:forEach items="${listDanhMuc}" var="listDm">
									<input type="checkbox" name="danhMuc" value="${listDm.idDanhMuc}">${listDm.nameDanhMuc} <br>
								</c:forEach>
								<br><button type="submit">Sửa</button>
							</form>
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