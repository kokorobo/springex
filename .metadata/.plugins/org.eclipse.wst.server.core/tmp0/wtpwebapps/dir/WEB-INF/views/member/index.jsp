<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	에헤헤헤헤헤 아무내용
	${index }
	<%=request.getAttribute("index") %>
	<br>
	<a href="login">로그인</a><br><a href="logout">로그아웃</a>
</body>
</html>