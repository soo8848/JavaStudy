package com.oopsw.academyStudentManagment.domain;

public class Lecture {
	private String lectureNum;
	private int lectureGrade;
	private String teacher;
	private String subject;
	private String lectureLevel;
	private String lectureDay;
	private String lectureTime;
	
	public Lecture(String lectureNum, int lectureGrade, String teacher, String subject, String lectureLevel,
			String lectureDay, String lectureTime) {
		super();
		this.lectureNum = lectureNum;
		this.lectureGrade = lectureGrade;
		this.teacher = teacher;
		this.subject = subject;
		this.lectureLevel = lectureLevel;
		this.lectureDay = lectureDay;
		this.lectureTime = lectureTime;
	}

	public String getLectureNum() {
		return lectureNum;
	}

	public void setLectureNum(String lectureNum) {
		this.lectureNum = lectureNum;
	}

	public int getLectureGrade() {
		return lectureGrade;
	}

	public void setLectureGrade(int lectureGrade) {
		this.lectureGrade = lectureGrade;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLectureLevel() {
		return lectureLevel;
	}

	public void setLectureLevel(String lectureLevel) {
		this.lectureLevel = lectureLevel;
	}

	public String getLectureDay() {
		return lectureDay;
	}

	public void setLectureDay(String lectureDay) {
		this.lectureDay = lectureDay;
	}

	public String getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(String lectureTime) {
		this.lectureTime = lectureTime;
	}

}
