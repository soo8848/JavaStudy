package com.oopsw.academyStudentManagment.domain;

public class Student {
	private int studentNum;
	private String studentName;
	private int grade;
	private String contact;
	private String contactGuardian;
	private String guardianDiv;
	private String registDate; // DB Date -> Java String »ç¿ë

	public Student(int studentNum, String studentName, int grade, String contact, String contactGuardian,
			String guardianDiv, String registDate) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.grade = grade;
		this.contact = contact;
		this.contactGuardian = contactGuardian;
		this.guardianDiv = guardianDiv;
		this.registDate = registDate;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactGuardian() {
		return contactGuardian;
	}

	public void setContactGuardian(String contactGuardian) {
		this.contactGuardian = contactGuardian;
	}

	public String getGuardianDiv() {
		return guardianDiv;
	}

	public void setGuardianDiv(String guardianDiv) {
		this.guardianDiv = guardianDiv;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

}
