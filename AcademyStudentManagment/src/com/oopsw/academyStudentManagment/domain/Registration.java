package com.oopsw.academyStudentManagment.domain;

public class Registration {
	private String courseNum;
	private int studentNum; // FK ¡æ STUDENT(STUDENT_NUM)
	private String lectureNum; // FK ¡æ LECTURE(LECTURE_NUM)

	public Registration(String courseNum, int studentNum, String lectureNum) {
		super();
		this.courseNum = courseNum;
		this.studentNum = studentNum;
		this.lectureNum = lectureNum;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getLectureNum() {
		return lectureNum;
	}

	public void setLectureNum(String lectureNum) {
		this.lectureNum = lectureNum;
	}

}
