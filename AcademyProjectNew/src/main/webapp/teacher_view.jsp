<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Teacher" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
table{
color:purple;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<a href="teacher_add.jsp">Add New Teacher</a><br><br>

<%TeacherDao  teacherDao=new TeacherDao();
List<Teacher> s=teacherDao.showAllTeachers();%>
<table border="1">
<tr>
<th>Id</th>
<th>Teacher First Name</th>
<th>Teacher Last Name</th>
<th>PhoneNumner</th>
<th>Address</th>
<th>Designation</th>
</tr>
<%for(Teacher s1:s){%>
<tr>
<td><%=s1.getTid() %></td>
<td><%=s1.getFirstName() %></td>
<td><%=s1.getLastName() %></td>
<td><%=s1.getPhoneNumber() %></td>
<td><%=s1.getAddress() %></td>
<td><%=s1.getDesignation() %></td>
</tr>
<%} %>
</table><br><br>


<a href="teacher_update.jsp">Update or delete Teacher Details</a>
</body>
</html>