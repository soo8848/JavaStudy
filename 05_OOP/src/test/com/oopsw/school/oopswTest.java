package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;


public class oopswTest {
	public static void main(String args[]) {
		Student s1 = new Student("200101001","홍길동",'M');
		s1.print();

		Teacher t1 = new Teacher("t001","수학 ","wjsgPdud",'F');
		t1.print();
		// 사이즈가 44, 55, 66, S, M, L
		int size='S';
		//학생 또는 교사의 정보를 입력, 확인 -이 경우 가장가까운 부모로 선언하는걸 권장
		//다형성 (1.상속관계, 2.재정의메서드가 무조건 있어야 함. 3. 부모로 선언 = new 자식() 으로 생성해야한다.
//		Person p=s1; // 선언은 컴파일 할때만 체크 실행할떄는 무조건 생성하는 애가 우선 즉, Student가 기준
		Person p=new Student("200101002", "이순신 ", 'M'); // 실행할떄는 Student가 우선
		p.print();                                     // 즉, Student의 print가 실해오딘다.
	}
}
// 이게 진짜 필요한가? 대표적으로 엤날에는 학생과 교수 주소가 따로 있었다. 그래서 해킹 시 그냥 교수 주소만 털면 됐다. 그래서 
// 모두가 로그인 가능하게 해놓고 (인증인가) 교수가 들어오면 교수화면, 학생은 학생화면, 사원은 사원화면을 보여줌.
// 그래서 객체 지향의 꽃(핵심)인 다향성이 필요한 것이다.