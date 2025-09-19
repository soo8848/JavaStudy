package com.oopsw.model;

public class MemberVO {	
	private String memberId;
	private String pw;
	private String name;
	
	public MemberVO(){}//
	public MemberVO(String memberId, String pw, String name) {
		setMemberId(memberId);
		setPw(pw);
		setName(name);
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + "]";
	}
	

}
