package com.operation01;

public class NameListTest {

	public static void main(String[] args) {
		NameList namelist = new NameList(5);
		System.out.println(namelist);
		namelist.add("ȫ�浿");
		namelist.add("��浿");
		namelist.add("��浿");
		System.out.println(namelist);
	}

}
