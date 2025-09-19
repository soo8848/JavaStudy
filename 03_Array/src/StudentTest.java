import java.util.Scanner;

/**김재욱 1명의 학생의 정보는 학번, 이름, 성별 있다.
 * 2명의 학생의 정보를 입력하고 확인한다.*/
public class StudentTest {
	public static void main(String[] args){
		String studentNumber1="2001010019"; 
		String name1="홍길동";
		String gender1="남성";
		
		String studentNumber2="2001010029"; 
		String name2="김숙이";
		String gender2="여성";

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 1의 학번을 입력: ");
		studentNumber1 = sc.next();
		System.out.println("학번확인: " + studentNumber1);
		System.out.print("학생 1의 이름을 입력: ");
		name1 = sc.next();
		System.out.println("이름확인: " + name1);
		System.out.print("학생 1의 성별을 입력(남성,여성): ");
		gender1 = sc.next();
		System.out.println("성별확인: " + gender1);
		
		System.out.print("학생 2의 학번을 입력: ");
		studentNumber2 = sc.next(); 
		System.out.println("학번확인: " + studentNumber2);
		System.out.print("학생 2의 이름을 입력: ");
		name2 = sc.next();
		System.out.println("이름확인: " + name2);
		System.out.print("학생 2의 성별을 입력(남성,여성): ");
		gender2 = sc.next();
		System.out.println("성별확인: " + gender2);
		
		System.out.println("확인작업이 끝났습니다. ");
		
	}//main

}
