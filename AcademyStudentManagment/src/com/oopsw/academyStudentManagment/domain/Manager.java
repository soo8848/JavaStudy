package com.oopsw.academyStudentManagment.domain;

public class Manager {
	private String managerEmail;
	private String managerPw;
	private String managerName;
	private String rank;
	private String contact;

	public Manager(String managerEmail, String managerPw, String managerName, String rank, String contact) {
		super();
		this.managerEmail = managerEmail;
		this.managerPw = managerPw;
		this.managerName = managerName;
		this.rank = rank;
		this.contact = contact;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getManagerPw() {
		return managerPw;
	}

	public void setManagerPw(String managerPw) {
		this.managerPw = managerPw;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
