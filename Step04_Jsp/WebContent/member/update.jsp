<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="test.dto.MemberDto"%>
        <%@page import="test.dao.MemberDao"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 int num = Integer.parseInt(request.getParameter("num"));
String name = request.getParameter("name");
String addr = request.getParameter("addr");
//MeberDto 에 담아서
MemberDto dto = new MemberDto(num, name, addr);
MemberDao.getInstance().insert(dto);
%>
<p>저장했습니다.</p>
<a href="List.jsp">목록보기</a>
</body>
</html>