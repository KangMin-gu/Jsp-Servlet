<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String cPath = request.getContextPath(); //localhost:8888/Step12_MemberMVC/
	response.sendRedirect(cPath + "/home.do");
%>
