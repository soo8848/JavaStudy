package com.oopsw.academyStudentManagment.domain;

public class Attendance {
	private int attendNum;
	private String courseNum;
	private String attendStatus;
	private String reason;
	private String attendDate;

	public Attendance(int attendNum, String courseNum, String attendStatus, String reason, String attendDate) {
		super();
		this.attendNum = attendNum;
		this.courseNum = courseNum;
		this.attendStatus = attendStatus;
		this.reason = reason;
		this.attendDate = attendDate;
	}

	public int getAttendNum() {
		return attendNum;
	}

	public void setAttendNum(int attendNum) {
		this.attendNum = attendNum;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getAttendStatus() {
		return attendStatus;
	}

	public void setAttendStatus(String attendStatus) {
		this.attendStatus = attendStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(String attendDate) {
		this.attendDate = attendDate;
	}

}
