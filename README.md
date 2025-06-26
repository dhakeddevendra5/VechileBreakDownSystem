<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
 
</head>
<body>

  <h1>🚗 Vehicle Breakdown Management System (Spring Boot)</h1>

  <p>
    The <strong>Vehicle Breakdown Management System</strong> is a backend application that manages real-time breakdown assistance. Drivers can report vehicle issues, and the system assigns available mechanics based on proximity and availability.
  </p>

  <h2>📌 Features</h2>
  <ul>
    <li>User authentication (Driver & Mechanic roles)</li>
    <li>Report vehicle breakdown with live location</li>
    <li>Mechanic assignment based on proximity</li>
    <li>Status tracking of requests</li>
    <li>Admin dashboard for monitoring</li>
    <li>RESTful API architecture</li>
  </ul>

  <h2>🛠️ Tech Stack</h2>
  <table>
    <thead>
      <tr>
        <th>Technology</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
      <tr><td>Java</td><td>Programming Language</td></tr>
      <tr><td>Spring Boot</td><td>Backend Framework</td></tr>
      <tr><td>Spring Security</td><td>Role-based authentication</td></tr>
      <tr><td>JPA + Hibernate</td><td>ORM for database interaction</td></tr>
      <tr><td>PostgreSQL</td><td>Relational Database</td></tr>
      <tr><td>Lombok</td><td>Boilerplate code reduction</td></tr>
      <tr><td>Swagger</td><td>API documentation & testing</td></tr>
    </tbody>
  </table>

  <h2>📂 Folder Structure</h2>
  <div class="code-block">
<pre>
vehicle-breakdown-system/
├── src/
│   ├── main/
│   │   ├── java/com/yourcompany/vehiclebreakdown/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   ├── config/
│   │   │   └── VehicleBreakdownApplication.java
│   └── resources/
│       ├── application.properties
│       └── static/templates (if using frontend templating)
├── README.md
</pre>
  </div>

  <h2>🚀 Getting Started</h2>

  <h3>Prerequisites</h3>
  <ul>
    <li>Java 17+</li>
    <li>Maven</li>
    <li>PostgreSQL</li>
  </ul>

  <h3>Clone the Repository</h3>
  <div class="code-block"><code>git clone https://github.com/yourusername/vehicle-breakdown-system.git</code><br>
  <code>cd vehicle-breakdown-system</code></div>

  <h3>Configure Application</h3>
  <div class="code-block">
<pre>
# application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/vehicle_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_pass

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
</pre>
  </div>

  <h3>Run the Application</h3>
  <div class="code-block"><code>./mvnw spring-boot:run</code></div>

  <h3>API Documentation</h3>
  <p>
    Access the Swagger UI at: <a href="http://localhost:8080/dashboard">http://localhost:8080/dashboard</a>
  </p>

  <h2>📌 API Overview</h2>
  <table>
    <thead>
      <tr>
        <th>Endpoint</th>
        <th>Method</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
      <tr><td>/api/auth/register</td><td>POST</td><td>Register user (driver/mechanic)</td></tr>
      <tr><td>/api/auth/login</td><td>POST</td><td>Login and receive JWT token</td></tr>
      <tr><td>/api/breakdowns/report</td><td>POST</td><td>Report a vehicle breakdown</td></tr>
      <tr><td>/api/breakdowns/assign</td><td>POST</td><td>Assign mechanic to a breakdown</td></tr>
      <tr><td>/api/breakdowns/status</td><td>GET</td><td>Get current status of breakdown</td></tr>
    </tbody>
  </table>

  <h2>📸 Screenshots</h2>
  <p>Add your Postman or UI screenshots here.</p>

  <h2>🧑‍💻 Author</h2>
  <p><a href="https://github.com/yourusername">Devendra Dhaked</a></p>

  <h2>📝 License</h2>
  <p>This project is licensed under the MIT License - see the <code>LICENSE</code> file for details.</p>

</body>
</html>
