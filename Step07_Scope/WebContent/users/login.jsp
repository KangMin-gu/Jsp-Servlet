<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/login.jsp</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		boolean isValid = false;
		if (id.equals("gura") && pwd.equals("1234")) {
			// 세션 객체를 얻어와서 //브라우처를 닫을대까지 유지된다. 브라우저를 모두 닫거나 삭제하면 없어진다.
			HttpSession ses=request.getSession();
			// 세션에 로그인 정보를 담는다.
			ses.setAttribute("id", id);
			isValid = true;
		}
	%>
	
	<%if(isValid){%>
		<p><strong><%=id %></strong>회원님 로그인 되었습니다.</p>
	<%}else{ %>
		<p>아이디 혹은 비밀번호가 틀려요!</p>
	<%}%>
</body>
</html>