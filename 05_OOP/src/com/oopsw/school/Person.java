package com.oopsw.school;

public class Person { //숨어있는 코드: extends Object
	private String name;
	private char gender;
	
//	public Person(){} //판단이 안서면 초보자면 디폴트 생성자를 만들어주는게 좋다.  왜? 모든 경우의 수를 계산할 수는 없으니까
	
	public Person(String name, char gender) {
		setName(name);
		setGender(gender);
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
	public void print() {
		System.out.println("이름: "+ name);
		System.out.println("성: "+ gender);
	}
	//Data 중심 객체는 Overriding 권장 뭘 권장하나면
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
