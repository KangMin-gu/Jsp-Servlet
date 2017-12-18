<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="test.dao.MemberDao"%>    
<%@page import="test.dto.MemberDto"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
request.setCharacterEncoding("utf-8");
//삭제할 회원의 번호를 읽어와서
int num=Integer.parseInt(request.getParameter("num"));
MemberDao.getInstance().delete(num);

%>

<script>
	alert("삭제 했습니다");
	location.href="List.jsp";
</script>
</body>
</html>