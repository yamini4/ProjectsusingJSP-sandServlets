<%@page import="com.student.dao.StudentDAO" %>
<%@page import="com.student.pojo.*" %>
    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
<%
String s1=request.getParameter("id");
out.print("Details of the student where id="+s1); %>
<br>
<%
StudentDAO dao=new StudentDAO();
Student x=dao.getOneStudent(s1);
out.println("old data of employee");
out.println("name: "+x.getName()+", E-mail: "+x.getEmail());
out.println("<h3>Enter the new data of the employee</h3>");
%>
</h2>
<form action="editsuccess.jsp">
Student Id<input type="text" name="id1">
<br>
Student Name<input type="text" name="name1">
<br>
Student Email<input type="email" name="email1">
<br>
<input type="submit" value="update">
</form>
</body>
</html>