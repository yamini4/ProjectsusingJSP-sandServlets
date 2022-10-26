
<%@page import="com.student.dao.StudentDAO"%> 
<%@page import="com.student.pojo.*" %> 


<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Details of all students</h1>
<%
StudentDAO dao=new StudentDAO();
List<Student> list=dao.getAllStudents();
%>
<table border="1"> 
<tr><th>Student Id</th><th>Student Name</th><th>Student Email</th><th>Edit</th><th>Delete</th></tr>
<%for(Student ss:list){ %>
<tr><td><%=ss.getId() %></td><td><%=ss.getName() %></td><td><%=ss.getEmail()%></td><td><a href="edit.jsp?id=<%= ss.getId() %>">edit</a></td><td><a href="delete.jsp?id=<%= ss.getId() %>">delete</a></td></tr>
<%}%>
</table>


</body>
</html>

