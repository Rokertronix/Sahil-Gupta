<%@ page language="java" contentType="text/html" import="java.util.*"%>
<%@include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scriplets</title>
</head>
<body>

<h2>Declaration Scriplet</h2>
<%!
		ArrayList<String> persons=new ArrayList<String>();
%>

<h2>Normal Scriplet</h2>
<%
	Date today= new Date();
	out.println("Today:"+today);
%>



</body>
</html>