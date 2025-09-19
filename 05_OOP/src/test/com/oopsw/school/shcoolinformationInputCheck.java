package test.com.oopsw.school;

// 학생 또는 교사 3명 정보 입력/확인
// 중요 포인트 단어: 또는(바뀔 수 있는 요구사항이다.)
// 3명(고정길이[]) 입력(한번에 입력 -> 생성자) 확인(print())

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class shcoolinformationInputCheck {
	public static void main(String[] args) {
		// 학생 또는 교사 3명 정보 입력 모두 확인
		// 학생은 학번, 이름, 성별
		// 교사는 교번, 과목, 이름, 성별
		//다형성 - 
		Person[] schoolPerson = { 
				new Teacher("2001", "수학", "아무개", 'F'), 
				new Student("200122", "홍길동", 'M'),
				new Student("200123", "박세희", 'F') 
				};
		// 새로운 문법 instanceOf연산자
		// 정보중에서 학생의 정보만 확인 - 학번을 확인 
		for (int i = 0; i < schoolPerson.length; i++) {
			if(schoolPerson[i] instanceof Student){
//			schoolPerson[i].print(); // 부모로 선언하면 자식 구현부를 N가 사용 // 기본개념은 byte개념으로 접근 , 객체는 상속으로 개념
				Student s=(Student)schoolPerson[i]; // object casting
				System.out.println(s.getStudentNumber());
			}
 		}
	}
}
