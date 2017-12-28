package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;
import test.users.dto.UsersDto;

public class UsersUpdateAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 파라미터로 전달되는 수정할 회원 정보 얻어오기
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		UsersDto dto = new UsersDto();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setEmail(email);
		//2. DB에 수정반영
		UsersDao.getInstance().update(dto);
		//3. 응답
		//개인정보보기로 리다일렉트 시키기
		ActionForward af = new ActionForward("/users/private/info.do");
		af.setRedirect(true);
		return af;
	}

}
