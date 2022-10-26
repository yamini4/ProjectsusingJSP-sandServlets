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
<h1>Add Class</h1>
<form action="ClassServlet" method="get">
Class Name: <input type="text" name="cname">
<input type="submit" name="AddClass" value="Add">
</form>
<br><br>
<a href="class_view1.jsp">All Classes</a>


</body>
</html>