<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>maven - mybatis</title>
</head>
<body>
	<h1>Hello Mybatis</h1>
	<h2>student</h2>
	<ul>
		<li><a href="${pageContext.request.contextPath}/student/insertStudent">/student/insertStudent</a></li>
		<li><a href="${pageContext.request.contextPath}/student/selectOne">/student/selectOne</a></li>
		<li><a href="${pageContext.request.contextPath}/student/selectList">/student/selectList</a></li>
	</ul>
	
	<h2>employee</h2>
	<ul>
		<li><a href="${pageContext.request.contextPath}/emp/search1">/emp/search1</a></li>
		<li><a href="${pageContext.request.contextPath}/emp/search2">/emp/search2</a></li>
		<li><a href="${pageContext.request.contextPath}/emp/search3">/emp/search3</a></li>
	</ul>
	
</body>
</html>