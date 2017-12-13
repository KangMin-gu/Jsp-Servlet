package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//폼 전송 되는 내용을 콘솔에 출력하고
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id :" + id + " pwd" + pwd);
		//클라이언트에게는 login ok~ 라고 출력해보세요
		
		//응답 인코딩 설정
		response.setCharacterEncoding("utf-8");
		//응답 컨텐츠 설정
		response.setContentType("text/html;charset=utf-8");
		//클라이언트에게 문자열을 출력할수 있는 객체 얻어오기
		PrintWriter pw = response.getWriter();
		
		if(id.equals("gura") && pwd.equals("1234")){
			pw.println("login ok~");
		}else {
			pw.println("login fail~");
		}
	
	}

}
