<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cPath=request.getContextPath();
	response.sendRedirect(cPath+"/home.do");
%>
<!--  인덱스에서 리다이렉트요청으로 home.do 화면이나오게 서버에 요청(response) -->










