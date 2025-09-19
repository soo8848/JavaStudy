package com.operation01;

public class NameListTest {

	public static void main(String[] args) {
		NameList namelist = new NameList(5);
		System.out.println(namelist);
		namelist.add("홍길동");
		namelist.add("장길동");
		namelist.add("장길동");
		System.out.println(namelist);
	}

}
