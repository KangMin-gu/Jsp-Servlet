package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dto.MemberDto;

public class InfoAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//회원정보를 불러온다. 
		MemberDto dto = new MemberDto(1, "김구라", "노량진");
		//request 에 담는다. 
		request.setAttribute("dto", dto);
		//forward 이동해서 회원정보를 출력
		return new ActionForward("/views/info.jsp");
	}

}
