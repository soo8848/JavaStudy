package com.oopsw.school;
// ù���� ���̴� �ſ��� ����̸� Ű����.  
public class StudentVO {
	// 1. class's ��� ������- �Ϲ������� �����ʹ� private ����  -> �����̹Ƿ� �Ⱦ��� ���ܻ�Ȳ���ִ�. -> ex) public static final int MAX_VALUE = 100; // ��¥�� ���� ū ���� ����(static)�̰� ���� ������(final)���� ������ �Ұ����ϴ� ���� ����(public)����.
	private String studentNumber; // - private�� ���� ������ ������ ���� �����°� �����ϱ� ���ؼ��̴�.
	private String name="�̸�����";
	private char gender='M'; 
	//3. �޸� �Ҵ� ���ÿ� �ʱ�ȭ ������ // �� �����ڸ� �߰��� �ۼ��ߴ°�? 
	//�����ڸ� �������� ������ VM�� �Ű����� ���� �����ڸ� �⺻ �����Ѵ�.
	//overloading = �Է°��� �پ缺
	public StudentVO() {};
	public StudentVO(String studentNumber, String name, char gender) {
		setStudentNumber(studentNumber);
		setName(name);
		setGender(gender);
//		this.studentNumber = studentNumber;
//		this.name = name;
//		this.gender = gender;
	}
    //2. setXxxx, getSss �Ϲ������� public ���� - �޼���� ����Ÿ��, �Ű����� ���� ����
	private void setStudentNumber(String studentNumber) { // �� private �� �ٲ�ߵǴ°�?  �̹� setStudentNumber�� ���������� ���� ����.
		//����
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

	// M, F ��� ������ �Է��ϰ� ���� �䱸���� ó��
	public void setGender(char gender) {
		switch (gender) {
		case 'M':
		case 'F':
			this.gender = gender;
		}
	}
	// ���� �ؾߵɰ� ����� return�� ���Ѵ�. println��ɾ ���� �� �� �ִ�. void�̴�. �̹� 1.�� �����Ͱ� �� �����Ƿ� �Է°��� �ʿ� ����.
	// 4. �䱸����: �Ѳ����� ����ϰ� �ʹ�.
	public void print(){
		System.out.println("�й�: "+studentNumber);
		System.out.println("�̸�: "+name);
		System.out.println("����: "+gender);
	}
}	
