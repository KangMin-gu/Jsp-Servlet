<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>test5/main.jsp</title>
<style>
.header{
	height: 100px;
	background-color: tan;
}
.footer{
	height: 100px;
	background-color: pink;
}
</style>
</head>
<body>
<jsp:include page="fragment/header.jsp"></jsp:include>
<div class="main">
	<h3>메인 컨텐츠 입니다.</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut libero quisquam aperiam quibusdam eaque dolorum possimus. Magnam sunt velit ex voluptas consectetur dolor illum iste accusantium animi nihil libero vitae!</p>
</div>
<jsp:include page="fragment/footer.jsp"></jsp:include>
</body>
</html>









