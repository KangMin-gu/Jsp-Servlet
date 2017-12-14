<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
	<%
		//String activeTab = "one";
		//String activeTab2 = "two";
		String activeTab = "two";
	%>
	<!-- 자바는 activeTab == "one" 하면안된다. .equals()가 동등비교연산자 -->
	<div class="container">
		<h3>동적으로 active tab 바꾸는 연습</h3>
		<ul class="nav nav-tabs">
			<%if(activeTab.equals("one")){ %>
			<li class="active"><a href="#">하나</a></li>
			<li ><a href="#">둘</a></li>
			<li><a href="#">셋</a></li>
			<%}else if(activeTab.equals("two")){ %>
			<li><a href="#">하나</a></li>
			<li class="active"><a href="#">둘</a></li>
			<li><a href="#">셋</a></li>			
			<%}else if(activeTab.equals("three")){ %>
			<li><a href="#">하나</a></li>
			<li ><a href="#">둘</a></li>
			<li class="active"><a href="#">셋</a></li>
			<%}%>
		</ul>
		<h3>동적으로 active tab 바꾸는 연습</h3>
		<ul>
			<li <%if(activeTab.equals("one")){%>class="active"<%}%>><a href="#">하나</a></li>
			<li <%if(activeTab.equals("two")){%>class="active"<%}%>><a href="#">둘</a></li>
			<li <%if(activeTab.equals("three")){%>class="active"<%}%>><a href="#">셋</a></li>
		</ul>
</div>		
		
		

</body>
</html>