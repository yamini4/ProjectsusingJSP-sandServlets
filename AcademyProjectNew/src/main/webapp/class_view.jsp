<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
body{
align-items: center;}
table{
color:purple;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<%int cid=Integer.parseInt(request.getParameter("id"));
%>
<%StudentDao studentDao=new StudentDao(); 
List<Student> l1=new ArrayList<Student>();
l1=studentDao.studentForClass(cid);%>
<h1>Class Report </h1>
<table border="1">
<tr><th>id</th><th>Student Name</th></tr>
<%for(Student t:l1) {%>
<tr><th><%=t.getStid() %></th><th><%=t.getFirstName() %></th></tr>
<%} %>
</table>
</body>
</html>