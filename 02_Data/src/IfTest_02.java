import java.util.Scanner;

/** 김재욱 */
public class IfTest_02 {
	public static void main(String[] args) {
		// 입력 값이 짝수 이거나 7의 배수 여부를 확인하세요.
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		if (input % 2 == 0 || input % 7 == 0) {
			if (input % 2 ==0) {
				System.out.println("짝수 ");
			}
			if (input % 7 == 0) {
				System.out.println("7의 배수 ");
			}
		}
	}
}