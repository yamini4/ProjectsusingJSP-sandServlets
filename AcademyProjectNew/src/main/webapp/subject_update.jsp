<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Subject" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<!-- update form -->
<%

SubjectDao subjectDao=new SubjectDao();
 List<Subject> c=subjectDao.showAllSubject();
%>
<form action="SubjectServlet" method="post">
<div id="update">
Update: <input type="checkbox" id="update"><br>
<select name="uid">
<option></option>
<%

for(Subject cl:c){
%>
<option value="<%=cl.getId()%>"><%=cl.getId()%></option>
<%
}
%>
</select><br>
Subject Name: <input id="ename" type="text" name="ename"><br>
<button type="submit" id="updateSubject" name="updateSubject"> Update</button> <br> <br>
</div>
<br><br>
</form>

<!-- deletion form -->
<form action="SubjectServlet" method="post">
<div id="delete">
Delete<input type="checkbox" id="delete" ><br>
<select name="did">
<option></option>
<%for(Subject cl:c){%>
<option value="<%=cl.getId()%>"><%=cl.getId() %></option>
<%} %>
</select>
</div>
 <div><br>
 <button type="submit" id="deleteSubject" name="deleteSubject"> Delete </button>
 </div>
</form>
</body>
</html>