<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Cart Condition</title>
</head>
<body>
<%@include file="usernavbar.jsp"%>
   <div class="container">
		<div class="success">
			<center>
			<h1 style="background-color:yellow;"><b>ALREADY IN CART</b></h1>
			</center>
			<br><br>
	
			<center>
			  <c:url value="/goback1" var="url"></c:url>
              <form id="back" name="myForm" modelAttribute="user" action="${url}" method="post">
                 <button type="submit" class="btn btn-lg btn-info">BACK</button>
   			  </form>  
   			</center>
		</div>
   </div>

<br><br><br><br> 
<%@include file="footer.jsp"%>
     
</body>
</html>