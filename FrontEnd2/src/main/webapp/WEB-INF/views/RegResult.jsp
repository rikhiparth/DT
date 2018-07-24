<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/RegResultPage.css" />">
<title>RegResult</title>
</head>
<body>
<%@include file="Navigation.jsp"%>
	<div class="container">
		<div class="success">
		     <h1 style="background-color:yellow;"><b>Your process has been processed!</b></h1>
		     <h1 style="background-color:yellow;"><b>Click below or on top navigation bar to login!!!</b></h1>
		     <br>
		     <center>
		     <form action="${pageContext.request.contextPath}/login">
		     <h2><input type="submit" value="Login" class="btn btn-primary btn-sm" style="width: 70px; height: 35px;"></h2>
		     </form>
		     </center>
		</div>
    </div>
<br><br><br><br>    
<%@include file="footer.jsp"%>		     
</body>
</html>