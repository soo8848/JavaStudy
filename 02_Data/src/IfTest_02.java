import java.util.Scanner;

/** ����� */
public class IfTest_02 {
	public static void main(String[] args) {
		// �Է� ���� ¦�� �̰ų� 7�� ��� ���θ� Ȯ���ϼ���.
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		if (input % 2 == 0 || input % 7 == 0) {
			if (input % 2 ==0) {
				System.out.println("¦�� ");
			}
			if (input % 7 == 0) {
				System.out.println("7�� ��� ");
			}
		}
	}
}