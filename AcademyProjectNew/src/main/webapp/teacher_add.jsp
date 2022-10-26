<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<h1>Add Teacher</h1>
<form action="TeacherServlet" method="get">
First Name:<input type="text" name="fname">
Last Name:<input type="text" name="lname">
Phone number:<input type="number" name="pnumber">
Address: <input type="text" name="address">
Designation:<input type="text" name="designation">
<input type="submit" name="AddTeacher" value="Add">
</form><br><br>

<a href="teacher_view.jsp">All Teachers</a>
</body>
</html>