<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>VIEW PRODUCT</title>
</head>
<body>
<%@include file="usernavbar.jsp"%>
   <div class="container-fluid bg-2 text-center">
      <h1 align="center" style="background-color:yellow;"><b><font color="blue"><u>DETAILS ABOUT THE PRODUCT</u></font></b></h1>
   </div>
   <br><br>
   <center>
   <img src="<c:url value="/resources/images/${product.productid}.jpg"/>" style="width:300px; height:400px; border: #00008B 4px solid;">
   </center>
   <br><br>
   <table align="center" style="background-color:lightblue;">
     <tr>
       <td><b><font size="5">Product Id:</font></b></td>
       <td><b><font size="5">${product.productid}</font></b></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Name:</font></b></td>
       <td><b><font size="5">${product.productname}</font></b></td>  
     </tr>
     <tr>
       <td><b><font size="5">Product Description:</font></b></td>
       <td><b><font size="5">${product.productdetails}</font></b></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Price:</font></b></td>
       <td><b><font size="5">${product.productprice}</font></b></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Quantity:</font></b></td>
       <td><b><font size="5">${product.productqty}</font></b></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Category:</font></b></td>
       <td><b><font size="5">${product.categoryid.categoryName}</font></b></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Supplier:</font></b></td>
       <td><b><font size="5">${product.supplierid.suppliername}</font></b></td>
     </tr>
   </table>
   
<br><br><br><br>

<%@include file="footer.jsp"%>
</body>
</html>