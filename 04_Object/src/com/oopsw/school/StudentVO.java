package com.oopsw.school;
// 첫번쨰 보이는 거에서 눈썰미를 키워라.  
public class StudentVO {
	// 1. class's 멤버 데이터- 일반적으로 데이터는 private 권장  -> 권장이므로 안쓰는 예외상황도있다. -> ex) public static final int MAX_VALUE = 100; // 어짜피 제일 큰 값은 고정(static)이고 값이 마지막(final)으로 수정이 불가능하니 공개 공유(public)하자.
	private String studentNumber; // - private를 쓰는 이유는 쓰레기 값이 들어오는걸 방지하기 위해서이다.
	private String name="이름없음";
	private char gender='M'; 
	//3. 메모리 할당 동시에 초기화 생성자 // 왜 생성자를 중간에 작성했는가? 
	//생성자를 정의하지 않으면 VM이 매개인자 없는 생성자를 기본 제공한다.
	//overloading = 입력값의 다양성
	public StudentVO() {};
	public StudentVO(String studentNumber, String name, char gender) {
		setStudentNumber(studentNumber);
		setName(name);
		setGender(gender);
//		this.studentNumber = studentNumber;
//		this.name = name;
//		this.gender = gender;
	}
    //2. setXxxx, getSss 일반적으로 public 권장 - 메서드는 리턴타입, 매개인자 업무 선택
	private void setStudentNumber(String studentNumber) { // 왜 private 로 바꿔야되는가?  이미 setStudentNumber는 내부적으로 쓰고 있음.
		//조건
		this.studentNumber = studentNumber;
	}
	public String getStudentNumber() {
		return studentNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() >= 2)
			this.name = name;
	}

	public char getGender() {
		return gender;
	}

	// M, F 라는 성별만 입력하고 싶은 요구사항 처리
	public void setGender(char gender) {
		switch (gender) {
		case 'M':
		case 'F':
			this.gender = gender;
		}
	}
	// 조심 해야될게 출력은 return은 안한다. println명령어를 보면 알 수 있다. void이다. 이미 1.에 데이터가 다 있으므로 입력값도 필요 없다.
	// 4. 요구사항: 한꺼번에 출력하고 싶다.
	public void print(){
		System.out.println("학번: "+studentNumber);
		System.out.println("이름: "+name);
		System.out.println("성별: "+gender);
	}
}	
