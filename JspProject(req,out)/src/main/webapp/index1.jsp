<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi simplilearn users</h1>
<table border="1">
<tr><td><%=request.getParameter("user")%></td></tr>
</table>
</body>
</html>
