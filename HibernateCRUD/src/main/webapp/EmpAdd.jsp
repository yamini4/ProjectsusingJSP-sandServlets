<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Adding</title>
</head>
<body>
<div id="add">
<h1>Add Employee</h1>
<form action="EmployeeController" method="get">
Employee Name: <input type="text" name="ename"><br>
Employee Email: <input type="email" name="eEmail"><br>
<input type="submit" name="addEmployee" value="Add">
</form>
</div>
<form action="EmployeeController" method="post">
<input type="submit" name="showEmployee" value="Show"> &nbsp; &nbsp;<br>
</form>
</body>
</html>