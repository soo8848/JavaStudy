package com.operation01;

public class NameList {
	String[] names;
	int count;
	
	public NameList() {
		this(5);
	}
	
	//0- nameList를 등록하는 생성자
	public NameList(int length) {
		names = new String[length];
	}

	//1- 등록된 이름을 확인하는 기능
	@Override
	public String toString() {
		String m="";
		for (int i = 0; i < count; i++) m += names[i];{
			return m;
		}
	}
	
	//2- 3- 사용자 이름을 등록(추가)하는 기능 -(중복방지)
	public void add(String name) {
		for (int i = 0; i < count; i++) {
			if(names[i].equals(name)) return;
			if(names.length == count) return;
		}
		names[count++]=name;
	}
	
	
}
