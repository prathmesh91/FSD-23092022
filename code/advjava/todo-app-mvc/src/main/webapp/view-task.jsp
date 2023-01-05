<%@page import="java.util.ArrayList"%>
<%@page import="com.todo.dto.TaskBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div align="center">
	<h1>All Task List</h1>
	<% 
		ArrayList<TaskBean> list = (ArrayList<TaskBean>) request.getAttribute("tasklist");
	%>	
	<table border="2">
		<thead>
			<tr>
				<th>Title</th>
				<th>Status</th>
				<th>Scheduled Date</th>
				<th>Updated Date</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<% for(TaskBean b : list) { %>
				<tr>
					<td><%=b.getTitle()%></td>
					<td><%=b.getStatus()%></td>
					<td><%=b.getScheduledOn()%></td>
					<td><%=b.getUpdatedOn()%></td>
					<td>
						<a href="#?id=<%=b.getId()%>">Edit</a> /
						<a href="#?id=<%=b.getId()%>">Delete</a>
					</td>
				</tr>
			<% } %>
		</tbody>
	</table>
	
</div>


</body>
</html>