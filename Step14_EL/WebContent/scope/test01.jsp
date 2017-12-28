<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope/test0.</title>
</head>
<body>
<%
	//page 영역에 "myName"이라는 키값으로 String type 저장하기
	pageContext.setAttribute("myName", "김구라");
	

//정의해놀것. -정보를 저장하고 불러올수있는 기능들이 있다. (el 알아서 4가지 전부 뒤져서 찾아서 캐스팅해서 가져옴.)
//1. pagecontext
//	하나의 jsp페이지 안에서만쓸수잇음.			//	.setAttribut("key", value) 키값 벨류로 저장하기
//2. httpservletrequest
//	자주씀-응답을하기전까지 쓸수있음.			//	.getAttribute(key) 벨류로 불러오기
//3. heepSession
//	자주씀-세션이 유지되고있는동안 쓸수있음.
//4. applicationcontext
//	서버를껐다킬때까지 계속 기억됨
%>
</body>
</html>