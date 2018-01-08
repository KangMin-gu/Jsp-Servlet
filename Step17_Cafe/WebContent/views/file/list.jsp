<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--lib > jstl-1.2.jar file -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/file/list/jsp</title>
</head>
<body>
	<h3>파일 목록 입니다.</h3>
	<a href="private/insertform.do">파일올리기</a>
	<!-- 로그인 되야지 올릴수있게 로그인필터동작하게만들어야함 "file/private/*" 로그인웹필터에추가
버튼을 눌르면 file/private/insertform.do 요청이된다.
 -->
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>파일명</th>
				<th>크기</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tmp" items="${list }">
				<tr>
					<td>${tmp.num }</td>
					<td>${tmp.writer }</td>
					<td>${tmp.title }</td>
					<td><a href="download.do?num=${tmp.num }"></a>${tmp.getOrgFileName }</td>
					<!-- file/download -->
					<td>${tmp.fiSize }byte</td>
					<td>${tmp.regDate }</td>
					<td>
						<!-- 로그인된 아이디가 글 작성자와 같을때만 삭제 링크 출력 --> 
						<c:if test="${id eq tmp.writer }">
							<a href="javascript:deleteConfirm(${tmp.num })">삭제</a>
							<!-- 자기가 올린글만 삭제가 뜨게해야한다. -->
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="page_display">
	<c:choose>
		<c:when test="${startPageNum ne 1 }"> <!--  시작페이지가 1이아니면 이전없애기 -->
			<a href="list.do?pageNum=${startPageNum-1 }">[ 이전 ]</a>
		</c:when>
		<c:otherwise>
			<a class="muted" href="javascript:">[ 이전 ]</a>
		</c:otherwise>
	</c:choose>

	<c:forEach var="i" begin="${startPageNum }" end="${endPageNum }">
		<c:choose>
			<c:when test="${i eq pageNum }">
				<a  class="active" href="list.do?pageNum=${i }">${i }</a>
			</c:when>
			<c:otherwise>
				<a href="list.do?pageNum=${i }">${i }</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	
	<c:choose>
		<c:when test="${endPageNum lt totalPageCount }">
			<a href="list.do?pageNum=${endPageNum+1 }">[ 다음 ]</a>
		</c:when>
		<c:otherwise>
			<a class="muted" href="javascript:">[ 다음 ]</a>
		</c:otherwise>
	</c:choose>
</div>
	
<!-- 검색어 관련 form  parameter condition(titlecontent, title, writer) , keyword가 넘어감-->
<form action="list.do" method="post">
	<label for="condition">검색조건</label>
	<select name="condition" id="condition">
		<option value="titlecontent" <c:if test="${condition eq 'titlecontent' }">selected</c:if> >제목+내용</option>
		<option value="title" <c:if test="${condition eq 'title' }">selected</c:if>>제목</option>
		<option value="writer" <c:if test="${condition eq 'writer' }">selected</c:if>>작성자</option>
	</select>
	<input value="${keyword }" type="text" name="keyword" placeholder="검색어"/>
	<button type="submit">검색</button>
</form>
	<script>
		function deleteConfirm(num) {
			var result = confirm(num + " 번 파일을 삭제 하시겠습니까?")
			if (result) {
				location.href = "private/delete.do?num=" + num;
			}
		}
	</script>
</body>
</html>