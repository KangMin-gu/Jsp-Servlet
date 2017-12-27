package test.controller;

import test.action.HomeAction;
import test.users.action.LoginAction;
import test.users.action.LoginFormAction;
import test.users.action.SignupAction;
import test.users.action.SignupFormAction;

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
		if(command.equals("/home")) {
			action=new HomeAction();
		}else if(command.equals("/users/signup_form")) {
			action=new SignupFormAction();
		}else if(command.equals("/users/signup")) {
			action=new SignupAction();
		}else if(command.equals("/users/login_form")) {
			action=new LoginFormAction();
		}else if(command.equals("/uesrs/login")) {
			action=new LoginAction();
		}
		return action;
	}
}












