<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test10.jsp</title>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
	<%
		//파라미터로 넘어오는 문자열을 읽어온다.
		String activeTab = request.getParameter("active");
	
		//만일 넘어오지 않으면 
		if(activeTab==null){
			activeTab="one";
		}
		
		
		//String activeTab = "one";
		//String activeTab2 = "two";
		//String activeTab = "two";
	%>
	<!-- 자바는 activeTab == "one" 하면안된다. .equals()가 동등비교연산자 -->
	<div class="container">
	<!-- <%-- -->	<h3>동적으로 active tab 바꾸는 연습</h3>
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
		</ul>--%>-->
	<h3>동적으로 active tab 바꾸는 연습</h3>
		<ul class="nav nav-tabs">
			<li <%if(activeTab.equals("one")){%>class="active"<%}%>><a href="test10.jsp?active=one">하나</a></li>
			<li <%if(activeTab.equals("two")){%>class="active"<%}%>><a href="test10.jsp?active=two">둘</a></li>
			<li <%if(activeTab.equals("three")){%>class="active"<%}%>><a href="test10.jsp?active=three">셋</a></li>
		</ul>
</div>		
		
		

</body>
</html>