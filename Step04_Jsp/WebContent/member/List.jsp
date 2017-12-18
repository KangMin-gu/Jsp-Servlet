<%@page import="test.dao.MemberDao"%>
<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//회원목록을 얻어온다.
request.setCharacterEncoding("utf-8");	
 List<MemberDto> list = MemberDao.getInstance().getList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insertform.jsp">추가하기</a>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>주소</th>
			</tr>
		</thead>
		<tbody>
			<%for(MemberDto tmp: list) { %>
			<tr>
				<td><%=tmp.getNum()%></td>
				<td><%=tmp.getName()%></td>
				<td><%=tmp.getAddr()%></td>
				<td><a href='update.jsp?num=<%= tmp.getNum() %>'>수정</a></td>
				<td><a href='delete.jsp?num=<%= tmp.getNum() %>'>삭제</a></td>
			</tr>
				<%}%>
		</tbody>
	</table>
	
</body>
</html>