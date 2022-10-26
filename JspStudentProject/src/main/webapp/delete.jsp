<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.student.dao.StudentDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
StudentDAO dao=new StudentDAO();
int i=dao.deleteStudent(request.getParameter("id"));
if(i>0){
	out.print("deleted sucessfully");
}else{
	out.print("your data was not deleted");
}
%>
</body>
</html>