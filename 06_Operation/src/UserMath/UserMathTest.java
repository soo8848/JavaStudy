package UserMath;

public class UserMathTest {
	public static void main(String[] args) {
//		UserMath u1=new UserMath();
		System.out.println(UserMath.max(10, 11)); // �����߿�.
		System.out.println(UserMath.max(10, 11)); // �ȵǴ°� �׽�Ʈ�ϱ�.
		System.out.println(UserMath.min(10, 11));
		System.out.println(UserMath.min(10, 10));
		System.out.println(UserMath.unicode(65));
		System.out.println(UserMath.unicode(-65)); // �����ذ�
		System.out.println(UserMath.grade(100));
		System.out.println(UserMath.grade(80));
		System.out.println(UserMath.grade(10));
	}

}
