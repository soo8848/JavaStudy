package com.oopsw.school;
//2 학생정보
public class Student extends Person{ //2.1
	//2.2
	private String studenetNumber;
	
	//2.4
	public Student(String name, String studenetNumber) {
		super(name);
		setStudenetNumber(studenetNumber);//this.studenetNumber = studenetNumber;
	}
	
	//2.3
	public String getStudenetNumber() {
		return studenetNumber;
	}
	public void setStudenetNumber(String studenetNumber) {
		this.studenetNumber = studenetNumber;
	}
	//2.5

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((studenetNumber == null) ? 0 : studenetNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studenetNumber == null) {
			if (other.studenetNumber != null)
				return false;
		} else if (!studenetNumber.equals(other.studenetNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "studenetNumber=" + studenetNumber + "," +super.toString();
	}
	
	
	

}
