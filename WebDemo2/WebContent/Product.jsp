<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>
</br></br></br>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<form action="ProductController" method="post">
<table align="right" cellspacing="2">
<tr bgcolour="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva"> Product Info</font>
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
<td>Product Name</td>
<td><input type="text" name="productName" required/></td>
</tr>
<td> Price</td>
<td><input type="text" name="price" required/></td>
</tr>
<td> Description</td>
<td><textarea rows="5" cols="30" name="desc" required></textarea></td>
</tr>
<td> Stock</td>
<td><input type="text" name="stock" required/></td>
</tr>
<td> Category</td>
<td><select name="category" required>
<option value="Mobile">Mobile</option>
<option value="Pendrive">Pendrive</option>
<option value="HardDisk">HardDisk</option>
<option value="Tripods">Tripods</option>
</select>
</td>
<tr>
<td> Supplier</td>
<td><select name="supplier" required>
<option value="CloudRetail">Cloud Retail</option>
<option value="abcincorp">ABC Incorporation</option>
<option value="CloudMap">Cloud Map</option>
<option value="bic">BigC</option>
</select></td>
</tr>
</tr>
<tr bgcolour="gray">
<td colspan="2"><center>
<input type="submit" value="Add The Product"/>
</center></td>
</tr>

</table>
</form>

</body>
</html>

