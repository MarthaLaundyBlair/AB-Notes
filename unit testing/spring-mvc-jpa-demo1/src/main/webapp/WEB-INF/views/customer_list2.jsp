<%@page import="com.ab.entities.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Student List </title>
</head>
<body>
    
 <%
    
  List<Customer> customers = (List<Customer>)session.getAttribute("session_customers");
 
 %>
 
 <h1> List of Registered Customers are : </h1>
 
 <%=customers %>
</body>
</html>