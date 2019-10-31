<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Đăng ký</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="<c:url value='/resource/images/icons/favicon.ico'/>"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/vendor/bootstrap/css/bootstrap.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/fonts/iconic/css/material-design-iconic-font.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/vendor/animate/animate.css'/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/vendor/css-hamburgers/hamburgers.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/vendor/animsition/css/animsition.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/vendor/select2/select2.min.css'/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/vendor/daterangepicker/daterangepicker.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/css/util.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/resource/css/main.css'/>">
<!--===============================================================================================-->
</head>
<body>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('resource/images/bg-01.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				
				<c:url value="/dang-ky" var="dangKyUrl"></c:url>
				<form class="login100-form validate-form" action="${dangKyUrl}" method="post">
					<span class="login100-form-title p-b-49">
						Login
					</span>

					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Họ tên</span>
						<input class="input100" type="text" name="name" placeholder="Nhập họ tên">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Username</span>
						<input class="input100" type="text" name="username" placeholder="Nhập tên tài khoản">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="password" placeholder="Nhập mật khẩu">
						<span class="focus-input100" data-symbol="&#xf190;"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Nhập lại Password</span>
						<input class="input100" type="password" name="nlusername" placeholder="Nhập lại mật khẩu">
						<span class="focus-input100" data-symbol="&#xf190;"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Địa chỉ</span>
						<input class="input100" type="text" name="add" placeholder="Nhập địa chỉ">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Số ĐT</span>
						<input class="input100" type="text" name="phone" placeholder="Nhập số điện thoại">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
					
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" type="submit">
								Đăng ký
							</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>	
	
	
	<div>
		<c:url value="/dang-ky" var="dangKyUrl"></c:url>
		<form action="${dangKyUrl }" method="post">
			<input type="text" name="username" placeholder="Username:"/>
			<input type="password" name="password" placeholder="Password:"/>
			<input type="password" name="nlpassword" placeholder="Nhập lại password:"/>
			<input type="text" name="name" placeholder="Họ tên:"/>
			<input type="text" name="add" placeholder="Địa chỉ:"/>
			<input type="text" name="phone" placeholder="Số điện thoại:"/>
			<button type="submit">Đăng Ký</button> 
		</form>
	</div>
	
	
	
	
	
	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="<c:url value='/resource/vendor/jquery/jquery-3.2.1.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resource/vendor/animsition/js/animsition.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resource/vendor/bootstrap/js/popper.js'/>"></script>
	<script src="<c:url value='/resource/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resource/vendor/select2/select2.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resource/vendor/daterangepicker/moment.min.js'/>"></script>
	<script src="<c:url value='/resource/vendor/daterangepicker/daterangepicker.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resource/vendor/countdowntime/countdowntime.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resource/js/main.js'/>"></script>
</body>
</html>