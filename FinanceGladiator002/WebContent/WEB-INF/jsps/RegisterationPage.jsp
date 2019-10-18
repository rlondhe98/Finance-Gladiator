<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">New Registeration</h1>
	<div style="margin:auto; max-width :300px;border:solid; height:500px;">
		<form action="registerEmployee.hr" method="post">
		<table border = "0" cellpadding="16">
			<tr>
				<td><b>Employee Id </b></td>
				<td><input type="text" name="empid"></td>
			</tr>
			
			<tr>
				<td><b>First Name </b></td>
				<td><input type="text" name="fname"></td>
			</tr>
			
			<tr>
				<td><b>Last Name </b></td>
				<td><input type="text" name="lname"></td>
			</tr>
			
			<tr>
				<td><b>Email</b></td>
				<td><input type="email" name="email"></td>
			</tr>
			
			<tr>
				<td><b>Hire Date</b></td>
				<td><input type="date" name="date"></td>
			</tr>
			
			<tr>
				<td><b>Job Id</b> </td>
				<td><input type="text" name="jobId"></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="submit" name="empid" style="width:100%;"></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>