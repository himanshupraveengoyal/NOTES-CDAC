<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

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


<%
//LATER ON WE WILL REMOVE IT ASSUME THIS CODE
//WAS WRITTEN BY CONTROLLER.

request.setAttribute("kkiuu1","jkjkklkl");

List<String> l =new ArrayList();
l.add("hello");
l.add("hi");
request.setAttribute("kwhat",l);


//controller we can take this list we got froms ervice layer and write to notice board
























int y[]={4,5,6,7};
request.setAttribute("k3",y);




%>


ct1.jsp at work  <e:out value="${k1}"/>


<e:forEach var="i" items="${arch}"> 
<Br/> <e:out value="${i.empno}"/> 
--
<e:out value="${i.empname}"/>
</e:forEach>









<%--
<e:out value="${k2.v1 }"/>
<e:out value="${abcdefghi }"/> what did you understand

<e:forEach var="i" items="${k3}"> 
<Br/> <e:out value="${i }"/>
</e:forEach>

<e:forEach var="i" items="${kwhat}"> 
<Br/> <e:out value="${i }"/>
</e:forEach>

 --%>

</body>






</html>





