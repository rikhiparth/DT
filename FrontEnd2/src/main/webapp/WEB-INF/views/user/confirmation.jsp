<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>FINAL CONFIRM</title>
</head>
<body>
<%@include file="usernavbar.jsp"%>
<div class="container" style="width: 1145px; margin-bottom: 180px;">
			<h1 align="center" style="background-color:yellow;"><font color="purple"><b><u>CONFIRM PAYMENT AND SHIPMENT</u></b></font></h1>
			<br><br>
			<table class="table table-hover" id="cartList">
			  <thead>
			   <tr>
			      <th>Product Id</th>
			      <th>Product Name</th>
			      <th>Product Price</th>
			      <th>Description</th>
			      <th>Category</th>
			      <th>Supplier</th>
			   </tr>
			 </thead>     
			 <tbody>
			     <c:forEach var="cartItem" items="${cartitems}" >
					<tr>
					  <td>${cartItem.getProduct().getProductid()}</td>
					  <td>${cartItem.getProduct().getProductname()}</td>
					  <td>${cartItem.getProduct().getProductprice()}</td>
					  <td>${cartItem.getProduct().getProductdetails()}</td>
					  <td>${cartItem.getProduct().getCategoryid().getCategoryName()}</td>
					  <td>${cartItem.getProduct().getSupplierid().getSuppliername()}</td>
					</tr> 
					<c:set var="cartItemCount"
						value="${cartItem.getCart().getCartItemCount()}" />
					<c:set var="grandTotal"
						value="${cartItem.getCart().getGrandTotal()}" />
				</c:forEach>	 
			</tbody>
		</table>	
		<br><br><br>
		<table class="table table-hover">
			<thead>
				<tr>
				   <th>Shipping Address</th>
				   <th>City</th>
				   <th>State</th>
				   <th>Zipcode</th>
				</tr>  
			</thead>
			<tbody>
			     <c:forEach var="cartItem" items="${cartitems}" >
					<tr> 
					  <td>${cartItem.getCart().getUser().getShipment().getAddress()}</td>
					  <td>${cartItem.getCart().getUser().getShipment().getCity()}</td>
					  <td>${cartItem.getCart().getUser().getShipment().getState()}</td>
					  <td>${cartItem.getCart().getUser().getShipment().getZipcode()}</td>	
					</tr>
				</c:forEach>
			</tbody>				
		</table>
        <br><br><br>   		
			
			<center>
					<c:if test="${cartItemCount > 0}">
						<font size="5" color="green"><b><u>Total Product Counting</u>: ${cartItemCount}</b></font>
						<br><br>
						<font size="5" color="green"><b><u>Grand Total</u>: &#8377;&nbsp;${grandTotal}/-</b></font>
					</c:if>
			</center>	
			
		<br><br><br>
		
		<center>
		   <form action="${pageContext.request.contextPath}/user/thank">
             <button type="submit" class="btn btn-primary btn-sm" style="width: 200px; height: 50px;">CONFIRM</button>
           </form>	
        </center>   			 
	</div>
<br><br><br> 
<%@include file="footer.jsp"%>
</body>
</html>