<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>play.jsp</title>
</head>
<body>
<%
	//sesion 에 담긴 내용을 읽어온다.
	String id = (String)session.getAttribute("id");
%>
<%if(id==null){ %>
<a href="users/Loginform.jsp">로그인</a>
<%}else{ %>
	<p><strong><%=id %></strong>회원님 로그인 중...</p>
<%}%>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore voluptatibus repellat dolore aliquam ad error ex perspiciatis ab voluptates alias esse autem nam distinctio ea vitae pariatur optio itaque veniam.</p>
</body>
</html>