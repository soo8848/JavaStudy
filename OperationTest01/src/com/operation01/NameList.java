package com.operation01;

public class NameList {
	String[] names;
	int count;
	
	public NameList() {
		this(5);
	}
	
	//0- nameList�� ����ϴ� ������
	public NameList(int length) {
		names = new String[length];
	}

	//1- ��ϵ� �̸��� Ȯ���ϴ� ���
	@Override
	public String toString() {
		String m="";
		for (int i = 0; i < count; i++) m += names[i];{
			return m;
		}
	}
	
	//2- 3- ����� �̸��� ���(�߰�)�ϴ� ��� -(�ߺ�����)
	public void add(String name) {
		for (int i = 0; i < count; i++) {
			if(names[i].equals(name)) return;
			if(names.length == count) return;
		}
		names[count++]=name;
	}
	
	
}
