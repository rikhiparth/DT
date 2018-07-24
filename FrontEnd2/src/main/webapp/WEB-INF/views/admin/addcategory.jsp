<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Add Category</title>
</head>
<body>
<%@include file="adminnavbar.jsp"%>
   <div class="container-fluid bg-2 text-center">
      <h1 align="center" style="background-color:yellow;"><b><font color="blue"><u>ADD CATEGORY FORM</u></font></b></h1>
   </div>
   <br><br>
   
   <script>
   
   function validateForm() {
	    var x1 = document.forms["myForm"]["categoryId"].value;
	    var x2 = document.forms["myForm"]["categoryName"].value;
	    
	    if (x1 == "") {
	        alert("Category id cannot be empty!!!");
	        return false;
	    }
	            
	    if (x2 == "") {
		    alert("Category name cannot be empty!!!");
		    return false;
		}
   }  
	
  </script>
  
  <c:url value="/addcategoryprocess" var="url"></c:url>	    
  <form id="add" name="myForm" modelattribute="admin" action="${url}" onsubmit="return validateForm()" method="post">

  <br><br><br><br>
      
      <table align="center" style="background-color:lightblue;">
  	       <tr>
  	         <td>        
    	       <label for="categoryId"><b><font size="5">Category Id:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter category id..." name="categoryId" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="categoryName"><b><font size="5">Category Name:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter category name..." name="categoryName" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	 </table>
    <br><br>
    <center>    
    <button type="submit" class="btn btn-lg btn-info">ADD</button>
    </center>	     
  </form>
  <br><br><br><br>
  <%@include file="footer.jsp"%>  
</body>
</html>