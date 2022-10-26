<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.ClassDao" %>
    <%@ page import="com.entity.Class1" %>
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

<%@include file="header.html" %><br>
<a href="class_add.jsp">Add New Class</a><br><br>
<%ClassDao classDao1= new ClassDao(); 
List<Class1> l=new ArrayList<Class1>();
l=classDao1.showAllClasses();%>

<table border="1">
<tr>
<th>Id</th>
<th>Class Name</th>
<th>View</th>
</tr>
<%for(Class1 c1:l) {%>
<tr>
<td><%=c1.getId() %></td>
<td><%=c1.getC_Name() %></td>
<td><a href="class_view.jsp?id=<%=c1.getId()%>">view</a></td>
</tr>
<%} %>
</table><br><br>
<a href="class_update.jsp">update or delete class details</a>

<br><br>

<a href="add_sub_tea.jsp">add subjects and teachers</a>
</body>
</html>