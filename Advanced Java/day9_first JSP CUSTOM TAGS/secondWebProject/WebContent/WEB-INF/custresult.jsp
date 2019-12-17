<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="e"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<e:forEach var="i" items="${AllCustomers}"> 
<Br/> <e:out value="${i.getCid()}"/> 
<e:out value="---"/> 
<e:out value="${i.getCname()}"/> 
<e:out value="---"/> 
<e:out value="${i.getCity()}"/> 
</e:forEach>

</body>
</html>