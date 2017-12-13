package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.BoardDao;
import javabean.BoardDto;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDao dao = BoardDao.getInstance();
		List<BoardDto> alist = dao.boardlist();
		
		response.setCharacterEncoding("utf-8");
		for (BoardDto bdto : alist) {
			String number = bdto.getNumber();
			String cname = bdto.getCname();
			String ctitle = bdto.getCtitle();
			String ccontents = bdto.getCcontents();
			String datee = bdto.getDatee();
			String views = bdto.getViews();
		}
	}

}
