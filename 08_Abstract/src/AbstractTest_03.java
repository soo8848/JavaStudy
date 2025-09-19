//3. 출력, 성별확인, .... 핵심 ===> 모든 업무의 구현부를 결정 X

abstract class SuperC {
	public abstract void print();

	public abstract void methodC();
}

class SubC extends SuperC {
	@Override
	public void print() {
		System.out.println("SubC's print()");
	}

	@Override
	public void methodC() {
		System.out.println("SubC's printC()");
	}
}

public class AbstractTest_03 {
	public static void main(String[] args) {
		SuperC c = new SubC();
		c.methodC();
		c.print();
	}
}
