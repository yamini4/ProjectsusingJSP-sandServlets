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
<h1>Add Subject</h1>
<form action="SubjectServlet" method="get">
Subject Name:<input type="text" name="sname">
<input type="submit" name="AddSubject" value="Add">
</form>
<a href="subject_view.jsp">All Subjects</a>
</body>
</html>
