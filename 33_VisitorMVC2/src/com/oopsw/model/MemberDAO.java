package com.oopsw.model;

public class MemberDAO {
	
	public MemberDAO(){
		//1.2
	}
	
	public String addMember(MemberVO memberVO) {
		String name=null;
		//JDBC insert
		if(memberVO !=null && !memberVO.getMemberId().equals("admin"))
			name=memberVO.getName();
		
		return name;		
	}

	public String login(String memberId, String pw) {
		String name=null;
		if(memberId.equals("jeon") && pw.equals("1234"))
			name="ȫ�浿";		
		return name;
	}

}
