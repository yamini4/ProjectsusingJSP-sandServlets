<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hi Simplilearn users</h1>
<%out.print("Total no of vistors to my page"); %>

<%!
int count=0;
int getcount(){
	return ++count;
}
%>


<%=getcount() %>


</body>
</html>