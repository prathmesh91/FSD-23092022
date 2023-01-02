<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<%
	int id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	String email = (String) request.getAttribute("email");
%>

<div align="center">
	<h1>User, <%= name %> </h1>
</div>
<hr>
<div align="center">
	<h2>Email : <%= email %> </h2>
</div>
</body>
</html>