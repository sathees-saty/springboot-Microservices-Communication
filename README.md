# springboot-Microservices-Communication

<html>
Created 3 microservices as below Architecture:
  <br>
  <img src="https://github.com/sathees-saty/springboot-Microservices-Communication/assets/65384711/fbbc2ad7-77d3-4600-af96-6e46cac72039" alt="springboot Microservices Communication" width="800" height="600">
<br>
Department Service
  <br>
server.port = 8081
  <br>
spring.datasource.url=jdbc:mysql://localhost:3306/department_db
<br>
  Role Service
  <br>
server.port = 8082
  <br>
spring.datasource.url=jdbc:mysql://localhost:3306/role_db
<br>
  User Service calls Role and Department service
  <br>
server.port = 8083
<br>
  spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
<br>
Added below dependcies in the services:
  <br>
    <img src="https://github.com/sathees-saty/springboot-Microservices-Communication/assets/65384711/5aad7d0b-dc50-407f-bd09-16460821a01d" alt="springboot" width="800" height="600">
<br>

</html>
