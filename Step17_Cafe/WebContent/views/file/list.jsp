<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--lib > jstl-1.2.jar file -->    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/file/list/jsp</title>
</head>
<body>
<h3>파일 목록 입니다.</h3>
<a href="fileinsertform.jsp">파일올리기</a>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>파일명</th>
			<th>크기</th>
			<th>등록일</th>			
		</tr>
	</thead>
	<tbody>
		<c:forEach var="tmp" items="${list }">
			<tr>
				<td>${tmp.num }</td>
				<td>${tmp.writer }</td>
				<td>${tmp.title }</td>
				<td><a href="download.jsp?num=${tmp.getnum }"></a>${tmp.getOrgFileName }</td>
				<td>${tmp.getFiSize } byte</td>
				<td>${tmp.getRegDate }</td>
				<td><a href="delete.jsp?num=${tmp.getNum }">삭제</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>