package com.oopsw.schoolTest;
/**김재욱
 * 교사는 교사번호, 담당과목, 이름, 성별 정보를 가진다.
 * 교사 정보를 3명 입력
 * 담당과목이 수확인 교사의 정보를 확인*/
public class SchoolTeacherTestVO {
	private int schoolMasterNumber;
	private String subjectsInCharge;
	private String name = "이름없음";
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
		System.out.println("교사번호: " + schoolMasterNumber);
		System.out.println("담당과목: " + subjectsInCharge);
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
		
	}

}
