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
	//request 영역에 "yourName" 이라는 키값으로 String type 저장
	request.setAttribute("yourName", "원숭이");
	//ssesion 영역에 "id" 이라는 키값으로 String type 저장
	session.setAttribute("id", "kimgura");
	//Application 영역에 "count" 라는 키값으로 int type 저장
	application.setAttribute("count", 999);

//정의해놀것. -정보를 저장하고 불러올수있는 기능들이 있다. (el 알아서 4가지 전부 뒤져서 찾아서 캐스팅해서 가져옴.)
//1. pageContext
//	하나의 jsp페이지 안에서만쓸수잇음.			//	.setAttribut("key", value) 키값 벨류로 저장하기
//2. HttpServletRequest
//	자주씀-응답을하기전까지 쓸수있음.			//	.getAttribute(key) 벨류로 불러오기
//3. HttpSession
//	자주씀-세션이 유지되고있는동안 쓸수있음.
//4. ApplicationContext
//	서버를껐다킬때까지 계속 기억됨
%>
<p>pageContext 객체에 저장된 문자열 : <strong>${pageScope.myName }</strong></p>
<p>pageContext 객체에 저장된 문자열 : <strong>${myName }</strong></p>

<p>HttpServletRequest 객체에 저장된 문자열 : <strong>${requestScope.yourName }</strong></p>
<p>HttpServletRequset 객체에 저장된 문자열 : <strong>${yourName }</strong></p>

<p>HpptSession 객체에 저장된 문자열: <strong>${sessionScope.id }</strong></p>
<p>HpptSession 객체에 저장된 문자열: <strong>${id }</strong></p>

<p>ApplicationContext 객체에 저장된 숫자 : <strong>${applicationScope.count }</strong></p>
<p>ApplicationContext 객체에 저장된 숫자 : <strong>${count }</strong></p>
</body>
</html>

























