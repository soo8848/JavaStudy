package com.oopsw.schoolTest;
/**�����
 * ����� �����ȣ, ������, �̸�, ���� ������ ������.
 * ���� ������ 3�� �Է�
 * �������� ��Ȯ�� ������ ������ Ȯ��*/
public class SchoolTeacherTestVO {
	private int schoolMasterNumber;
	private String subjectsInCharge;
	private String name = "�̸�����";
	private char gender = 'M';
	public SchoolTeacherTestVO(int schoolMasterNumber, String subjectsInCharge, String name, char gender) {
		//		super();
		this.schoolMasterNumber = schoolMasterNumber;
		this.subjectsInCharge = subjectsInCharge;
		this.name = name;
		this.gender = gender;
	}
	public int getSchoolMasterNumber() {
		return schoolMasterNumber;
	}
	public void setSchoolMasterNumber(int schoolMasterNumber) {
		this.schoolMasterNumber = schoolMasterNumber;
	}
	public String getSubjectsInCharge() {
		return subjectsInCharge;
	}
	public void setSubjectsInCharge(String subjectsInCharge) {
		this.subjectsInCharge = subjectsInCharge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	public void techearInformationPrint() {
		System.out.println("�����ȣ: " + schoolMasterNumber);
		System.out.println("������: " + subjectsInCharge);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + gender);
		
	}

}
