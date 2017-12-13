<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h3>게시판</h3>
<table cellspacing=1 width=600 border=1>
	<tr>
		<td width=50><p align=center>번호</p></td>
		<td width=100><p align=center>이름</p></td>
		<td width=320><p align=center>제목</p></td>
		<td width=100><p align=center>등록일</p></td>
		<td width=100><p align=center>조회수</p></td>
	</tr>
	<tr>
		<td width=50><p align=center><% %></p></td>
		<td width=100><p align=center></p></td>
		<td width=320><p align=center><a href='/TitleServlet'></a></p></td>
		<td width=100><p align=center></p></td>
		<td width=100><p align=center></p></td>
	</tr>
</table>
<table width=700>
	<tr>
		<td><input type=button value="글쓰기"
			onClick="location.href='Contents.jsp'"></td>
	</tr>
</table>

</body>
</html>