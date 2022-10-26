<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Subject" %>
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
<%@include file="header.html" %>
<a href="subject_add.jsp">Add Subject</a><br><br>

<%SubjectDao subjectDao=new SubjectDao(); 
List<Subject> l=subjectDao.showAllSubject();%>

<table border="1">
 <tr>
 <th>Id</th>
 <th>subject Name</th>
 </tr>
 <%for(Subject c1:l){ %>
 <tr>
 <td><%=c1.getId() %></td>
 <td><%=c1.getSubName() %></td>
 </tr>
 <%} %>
 
 </table><br><br>
 
  <a href="subject_update.jsp">update or delete subject details</a>
</body>
</html>