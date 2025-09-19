import java.util.*; // 패키지 내 모든 객체 활용
//어떤 값을 N개 저장하는데 단 중복 저장하지 않는다. == equals()
public class SetTest {
	public static void main(String[] args) {
		Collection c;
		c=new HashSet();
		
		System.out.println(c.add(1234)); //1.5 int -> Interger 1.5부터 래퍼클래스로 자동변환 해줌.
		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); //이렇게 테스트 코드부터 만드는걸 TDD라고 한다.
		System.out.println(c.add(1234)); //1.5 int -> Interger 1.5부터 래퍼클래스로 자동변환 해줌.
		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); //이렇게 테스트 코드부터 만드는걸 TDD라고 한다.
		System.out.println(c);//콜백패턴 - 생명주기 메서드
	}
}
// 정리하자면 개발자는 애랑 애가 같다는 거를 boolean형으로 비교하고 싶은게 본능이고 그게 equals에요. 자바는 모든 데이터가 리터럴 메모리를 건들린다고 했죠. 최종적으로 중간에 애매한 값을 비교하는게 의미가 없어요. 해시코드는 리턴타입이 int로 되어 있어요. 최종의 리터럴값의 추소체계를 계산해놓은게 hashcode예요. 주소가 아닌 주소 체계를 체크하는 거예요.