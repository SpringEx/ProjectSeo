<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title> Form Page</title>
</head>
<body>
<form action="/test/testSubmit.do" method="post">
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" id="name" name="name"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" id="phone" name="phone"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" id="email" name="email"></td>
		</tr>
		<tr>
			<td>컨텐츠</td>
			<td><input type="text" id="content" name="content"></td>
		</tr>
	</table>
	
	<input type="submit" value="입력">
</form>	
</body>
</html>
