import java.util.Scanner;

/**
 * 김재욱
 * 요구사항: 두 수를 입력받아서 구구단을 출력
 */
public class loopTest_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = 0, input2 = 0;
		int inputMin = 0, inputMax = 0;


		while(true) {
			System.out.print("2~9사이의 숫자를 두번 입력하십시오. :");
			input1 = sc.nextInt();
			input2 = sc.nextInt();

			if((input1 >= 2 && input1 <= 9) && (input2 >=2 && input2 <=9)) {
				inputMin = Math.min(input1, input2);
				inputMax = Math.max(input1, input2);
				break;
			} else {
				System.out.println("2~9사이의 숫자만 입력하십시오."); 
			}
		} 
		
		for (int i=1; i <= 9; i++) {
			int dan=inputMin;
			while(dan <= inputMax) {
				System.out.printf("%d*%d=%-2d\t",dan,i,dan*i);
				dan++;
			}
			System.out.println();
		}

	}
}
