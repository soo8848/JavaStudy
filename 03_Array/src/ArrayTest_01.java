/** ����� ����� 44, 55, 66 ,77 ���ִ�. ==> �Է�, ��� */
public class ArrayTest_01 {
	public static void main(String[] args) {
		int size1 = 44;
		int size2 = 55;
		int size3 = 66;
		int size4 = 77;
		// �迭�� Ŭ������ ���� ������ ��ü
		int[] size; // ����
		size = new int[4]; // �迭 ũ�� ����
		for (int i = 0; i < 4; i++)
			System.out.println(size[i]);

		// char [] cs= new char[] {'S','M','L','X'};
		char[] cs = { 'S', 'M', 'L', 'X' }; // ����, ����, �ʱ�ȭ
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		cs = new char[5];
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		System.out.println("end");
	}// main
}