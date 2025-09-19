//3. CheckedException - API 있는 경우
public class ExceptionTest_03 {
	public static void main(String[] args) {
		
		try {
//			Class.forName("java.lang.String"); // 숨어있는코드 new String()
			Class.forName("String"); // 숨어있는코드 new String()
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 스카이 다이빙 비행기 타기전에 낙하산이 없는 상황
		
		System.out.println("정상 종료 ");
	}

}
