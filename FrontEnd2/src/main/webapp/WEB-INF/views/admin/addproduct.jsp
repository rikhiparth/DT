<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Add Product</title>
</head>
<body>
<%@include file="adminnavbar.jsp"%>
   <div class="container-fluid bg-2 text-center">
      <h1 align="center" style="background-color:yellow;"><b><font color="blue"><u>ADD PRODUCT FORM</u></font></b></h1>
   </div>
   <br><br>
   
   <center>
      <form action="${pageContext.request.contextPath}/admin/addcategory">
      <button type="submit" class="btn btn-lg btn-info">ADD PRODUCT CATEGORY</button>
      </form>
      <br>
      <form action="${pageContext.request.contextPath}/admin/addsupplier">
      <button type="submit" class="btn btn-lg btn-info">ADD PRODUCT SUPPLIER</button>
      </form>
      <br>
      <form action="${pageContext.request.contextPath}/getAllcategories">
      <button type="submit" class="btn btn-lg btn-info">CATEGORY LIST</button>
      </form>
      <br>
      <form action="${pageContext.request.contextPath}/getAllsuppliers">
      <button type="submit" class="btn btn-lg btn-info">SUPPLIER LIST</button>
      </form>
   </center>
   <br><br><br><br>
      
   <script>
   
   function validateForm() {
	    var x1 = document.forms["myForm"]["productid"].value;
	    var x2 = document.forms["myForm"]["productname"].value;
	    var x3 = document.forms["myForm"]["productdetails"].value;
	    var x4 = document.forms["myForm"]["productprice"].value;
	    var x5 = document.forms["myForm"]["productqty"].value;
	    var x6 = document.forms["myForm"]["supplierid"].value;
	    var x7 = document.forms["myForm"]["categoryid"].value;
	    
	    if (x1 == "") {
	        alert("Productid cannot be empty!!!");
	        return false;
	    }
	            
	    if (x2 == "") {
		    alert("Product name cannot be empty!!!");
		    return false;
		}
		if (x3 == "") {
			alert("Product details cannot be empty!!!");
			return false;
		}
		if (x4 == "") {
			alert("Product price cannot be empty!!!");
			return false;
		}
		if (x5 == "") {
			alert("Product qty cannot be empty!!!");
			return false;
		}
		if (x6 == "") {
			alert("Product supplier cannot be empty!!!");
			return false;
		}
		if (x7 == "") {
			alert("Product category cannot be empty!!!");
			return false;
		}
  }
   
   </script>
   
   <c:url value="/addproductprocess" var="url"></c:url>
   <form id="add" name="myForm" modelattribute="product" action="${url}" onsubmit="return validateForm()" method="post">
      <div class="imgcontainer" align="center">
    	 <img src="${pageContext.request.contextPath}/resources/images/addproduct.png" alt="Avatar" class="avatar" style="width: 200px; height: 200px;">
      <br><br><br><br>
         
      <table align="center" style="background-color:lightblue;">
  	       <tr>
  	         <td>        
    	       <label for="productid"><b><font size="5">Product Id:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product id..." name="productid" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="productname"><b><font size="5">Product Name:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product name..." name="productname" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="productdetails"><b><font size="5">Product Description:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product details..." name="productdetails" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="productprice"><b><font size="5">Product Price:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product price..." name="productprice" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="productqty"><b><font size="5">Product Quantity:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product quantity..." name="productqty" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="categoryid"><b><font size="5">Category:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product category..." name="categoryid" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>
    	   <tr>
  	         <td>        
    	       <label for="supplierid"><b><font size="5">Supplier:</font></b></label>
    	     </td>  
    	     <td>
    	       <input type="text" placeholder="Enter product supplier..." name="supplierid" style="background-color:lightyellow;"/>
    	     </td>
    	   </tr>        
    </table>
    <br><br>
    <center>    
    <button type="submit" class="btn btn-lg btn-info">ADD</button>
    </center>	   
    </div>  
  </form>
  <br><br><br><br>
  <%@include file="footer.jsp"%>
</body>
</html>