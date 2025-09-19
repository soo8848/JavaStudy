package com.oopsw.model;

public class MemberDAO {
	
	public MemberDAO() {
		//1.2.
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
	}
	
	public String addMember(MemberVO memberVO) {
		String name=null; //null만 보내버리면 왜 회원가입이 안됐는지 알 수 없으니, 회원가입이 안된 이유를 알려주는 친절함이 있어야한다.
		//JDBC insert
		if(memberVO !=null && !memberVO.getMemberId().equals("admin")) //admin이라는 계정은 못만드는 것.
			name=memberVO.getName(); //가짜가 들어가는 것.
		
		return name;
	}

	public String login(String memberId, String pw) { // 테스트용 가상 계정 만들기
		String name=null;
		if(memberId.equals("jeon") && pw.equals("1234"))
			name="홍길동";
		return name;
	}

}