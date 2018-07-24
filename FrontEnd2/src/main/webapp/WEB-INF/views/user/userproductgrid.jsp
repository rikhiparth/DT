<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Product Grid</title>
</head>
<body>

<%@include file="usernavbar.jsp"%>
	
		<div class="col-sm-4">
		   <img src="<c:url value="/resources/images/two.jpg"/>" style="width:400px; height:500px;">
		        <p>
					<b>Oppo A37</b>
				</p>
				<p>
					<ul>
						<li>Technology - GSM/HSPA/LTE</li>
						<li>Resolution - 720x1280 pixels</li>
						<li>OS - Android OS, v5.1(Lollipop)</li>
						<li>Price - 10,000.00</li>
					</ul>
				</p>
		</div>
		<div class="col-sm-4">
			<img src="<c:url value="/resources/images/seven.jpg"/>" style="width:400px; height:500px;">
			    <p>
					<b>Oppo A53</b>
				</p>
				<p>
					<ul>
						<li>Technology - GSM/HSPA/LTE</li>
						<li>Resolution - 720x1280 pixels</li>
						<li>OS - Android OS, v5.1(Lollipop)</li>
						<li>Price - 8,000.00</li>
					</ul>
				</p>
		</div>
		<div class="col-sm-4">
			<img src="<c:url value="/resources/images/five.jpg"/>" style="width:400px; height:500px;">
			   <p>
					<b>Oppo F1s</b>
				</p>
				<p>
					<ul>
						<li>Technology - GSM/HSPA/LTE</li>
						<li>Resolution - 720x1280 pixels</li>
						<li>OS - Android OS, v5.1(Lollipop)</li>
						<li>Price - 18,000.00</li>
					</ul>
				</p>
		</div>
  
<%@include file="footer.jsp"%>
</body>
</html>