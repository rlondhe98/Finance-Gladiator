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
		<th>Product Name</th>
		<th>Product Cost</th>
		<th>Link To Image</th>
	</tr>
	<c:forEach items = "${requestScope.productList}" var="product">
	<tr>
		<td>${product.productId}</td> <%-- <%= employee.getEmpId() %> --%>
		<td>${product.productName}</td> <%--<%= employee.getFirstName() %>--%>
		<td>${product.productCost}</td>
		<td>${product.productImageLink}</td>
		<td><a href="productDetails.hr?id=${product.productId}" id="id">Details</a></td>
	</tr>
	</c:forEach>

</table>
<br><a href="home.hr">Home</a>
</body>
</html>