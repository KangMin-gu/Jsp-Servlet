package test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class HomeAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//DB 에서 공지사항을 읽어온다.
		List<String> news=new ArrayList<>();
		news.add("오늘 날씨가 춥네요!");
		news.add("감기 조심 하세요");
		news.add("MVC pattern 공부중");
		news.add("어쩌구.. 저쩌구....");
		//request 에 담는다.
		request.setAttribute("news", news);
		// home.jsp 페이지로 forward 이동해서 응답할수 있도록
		ActionForward af=new ActionForward("/views/home.jsp");	// 맨앞 / 는 webcontent라는 의미
		
		return af;
		
		//자바코드영역 -> request.getAttribute("news")
		//html 영역 -> ${news} , ${requestScope.news} (requestScope 생량가능) int, String, xxxDto, List 주로 이걸 담는다.
		//이렇게 읽어온다.  
		//request 영역은 포워드이동해서 레스폰하면 사라진다 1회성
		//세션 영역은 유지되는동안 살아있음. 임의로지우거나, 일정시간이지나거나 웹브라우저가 꺼질대까지
		
		/*
		 * ${key} 
		 * 1. key type : int => <p>${key}</p> 
		 * 2. key type : Stirng => <p>${key}</p>
		 * 3. key type : xxxDto => <p>${key.num(필드명)}</p>	
		 * 4. key type : List<String> => <c:forEach items="${key}" var="tmp">
		 * 								 <P>${tmp}</p>
		 * 5. key type : List<xxxDto> => <c:forEach items="${tmp.num}" var="tmp">
		 * 
		 */
	}

}











