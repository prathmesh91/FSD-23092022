<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
</head>
<body>

<div align="center">
	<h2>Student Information</h2>
	<form action="save-info">
		Enter Name : <input type="text" name="name">
		<br/><br/>
		Enter Contact : <input type="text" name="contact">
		<br/><br/>
		Enter Email : <input type="text" name="email">
		<br/><br/>
		<button type="submit">Save</button>
	</form>
</div>

</body>
</html>