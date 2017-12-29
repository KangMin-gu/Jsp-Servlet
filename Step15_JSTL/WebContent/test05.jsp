<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test05.jsp</title>
</head>
<body>
<%
	session.setAttribute("id", "gura");
%>
<h3>session 에 id 가 담겨 있는지 여부</h3>
<p>session 영역에 id 가 있는지 여부 : <strong>${not empty id }</strong></p>
<!-- ${not empty sessionscope.id} el은 scope영역의 모든 id를 찾기때문에 생략가능 -->
<c:if test="${not empty id }"> 
	<p><strong>${id }</strong>님 로그인중...</p>
</c:if>
<!-- taglib 에는 if else가 없고 대신하여쓸수있는 문법이있다. -->
</body>
</html>

















