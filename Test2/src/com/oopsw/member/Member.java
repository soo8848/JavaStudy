package com.oopsw.member;

public class Member {
	private String memberNumber;
	private String name;
	private char gender;

	public Member(String memberNumber, String name, char gender) throws GenderValueException, NameLengthException {
		setMemberNumber(memberNumber);
		setName(name);
		setGender(gender);
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getName() {
		return name;
	}

	// 프로젝트할때 사용자 정의 예외상황을 잘 작성할 것.
	public void setName(String name) throws NameLengthException {
		if (name == null || name.length() < 2)
			throw new NameLengthException("2이상");
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) throws GenderValueException {
		if (gender != 'M' || gender == 'F')
			throw new GenderValueException("M or F"); // 1. 문제를 확인하는 예외 발생 - 용어집
														// 만들기

		// 안되는 조건
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "회원번호: " + memberNumber + ", 이름: " + name + ", 성별: " + gender;
	}

}
