<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Teacher" %>
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

TeacherDao teacherDao=new TeacherDao();
List<Teacher> t=teacherDao.showAllTeachers();
%>
<form action="TeacherServlet" method="post">
<div id="update">
Update: <input type="checkbox" id="update"><br>
<select name="uid">
<option></option>
<%

for(Teacher cl:t){
%>
<option value="<%=cl.getTid()%>"><%=cl.getTid()%></option>
<%
}
%>
</select><br>
First Name: <input id="fname" type="text" name="fname"><br>
Last Name: <input id="lname" type="text" name="lname"><br>
Phone number:<input type="number" name="pnumber"><br>
Address: <input type="text" name="address"><br>
Designation: <input type="text" name="designation"><br>
<button type="submit" id="updateTeacher" name="updateTeacher"> Update</button> <br> <br>
</div>
<br><br>
</form>

<!-- deletion form -->
<form action="TeacherServlet" method="post">
<div id="delete">
Delete<input type="checkbox" id="delete" ><br>
<select name="did">
<option></option>
<%for(Teacher cl:t){%>
<option value="<%=cl.getTid()%>"><%=cl.getTid() %></option>
<%} %>
</select>
</div>
 <div><br>
 <button type="submit" id="deleteTeacher" name="deleteTeacher"> Delete </button>
 </div>
</form>
</body>
</html>