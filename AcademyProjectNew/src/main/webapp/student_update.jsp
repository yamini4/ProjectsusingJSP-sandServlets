<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.Student" %>
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

 StudentDao studentDao=new StudentDao();
List<Student> s=studentDao.showAllStudent();
%>
<form action="StudentServlet" method="post">
<div id="update">
Update: <input type="checkbox" id="update"><br>
<select name="uid">
<option></option>
<%

for(Student cl:s){
%>
<option value="<%=cl.getStid()%>"><%=cl.getStid()%></option>
<%
}
%>
</select><br>
First Name: <input id="fname" type="text" name="fname"><br>
Last Name: <input id="lname" type="text" name="lname"><br>
Phone number:<input type="number" name="pnumber"><br>
Address: <input type="text" name="address"><br>
<button type="submit" id="updateStudent" name="updateStudent"> Update</button> <br> <br>
</div>
<br><br>
</form>



<!-- deletion form -->
<form action="StudentServlet" method="post">
<div id="delete">
Delete<input type="checkbox" id="delete" ><br>
<select name="did">
<option></option>
<%for(Student cl:s){%>
<option value="<%=cl.getStid()%>"><%=cl.getStid() %></option>
<%} %>
</select>
</div>
 <div><br>
 <button type="submit" id="deleteStudent" name="deleteStudent"> Delete </button>
 </div>
</form>
</body>
</html>