import java.util.Scanner;

//2.RuntimeException�ε� - API �ִ� ��� - ������ ���� ����
public class ExceptionTest_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
		int input = s.nextInt();
		}catch(RuntimeException e){ // �� �θ� ����
			e.printStackTrace();
		}
		System.out.println("���� ����");
	}

}
