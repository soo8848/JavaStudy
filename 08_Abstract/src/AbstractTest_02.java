//�ʺ������� �ҽ��� �䱸������ �����Ѱ� �ش�. -> ����� ������ ����Ѵ�. �����߿��� �̸� ���� �ִ�. <- �ո��� ����. ~���� ���� �𸣴� �̸� ������ ���� = ������(����-���� ����, ���� ������ ����)
// 2.2 1�� �̻� �߻� �޼��尡 ������ ������ �߻� Ŭ������.
abstract class SuperB{ // �ָ��Ѱ� ���谡 �̸� Ʋ ����
	public void methodB(){} //{}�����ΰ� �ִ�. -> ������ ��Ȯ�ϱ���~
	public abstract void print();//2.1 abstract method --> �ٽ�: �����θ� ���� �� ����. X
}
//2.3 �߻� Ŭ������ ��ӹ��� �߻� �޼���� ������ �ʼ�
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
		b1.print(); // ������ <- ���� �ٽ��� �����ΰ� �ֳ� ���� �� ����
	}
}