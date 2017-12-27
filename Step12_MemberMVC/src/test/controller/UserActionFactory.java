package test.controller;

import test.member.action.MemberInsertFormAction;
import test.member.action.MemberListAction;

public class UserActionFactory {
	private static UserActionFactory factory;
	private UserActionFactory(){}
	//자신의 참조값을 리턴해주는 메소드
	public static UserActionFactory getInstance(){
		if(factory==null){
			factory=new UserActionFactory();
		}
		return factory;
	}
	// 요청처리를 할 Action 객체를 리턴해주는 메소드
	public Action action(String command) {
		Action action=null;
		if(command.equals("/member/list")) {
			action=new MemberListAction();
		}else if(command.equals("/member/insertform")) {
			action=new MemberInsertFormAction();
		}
		
		return action;
	}
}












