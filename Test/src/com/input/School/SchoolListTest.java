package com.input.School;

/**
 * 김재욱 
 * 학생 또는 교사 정보를 2개 입력(학번,이름) (교사번호,이름) 단, 중복 저장하지 않는다. 
 * 입력 후 모든 정보를 확인한다.
 */
public class SchoolListTest {
	public static void main(String args[]) {
		SchoolList list = new SchoolList(2);
		System.out.println(list);
		list.add(new Student("전혜영","2001001"));
		list.add(new Student("전현무","2001002"));
		list.add(new Teacher("전지형","2001003"));
		list.add(new Teacher("전구형","2001004"));
//		list.add(new Student("전혜영","2001001"));
		System.out.println(list);
	}
}