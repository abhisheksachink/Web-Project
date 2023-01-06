<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<%@include file="header.jsp" %>
<h1>Registeration Page</h1>
<form action="<%=request.getContextPath()%>/LoginServlet" method="post">
<h3>Enter your Credentials for login</h3>
<label for="userID">User ID:-</label>
<input type="text" name="userid" placeholder="Enter User ID" ><br><br>
<label for="phone">Mobile No.:-</label>
<input type="phone" name="phone" placeholder="Enter Phone" ><br><br>
<input id="button1" type="submit" value="Login">
</form>

</body>
</html>