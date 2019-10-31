<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sửa thành viên</title>

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
						<div class="panel-heading">Sửa thành viên</div>
						<div class="panel-body">
							<c:url value="/admin/member/edit" var="editMemberUrl"></c:url>
							<form action="${editMemberUrl }" method="post">
								<input type="hidden" name="idUser" value="${user.idUser}" /> <br>
								<input type="text" name="username" value="${user.username}" />  <br>
								<input type="text" name="password" value="${user.password}" />  <br>
								<input type="text" name="name" value="${user.name}" />  <br>
								<input type="text" name="add" value="${user.add}" />  <br>
								<input type="text" name="phone" value="${user.phone}" /> <br>
								<c:if test="${user.type==1}">
									<input type="radio" name="type" value="Admin" checked />Admin
									<input type="radio" name="type" value="Người dùng" />Người dùng
								</c:if>
								<c:if test="${user.type==0}">
									<input type="radio" name="type" value="Admin" />Admin
									<input type="radio" name="type" value="Người dùng" checked />Người dùng
								</c:if>
								<br><button type="submit">Sửa</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!--/.row-->


		</div>
		<!--/.main-->
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