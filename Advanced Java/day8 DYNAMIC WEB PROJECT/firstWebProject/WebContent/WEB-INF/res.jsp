<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Object x = request.getAttribute("k1");
	int y[]=(int[])x;
	for(int i=0 ;  i < y.length ; i++)
	{
%>
	<Br/>  <%= y[i] %>
<%
	}
%> 
</body>
</html>