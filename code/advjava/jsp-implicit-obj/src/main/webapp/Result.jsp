<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>

<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	String option = request.getParameter("opt");
	double ans = 0.0;
	double n1 = Double.parseDouble(num1);
	double n2 = Double.parseDouble(num2);
	
	switch(option) {
		case "+" : 
			ans = n1+n2;
		break;
		case "-" : 
			ans = n1-n2;
		break;
		case "/" : 
			ans = n1/n2;
		break;
		case "*" : 
			ans = n1*n2;
		break;
	}

%>
<h1> <%= n1 + " " + option + " " + n2 + " = " + ans%> </h1>


</body>
</html>