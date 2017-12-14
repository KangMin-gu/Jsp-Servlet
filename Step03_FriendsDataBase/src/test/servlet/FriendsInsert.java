package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FriendsDao;
import test.dto.FriendsDto;

@WebServlet("/friends/insert")
public class FriendsInsert extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		
		
		FriendsDto dto = new FriendsDto();
		dto.setName(name);
		dto.setPhone(phone);
		
		FriendsDao.getInstance().insert(dto);
		
		//응답 인코딩 설정
		response.setCharacterEncoding("UTF-8");
		//응답 컨텐츠 설정
		response.setContentType("text/html;charset=UTF-8");
		//클라이언트에게 문자열을 출력할수 있는 객체 얻어오기
		PrintWriter pw = response.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='UTF-8'/>");
		pw.println("<title>오늘의 운세 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<a href = 'List'>목록으로</a>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
