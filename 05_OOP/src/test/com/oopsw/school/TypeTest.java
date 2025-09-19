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
		Person p1 = new Person("홍길동", 'M');
		Person p2 = new Person("홍길동", 'M');
		// 중복 여부 확인
		System.out.println(num1 == num2); // true
		System.out.println(s1 == s2); // true
		System.out.println(s3 == s4);// false
		System.out.println(s5 == s4);// true
		System.out.println(s3.equals(s4));// true
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // false // 자동 오버라이딩(재정의)가능

		System.out.println(num1);
		System.out.println(s1);
		System.out.println(p1); // @앞은 타입 뒤는 주소       com.oopsw.school.Person@2a139a55
		System.out.println(p1.toString()); // 콜 백 메서드 com.oopsw.school.Person@2a139a55
	}

}
