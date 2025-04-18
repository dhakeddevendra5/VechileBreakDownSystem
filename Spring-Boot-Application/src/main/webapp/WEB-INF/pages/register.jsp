<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String errorMessage = (String) request.getAttribute("errorMessage");
    String successMessage = (String) request.getAttribute("successMessage");
%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
	<link rel="stylesheet" href="<%= request.getContextPath() %>/newStyle.css">

</head>
<body>
    

    <% if (errorMessage != null) { %>
        <p style="color: red;"><%= errorMessage %></p>
    <% } %>

    <% if (successMessage != null) { %>
        <p style="color: green;"><%= successMessage %></p>
        <script>
            // Redirect to login page after 2 seconds
            setTimeout(function() {
                window.location.href = "<%= request.getContextPath() %>/login";
            }, 2000);
        </script>
    <% } %>

    <form action="<%= request.getContextPath() %>/user/register" method="post" id="Rpage">
		<h2>Register</h2>
        <label>Name:</label>
		<input type="text" name="name" required /><br>
		
        <label>Email:</label>
		<input type="email" name="email" required /><br>
        
		<label>Mobile:</label>
		<input type="text" name="number" required /><br>
        
		<label>Password:</label>
		<input type="password" name="password" required /><br>
        
		<label>Conform Password:</label>
		<input type="password" name="conformPassword" required /><br><br>
        <button type="Submit">Register</button><br>
		
		<p>Already have an account? <a href="<%= request.getContextPath() %>/user/login">Login here</a></p>

    </form>

</body>
</html>
