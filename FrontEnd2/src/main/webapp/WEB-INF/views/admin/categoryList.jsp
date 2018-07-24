<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>ADD CATEGORIES</title>
</head>
<body>

<%@include file="adminnavbar.jsp"%>
   <div class="container" style="width: 1145px; margin-bottom: 180px;">
			<h1 align="center" style="background-color:yellow;"><font color="blue"><b><u>LIST OF CATEGORIES</u></b></font></h1>
			<br><br>
			<center>
			<table class="table table-hover" id="categoryList" style="background-color:lightyellow;">
			  <thead>
			   <tr>
			      <th>Category Id</th>
			      <th>Category Name</th>
			      <th>DELETE</th>
			   </tr>
			  </thead>
			  <tbody>
			     <c:forEach var="catg" items="${categorylist}" >
					<tr>
					  <td>${catg.categoryId}</td>
					  <td>${catg.categoryName}</td>
					  <td>
					  <c:url value="/deletecategory/${catg.categoryId}" var="delete"></c:url>
					  <a href="${delete}" class="btn btn-danger" style="margin-left: 5px"> <span
									class="glyphicon glyphicon-trash"></span></a>
					  </td>
					</tr>
			     </c:forEach>	
			  </tbody>   	  
			</table>     
		</center>	
	</div>
<br><br><br><br> 
<%@include file="footer.jsp"%> 
			 
</body>
</html>