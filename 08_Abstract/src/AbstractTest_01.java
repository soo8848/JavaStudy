// 1. Ŭ������ �����ڷ� abstract�� ���� new�ڿ� �����ڸ� ������. �̰� �ٽ��̿���.
// Object�� �ٽ� - ��� Ŭ������ �θ�, ������ ���� �и�ϱ� �ʼ� ���
// �߻� Ŭ������ ������ �ʼ� - WindowAdapter�� �� ���Ҽ��� �������?  ���������� �ʿ��� ����� ��Ӹ� ���� ex)���α�?
abstract class SuperA{  // �̰� 1.1�̱���.
//	private SuperA() {}
	public SuperA() {
		System.out.println("SuperA()");
	}
}
// 1.3���� ���: <- �ڽ� Ŭ������ �ʼ�
class SubA extends SuperA{}

public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1;	//�������� �ʱ�ȭ �ʼ�
//		a1=new SuperA(); //�̰� 1.2���̿���. new�� ���ؿ�.X
		a1=new SubA(); // �̰� 1.4����
		System.out.println(a1);
	}
}