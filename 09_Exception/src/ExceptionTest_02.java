import java.util.Scanner;

//2.RuntimeException인데 - API 있는 경우 - 문서를 보고 예측
public class ExceptionTest_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
		int input = s.nextInt();
		}catch(RuntimeException e){ // 내 부모 선언
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}

}
