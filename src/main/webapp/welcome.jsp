<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ page import="java.util.List" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<p id="h">hello</p>
<%@include file="header.jsp" %>
<h2>successfully login</h2>
<table id="tables">
<tr>
<th>UserName</th>
<th>Mobile</th>
<c:forEach items="${userList}" var="user">
<tr>
<td>${user.getUserId()}</td>
<td>${user.getPhone()}</td>
</tr>

</c:forEach>
</tr>

</table>

</body>
</html>