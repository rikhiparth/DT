<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Shipment</title>
</head>
<body>
<%@include file="usernavbar.jsp"%>
   <div class="container-fluid bg-2 text-center">
      <h1 align="center" style="background-color:yellow;"><b><font color="blue"><u>SHIPMENT DETAILS</u></font></b></h1>
   </div>
   <br><br>
      
   <script>
   
   function validateForm() {
	    var x1 = document.forms["myForm"]["shippingAddressId"].value;
	    var x2 = document.forms["myForm"]["address"].value;
	    var x3 = document.forms["myForm"]["city"].value;
	    var x4 = document.forms["myForm"]["state"].value;
	    var x5 = document.forms["myForm"]["zipcode"].value;
	    var x6 = document.forms["myForm"]["country"].value;
	    
	    if (x1 == "") {
	        alert("Shipping Address id cannot be empty!!!");
	        return false;
	    }
	            
	    if (x2 == "") {
		    alert("Address cannot be empty!!!");
		    return false;
		}
		if (x3 == "") {
			alert("City name cannot be empty!!!");
			return false;
		}
		if (x4 == "") {
			alert("State name cannot be empty!!!");
			return false;
		}
		if (x5 == "") {
			alert("Zipcode cannot be empty!!!");
			return false;
		}
		if (x6 == "") {
			alert("Country name cannot be empty!!!");
			return false;
		}
  }
   
   </script>
   
   <c:url value="/addshipment" var="url"></c:url>
   <form id="add" name="myForm" modelattribute="product" action="${url}" onsubmit="return validateForm()" method="post">
         
      <table align="center" style="background-color:lightblue;">
  	       <tr>
  	         <td>        
    	       <label for="shippingAddressId"><b><font size="5">Shipping Address Id:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter shippingAddress id..." name="shippingAddressId" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="address"><b><font size="5">Address:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter your address..." name="address" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="city"><b><font size="5">City:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter city name..." name="city" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="state"><b><font size="5">State:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter State name..." name="state" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="zipcode"><b><font size="5">Zipcode:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter zipcode..." name="zipcode" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="country"><b><font size="5">Country:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter country name..." name="country" style="background-color:lightyellow;"/>
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