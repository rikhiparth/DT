<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>List of Users</title>
</head>
<body>

<%@include file="adminnavbar.jsp"%>
  <div class="container" style="width: 1145px; margin-bottom: 180px;">
			<h1 align="center" style="background-color:yellow;"><font color="purple"><b><u>LIST OF USERS</u></b></font></h1>
			<br><br>
			<table class="table table-hover" id="userlist">
			<thead>
			   <tr>
			     <th>User Id</th>
			     <th>Address</th>
			     <th>Contact name</th>
			     <th>Email Id</th>
			     <th>Password</th>
			     <th>Phone number</th>
			     <th>Role</th>
			     <th>DELETE USER</th>
			   </tr>
			</thead>
			<tbody>
			     <c:forEach var="user" items="${userlist}" >
			       <tr>
			         <td>${user.userId}</td>
			         <td>${user.address}</td>
			         <td>${user.contact}</td>
			         <td>${user.emailId}</td>
			         <td>${user.password}</td>
			         <td>${user.phoneno}</td>
			         <td>${user.role}</td>
			         <td>
			           <c:url value="/deleteuser/${user.userId}" var="delete"></c:url>
			           <a href="${delete}" class="btn btn-danger" style="margin-left: 5px"> <span
									class="glyphicon glyphicon-trash"></span></a>	
			         </td>
			      </tr>
			   </c:forEach>
			</tbody>
		</table>
   </div> 
<%@include file="footer.jsp"%>

</body>
</html>