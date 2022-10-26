<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.student.dao.*" %>
    <%@ page import="com.student.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Student s= new Student();
s.setId(request.getParameter("id"));
s.setName(request.getParameter("name"));
s.setEmail(request.getParameter("email"));
StudentDAO dao=new StudentDAO();
int row=dao.insertStudent(s);
if(row>0){
	out.print("insertion is successfull");
}
else{
	out.print("insertion failed");
}
%>

<a href="index.jsp">insert more record</a>

<form action="retrieve.jsp">
<input type="submit" value="getstudents">
</form>

</body>
</html>