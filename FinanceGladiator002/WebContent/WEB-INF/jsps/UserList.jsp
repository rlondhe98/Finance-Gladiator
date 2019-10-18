<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lti.fg.entities.User,java.util.*"%>
    
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
		<th>User Id</th>
		<th>User Name</th>
		<th>User Pass</th>
		<th>Email</th>
		<th>Contact</th>
		<th>Address</th>
		<th>Savings Account Number</th>
		<th>IFSC Code</th>
	</tr>
	<c:forEach items = "${requestScope.userList}" var="user">
	<tr>
		<td>${user.userId}</td> <%-- <%= employee.getEmpId() %> --%>
		<td>${user.userName}</td> <%--<%= employee.getFirstName() %>--%>
		<td>${user.userPassword}</td>
		<td>${user.userEmail}</td>
		<td>${user.userContactNumber}</td>
		<td>${user.userAddress}</td>
		<td>${user.userSavingsAccNumber}</td>
		<td>${user.bankIfscCode}</td>
	</tr>
	</c:forEach>

</table>
<br><a href="home.hr">Home</a>
</body>
</html>