<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="2" style="align-content: center;">
		<tr>
			<th>Product Id</th>
			<td>${requestScope.product.productId}</td>
		</tr>
		<tr>
			<th>Product Name</th>
			<td>${requestScope.product.productName}</td>
		</tr>
		<tr>
			<th>Product Cost</th>
			<td>${requestScope.product.productCost}</td>
		</tr>
		<tr>
			<th>Link To Image</th>
			<td>${requestScope.product.productImageLink}</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="addToCart.hr?id=${ requestScope.product.productId}">
					<button style="width:100%;">Add To Cart</button>
				</a>
			</td>
		</tr>			
	</table>
	<form action="viewCart.hr">
UserId:<br>
<input type="text" name="userId"><br>
<input type="submit" value="View Cart">
</form>
<br><a href="home.hr">Home</a>
</body>
</html>