package com.oopsw.action;

public class ActionFactory {
	private ActionFactory(){} //�̷��� �����ڸ� ���� �ֵ��� ����ƽ, �̱����̶� �ϴµ� ���丮�� static���� �Ѵ�. <- ������ �޸𸮿� �ø��� �������� ���
	//ª��ª���ϰ� ���¸� ����. �ڸ�Ʈ ���丮. �޴��� �Ѱ��شٴ� ��. Ŀ�ǵ� ����(Command pattern)�̶�� �Ѵ�.
	
	//1. Factory�� action�� ����ڿ� �ּҸ� �ѰܾߵǴµ�  - p16�׸��̶� �����ؼ� ���ߵ�.
	public static Action getAction(String cmd){ // �����ڰ� ���������� static
		Action a=null; //������� Action���� �Ǿ��ֱ� ������ �������� Action�� �Ǿ���Ѵ�. ��� �������� Action�� ��ӹް� �ȴ�. �̰� �ڵ������� �̿��ϱ� ���� �������ϴ� ���̴�.
		//������
		//���δٸ� UI�� ��Ģ���� ������ switch
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