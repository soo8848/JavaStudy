package com.oopsw.model;

public class MemberVO {
	/**변수 선언을 한줄로 안한거는 이렇게 위에 주석 넣을려고*/
	private String memberId;
	private String pw;
	private String name;
	
	public MemberVO() {}//웹 어플리케이션은 생성자를 박아놓고 써도 된다. 왜냐하면 경우의 수가 많아서
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
	// 웹에서도 toString() toequals() toHashCode()는 중복된 데이터를 방지하기 위해 쓰는데 그래서 사람들이 웹 어플리케이션에서는 안쓰는데 toStirng()은 써야된다. 대신 외부에 보이면 안되는 pw같은 데이터는 빼야된다.
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + "]";
	}
	
	
	
}
