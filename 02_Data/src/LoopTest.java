import java.util.Scanner;

/**�����
 * �䱸����: ���ڸ� �Է¹޾Ƽ� �������� ���*/
public class LoopTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String output = "";
		 
		for(int i = 1; i <= 9; i++) {
			output += input + "*" + i + "=" + input*i + "\n";
		}
		
		System.out.println(output);
	}

}