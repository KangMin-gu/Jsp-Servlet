
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 추가 폼입니다.</h3>
<form action="insert.jsp" method="post">
	<label for="name">이름</label>
	<input type="text" name="name" id="name" />
	<label for="addr">주소</label>
	<input type="text" name="addr" id="addr"/>
	<button type="submit">추가</button>
	<button type="reset">취소</button>
</form>
<a href="List.jsp">목록보기</a>
</body>
</html>
