package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.BoardDao;
import javabean.BoardDto;

/**
 * Servlet implementation class ContentsServlet
 */
@WebServlet("/ContentsServlet")
public class ContentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String number = request.getParameter("number");
		String cname = request.getParameter("cname");
		String ctitle = request.getParameter("ctitle");
		String ccontents = request.getParameter("ccontents");
		String datee = request.getParameter("datee");
		String views = request.getParameter("views");
		
		BoardDto dto = new BoardDto(number, cname, ctitle, ccontents, ccontents, views);
		
		BoardDao dao = BoardDao.getInstance();
		
		dao.insert(dto);
		
		System.out.println("성공!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
