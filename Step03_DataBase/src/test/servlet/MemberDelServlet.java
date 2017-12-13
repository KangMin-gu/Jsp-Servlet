package test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MemberDao;

public class MemberDelServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//1. 삭제할 회원의 번호를 읽어온다.
		int num = Integer.parseInt(request.getParameter("num"));
		//2. MemberDao 를 이용해서 회원정보를 삭제하고
		MemberDao.getInstance();
		//3. 응답한다.
	}
}
