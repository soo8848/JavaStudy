//1.RuntimeException - API ���� ��� -> ��ǥ������ �迭 , ������
public class ExceptionTest_01 {
	public static void main(String[] args) {
		int num=10;
		try {// ������ġ - �׻����� ������ ����. ���������� �ִ� �ʷϻ� ������ ���� ��Ȳ ���
			System.out.println(args[0]); //�ٽ�: �̸� ���� ��Ȳ�� üũ
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace(); // ����� �� ���� ����ģ ������ ã�°�
		}
		System.out.println("���� ����");
	}
}