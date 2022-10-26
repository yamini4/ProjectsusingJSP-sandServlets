<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.student.dao.StudentDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% StudentDAO dao=new StudentDAO();
int r=dao.updateStudent(request.getParameter("id1"), request.getParameter("name1"), request.getParameter("email1"));
if(r>0){
	out.print("updated sucessfully");
}else{
	out.print("your data was not updated");
}
%>
</body>
</html>