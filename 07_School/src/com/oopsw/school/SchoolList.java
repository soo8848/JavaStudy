package com.oopsw.school;

public class SchoolList {
	//1.1
	private Person[] list;
	private int count;
	
	//1.2
	public SchoolList(int length){
		list=new Person[length];
	}	
	//1. �л� �Ǵ� ���縦 �Է�
	public void add(Person p){
		//2.
		if(count == list.length) return;
		for(int i=0; i<count; i++){
			if(list[i].equals(p)) return;
		}
		list[count++] = p;
	}	
	//1.3 Ȯ��
	@Override
	public String toString() {
		String message="";
		for (int i = 0; i < count; i++) {
			message +=list[i].toString() + "\n";
		}
		return message;
	}
	
}
