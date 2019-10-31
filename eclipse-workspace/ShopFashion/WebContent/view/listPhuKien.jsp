<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
        <title>Phụ kiện thời trang</title>
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
		<section class="vacation-offer-block">
			<div class="vacation-offer-bgbanner">
				<div class="container">
					<div class="row">
						<div class="col-md-5 col-sm-6 col-xs-12">
							<div class="vacation-offer-details">
								<h1>Phụ kiện thời trang</h1>
								<button type="button" class="btn btn-default">Xem tất
									cả</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section class="resort-overview-block">
			<div class="container">
				<div id="san-pham">
					<ul>
						<c:forEach items="${listProduct}" var="p">
							<li>
								<img alt="" src="${p.image}" />
								<h3>${p.nameProduct}</h3>
								<div class="links"><a href="<c:url value='/chi-tiet-san-pham?idProduct=${p.idProduct}'/>">Chi tiết</a></div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</section>
	</div>
	<jsp:include page="/view/giaodien/footer.jsp"></jsp:include>
</body>
</html>