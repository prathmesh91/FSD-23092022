<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>
	<%
		String name = request.getParameter("uname");
	%>
	<div align="right">
		<h2>User Name, <%=name%> </h2>
	</div>
	<hr>
	<div align="center">
		<h1>Welcome User to Home Page</h1>
	</div>

</body>
</html>