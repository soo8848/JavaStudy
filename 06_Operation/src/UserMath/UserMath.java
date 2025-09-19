package UserMath;
public class UserMath { 
	// 생성자를 무조건 제공해서 클래스가 분리되어 있어도 접근이 가능함.
	private UserMath() {// 계산식 or 구현부가 절대 안바뀔 코드 -> 생성자 막고 static
	}

	// 두수를 입력해서 최대값을 확인
	public static int max(int num1, int num2) { // 인터페이스 찾아내는게 어려운거예요.
		if (num1 > num2)
			return num1;
		return num2;
	}

	// 두수를 입력해서 최소값을 확인
	public static int min(int num1, int num2) {
		if (num1 > num2)
			return num2;
		return num1;
	}
	// 유니코드를 입력하면 해당 문자를 확인
	public static char unicode(int code) {
		return (char) code;
	}
	// 점수를 입력하면 학점(A, B,C, F)를 확인
	public static char grade(int score) {
		char grade='F';
		if(score<=100 && score>90) grade='A';
		else if(score<=90 && score >80) grade='B';
		else if(score<=80 && score >70) grade='C';
		
		return grade;
	}
}
