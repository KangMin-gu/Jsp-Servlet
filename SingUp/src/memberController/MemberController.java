package memberController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.DALOAD;

import javabean.MemberDao;
import javabean.MemberDto;

@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberController() {
        super();
     
    }

	//회원가입 컨트롤러
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String usernm = request.getParameter("usernm");
		String password = request.getParameter("password");
		String jumin1 = request.getParameter("jumin1");
		String jumin2 = request.getParameter("jumin2");
		String mailrcv = request.getParameter("mailrcv");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String intro = request.getParameter("intro");
		
		MemberDto dto = new MemberDto
				(userid, usernm, password, jumin1, jumin2, mailrcv, gender, job, intro);
	
		MemberDao dao = MemberDao.getInstance();
		
		dao.insert(dto);
		
		System.out.println("등록되었습니다.");
		
	}

}
