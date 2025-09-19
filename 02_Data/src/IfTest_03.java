import java.util.Scanner;

/**김재욱 */
/**요구사항: 입력 값이 짝수 이거나 7의 배수 여부 확인. 단, 입력값이 0일 경우 따로 처리해주어야한다. */
public class IfTest_03 {
	public static void main(String[] args) {
		int input=14;
		String message="";
		if (input != 0){;
		if (input % 2 == 0 )message="짝수" + message; 
		if (input % 7 == 0) message += "7의 배수";
		} else message += "0입니다";
		System.out.println(message + " 끝 ");
	}
}