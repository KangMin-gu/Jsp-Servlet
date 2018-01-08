<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--lib > jstl-1.2.jar file -->    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>         
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/file/insert_result.jsp</title>
</head>
<body>
<p>파일 업로드 했습니다.</p>
<a href="${pageContext.request.contextPath }/file/list.do">파일 목록보기</a>
</body>
</html>