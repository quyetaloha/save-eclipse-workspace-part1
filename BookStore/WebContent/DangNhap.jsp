<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!--  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="background-color: #E0F8F7">
<form action="DangNhap" method="post">
 <div align="center">
 	 <h1>Đăng Nhập</h1>
	 <table>
	 <tr>
	 <td>Account</td>
	 <td><input type="text" name="account"></td>
	 <td rowspan=2>
	 <button style="height: 48px" type="submit">Đăng Nhập</button>
	 </td>
	 </tr>
	 <tr>
	 <td>Password</td>
	 <td><input type="password" name="password"></td>
	 </tr>
	 
	 </table>
</div>
</form>
</body>
</html>
-->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<style>
<!--
	body {
	  margin: 0;
	  padding: 0;
	  background-color: #17a2b8;
	  height: 100vh;
	}
	#login .container #login-row #login-column #login-box {
	  margin-top: 120px;
	  max-width: 600px;
	  height: 320px;
	  border: 1px solid #9C9C9C;
	  background-color: #EAEAEA;
	}
	#login .container #login-row #login-column #login-box #login-form {
	  padding: 20px;
	}
	#login .container #login-row #login-column #login-box #login-form #register-link {
	  margin-top: -85px;
	 
	}
	
-->
</style>

<body>
    <div id="login">
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="DangNhap" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Username:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="text" name="password" id="password" class="form-control">
                            </div>
                            <div style="vertical-align: middle;" class="form-group">
                               
                                <input style="margin-left: 95px;"  type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                            </div>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
