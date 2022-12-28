<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scripting Tag Example</title>
</head>
<body>

<%
	int x =20;

	for(int i =1; i<=10 ; i++) {
		System.out.println(i);
	}
	
	dummy();
%>

<h1>Square : <%= x*x %> </h1>

<%!
	public void dummy() {
		System.out.println("This is the methods from JSP page");
	}

%>




</body>
</html>