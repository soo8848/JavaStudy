package com.oopsw.model;

public class MemberVO {
	/**���� ������ ���ٷ� ���ѰŴ� �̷��� ���� �ּ� ��������*/
	private String memberId;
	private String pw;
	private String name;
	
	public MemberVO() {}//�� ���ø����̼��� �����ڸ� �ھƳ��� �ᵵ �ȴ�. �ֳ��ϸ� ����� ���� ���Ƽ�
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
	// �������� toString() toequals() toHashCode()�� �ߺ��� �����͸� �����ϱ� ���� ���µ� �׷��� ������� �� ���ø����̼ǿ����� �Ⱦ��µ� toStirng()�� ��ߵȴ�. ��� �ܺο� ���̸� �ȵǴ� pw���� �����ʹ� ���ߵȴ�.
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + "]";
	}
	
	
	
}
