package com.oopsw.action;

public class ActionFactory {
	private ActionFactory(){} //이렇게 생성자를 막는 애들을 스태틱, 싱글콘이라 하는데 팩토리는 static으로 한다. <- 공장을 메모리에 올리지 않으려고 사용
	//짧막짧막하게 상태를 전달. 코멘트 팩토리. 메뉴를 넘겨준다는 것. 커맨드 패턴(Command pattern)이라고 한다.
	
	//1. Factory가 action을 만든뒤에 주소를 넘겨야되는데  - p16그림이랑 연결해서 봐야됨.
	public static Action getAction(String cmd){ // 생성자가 막혀있으니 static
		Action a=null; //선언언이 Action으로 되어있기 때문에 생성형도 Action이 되어야한다. 고로 생성형도 Action을 상속받게 된다. 이걸 자동생성을 이용하기 위해 역설계하는 것이다.
		//구현부
		//서로다른 UI에 규칙성이 없으니 switch
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