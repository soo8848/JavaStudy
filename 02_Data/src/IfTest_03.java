import java.util.Scanner;

/**����� */
/**�䱸����: �Է� ���� ¦�� �̰ų� 7�� ��� ���� Ȯ��. ��, �Է°��� 0�� ��� ���� ó�����־���Ѵ�. */
public class IfTest_03 {
	public static void main(String[] args) {
		int input=14;
		String message="";
		if (input != 0){;
		if (input % 2 == 0 )message="¦��" + message; 
		if (input % 7 == 0) message += "7�� ���";
		} else message += "0�Դϴ�";
		System.out.println(message + " �� ");
	}
}