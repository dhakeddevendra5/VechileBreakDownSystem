<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vehicle Breakdown Support</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/style3.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
   
</head>
<body>
    <div class="container">
        <div class="welcome-box">
            <h1>Vehicle Breakdown Emergency Support</h1>
            <p>Your reliable partner in times of need.</p>
            <div class="action-buttons">
                <a href="<%= request.getContextPath() %>/user/register" class="register-btn">Register</a>
                <a href="<%= request.getContextPath() %>/user/login" class="login-btn">Login</a>
            </div>
        </div>
    </div>
</body>
</html>