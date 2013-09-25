<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title><decorator:title default="Main Page" /></title>
	<decorator:head />
</head>
<body>
    <div>공통 헤더</div>
    <hr/>
    <decorator:body />
    <hr/>
    <div>공통 푸터</div>
</body>
</html>
