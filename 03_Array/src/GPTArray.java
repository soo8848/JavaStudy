import java.util.Scanner;

public class GPTArray {
	    public static void main(String[] args) {
	        int firstNum, secondNum;
	        int inputMin, inputMax;

	        try (Scanner sc = new Scanner(System.in)) {
	            while (true) {
	                System.out.print("2~9 사이의 숫자를 두 번 입력하세요: ");
	                firstNum = sc.nextInt();
	                secondNum = sc.nextInt();

	                if ((firstNum >= 2 && firstNum <= 9) && (secondNum >= 2 && secondNum <= 9)) {
	                    inputMin = Math.min(firstNum, secondNum);
	                    inputMax = Math.max(firstNum, secondNum);
	                    break;
	                }
	                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
	            }
	        }

	        StringBuilder output = new StringBuilder();
	        for (int i = 1; i <= 9; i++) {
	            for (int dan = inputMin; dan <= inputMax; dan++) {
	                output.append(dan).append("*").append(i)
	                      .append("=").append(dan * i).append("\t");
	            }
	            output.append("\n");
	        }

	        System.out.print(output);
	    }
	}

