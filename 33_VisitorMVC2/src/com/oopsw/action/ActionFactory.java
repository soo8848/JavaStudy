package com.oopsw.action;

public class ActionFactory {
	private ActionFactory(){}
	
	public static Action getAction(String cmd){
		Action a=null;
		//±¸ÇöºÎ
		switch(cmd){
		
		case "logoutAction":
			a=new LogoutAction();
			break;
		case "loginAction":
			a=new LoginAction();
			break;
		case "addMemberAction":
			a=new AddMemberAction();
			break;
		case "addMemberUI":
			a=new AddMemberUIAction();
			break;
		case "loginUI":
		case "mainUI":
			a=new LoginUIAction();
			break;
		default:
			a=new LoginUIAction();
		}
		return a;
	}
	
}
