<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>R1</title>
</head>
<body>
<h1>
R3.jsp Running<br>
<%
Object o = request.getAttribute("MT");
int i = (Integer) o;
for(int  k =1 ; k < 4 ; k++)
{
%>

<br> <%= i*k %>
<%
}
%>

</h1>
</body>
</html>