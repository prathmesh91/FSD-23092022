<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

<div  align="center">
<h1>User Login</h1>

<%
	String c = request.getParameter("code");
	String message = "";
	if(c != null) {
		switch(c) {
			case "-1":
				message = "Invalid User Name or Password";
				break;
		}
	}

%>

<h2 style="color: red"><%= message %></h2>

<form action="auth-user" method="post">
	Enter User Email : <input type="text" name="uname">
	<br/><br/>
	Enter Password : <input type="password" name="upass">
	<br/><br/>
	<button type="submit">Login</button>
</form>

</div>


</body>
</html>