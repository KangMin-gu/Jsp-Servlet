<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	//서블릿으로 바뀌었을때 service()메소드 안쪽이라고 생각하면 된다.
	String fortuneToday="졸라 추워요~";
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오늘의 운세 페이지</title>
</head>
<body>
<p>오늘의 운세:<strong><%= fortuneToday %></strong></p>
</body>
</html>

<!-- 
	 fortuneServlet.java=>FortuneServlet.class (new)
	 text file
	 fortune.jsp = > fortune.java => fortune.class (new) 서블릿으로 바뀐다.
	 fortune.java->servlet!
	 자바 소스코드는 원하는 위치 아무곳이나 사용 가능하며 사용하기 이전에만 명시되면 된다.
-->