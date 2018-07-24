<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>EDIT PRODUCT</title>
</head>
<body>

<%@include file="adminnavbar.jsp"%>
  <div class="container-fluid bg-2 text-center">
      <h1 align="center" style="background-color:yellow;"><b><font color="blue"><u>UPDATE PRODUCT</u></font></b></h1>
   </div>
   <br><br>
   <c:url value="/editsave" var="url"></c:url>
   <form action="${url}" commandName="productObj" method="post">
   <table align="center" style="background-color:lightblue;">
     <tr>
       <td><b><font size="5">Product Id:</font></b></td>
       <td><input type="text" placeholder="Enter product id..." name="productid" style="background-color:lightyellow;"/></td>
     </tr>
     <tr>  
       <td><b><font size="5">Product Name:</font></b></td>
       <td><input type="text" placeholder="Enter product name..." name="productname" style="background-color:lightyellow;"/></td>
     </tr>
     <tr> 
       <td><b><font size="5">Product Description:</font></b></td>
       <td><input type="text" placeholder="Enter product details..." name="productdetails" style="background-color:lightyellow;"/></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Price:</font></b></td>
       <td><input type="text" placeholder="Enter product price..." name="productprice" style="background-color:lightyellow;"/></td>
     </tr>
     <tr>
       <td><b><font size="5">Product Quantity:</font></b></td>
       <td><input type="text" placeholder="Enter product quantity..." name="productqty" style="background-color:lightyellow;"/></td>
     </tr>
     <tr>
       <td><b><font size="5">Category:</font></b></td>
       <td><input type="text" placeholder="Enter product category..." name="categoryid" style="background-color:lightyellow;"/></td>
     </tr> 
     <tr>
       <td><b><font size="5">Supplier:</font></b></td>
       <td><input type="text" placeholder="Enter product supplier..." name="supplierid" style="background-color:lightyellow;"/></td>
     </tr>  
	</table>
	<br><br>
    <center>    
    <input type="submit" value="UPDATE" name="action" class="btn btn-lg btn-info">
    </center>
   </form> 
 <br><br><br><br>    
<%@include file="footer.jsp"%>
</body>
</html>