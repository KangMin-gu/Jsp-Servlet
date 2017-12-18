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
		//폼 전송 되는 내용을 변수에 담아 보세요.
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");//라디오는 네임속성값이 같으면 그룹으로 묶인다. 네이그룹중 하나의 value 값만 선택가능
		String[] hobby = request.getParameterValues("hobby"); //여러개 체크박스를 체크하여 추출하는 폼은 배열로추출한다.

		System.out.println("email :"+email);
		System.out.println("pwd :"+pwd);
		System.out.println("job :"+job);
		System.out.println("gender :"+gender);
		
		for(String tmp : hobby){
			System.out.println("hobby : "+tmp);

		}
	%>




</body>
</html>