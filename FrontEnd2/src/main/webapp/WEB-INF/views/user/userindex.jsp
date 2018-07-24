<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Home Page</title>
</head>
<body>
  <%@include file="usernavbar.jsp"%>

     <div class="jumbotron">
		<div class="container">
			
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
					<li data-target="#myCarousel" data-slide-to="3"></li>
					<li data-target="#myCarousel" data-slide-to="4"></li>
				</ol>
				
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="<c:url value="/resources/images/oppo.jpg"/>" align="middle" alt="Image1" style="width:100%; height:300px;">
					</div>
					<div class="item">
						<img src="<c:url value="/resources/images/oppo1.jpg"/>" align="middle" alt="Image2" style="width:100%; height:300px;">
					</div>
					<div class="item">
						<img src="<c:url value="/resources/images/oppo2.jpg"/>" align="middle" alt="Image3" style="width:100%; height:300px;">
					</div>
					<div class="item">
						<img src="<c:url value="/resources/images/oppo3.jpg"/>" align="middle" alt="Image4" style="width:100%; height:300px;">
					</div>
					<div class="item">
						<img src="<c:url value="/resources/images/oppo4.jpg"/>" align="middle" alt="Image5" style="width:100%; height:300px;">
					</div>
                 </div>
                 <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> 
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				 </a> 
				 <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> 
				 <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				 <span class="sr-only">Next</span>
				 </a>
			</div> 
		</div>
	</div>
	<br>
	<div class="container text-center" id="product">
	<h1 style="background-color:yellow"><b><u>OUR PRODUCTS</u></b></h1>
	<br><br>
		<div class="col-sm-4">
			<img src="<c:url value="/resources/images/1.jpg"/>" style="width:400px; height:300px;">
		</div>
		<div class="col-sm-4">
			<img src="<c:url value="/resources/images/2.jpg"/>" style="width:200px; height:300px;">
		</div>
		<div class="col-sm-4">
			<img src="<c:url value="/resources/images/3.jpg"/>" style="width:300px; height:300px;">
		</div>
	</div>
	<br><br><br><br>
  <%@include file="footer.jsp"%>
</body>
</html>