/**  기본형 자료형 - 정수 */
public class DataTypeTest {
	public static void main(String[] args) {
		// 요구사항
		// 월 입력
		int m1 = 10;
		byte m2 = 10; // VM이 범위를 체크
		// 50% 입력
		 float f1 = 0.5F; // 근사값 이고 실수의 기본형은 Double이다.

		 byte b1 = 10+10;
		 // 자바 컴파일러가 변수의 자료형 체크 (-128~127)
		 byte b2 = (byte) (b1 + 10); // byte, short -> int
		 byte b3 = Byte.MAX_VALUE;
		 int i = Integer.MAX_VALUE;
		 System.out.println(b3); //127
		 System.out.println(i); //2147483647
		 System.out.println(b3 +1); //128
		 System.out.println(i +1); //-2147483648 - 내가 원하는 값이 아님 - 텍스트 결과를 확인하는 연습이 꼭 필요하다.
		 System.out.println(i +1L); 
		 // >> << >>> ^ | &  ~ 
		 byte b5=5, b6=6; // 00000101 00000110
		 System.out.println(b5 & b6);
		 System.out.println(b5 | b6);
		 System.out.println(b5 ^ b6);
		 
		 
	}//main
}//class
