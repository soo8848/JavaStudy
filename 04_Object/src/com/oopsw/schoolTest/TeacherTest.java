package com.oopsw.schoolTest;

import java.util.Scanner;

/**
 * ����� ����� �����ȣ, ������, �̸�, ���� ������ ������. ���� ������ 3�� �Է� �������� ��Ȯ�� ������ ������ Ȯ��
 */
public class TeacherTest {
	// �����ִ� �ڵ�
//	private TeacherTest() {}
	public static void main(String[] args) {
		
//		 ����, ����, ����
		 SchoolTeacherTestVO koreanLanguageTeacher = new
		 SchoolTeacherTestVO(993747461, "����", "�豹��", 'M');
		 SchoolTeacherTestVO englishTeacher = new
		 SchoolTeacherTestVO(993747462, "����", "�ڿ���", 'W');
		 SchoolTeacherTestVO mathTeacher = new
		 SchoolTeacherTestVO(993747463, "����", "�ּ���", 'W');
		 koreanLanguageTeacher.techearInformationPrint();
		 englishTeacher.techearInformationPrint();
		 mathTeacher.techearInformationPrint();

	}
}
