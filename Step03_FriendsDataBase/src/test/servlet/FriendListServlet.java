package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FriendsDao;
import test.dto.FriendsDto;

@WebServlet("/friends/List")
public class FriendListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		List<FriendsDto> list = FriendsDao.getInstance().getlist();
		
		//응답 인코딩 설정
		response.setCharacterEncoding("utf-8");
		//응답 컨텐츠 설정
		response.setContentType("text/html;charset=utf-8");
		for (FriendsDto frd : list) {
			System.out.println("하이"+frd.getName());
		}
		//클라이언트에게 문자열을 출력할수 있는 객체 얻어오기
	    PrintWriter pw = response.getWriter();
	      pw.println("<!doctype html>");
	      pw.println("<html>");
	      pw.println("<head>");
	      pw.println("<meta charset='utf-8'/>");
	      pw.println("<title>친구목록</title>");
	      pw.println("<style>");
	      pw.println("p{color: plum;}");
	      pw.println("</style>");
	      pw.println("</head>");
	      pw.println("<body>");
	      pw.println("<h3>친구추가</h3>");
	      pw.println("<a href ='insertform.html'>친구등록</a>");
	      pw.println("<h3>친구목록</h3>");
	      pw.println("<table>");
	      pw.println("<thead>");
	      pw.println("<tr>");
	      pw.println("<th>번호</th>");
	      pw.println("<th>이름</th>");
	      pw.println("<th>전화번호</th>");
	      pw.println("<th>날짜</th>");
	      pw.println("<th>삭제</th>");
	      pw.println("<th>수정</th>");
	      pw.println("</tr>");
	      for(FriendsDto frd: list) {
		         pw.println("<tr>");
		         pw.println("<td>" + frd.getNum() + "</td>");
		         pw.println("<td>" + frd.getName() + "</td>");
		         pw.println("<td>" + frd.getPhone() + "</td>");
		         pw.println("<td>" + frd.getDate() + "</td>");
		         pw.println("<td><a href=''>수정</a></td>");
		         pw.println("<td><a href='del?num="+frd.getNum()+"'>삭제</a></td>");
		         pw.println("</tr>");
		         System.out.println(frd.getName());
		      }
	      pw.println("</thead>");
	      pw.println("<tbody>");
	      
	
		
		
		
	}
}
