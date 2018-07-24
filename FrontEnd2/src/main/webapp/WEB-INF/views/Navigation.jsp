<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Navigation</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="nav navbar">
			<img class="navbar-brand"
				src="<c:url value="/resources/images/shopieasy-logo.png"/>"
				href="<c:url value="/index"/>" style="width:200px; height:100px;"
				alt="logo-image">
				<br>
				<input type="text" placeholder="Search..." style="width: 650px; height: 35px;">
				<input type="submit" value="Search" class="btn btn-primary btn-sm " style="width: 70px; height: 35px;">
	</div>
    <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><font size="6">ShopIeasy</font></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
         <li><a href="${pageContext.request.contextPath}/index">HOME</a></li>
         <li><a href="${pageContext.request.contextPath}/about">ABOUT US</a></li>
         <li><a href="${pageContext.request.contextPath}/productgrid">PRODUCT GRID</a></li>
      </ul>   
      <ul class="nav navbar-nav navbar-right">
         <li><a href="${pageContext.request.contextPath}/myregister"><span class="glyphicon glyphicon-user"></span> SIGN UP</a></li>
         <li><a href="${pageContext.request.contextPath}/mylogin"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
      </ul>  
    </div>
  </div>
</nav>   
</body>
</html>