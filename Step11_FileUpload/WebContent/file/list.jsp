<%@page import="test.file.dto.FileDto"%>
<%@page import="java.util.List"%>
<%@page import="test.file.dao.FileDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file/list.jsp</title>
</head>
<body>
<%
	//파일 목록을 불러오기
	List<FileDto> list = FileDao.getInstance().getList();
%>
	<h3>파일 목록입니다.</h3>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>파일명</th>
				<th>크기</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<%for(FileDto tmp: list){ %>
			<tr>
				<td><%=tmp.getNum() %></td>
				<td><%=tmp.getWriter() %></td>
				<td><%=tmp.getOrgFileName() %></td>
				<td><%=tmp.getFileSize() %></td>
				<td><%=tmp.getRegdate() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>