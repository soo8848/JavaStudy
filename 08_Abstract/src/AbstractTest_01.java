// 1. 클래스에 지정자로 abstract를 쓰면 new뒤에 생성자를 못쓴다. 이게 핵심이예요.
// Object의 핵심 - 모든 클래스의 부모, 유일한 공통 분모니까 필수 상속
// 추상 클래스는 다형성 필수 - WindowAdapter는 왜 정할수가 없을까요?  최종적으로 필요한 사람만 상속만 유도 ex)돋부기?
abstract class SuperA{  // 이게 1.1이구요.
//	private SuperA() {}
	public SuperA() {
		System.out.println("SuperA()");
	}
}
// 1.3번쨰 방법: <- 자식 클래스가 필수
class SubA extends SuperA{}

public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1;	//지역변수 초기화 필수
//		a1=new SuperA(); //이게 1.2번이예요. new를 못해요.X
		a1=new SubA(); // 이게 1.4번쨰
		System.out.println(a1);
	}
}