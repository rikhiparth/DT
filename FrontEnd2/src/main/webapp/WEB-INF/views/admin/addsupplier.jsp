<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Add Supplier</title>
</head>
<body>
<%@include file="adminnavbar.jsp"%>
   <div class="container-fluid bg-2 text-center">
      <h1 align="center" style="background-color:yellow;"><b><font color="blue"><u>ADD SUPPLIER FORM</u></font></b></h1>
   </div>
   <br><br>
   
   <script>
   
   function validateForm() {
	    var x1 = document.forms["myForm"]["supplierid"].value;
	    var x2 = document.forms["myForm"]["suppliername"].value;
	    var x3 = document.forms["myForm"]["supplieremail"].value;
	    var x4 = document.forms["myForm"]["supplieraddr"].value;
	    
	    if (x1 == "") {
	        alert("Supplier id cannot be empty!!!");
	        return false;
	    }           
	    if (x2 == "") {
		    alert("Supplier name cannot be empty!!!");
		    return false;
		}
		if (x3 == "") {
			alert("Supplier email cannot be empty!!!");
			return false;
		}
		if (x4 == "") {
			alert("Supplier address cannot be empty!!!");
			return false;
		}
   }
   
   </script>
   
   <c:url value="/addsupplierprocess" var="url"></c:url>
   <form id="add" name="myForm" modelattribute="admin" action="${url}" onsubmit="return validateForm()" method="get">
   <table align="center" style="background-color:lightblue;">
  	       <tr>
  	         <td>        
    	       <label for="supplierid"><b><font size="5">Supplier Id:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter supplier id..." name="supplierid" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="suppliername"><b><font size="5">Supplier Name:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter supplier name..." name="suppliername" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="supplieremail"><b><font size="5">Supplier Email:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter supplier email..." name="supplieremail" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="supplieraddr"><b><font size="5">Supplier Address:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter supplier address..." name="supplieraddr" style="background-color:lightyellow;"/>
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