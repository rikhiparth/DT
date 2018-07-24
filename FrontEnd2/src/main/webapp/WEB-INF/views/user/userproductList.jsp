<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>Products</title>
</head>
<body>

<%@include file="usernavbar.jsp"%>
   <div class="container" style="width: 1145px; margin-bottom: 180px;">
			<h1 align="center" style="background-color:yellow;"><font color="purple"><b><u>LIST OF PRODUCTS</u></b></font></h1>
			<br><br>
			<table class="table table-hover" id="productList">
			  <thead>
			   <tr>
			      <th>Product Id</th>
			      <th>Product Name</th>
			      <th>Product Price</th>
			      <th>Product Quantity</th>
			      <th>Description</th>
			      <th>Category</th>
			      <th>Supplier</th>
			     
			      <th>View / Add To Cart
			   </tr>         
			  </thead> 
			  <tbody>
			     <c:forEach var="prod" items="${productlist}" >
					<tr>
					  <td>${prod.productid}</td>
					  <td>${prod.productname}</td>
					  <td>${prod.productprice}</td>
					  <td>${prod.productqty}</td>
					  <td>${prod.productdetails}</td>
					  <td>${prod.categoryid.categoryName}</td>
					  <td>${prod.supplierid.suppliername}</td>
					  <td>
					    <c:url value="/userviewproduct/${prod.productid}" var="view"></c:url>
					    <a href="${view}" class="btn btn-info"
							role="button"> <span class="glyphicon glyphicon-info-sign"></span></a>
						
						<c:url value="/user/addProductToCartItem/${prod.productid}" var="add"></c:url>
						<a href="${add}" role="button" class="btn btn-primary" style="margin-left: 5px"> 
						<span class="glyphicon glyphicon-shopping-cart"></span></a>					
					    </td>
					</tr>
			     </c:forEach>	
			  </tbody>
			</table>
   </div>
<br><br><br><br> 
<%@include file="footer.jsp"%>

</body>
</html>