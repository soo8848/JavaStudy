package com.input.School;

/**
 * ����� 
 * �л� �Ǵ� ���� ������ 2�� �Է�(�й�,�̸�) (�����ȣ,�̸�) ��, �ߺ� �������� �ʴ´�. 
 * �Է� �� ��� ������ Ȯ���Ѵ�.
 */
public class SchoolListTest {
	public static void main(String args[]) {
		SchoolList list = new SchoolList(2);
		System.out.println(list);
		list.add(new Student("������","2001001"));
		list.add(new Student("������","2001002"));
		list.add(new Teacher("������","2001003"));
		list.add(new Teacher("������","2001004"));
//		list.add(new Student("������","2001001"));
		System.out.println(list);
	}
}