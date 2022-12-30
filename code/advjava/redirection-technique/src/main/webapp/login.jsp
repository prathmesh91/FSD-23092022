<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

	<div align="center">
		<h1>User Login</h1>
		<form action="validate-user">
			Enter User Name : <input type="text" name="uname">
			<br/><br/>
			Enter Password : <input type="password" name="upass">
			<br/><br/>
			<button type="submit">Sign In</button>
		</form>
	</div>

</body>
</html>