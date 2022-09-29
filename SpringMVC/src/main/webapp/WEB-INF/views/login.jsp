<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!!!! from jsp</title>
</head>
<%
//System.out.println("Dummy");
Date date = new Date();
%>
<div>Current date is <%=date%></div>
<body>
My First JSP ${name} and password ${pass}
<p><font color="red">${error}</font></p>
<form action="/login" method = "post">
<!-- Enter your name <input type="text" name="name"/><input type="submit" value="loggin" /> -->
Name: <input type="text" name="name"/> Password: <input type="password" name="pass"/><input type="submit" value="Loggin"/>
</form>

</body>
</html>