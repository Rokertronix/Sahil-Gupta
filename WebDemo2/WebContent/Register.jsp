<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<form action="RegisterController1" method="post">
<table align="right" cellspacing="2">
<tr bgcolour="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva"> Sign Up Here</font>
</h2>
</td>
</tr>

<tr bgcolour="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva">${errorInfo}</font>
</h2>
</td>
</tr>

<tr>
<td> Login</td>
<td><input type="text" name="loginId" required/></td>
</tr>
<td> Password</td>
<td><input type="password" name="passwd" required/></td>
</tr>
<td> Customer Name</td>
<td><input type="text" name="customerName" required/></td>
</tr>
<td> Email Id</td>
<td><input type="text" name="emailId" required/></td>
</tr>
<td> Mobile</td>
<td><input type="text" name="mobile" pattern="[789]\d{9}" 
placeholder="Enter Mobile No. of 10 digits" required/></td>
</tr>
<td> Address</td>
<td><textarea rows="5" cols="30" name="address"></textarea></td>
</tr>
<tr>
<td>Country</td>
<td><select name="country">
<option value="India">India</option>
<option value="Srilanka">Srilanka</option>
<option value="Bangladesh">Bangladesh</option>
<option value="Australia">Australia</option>
</select></td>
</tr>
<tr bgcolour="gray">
<td colspan="2"><center>
<input type="submit" value="Sign Up"/>
</center></td>
</tr>

</table>
</form>

</body>
</html>