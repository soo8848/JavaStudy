import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//어떤 값(UserOject)을 N개 저장하는데 
//순서 체크 할때도 있고
//중복을 체크 할때도 있다.
//ㄴ 요구사항이 들어왔는데 결정할 수 없다. -- 입력값으로 정하기 == 객체로 받아야된다.

public class ListSetTest {
	public static void printAll(Collection<UserObject> c) {
//		System.out.println(c.add(1234)); // 1.5 int -> Interger 1.5부터 래퍼클래스로
//											// 자동변환 해줌.
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); // 이렇게 테스트 코드부터 만드는걸
//															// TDD라고 한다.
//		System.out.println(c.add(1234)); // 1.5 int -> Interger 1.5부터 래퍼클래스로
//											// 자동변환 해줌.
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); // 이렇게 테스트 코드부터 만드는걸
															// TDD라고 한다.
		System.out.println(c);// 콜백패턴 - 생명주기 메서드

	}

	public static void main(String[] args) {
		printAll(new ArrayList());
		printAll(new HashSet());
	}

}
