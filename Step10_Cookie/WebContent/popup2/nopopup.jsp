<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// chk 라는 파라미터 명으로 넘어오는 값이 있는지 확인한다. 
		String chk = request.getParameter("chk");

		//만일 체크박스를 체크하고 팝업창을 닫았다면
		if (chk != null) {
			Cookie cookie = new Cookie("popup", chk);
			//쿠키 유지시간 (1분)
			cookie.setMaxAge(60); //하루종일 닫기 60초*60분*24시간 => (60*60*24)
			response.addCookie(cookie);
		}
	%>
	<script>
		//쿠키를 응답한 다음 팝업창이 자동으로 닫아 지도록
		self.close();
	</script>
</body>
</html>