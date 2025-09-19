import java.util.Scanner;

/**김재욱
 * 요구사항: 숫자를 입력받아서 구구단을 출력*/
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