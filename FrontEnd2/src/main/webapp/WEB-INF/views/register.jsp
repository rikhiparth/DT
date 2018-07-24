<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
  <link rel="stylesheet" href="<c:url value="/resources/css/register.css" />">
<title>Register</title>
</head>
<body>

<%@include file="Navigation.jsp"%>

   <div class="container-fluid bg-2 text-center">
			<h1 style="background-color:orange;"><b><font color="blue"><u>SIGN UP FORM</u></font></b></h1>
   </div>
   <br>
   
   <script>
   
   function validateForm() {
	    var x1 = document.forms["myForm"]["userId"].value;
	    var x2 = document.forms["myForm"]["emailId"].value;
	    var x3 = document.forms["myForm"]["contact"].value;
	    var x4 = document.forms["myForm"]["password"].value;
	    var x5 = document.forms["myForm"]["address"].value;
	    var x6 = document.forms["myForm"]["role"].value;
	    var x7 = document.forms["myForm"]["phoneno"].value;
	    
	    if (x1 == "") {
	        alert("UserId cannot be empty!!!");
	        return false;
	    }
	            
	    if (x2 == "") {
		    alert("EmailId cannot be empty!!!");
		    return false;
		}
		if (x3 == "") {
			alert("Contact name cannot be empty!!!");
			return false;
		}
		if (x4 == "") {
			alert("Password cannot be empty!!!");
			return false;
		}
		if (x5 == "") {
			alert("Address cannot be empty!!!");
			return false;
		}
		if (x6 == "") {
			alert("Role cannot be empty!!!");
			return false;
		}
		if (x7 == "") {
			alert("Phone no. cannot be empty!!!");
			return false;
		}
   }
   
   </script>
   
   <form name="myForm"  id="regForm" modelAttribute="user" action="RegisterProcess" onsubmit="return validateForm()" method="post">
         <div class="imgcontainer" align="center">
    	     <img src="${pageContext.request.contextPath}/resources/images/img_avatar2.png" alt="Avatar" class="avatar" style="width: 200px; height: 200px;">
  	     <br><br>
  	     <table align="center" style="background-color:lightblue;">    
    	   <tr>
  	         <td>
    	       <label for="userId"><b><font size="5">User Id:</font></b></label>
    	     </td>
    	     <td>  
    	       <input type="text" placeholder="Enter User Id..." name="userId" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>    
    	   <tr>
  	         <td>
    	       <label for="emailId"><b><font size="5">Email address:</font></b></label>
    	     </td>
    	     <td>  
    	       <input type="text" placeholder="Enter User email..." name="emailId" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>    
    	   <tr>
  	         <td>
    	       <label for="contact"><b><font size="5">Contact:</font></b></label>
    	     </td>
    	     <td>
    	       <input type="text" placeholder="Enter Contact name..." name="contact" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>  
    	   <tr>
  	         <td>
    	       <label for="password"><b><font size="5">Password:</font></b></label>
    	     </td>
    	     <td>  
    	       <input type="password" placeholder="Enter User Password..." name="password" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>   
    	   <tr>
  	         <td>
               <label for="address"><b><font size="5">Address:</font></b></label>
             </td>
             <td>  
    	       <input type="text" placeholder="Enter User address..." name="address" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr> 
    	   <tr>
  	         <td>        
    	       <label for="role"><b><font size="5">Role:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter User Role..." name="role" style="background-color:lightyellow;"/>
    	     </td>  
    	   </tr>  
    	   <tr>
  	         <td>        
    	       <label for="phoneno"><b><font size="5">Phone number:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter User Phone no ..." name="phoneno" style="background-color:lightyellow;"/>
    	     </td>  
    	   </tr>
    	   </table>
    	   <br><br>
    	     
    	   <input type="submit" value="Add" name="action" class="btn btn-lg btn-info" style="width: 70px; height: 50px;">   
    </div> 
   </form>
<br><br><br><br>   
<%@include file="footer.jsp"%>
</body>
</html>