<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.app.Entity.Users" %>
<%@ page import="com.app.Entity.Breakdown" %>
<%@ page import="java.util.ArrayList" %>
<%
    Object userObj = session.getAttribute("users");
    List<Breakdown> breakdowns = (session.getAttribute("breakdowns") != null)
            ? (List<Breakdown>) session.getAttribute("breakdowns")
            : new ArrayList<>();
%>
<html>
<head>
    <title>User Dashboard</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/style1.css">
    <script src="<%= request.getContextPath() %>/script.js"></script>
</head>
<body>

<div class="container">
    <h1>Welcome, <%= (userObj != null) ? ((com.app.Entity.Users) userObj).getName() : "Guest" %>!</h1>
    <p>Email: <%= (userObj != null) ? ((com.app.Entity.Users) userObj).getEmail() : "N/A" %></p>
    <p>Phone: <%= (userObj != null) ? ((com.app.Entity.Users) userObj).getNumber() : "N/A" %></p>

    <div class="form-section">
        <h3>Submit Breakdown Request</h3>
        <form action="submitbreakdown" method="post" id="breakdownForm">
            <label for="location">Location:</label>
            <input type="text" id="location" name="location" required /><br>
            <label for="vehicleType">Vehicle Type:</label>
            <input type="text" id="vehicleType" name="vehicleType" required /><br>
            <label for="issue">Issue:</label>
            <input type="text" id="issue" name="issue" required /><br><br>
            <button type="submit" id="submitButton">Submit Request</button>
        </form>
    </div>

    <div class="table-section">
        <h3>Your Breakdown Requests</h3>
        <table border="1" id="breakdownTable">
            <thead>
            <tr>
                <th>Location</th>
                <th>Vehicle Type</th>
                <th>Issue</th>
                <th>Status</th>
            </tr>
            </thead>
            <tbody>
            <% if (breakdowns != null) {
                for (Breakdown breakdown : breakdowns) { %>
            <tr>
                <td><%= breakdown.getLocation() %></td>
                <td><%= breakdown.getVehicleType() %></td>
                <td><%= breakdown.getIssue() %></td>
                <td><%= breakdown.getStatus() %></td>
            </tr>
            <% }
            } else { %>
            <tr>
                <td colspan="4">No breakdown requests found.</td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </div>

    <div class="logout-section">
        <form action="logout" method="post">
            <button type="submit" class="logout-button">LOGOUT</button>
        </form>
    </div>
</div>

</body>
</html>