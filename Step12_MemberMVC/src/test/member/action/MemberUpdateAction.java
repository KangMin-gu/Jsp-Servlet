package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberUpdateAction extends	Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 파라미터로 전달되는 수정할 회원정보 얻어오기
		int num = Integer.parseInt(request.getParameter("num"));
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//2. DB에 수정 반영
		MemberDao.getInstance().update(dto);
	
		//3. 응답
		request.setAttribute("msg", "회원 정보를 수정 했습니다");
		request.setAttribute("url", "/member/list.do");
		
		ActionForward af = new ActionForward("/views/member/alert.jsp");
		return af;
	}

}
