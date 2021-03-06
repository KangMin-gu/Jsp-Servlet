package test.file.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.file.dao.FileDao;
import test.file.dto.FileDto;

public class FileDownAction extends	Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//=========================다른곳에서 사용시 수정할만한 부분====================================
		//파라미터로 전달되는 다운로드 시켜줄 파일의 번호를 읽어온다.
		int num = Integer.parseInt(request.getParameter("num"));
		//다운로드 시켜줄 파일의 정보를 DB 에서 읽어온다. 
		//다운로드 시켜줄 파일의 정보를 DB 에서 읽어온다.
		FileDto dto = FileDao.getInstance().getData(num);
		
		// FileDto를 request 에 담고
		request.setAttribute("dto", dto);
		
		//파일을 다운로드 시켜주는 view 페이지로 forward 이동해서 
		//파일 다운로듯 ㅣ켜주기
		return new ActionForward("/views/file/download.jsp");
		
	}

}
