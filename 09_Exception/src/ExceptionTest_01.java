//1.RuntimeException - API 없는 경우 -> 대표적으로 배열 , 연산자
public class ExceptionTest_01 {
	public static void main(String[] args) {
		int num=10;
		try {// 안정장치 - 항상문제가 생기진 않음. 번지점프에 있는 초록색 안전망 같은 상황 사례
			System.out.println(args[0]); //핵심: 미리 예외 상황을 체크
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace(); // 차사고 후 서로 붙이친 흔적을 찾는거
		}
		System.out.println("정상 종료");
	}
}