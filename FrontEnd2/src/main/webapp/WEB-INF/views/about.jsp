<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

  <link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/about.css" />">

<title>ABOUT US PAGE</title>

</head>

<body>
	<%@include file="Navigation.jsp"%>
	<div class="container-fluid bg-2 text-center">
			<h1 style="background-color:orange;"><b><font color="darkblue">ShopIeasy a WorldWide E-Commerce Site</font></b></h1>
	</div>
	<br>
	<div class="container-fluid">
			<h2 align="center" style="background-color:yellow;"><b><font color="red">What Am I?</font></b></h2>
			<br>
			<div id="para"><p><font size="5" color="green">ShopIeasy's vision is to create India's most reliable and
				frictionless commerce ecosystem that creates life-changing
				experiences for buyers and sellers.</font></p>
			</div>
			<div id="para"><p><font size="5" color="green">We have always taken pride in our culture. There are some core
				values that have been inherent and are an integral part of our
				success story. These values are a pure reflection of what is
				important to us as a Team and Business..</font></p>
		    </div>
	</div>
	<br><br><br><br>
	<%@include file="footer.jsp"%>
</body>
</html>