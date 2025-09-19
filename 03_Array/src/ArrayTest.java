import java.util.Scanner;

public class ArrayTest {
	public static void main(String args[]) {
		int input1=0;
		int input2=0;

		int inputMin=0;
		int inputMax=0;
		
		String sum="";

		Scanner sc = new Scanner(System.in);
		while(true) {
			input1=sc.nextInt();
			input2=sc.nextInt();

			if((input1 >= 2 && input1 <= 9) && (input2 >= 2 && input2 <= 9)) {
				inputMin=Math.min(input1, input2);
				inputMax=Math.max(input1, input2);
				break;
			}
		}
        for (int i = 1; i <= 9; i++) { // 1~9 °öÇÏ±â
            for (int j = inputMin; j <= inputMax; j++) { // ´Ü Áõ°¡
                sum += j + "*" + i + "=" + j*i + "\t";
            }
            sum += "\n";
        }
        
        System.out.print(sum);
        
	}// main
}