<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Class1" %>
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

 ClassDao classDao=new ClassDao();
 List<Class1> c=classDao.showAllClasses();
%>
<form action="ClassServlet" method="post">
<div id="update">
Update: <input type="checkbox" id="update"><br>
<select name="uid">
<option></option>
<%

for(Class1 cl:c){
%>
<option value="<%=cl.getId()%>"><%=cl.getId()%></option>
<%
}
%>
</select><br>
Class Name: <input id="ename" type="text" name="ename"><br>
<button type="submit" id="updateClass" name="updateClass"> Update</button> <br> <br>
</div>
<br><br>
</form>

<!-- deletion form -->
<form action="ClassServlet" method="post">
<div id="delete">
Delete<input type="checkbox" id="delete" ><br>
<select name="did">
<option></option>
<%for(Class1 cl:c){%>
<option value="<%=cl.getId()%>"><%=cl.getId() %></option>
<%} %>
</select>
</div>
 <div><br>
 <button type="submit" id="deleteClass" name="deleteClass"> Delete </button>
 </div>
</form>
<!-- add Employee -->
</body>
</html>