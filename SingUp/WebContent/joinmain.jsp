<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h3>회원가입</h3>
<form name = "frm1" action = "MemberController" method = "post">
<table width ="500" border ="1" cellpadding="0" cellspacing ="0">

<TR>
<TD WIDTH="40%" ALIGN="left">아이디</TD>
<TD width="80%" ALIGN="left">
<INPUT TYPE="text" size="15" Maxlength="10" name="userid">
</TD>
</TR>

<TR>
<TD WIDTH="40%" ALIGN="left">이름</TD>
<TD width="60%" ALIGN="left">
<INPUT TYPE="text" size="15" Maxlength="10" name="usernm" value='aaaa'>
</TD>
</TR>

<TR>
<TD WIDTH="40%" ALIGN="left">비밀번호</TD>
<TD width="60%" ALIGN="left">
<INPUT TYPE="password" size="10" Maxlength="10" name="password">
</TD>
</TR>

<TR>
<TD WIDTH="40%" ALIGN="left">주민번호</TD>
<TD width="60%" ALIGN="left">
<INPUT TYPE="text" name="jumin1" size="6" maxlength="6">-<INPUT TYPE="text" name="jumin2" size="7" maxlength="7">
</TD>
</TR>

<TR>
<TD WIDTH="40%" ALIGN="left">메일 수신 여부</TD>
<TD width="60%" ALIGN="left">
동의함 <INPUT TYPE="checkbox" name="mailrcv">
</TD>
</TR>

<Tr>
<TD WIDTH="40%" ALIGN="left">성별</TD>
<TD width="60%" ALIGN="left">

남<input type="radio" name="gender" value="1">
여<input type="radio" name="gender" value="2">

</TD>
</tr>

<tr>
<td width="40%" align="left">직업</td>
<td width="60%" align="left">
<select name="job">
<option value="">=====직업을선택하세요=====</option>
<option value="1">학생</option>
<option value="2">회사원</option>
<option value="3">군인</option>
<option value="9">기타</option>
</select>
</td>
</tr>

<tr>
<td width="40%" align="left">자기소개</td>
<td width="60%" align="left">
<textarea name="intro" rows=5 cols=50></textarea>
</td>
</tr>

<tr>
<td width="100%" align="center" colspan="2">
<input type="submit" value="가입">
</td>
</tr>
</table>
</form>

</body>
</html>
</body>
</html>