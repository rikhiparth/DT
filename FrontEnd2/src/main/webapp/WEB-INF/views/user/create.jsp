<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Add Cart</title>
</head>
<body>

<%@include file="usernavbar.jsp"%>
	<br>
   <h1 align="center" style="background-color:yellow;"><font color="red"><b><u>CREATE CART</u></b></font></h1>
   <br><br>
   <center>
     <c:url value="/addcart" var="url"></c:url>
     <form id="back" name="myForm" modelAttribute="user" action="${url}" method="post">
       <button type="submit" class="btn btn-lg btn-info">ADD</button>
     </form>  
   </center>
<br><br><Br>   
<%@include file="footer.jsp"%>
</body>
</html>