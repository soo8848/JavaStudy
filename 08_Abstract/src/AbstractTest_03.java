//3. ���, ����Ȯ��, .... �ٽ� ===> ��� ������ �����θ� ���� X

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
