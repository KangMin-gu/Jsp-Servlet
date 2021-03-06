package test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do") 
// 모든 요청은 do 말고 다른 걸로 변경가능하다. do는 일반적으로쓰는것
//ex) @WebServlet("*.arcon") .arcon으로 끝나는 요청처리는 전부처리하겠다.
public class ActionServlet extends HttpServlet{
	//. 을 포함한 요청 확장자의 길이 (.do 의 길이)
	public static final int INCLUDE_EXTENSION_LENGTH=3;
	
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//요청 URI 읽어오기
		String uri=request.getRequestURI();
		//context name 읽어오기
		String contextName=request.getContextPath();
		//순수 요청 경로를 추출 한다.
		// command => /fortune or /showtime
		String command=uri.substring(contextName.length(),
				uri.length()-INCLUDE_EXTENSION_LENGTH);
		
		//해당 command 를 수행할 Action 객체를 팩토리로 부터 얻어온다. 
		Action action=UserActionFactory.getInstance().action(command);
		
		if(action != null){//처리 가능한 command 라면 
			ActionForward af=null;
			try{
				//액션 수행하기 
				af=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
				return;
			}
			if(af.isRedirect()){//redirect 이동해야 한다면
				//redirect 이동 시킨다. //새로운경로로 나에게 새로운 요청을 다시해.라는 응답
				response.sendRedirect(contextName+af.getPath()); //af. 응답경로
			}else{//forward 이동해야 한다면 //jsp페이지에게 응답을 위임하는것.
				RequestDispatcher rd=
						request.getRequestDispatcher(af.getPath());
				rd.forward(request, response);
			}
		}//.do로 끝나는 요청을 받아 비즈니스로직 처리를 하고 -> redirect or forward로 응답
	}
}



















