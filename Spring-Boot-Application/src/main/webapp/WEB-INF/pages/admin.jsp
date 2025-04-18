<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Admin Dashboard</title>
	<link rel="stylesheet" href="<%= request.getContextPath() %>/style2.css">

</head>
<body>
    <h2>Admin Dashboard - Breakdown Requests</h2>

    <table border="1">
        <thead>
            <tr>
                <th>User</th>
                <th>Location</th>
                <th>Vehicle Type</th>
                <th>Issue</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="breakdown" items="${breakdowns}">
                <tr>
                    <td>${breakdown.user.name}</td>
                    <td>${breakdown.location}</td>
                    <td>${breakdown.vehicleType}</td>
                    <td>${breakdown.issue}</td>
                    <td>${breakdown.status}</td>
                    <td>
						<form action="update-status/${breakdown.id}" method="post">
						    <select name="status">
						        <option value="Pending" <c:if test="${breakdown.status == 'Pending'}">selected</c:if>>Pending</option>
						        <option value="In Progress" <c:if test="${breakdown.status == 'In Progress'}">selected</c:if>>In Progress</option>
						        <option value="Resolved" <c:if test="${breakdown.status == 'Resolved'}">selected</c:if>>Resolved</option>
						    </select>
						    <button type="submit">Update</button>
						</form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>