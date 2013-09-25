<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title> List Page</title>
</head>
<body>
<table>
<c:forEach items="${testList }" var="temp" varStatus="i">
	<tr>
		<td>${temp.name }</td>
		<td>${temp.phone }</td>
		<td>${temp.email }</td>
	</tr>
	<tr>
		<td>${temp.content }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
