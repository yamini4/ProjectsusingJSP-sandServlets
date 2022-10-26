<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Class1" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<%ClassDao classDao=new ClassDao(); 
List<Class1> cl=new ArrayList<Class1>();
cl=classDao.showAllClasses();%>
<h1>Add Student</h1>
<form action="StudentServlet" method="get">
First Name:<input type="text" name="fname">
Last Name:<input type="text" name="lname">
Phone number:<input type="number" name="pnumber">
Address: <input type="text" name="address">
Class: <select name="cid">
<option></option>
<%for(Class1 c:cl){ %>
<option value="<%=c.getId()%>"><%=c.getC_Name() %></option>
<%}%>
</select>
<input type="submit" name="AddStudent" value="Add">
</form><br><br>

<a href="student_view.jsp">All Students</a>
</body>
</html>