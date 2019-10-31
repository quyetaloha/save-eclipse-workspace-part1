<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Danh sách thành viên</title>
<link href="<c:url value='/admin/css/bootstrap.min.css'/>"
	rel="stylesheet">
<link href="<c:url value='/admin/css/datepicker3.css'/>"
	rel="stylesheet">
<link href="<c:url value='/admin/css/styles.css'/>" rel="stylesheet">
</head>
<body>
	<jsp:include page="/view/admin/giaodien/header.jsp"></jsp:include>
	<jsp:include page="/view/admin/giaodien/menuLeft.jsp"></jsp:include>
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li class="active">Member</li>
			</ol>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Member</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Danh sách thành viên</div>
					<div class="panel-body">
						<c:url value="/admin/member/add" var="addMemberUrl"></c:url>
						<a href="${addMemberUrl }">Thêm</a>
						<table data-toggle="table" data-show-refresh="true"
							data-show-toggle="true" data-show-columns="true"
							data-search="true" data-select-item-name="toolbar1"
							data-pagination="true" data-sort-name="name"
							data-sort-order="desc" border="1">
							<thead>
								<tr style="background: blue; color: white;">
									<th>ID</th>
									<th>Tên tài khoản</th>
									<th>Mật khẩu</th>
									<th>Họ tên</th>
									<th>Địa chỉ</th>
									<th>Số điện thoại</th>
									<th>Loại</th>
									<th>Sửa</th>
									<th>Xóa</th>
								</tr>
								<c:forEach items="${dsMember }" var="u">
									<tr>
										<td>${u.idUser }</td>
										<td>${u.username }</td>
										<td>${u.password }</td>
										<td>${u.name}</td>
										<td>${u.add}</td>
										<td>${u.phone}</td>
										<td>${u.type}</td>
										<td><c:url value="/admin/member/edit?idUser=${u.idUser }"
												var="editMemberUrl"></c:url><a href="${editMemberUrl }">Sửa</a></td>
										<td><c:url
												value="/admin/member/delete?idUser=${u.idUser }"
												var="deleteMemberUrl"></c:url><a href="${deleteMemberUrl }">Xóa</a></td>
									</tr>
								</c:forEach>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
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