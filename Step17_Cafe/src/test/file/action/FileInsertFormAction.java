package test.file.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class FileInsertFormAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//특별이 수행할 로직은 업음. 인서트폼으로 연결만시켜주면됨.
		return new ActionForward("/views/file/private/insertform.jsp"); 
		//액션에서 리스트에서버튼을 눌르면 여기로 이동시킨다. 그다음 여기서 마지막으로 포워드로 insertform.jsp로 이동시킴
	}

}
