<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="user.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a=Integer.parseInt(request.getParameter("a"));
int b=Integer.parseInt(request.getParameter("b"));
out.print("The Result is: "+(a/b));
out.print("    Thank you");
%>
</body>
</html>