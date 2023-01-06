<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %> 
    
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h2>**Please enter correct username and password**</h2> <br>
<h4>Welcome with session id:<%=session.getId()%></h4>
<%-- 
<%
out.print("Welecome with session id:- "+session.getId());
%>
--%>
</body>
</html>