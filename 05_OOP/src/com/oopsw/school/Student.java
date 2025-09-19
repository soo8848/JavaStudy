package com.oopsw.school; // VM 자식 생성자는 부모 기본 생성자를 호출 
//VM은 생성자가 없으면 묵시적 생성함. 근데 VM 자식 생성자는 부모 기본 생성자를 호출하는게 숨어있다.
public class Student extends Person {
	//2
	//public Student() {super();} 묵시적 선언이 숨겨져 있는데 super(어쩌구,저쩌구)로 명시적 선언을 해줘버려서 VM이 디폴드 생성자를 생성해주지 않는다.
	private String studentNumber;

	
	public Student(String studentNumber, String name, char gender) {
		super(name, gender);	//애네들은 1번째 줄에 1번만 올 수 있다. - 생성자가 다른 생성자를 호출할떄 // 생성자를 오버로딩해버리면 디폴트 생성자가 생성이 안되고 그러면 오류가 안난다.
		setStudentNumber(studentNumber);    //메서드는 내 마음대로 호출할 수 있다.
//		this.studentNumber = studentNumber; //메서드는 내 마음대로 호출할 수 있다.
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Student(String name, char gender, String studentNumber) {
		super(name, gender);
		this.studentNumber = studentNumber;
	}
	
	//overriding = 상속받은 메서드의 구현부를 변경 => 재정의
	public void print() {
		System.out.println("학번: "+studentNumber);
		super.print();
	}
}
