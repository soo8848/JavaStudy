//초보자한테 소스의 요구사항이 매해한걸 준다. -> 사람의 정보를 출력한다. 정보중에서 이름 등이 있다. <- 합리적 선택. ~등은 내가 모르니 이름 까지만 구현 = 유연성(기준-지금 결정, 나중 결정을 구분)
// 2.2 1개 이상 추상 메서드가 있으면 무조건 추상 클래스다.
abstract class SuperB{ // 애매한건 선배가 미리 틀 제공
	public void methodB(){} //{}구현부가 있다. -> 업무가 명확하구나~
	public abstract void print();//2.1 abstract method --> 핵심: 구현부를 정할 수 없다. X
}
//2.3 추상 클래스를 상속받은 추상 메서드는 재정의 필수
class Sub extends SuperB{
	@Override
	public void print() {
		System.out.println("Sub's print()");
	}
}
public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b1;
		b1=new Sub();
		b1.methodB();
		b1.print(); // 재정의 <- 애의 핵심은 구현부가 있냐 없냐 의 차이
	}
}