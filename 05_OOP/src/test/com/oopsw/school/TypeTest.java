package test.com.oopsw.school;

import com.oopsw.school.Person;

public class TypeTest {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		String s1 = "hi";
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		String s5 = s4;
		Person p1 = new Person("ȫ�浿", 'M');
		Person p2 = new Person("ȫ�浿", 'M');
		// �ߺ� ���� Ȯ��
		System.out.println(num1 == num2); // true
		System.out.println(s1 == s2); // true
		System.out.println(s3 == s4);// false
		System.out.println(s5 == s4);// true
		System.out.println(s3.equals(s4));// true
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // false // �ڵ� �������̵�(������)����

		System.out.println(num1);
		System.out.println(s1);
		System.out.println(p1); // @���� Ÿ�� �ڴ� �ּ�       com.oopsw.school.Person@2a139a55
		System.out.println(p1.toString()); // �� �� �޼��� com.oopsw.school.Person@2a139a55
	}

}
