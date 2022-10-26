<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.entity.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>add Subjects and Teachers</h1>
<form action="submit"></form>

<%@include file="header.html" %>

<%
ClassDao classDao=new ClassDao();
List<Class1> c1=new ArrayList<Class1>();
c1=classDao.showAllClasses();

SubjectDao subjectDao = new SubjectDao();
List<Subject> s1=subjectDao.showAllSubject();

TeacherDao teacherDao = new TeacherDao();
List<Teacher> t1=teacherDao.showAllTeachers();

%>

<form action="ClassServlet" method="post">
<div>Select class id
<select name="cid">
<option></option>
<%for(Class1 cc:c1){ %>
<option value="<%=cc.getId()%>"><%=cc.getC_Name() %></option>
<%}%>
</select>
name:
<select name="cname">
<option></option>
<%for(Class1 cc:c1){ %>
<option value="<%=cc.getC_Name()%>"><%=cc.getC_Name() %></option>
<% }%>
</select>
</div>
<div>Select subject name
<select name="sid">
<option></option>
<%for(Subject ss:s1){ %>
<option value="<%=ss.getId() %>"><%=ss.getSubName()%></option>
<%} %>
</select>
</div>

<div>Select teacher name
<select name="tid">
<option></option>
<%for(Teacher ss:t1){ %>
<option value="<%=ss.getTid() %>"><%=ss.getFirstName()%></option>
<%} %>
</select><br><br>
<button type="submit" id="addTeaSub" name="addTeaSub">OK</button>
</div>
</form>
</body>
</html>