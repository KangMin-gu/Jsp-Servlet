<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDto dto = (MemberDto)request.getAttribute("dto");

%>
<h3>회원정보 수정 폼</h3>
<form action="update.do">
	번호<input type="text" name="num" value="<%=dto.getNum() %>" disabled/><br/>
	이름<input type="text" name="name" value="<%=dto.getName() %>" /><br/>
	주소<input type="text" name="addr" value="<%=dto.getAddr() %>" /><br/>
	<button type="submit">수정확인</button>
</form>
</body>
</html>