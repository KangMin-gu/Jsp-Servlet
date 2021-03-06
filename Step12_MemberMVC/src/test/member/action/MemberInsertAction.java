package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberInsertAction extends Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 폼 전송되는 파라미터를 추출해서
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		// MemberDto 에 담기
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 2. DB 에 저장하고
		MemberDao.getInstance().insert(dto);
		// 3. 응답?
		// 응답 메세지를 request 에 담고
		request.setAttribute("msg", "회원 정보를 추가 했습니다.");
		// 확인을 눌렀을때 이동할 url을 request 에 담기
		request.setAttribute("url", "/member/list.do");
		// 알림 페이지 view로 forward 이동할 수 있도록
		ActionForward af = new ActionForward("/views/member/alert.jsp");
		return af;
	}

}
