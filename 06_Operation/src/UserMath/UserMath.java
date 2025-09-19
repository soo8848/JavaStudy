package UserMath;
public class UserMath { 
	// �����ڸ� ������ �����ؼ� Ŭ������ �и��Ǿ� �־ ������ ������.
	private UserMath() {// ���� or �����ΰ� ���� �ȹٲ� �ڵ� -> ������ ���� static
	}

	// �μ��� �Է��ؼ� �ִ밪�� Ȯ��
	public static int max(int num1, int num2) { // �������̽� ã�Ƴ��°� �����ſ���.
		if (num1 > num2)
			return num1;
		return num2;
	}

	// �μ��� �Է��ؼ� �ּҰ��� Ȯ��
	public static int min(int num1, int num2) {
		if (num1 > num2)
			return num2;
		return num1;
	}
	// �����ڵ带 �Է��ϸ� �ش� ���ڸ� Ȯ��
	public static char unicode(int code) {
		return (char) code;
	}
	// ������ �Է��ϸ� ����(A, B,C, F)�� Ȯ��
	public static char grade(int score) {
		char grade='F';
		if(score<=100 && score>90) grade='A';
		else if(score<=90 && score >80) grade='B';
		else if(score<=80 && score >70) grade='C';
		
		return grade;
	}
}
