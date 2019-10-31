<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>
	<!---header top---->
	<div class="top-header">
		<div class="container">
			<div class="row">
				<div class="col-md-6"></div>
				<div class="col-md-6">
					<div class="social-grid">
						<ul class="list-unstyled text-right">
							<li><a><i class="fa fa-facebook"></i></a></li>
							<li><a><i class="fa fa-twitter"></i></a></li>
							<li><a><i class="fa fa-linkedin"></i></a></li>
							<li><a><i class="fa fa-instagram"></i></a></li>
							<c:if test="${sessionScope.user==null}">
									<li><a href="<c:url value='/login'/>">Đăng nhập</a></li>
									<li><a href="<c:url value='/dang-ky'/>">Đăng ký</a></li>
							</c:if>
							
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--header--->
	<header class="header-container">
		<div class="container">
			<div class="top-row">
				<div class="row">
					<div class="col-md-2 col-sm-6 col-xs-6">
						<div id="logo">
							<a href="<c:url value='/home-shop'/>"><span>Shop</span>Fashion</a>
						</div>
					</div>
					<div class="col-sm-6 visible-sm">
						<div class="text-right">
							<button type="button" class="book-now-btn">Book Now</button>
						</div>
					</div>
					<div class="col-md-8 col-sm-12 col-xs-12 remove-padd">
						<nav class="navbar navbar-default">
							<div class="navbar-header page-scroll">
								<button data-target=".navbar-ex1-collapse"
									data-toggle="collapse" class="navbar-toggle" type="button">
									<span class="sr-only">Toggle navigation</span> 
									<span class="icon-bar"></span> 
									<span class="icon-bar"></span> 
									<span class="icon-bar"></span>
								</button>

							</div>
							<div
								class="collapse navigation navbar-collapse navbar-ex1-collapse remove-space">
								<ul class="list-unstyled nav1 cl-effect-10">
									<li><a data-hover="Home" href="#"><span>Home</span></a></li>
									<li><a data-hover="Danh mục" href="#"><span>Danh Mục</span></a></li>
									<li><a data-hover="Tin tức" href="#"><span>Tin tức</span></a></li>
									<li><a  data-hover="About" href="#"><span>About</span></a></li>
								</ul>

							</div>
						</nav>
					</div>
					<div class="col-md-2  col-sm-4 col-xs-12 hidden-sm">
						<div class="text-right">
							<button type="button" class="book-now-btn">Book Now</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>


	<!--end-->
</body>
</html>