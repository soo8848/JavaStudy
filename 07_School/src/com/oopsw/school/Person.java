package com.oopsw.school;
//1)Data - ���� �ڵ� ����
public class Person { //extends Object
	//1.1
	private String name;
	//1.3
	public Person(String name) {
		super();
//		this.name = name;
		setName(name);
	}
	//1.2
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//1.4 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "name=" + name ;
	}
	
	
	
}

