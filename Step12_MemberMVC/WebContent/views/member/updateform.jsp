<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>views/member/updateform.jsp</title>
</head>
<body>
<%
	MemberDto dto = (MemberDto)request.getAttribute("dto");

%>
<h3>회원 수정 폼입니다.</h3>
<form action="update.do">
	<label for="num">번호</label>
	<input type="text" name="num" value="<%=dto.getNum()%>" disabled/>
	<label for="name">이름</label>
	<input type="text" name="name" value="<%=dto.getName()%>"/>
	<label for="addr">주소</label>
	<input type="text" name="addr" value="<%=dto.getAddr()%>" />
	<button type="submit">수정확인</button>
</form>
</body>
</html>