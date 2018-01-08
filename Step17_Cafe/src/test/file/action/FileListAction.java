package test.file.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.file.dao.FileDao;
import test.file.dto.FileDto;

public class FileListAction extends Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//파일 목록을 얻어온다.
		List<FileDto> list = FileDao.getInstance().getList();
		//request 에 담는다
		request.setAttribute("list", list);
		//view 페이지로 forward 이동해서 파일 목록 출력
		return new ActionForward("/views/file/list.jsp");
	}

}
