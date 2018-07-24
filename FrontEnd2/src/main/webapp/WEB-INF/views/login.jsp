<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
  <link  rel="stylesheet" href="<c:url value="/resources/css/register.css" />">
<title>Login</title>
</head>
<body>

<%@include file="Navigation.jsp"%>

	<div class="container-fluid bg-2 text-center">
			<h1 style="background-color:orange;"><b><font color="blue"><u>LOGIN FORM</u></font></b></h1>
	</div>		
    <br><br>
    
    <script>
    function validateForm() {
	    var x1 = document.forms["LoginForm"]["userid"].value;
	    var x2 = document.forms["LoginForm"]["psw"].value;
	    
	    if (x1 == "") {
	        alert("Userid cannot be empty!!!");
	        return false;
	    }
	            
	    if (x2 == "") {
		    alert("Password cannot be empty!!!");
		    return false;
		}
    }
	</script>
	    
    <div class="login-box">
    <form name="LoginForm" id="loginForm" modelAttribute="user" action="<c:url value="LoginProcess"/>" onsubmit="return validateForm()" method="post">
    	<div align="center">
    	  <div class="imgcontainer">
    	     <img src="${pageContext.request.contextPath}/resources/images/img_avatar2.png" alt="Avatar" class="avatar" style="width: 200px; height: 200px;">
  	      </div>
  	      <br><br>
  	      
  	      <div class="container" style="background-color:lightblue;">
  	         <font size="5">
  	         <label for="userid"><b>Userid: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label></font>
    	     <input type="text" placeholder="Enter Userid..." name="userid" style="background-color:lightyellow;"/>
    	     <br><br>
    	  
    	     <font size="5">
    	     <label for="psw"><b>Password:</b></label></font>    
             <input type="password" placeholder="Enter Password..." name="psw" style="background-color:lightyellow;"/>    
    	     <br>
    	  </div>
    	  <br>
    	   <input type="submit" value="Login" name="action" class="btn btn-primary btn-sm " style="width: 60px; height: 30px;">
           <br><br>
           
           <label>
             <input type="checkbox" name="remember"> Remember me
           </label>
         </div>  
    </form>
    </div>
    <br><br><br><br>
    <%@include file="footer.jsp"%>
</body>
</html>