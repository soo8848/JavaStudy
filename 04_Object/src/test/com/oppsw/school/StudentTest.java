package test.com.oppsw.school;

import com.oopsw.school.StudentVO;

public class StudentTest {

	public static void main(String[] args) {
		// 정수	
		int number = 10; // 근데 내가 만든건 VM이 잘 모름. 그래서 이름이 똑같으면 왼쪽과 오른쪽이 같아야됨. 이건 VM이 알아서 함.
		// 학생의 정보(사용자 정의 타입)를 입력
		// 같은거다. 라고 규정을 한거임. 엄밀히 말하면 왼쪽과 오른쪽의
		// 역할이 다르니 오른쪽에 ()소괄호를 준다.
		StudentVO s1 = new StudentVO();
		StudentVO s2 = new StudentVO("200101002","전혜영",'F');  
//		s2.setStudentNumber("02001001"); // public을 private로 바꿔서 애만 권환이 없다
		s2.setName("홍");
		s2.setGender('X');
		
		s1.print();
		s2.print();
//		
//		System.out.println(s1.getStudentNumber());
//		System.out.println(s1.getName());
//		System.out.println(s1.getGender());
//		
//		System.out.println(s2.getStudentNumber());
//		System.out.println(s2.getName());
//		System.out.println(s2.getGender());
	}

}
