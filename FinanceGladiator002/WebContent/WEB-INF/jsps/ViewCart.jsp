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
		<th>Product Name</th>
		<th>Product Cost</th>
	</tr>
	<c:forEach items = "${requestScope.productList}" var="product">
		<tr>
		<td>${product.productName}</td>
		<td>${product.productCost}</td>
		</tr>
	</c:forEach>
	<tr>
	<th>Total Cost</th>
	<td><%=request.getAttribute("cartCost") %></td>
	</tr>
</table>
<br><a href="home.hr">Home</a>
</body>
</html>