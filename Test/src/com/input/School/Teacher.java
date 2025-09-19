package com.input.School;

public class Teacher extends Person {
	String teacherNumber = "";

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String teacherNumber, String name) {
		super(name);
		this.teacherNumber = teacherNumber;
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teacherNumber == null) ? 0 : teacherNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teacherNumber == null) {
			if (other.teacherNumber != null)
				return false;
		} else if (!teacherNumber.equals(other.teacherNumber))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "교번: " + teacherNumber + " 이름: " + name;
	}

}
