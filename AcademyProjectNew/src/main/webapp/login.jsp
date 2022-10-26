<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-color:pink;
text:bold;
}
button{
color:white;
background-color:blue;
}
label{
font-size:20px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AdminLoginServlet" method="get"> 
    
        <div class="container">   
            <label>User Name : </label>   
            <br/>
            <input type="text" class="text1" name="username" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" class="text1" name="password" required>  
            <br/>
            <br/>
            <button type="submit" class="button-73" role="button">Login</button>   
             
        </div>   
        
    </form>     

</body>
</html>