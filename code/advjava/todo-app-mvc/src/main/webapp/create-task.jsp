<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div align="center"> 

<%
	String code = request.getParameter("c");
	String msg = "";
	String color="";
	if(code!=null) {
		switch(code) {
			case "1":
				msg = "Task Created Successfully...";
				color="green";
				break;
			case "-1":
				msg = "task Creation Fail...";
				color="red";
				break;
		}
	}
%>


	<h1>Create new task</h1>
	
	<h3 style="color: <%=color%>"><%= msg %></h3>
	
	<form action="add-task">
		Enter Title : <input name="title">
		<br><br>
		Select Status : <select name="status">
							<option value="open">Open</option>
							<option value="inprogress">InProgress</option>
							<option value="complete">Complete</option>
						</select>
		<br><br>
		Select Scheduled Date : <input type="date" name="scheduledDate">
		<br><br>
		<button type="submit">Create Task</button>
	</form>
</div>


</body>
</html>