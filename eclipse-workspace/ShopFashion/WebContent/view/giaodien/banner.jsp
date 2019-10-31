<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>banner</title>
</head>
<body>
	 <div id="myCarousel1" class="carousel slide" data-ride="carousel"> 
                <!-- Indicators -->

                <ol class="carousel-indicators">
                    <li data-target="#myCarousel1" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel1" data-slide-to="1"></li>
                    <li data-target="#myCarousel1" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active"> <img src="<c:url value='/static/images/banner.png'/>" style="width:100%; height: 500px" alt="First slide">
                        <div class="carousel-caption">
                            <h1>Thời trang nữ<br>Sang trọng & Thanh lịch</h1>
                        </div>
                    </div>
                    <div class="item"> <img src="<c:url value='/static/images/banner2.png'/>" style="width:100%; height: 500px" alt="Second slide">
                        <div class="carousel-caption">
                            <h1>Thời trang nam<br> Lịch thiệp & Trẻ trung</h1>
                        </div>
                    </div>
                    <div class="item"> <img src="<c:url value='/static/images/banner3.png'/>" style="width:100%; height: 500px" alt="Third slide">
                        <div class="carousel-caption">
                            <h1>Thời trang bé<br> Xinh xắn & Đáng yêu</h1>
                        </div>
                    </div>

                </div>
                <a class="left carousel-control" href="#myCarousel1" data-slide="prev"> <img src="<c:url value='/static/images/icons/left-arrow.png'/>" onmouseover="this.src = '/ShopFashion/static/images/icons/left-arrow-hover.png'" onmouseout="this.src = '/ShopFashion/static/images/icons/left-arrow.png'" alt="left"></a>
                <a class="right carousel-control" href="#myCarousel1" data-slide="next"><img src="<c:url value='/static/images/icons/right-arrow.png'/>" onmouseover="this.src = '/ShopFashion/static/images/icons/right-arrow-hover.png'" onmouseout="this.src = '/ShopFashion/static/images/icons/right-arrow.png'" alt="left"></a>

            </div>
            <div class="clearfix"></div>

            <!--service block--->
            <section class="service-block">
                <div class="container">
                    <div class="row">
                        <div class="col-md-3 col-sm-3 col-xs-6 width-50">
                            <div class="service-details text-center">
                                <div class="service-image">
                                    <img style="width: 55px; height: 45px" alt="image" class="img-responsive" src="<c:url value='/static/images/icons/wifi1.png'/>">
                                </div>
                                <h4><a href="<c:url value='/product/san-pham-moi'/>">Sản phẩm mới</a></h4>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-3 col-xs-6 width-50">
                            <div class="service-details text-center">
                                <div class="service-image">
                                    <img style="width: 55px; height: 45px" alt="image" class="img-responsive" src="<c:url value='/static/images/icons/key1.png'/>">
                                </div>
                                <h4><a href="<c:url value='/product/san-pham-thinh-hanh'/>">Sản phẩm thịnh hành</a></h4>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-3 col-xs-6 mt-25">
                            <div class="service-details text-center">
                                <div class="service-image">
                                    <img style="width: 55px; height: 45px" alt="image" class="img-responsive" src="<c:url value='/static/images/icons/car.png'/>">
                                </div>
                                <h4><a href="<c:url value='/product/san-pham-noi-bat'/>">Sản phẩm nổi bật</a></h4>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-3 col-xs-6 mt-25">
                            <div class="service-details text-center">
                                <div class="service-image">
                                    <img style="width: 55px; height: 45px" alt="image" class="img-responsive" src="<c:url value='/static/images/icons/user1.png'/>">
                                </div>
                                <h4><a href="<c:url value='/product/phu-kien'/>">Phụ kiện thời trang</a></h4>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
             <!--gallery block--->
            <section class="gallery-block gallery-front">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img style="width: 268px; height: 281px" class="img-responsive" src="<c:url value='/static/images/room1.png'/>">
                                <div class="overlay">
                                    <p><a  href="<c:url value='/product/thoi-trang-nu'/>">Thời trang nữ</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img style="width: 268px; height: 281px" class="img-responsive" src="<c:url value='/static/images/room22.png'/>">
                                <div class="overlay">
                                    <p><a href="<c:url value='/product/thoi-trang-nam'/>">Thời trang nam</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img style="width: 268px; height: 281px" class="img-responsive" src="<c:url value='/static/images/room33.png'/>">
                                <div class="overlay">
                                    <p><a href="<c:url value='/product/thoi-trang-be'/>">Thời trang bé</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img style="width: 268px; height: 281px" class="img-responsive" src="<c:url value='/static/images/room44.png'/>">
                                <div class="overlay">
                                    <p><a href="<c:url value='/product/phu-kien'/>">Phụ kiện</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
</body>
</html>