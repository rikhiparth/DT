<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>USER CONFIRMATION</title>
</head>
<body>
<%@include file="usernavbar.jsp"%>
   <div class="container" style="margin-bottom: 19px">
		<center><h1 class="well" style="background-color:yellow;"><b><font color="blue"><u>CONFIRM CUSTOMER DETAILS</u></font></b></h1></center>
		<div class="col-lg-12 well" style="background-color:#A3E4D7;">
			<div class="row">
			   <form modelAttribute="user">
			      <div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label for="userId">USER ID</label>
								<form:input type="text" class="form-control"
									path="user.userId" style="background-color:lightyellow;">${user.userId}</form:input>
							</div>
							<div class="col-sm-6 form-group">
								<label for="password">PASSWORD</label>
								<form:input type="text" class="form-control"
									path="user.password" style="background-color:lightyellow;">${user.password}</form:input>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<label for="contact">CONTACT</label>
								<form:input type="text" class="form-control"
									path="user.contact" style="background-color:lightyellow;">${user.contact}</form:input>
							</div>
							<div class="col-sm-6 form-group">
								<label for="emailId">EMAIL ID</label>
								<form:input type="text" class="form-control"
									path="user.emailId" style="background-color:lightyellow;">${user.emailId}</form:input>
							</div>
						</div>
						<div class="form-group">
							<label for="address">ADDRESS</label>
							<form:textarea type="text" class="form-control"
								path="user.address" style="background-color:lightyellow;">${user.address}</form:textarea>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<label for="phoneno">PHONE NO.</label>
								<form:input type="text" class="form-control"
									path="user.phoneno" style="background-color:lightyellow;">${user.phoneno}</form:input>
							</div>
							<div class="col-sm-6 form-group">
								<label for="role">ROLE</label>
								<form:input type="text" class="form-control"
									path="user.role" style="background-color:lightyellow;">${user.role}</form:input>
							</div>
						</div>
						<br>
						<center>
						    <c:url value="/user/addshipmentdetails" var="next"></c:url>
						    <c:url value="/user/userindex" var="ui"></c:url>
							<a href="${next}" style="margin-right: 44px; margin-left: 0px"><font size="5"><b><u>NEXT</u></b></font></a>
							<a href="${ui}" style="margin-right: 44px; margin-left: 0px" ><font size="5"><b><u>CANCEL</u></b></font></a>
						</center>
				</div>
			</form>
		</div>
	</div>
</div>		
<br><br><br> 
<%@include file="footer.jsp"%>
</body>
</html>