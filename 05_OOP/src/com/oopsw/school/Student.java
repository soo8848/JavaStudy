package com.oopsw.school; // VM �ڽ� �����ڴ� �θ� �⺻ �����ڸ� ȣ�� 
//VM�� �����ڰ� ������ ������ ������. �ٵ� VM �ڽ� �����ڴ� �θ� �⺻ �����ڸ� ȣ���ϴ°� �����ִ�.
public class Student extends Person {
	//2
	//public Student() {super();} ������ ������ ������ �ִµ� super(��¼��,��¼��)�� ����� ������ ��������� VM�� ������ �����ڸ� ���������� �ʴ´�.
	private String studentNumber;

	
	public Student(String studentNumber, String name, char gender) {
		super(name, gender);	//�ֳ׵��� 1��° �ٿ� 1���� �� �� �ִ�. - �����ڰ� �ٸ� �����ڸ� ȣ���ҋ� // �����ڸ� �����ε��ع����� ����Ʈ �����ڰ� ������ �ȵǰ� �׷��� ������ �ȳ���.
		setStudentNumber(studentNumber);    //�޼���� �� ������� ȣ���� �� �ִ�.
//		this.studentNumber = studentNumber; //�޼���� �� ������� ȣ���� �� �ִ�.
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
	
	//overriding = ��ӹ��� �޼����� �����θ� ���� => ������
	public void print() {
		System.out.println("�й�: "+studentNumber);
		super.print();
	}
}
