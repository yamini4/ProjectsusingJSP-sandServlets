<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.StudentDao" %>
    <%@ page import="com.entity.Student" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
body{align-items: center;}
table{
color:purple;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<a href="student_add.jsp">Add New Student</a><br><br>

<%StudentDao  studentDao=new StudentDao();
List<Student> s=studentDao.showAllStudent();%>
<table border="1">
<tr>
<th>Id</th>
<th>Student First Name</th>
<th>Student Last Name</th>
<th>PhoneNumner</th>
<th>Address</th>
</tr>
<%for(Student s1:s){%>
<tr>
<td><%=s1.getStid() %></td>
<td><%=s1.getFirstName() %></td>
<td><%=s1.getLastNAme() %></td>
<td><%=s1.getPhoneNumber() %></td>
<td><%=s1.getAddress() %></td>
</tr>
<%} %>
</table><br><br>


<a href="student_update.jsp">Update or delete Student Details</a>
</body>
</html>