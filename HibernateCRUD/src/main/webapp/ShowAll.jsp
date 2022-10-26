<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.entity.*" %>
    <%@ page import="com.dao.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Page</title>

</head>
<body>
All Employees<br>
<%
Employee_Dao dao=new Employee_Dao();
List<Employee> EmpList=dao.showAllEmployees();
for(Employee emp:EmpList){ %>
Employee Id: <%=emp.getId() %> <br>
Employee Name: <%=emp.getName() %> <br>
Employee Number: <%=emp.getEmail() %><br>
-------------------------------------<br>
<!-- update form -->
<%} %>
<form action="EmployeeController" method="post">
<div id="update">
Update: <input type="checkbox" id="update"><br>
<select name="uid">
<%for(Employee emp:EmpList){ %>
<option value="<%=emp.getId()%>"><%=emp.getId() %></option>
<%} %>
</select><br>
Update Name: <input id="ename" type="text" name="ename"><br>
Update Email: <input id="enumberupdate" type="text" name="eEmail"><br>
<button type="submit" id="updateEmployee" name="updateEmployee"> Update</button> <br> <br>
</div>
<br><br>
</form>

<!-- deletion form -->
<form action="EmployeeController" method="post">
<div id="delete">
Delete<input type="checkbox" id="delete" ><br>
<select name="did">
<%for(Employee emp:EmpList){ %>
<option value="<%=emp.getId()%>"><%=emp.getId() %></option>
<%} %>
</select>
</div>
 <div><br>
 <button type="submit" id="deleteEmployee" name="deleteEmployee"> Delete </button>
 </div>
</form>
<!-- add Employee -->
<a href="EmpAdd.jsp">add new employee</a>
</body>
</html>