<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">
<title>CART LIST</title>
</head>
<body>
<%@include file="usernavbar.jsp"%>
   <div class="container" style="width: 1145px; margin-bottom: 180px;">
			<h1 align="center" style="background-color:yellow;"><font color="red"><b><u>LIST OF CARTITEMS</u></b></font></h1>
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
			      <th>+1 Quantity</th>
			      <th>-1 Quantity</th>
			      <th>Delete CartItem</th>
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
					  <td><a class="btn btn-primary" href="${pageContext.request.contextPath}/user/plusOneProductQuantity/${cartItem.getProduct().getProductid()}/${cartItem.getCartitemId()}">+</a></td>
					  <td><a class="btn btn-primary" href="${pageContext.request.contextPath}/user/minusOneProductQuantity/${cartItem.getProduct().getProductid()}/${cartItem.getCartitemId()}">-</a></td>
					  <td><c:url value="/deletecartitem/${cartItem.getCartitemId()}" var="delete"></c:url>
					  <a href="${delete}" class="btn btn-danger" style="margin-left: 5px"> <span
									class="glyphicon glyphicon-trash"></span></a>
					</tr> 
					<c:set var="cartItemCount"
						value="${cartItem.getCart().getCartItemCount()}" />
					<c:set var="grandTotal"
						value="${cartItem.getCart().getGrandTotal()}" />
						
				</c:forEach>	 
			</tbody>
		</table>	
			
		<br><br><br>
			<c:url value="/deleteAllcartitems" var="del"></c:url>
				<center>	
					<form action="${del}">
            			<button type="submit" class="btn btn-lg btn-info">REMOVE ALL CARTITEMS</button>
           			</form>
           		</center>	
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
		   <form action="${pageContext.request.contextPath}/user/usergetAllproducts">
             <button type="submit" class="btn btn-primary btn-sm" style="width: 200px; height: 50px;">CONTINUE SHOPPING</button>
           </form>
           <br><br>
           <form action="${pageContext.request.contextPath}/user/confirmdetails">
             <button type="submit" class="btn btn-primary btn-sm" style="width: 200px; height: 50px;">CHECKOUT</button>
           </form>
		</center>				 
	</div>
<br><br><br> 
<%@include file="footer.jsp"%>
		
</body>
</html>