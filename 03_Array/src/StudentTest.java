import java.util.Scanner;

/**����� 1���� �л��� ������ �й�, �̸�, ���� �ִ�.
 * 2���� �л��� ������ �Է��ϰ� Ȯ���Ѵ�.*/
public class StudentTest {
	public static void main(String[] args){
		String studentNumber1="2001010019"; 
		String name1="ȫ�浿";
		String gender1="����";
		
		String studentNumber2="2001010029"; 
		String name2="�����";
		String gender2="����";

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� 1�� �й��� �Է�: ");
		studentNumber1 = sc.next();
		System.out.println("�й�Ȯ��: " + studentNumber1);
		System.out.print("�л� 1�� �̸��� �Է�: ");
		name1 = sc.next();
		System.out.println("�̸�Ȯ��: " + name1);
		System.out.print("�л� 1�� ������ �Է�(����,����): ");
		gender1 = sc.next();
		System.out.println("����Ȯ��: " + gender1);
		
		System.out.print("�л� 2�� �й��� �Է�: ");
		studentNumber2 = sc.next(); 
		System.out.println("�й�Ȯ��: " + studentNumber2);
		System.out.print("�л� 2�� �̸��� �Է�: ");
		name2 = sc.next();
		System.out.println("�̸�Ȯ��: " + name2);
		System.out.print("�л� 2�� ������ �Է�(����,����): ");
		gender2 = sc.next();
		System.out.println("����Ȯ��: " + gender2);
		
		System.out.println("Ȯ���۾��� �������ϴ�. ");
		
	}//main

}
