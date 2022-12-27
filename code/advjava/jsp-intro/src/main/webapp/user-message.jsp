<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Message</title>
</head>
<body>
<div align="center">
	<h2>User Message</h2>
	<form action="display.jsp">
		Enter User Name : <input type="text" name="uname">
		<br/><br/>
		Enter Message : <textarea rows="3" cols="20" name="msg"></textarea>
		<br/><br/>
		<button type="submit">Send</button>
	</form>
</div>


</body>
</html>