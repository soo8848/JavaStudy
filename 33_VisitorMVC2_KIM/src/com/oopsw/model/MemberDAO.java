package com.oopsw.model;

public class MemberDAO {
	
	public MemberDAO() {
		//1.2.
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
	}
	
	public String addMember(MemberVO memberVO) {
		String name=null; //null�� ���������� �� ȸ�������� �ȵƴ��� �� �� ������, ȸ�������� �ȵ� ������ �˷��ִ� ģ������ �־���Ѵ�.
		//JDBC insert
		if(memberVO !=null && !memberVO.getMemberId().equals("admin")) //admin�̶�� ������ ������� ��.
			name=memberVO.getName(); //��¥�� ���� ��.
		
		return name;
	}

	public String login(String memberId, String pw) { // �׽�Ʈ�� ���� ���� �����
		String name=null;
		if(memberId.equals("jeon") && pw.equals("1234"))
			name="ȫ�浿";
		return name;
	}

}