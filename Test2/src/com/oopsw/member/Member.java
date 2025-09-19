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

	// ������Ʈ�Ҷ� ����� ���� ���ܻ�Ȳ�� �� �ۼ��� ��.
	public void setName(String name) throws NameLengthException {
		if (name == null || name.length() < 2)
			throw new NameLengthException("2�̻�");
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) throws GenderValueException {
		if (gender != 'M' || gender == 'F')
			throw new GenderValueException("M or F"); // 1. ������ Ȯ���ϴ� ���� �߻� - �����
														// �����

		// �ȵǴ� ����
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ȸ����ȣ: " + memberNumber + ", �̸�: " + name + ", ����: " + gender;
	}

}
