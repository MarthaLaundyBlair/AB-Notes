<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>

<h1> This is a Registration Form  </h1>


 
   <form action="/registration_process" method="POST">
   
    First Name : <input type="text" name="firstname" /> <br>
    Last Name : <input type="text" name="lastname" /> <br>
    Username : <input type="text" name="username" /> <br>
    Password : <input type="password" name="password" /> <br>
    
    <input type="submit" value="Register"/>
   
   </form>

</body>
</html>