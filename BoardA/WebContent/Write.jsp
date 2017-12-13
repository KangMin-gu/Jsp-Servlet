<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판글쓰기</h3>
	<form action ="ContentsServlet" method = "post">
		<table width=700 border=1 cellspacing=0 cellpadding=5>
			<tr>
				<td><b>이름</b></td>
				<td><input type=text name=cname size=50 maxlength=50></td>
			</tr>
			<tr>
				<td><b>제목</b></td>
				<td><input type=text name=ctitle size=50 maxlength=50></td>
			</tr>
			<tr>
				<td><b>내용</b></td>
				<td><textarea name=ccontents cols=50 rows=10></textarea></td>
			</tr>
		</table>
		<table width=700 border=1 cellspacing=0 cellpadding=0>
			<tr>
				<td><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
</body>
</html>