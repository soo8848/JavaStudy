import java.util.Scanner;

/**
 * �����
 * �䱸����: �� ���� �Է¹޾Ƽ� �������� ���
 */
public class loopTest_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = 0, input2 = 0;
		int inputMin = 0, inputMax = 0;


		while(true) {
			System.out.print("2~9������ ���ڸ� �ι� �Է��Ͻʽÿ�. :");
			input1 = sc.nextInt();
			input2 = sc.nextInt();

			if((input1 >= 2 && input1 <= 9) && (input2 >=2 && input2 <=9)) {
				inputMin = Math.min(input1, input2);
				inputMax = Math.max(input1, input2);
				break;
			} else {
				System.out.println("2~9������ ���ڸ� �Է��Ͻʽÿ�."); 
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
