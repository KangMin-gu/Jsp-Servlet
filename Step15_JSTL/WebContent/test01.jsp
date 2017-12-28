<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 라이브러리 사용할 준비  taglib->ctrl+space->uri->ctrlspace->core->prefix="c" 접두어를 c라고하겠다.-->
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01.jsp</title>
</head>
<body>
<h3>jstl 반복문</h3>
<c:forEach var="i" begin="0" end="9" step="1">
	<strong>${i }</strong> <br/>
</c:forEach>

<h3>java code 반복문</h3>
<%for(int i=0; i<10; i++){ %>
	<strong><%=i %></strong><br/>
<%} %>
</body>
</html>


















