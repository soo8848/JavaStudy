/**  �⺻�� �ڷ��� - ���� */
public class DataTypeTest {
	public static void main(String[] args) {
		// �䱸����
		// �� �Է�
		int m1 = 10;
		byte m2 = 10; // VM�� ������ üũ
		// 50% �Է�
		 float f1 = 0.5F; // �ٻ簪 �̰� �Ǽ��� �⺻���� Double�̴�.

		 byte b1 = 10+10;
		 // �ڹ� �����Ϸ��� ������ �ڷ��� üũ (-128~127)
		 byte b2 = (byte) (b1 + 10); // byte, short -> int
		 byte b3 = Byte.MAX_VALUE;
		 int i = Integer.MAX_VALUE;
		 System.out.println(b3); //127
		 System.out.println(i); //2147483647
		 System.out.println(b3 +1); //128
		 System.out.println(i +1); //-2147483648 - ���� ���ϴ� ���� �ƴ� - �ؽ�Ʈ ����� Ȯ���ϴ� ������ �� �ʿ��ϴ�.
		 System.out.println(i +1L); 
		 // >> << >>> ^ | &  ~ 
		 byte b5=5, b6=6; // 00000101 00000110
		 System.out.println(b5 & b6);
		 System.out.println(b5 | b6);
		 System.out.println(b5 ^ b6);
		 
		 
	}//main
}//class
