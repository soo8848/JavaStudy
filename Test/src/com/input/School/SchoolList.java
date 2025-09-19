package com.input.School;

public class SchoolList {
	private Person[] list;
	private int count;
	
	public SchoolList(int length) {
		list=new Person[length];
	}

	public void add(Person p) {
		if(count == list.length) return;
		for(int i=0; i<count; i++){
			if(list[i].equals(p)) return;
		}
		list[count++] = p;
	}

	@Override
	public String toString() {
		String message="";
		for (int i = 0; i < count; i++) {
			message +=list[i].toString() + "\n";
		}
		return message;
	}
	
	
	
	
}
