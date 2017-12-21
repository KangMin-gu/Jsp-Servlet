<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup2/main.jsp</title>
</head>
<body>
	<%
		//팝업창을 띄울지에 대한 여부 (초기값을 true로 해놓고)
		boolean canPopup = true;
		//쿠키 목록을 읽어와서 
		Cookie[] cookies = request.getCookies(); //Cookie[]라는 java 배열안에 쿠키value값과 key값을 넣는다.
		//반복문 돌면서 쿠키를 확인해서 
		for (Cookie tmp : cookies) {
			//popup 이라는 키값으로 저장된 쿠키가 존재하면
			if (tmp.getName().equals("popup")) { //key값이 popup이 있다면 
				//팝업을 띄우지 않도록 설정
				canPopup = false;
			}
		}
	%>
	<%
		if (canPopup) {
	%>
	<script>
		window.open("popup_page.jsp", "팝업창",
				"width=400,height=300,top=100,left=100");
	</script>
	<%
		}
	%>
	<h3>메인 페이지 입니다.</h3>
	<p>Gura 홈쇼핑</p>
	<p>겨울을 미리 준비하세요~</p>
</body>
</html>