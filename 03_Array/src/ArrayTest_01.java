/** 김재욱 사이즈가 44, 55, 66 ,77 이있다. ==> 입력, 출력 */
public class ArrayTest_01 {
	public static void main(String[] args) {
		int size1 = 44;
		int size2 = 55;
		int size3 = 66;
		int size4 = 77;
		// 배열은 클래스가 없는 유일한 객체
		int[] size; // 선언
		size = new int[4]; // 배열 크기 생성
		for (int i = 0; i < 4; i++)
			System.out.println(size[i]);

		// char [] cs= new char[] {'S','M','L','X'};
		char[] cs = { 'S', 'M', 'L', 'X' }; // 선언, 생성, 초기화
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		cs = new char[5];
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		System.out.println("end");
	}// main
}