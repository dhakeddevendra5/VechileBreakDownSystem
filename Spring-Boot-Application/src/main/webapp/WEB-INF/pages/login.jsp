<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--
    String errorMessage = (String) request.getAttribute("errorMessage"); // Remove this line
--%>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Login Page</title>
		<link rel="stylesheet" href="<%= request.getContextPath() %>/newStyle.css">
	</head>

	<body>
		<%-- Use EL to access the request attribute --%>
		<% if (request.getAttribute("errorMessage") != null) {%>
			<p style="color:red"><%= request.getAttribute("errorMessage") %></p>
		<% } %>

		<form action="login" method="post">
			<label>Email:</label>
			<input type="email" name="email" required><br>
			<label>Password:</label>
			<input type="password" name="password" required><br>
			<button type="Submit">Login</button><br>
			
			<p>Create a new account? <a href="<%= request.getContextPath() %>/user/register">register here</a></p>

		</form>

	</body>

</html>