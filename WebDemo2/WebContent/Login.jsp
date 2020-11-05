<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController"method="post">
<table align="left"cellspacing="2">
<tr bgcolor="gray"><td colspan="2">Sign in Here</center></td></tr>

<tr><br><td>Login</td><td><input type="text"name="loginId"/></td></tr>

<tr><br><td>Password</td><td><input type="password"name="Password"/></td></tr>

<tr><td colspan="2"><input type="submit"value="Sign in"/></td></tr>
</table>
</form>
</body>
</html>