<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu left</title>
</head>
<body>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li class="active"><a href="index.html"><span class="glyphicon glyphicon-dashboard"></span> Dashboard</a></li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-list-alt"></span> Tables <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="<c:url value='/admin/member/list'/>">
							<span class="glyphicon glyphicon-share-alt"></span> Người dùng
						</a>
					</li>
					<li>
						<a class="" href="<c:url value='/admin/product/list'/>">
							<span class="glyphicon glyphicon-share-alt"></span> Sản phẩm
						</a>
					</li>
					<li>
						<a class="" href="<c:url value='/admin/danh-muc/list'/>">
							<span class="glyphicon glyphicon-share-alt"></span> Danh mục
						</a>
					</li>
					<li>
						<a class="" href="#">
							<span class="glyphicon glyphicon-share-alt"></span> Order
						</a>
					</li>
				</ul>
			</li>
			<li><a href="#"><span class="glyphicon glyphicon-th"></span> Widgets</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-stats"></span> Charts</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span> Tables</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-pencil"></span> Forms</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-info-sign"></span> Alerts &amp; Panels</a></li>
			<li role="presentation" class="divider"></li>
			<li><a href="login.html"><span class="glyphicon glyphicon-user"></span> Login Page</a></li>
		</ul>
	</div><!--/.sidebar-->
</body>
</html>