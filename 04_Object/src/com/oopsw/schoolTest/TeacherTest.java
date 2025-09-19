package com.oopsw.schoolTest;

import java.util.Scanner;

/**
 * 김재욱 교사는 교사번호, 담당과목, 이름, 성별 정보를 가진다. 교사 정보를 3명 입력 담당과목이 수확인 교사의 정보를 확인
 */
public class TeacherTest {
	// 숨어있는 코드
//	private TeacherTest() {}
	public static void main(String[] args) {
		
//		 국어, 영어, 수학
		 SchoolTeacherTestVO koreanLanguageTeacher = new
		 SchoolTeacherTestVO(993747461, "국어", "김국어", 'M');
		 SchoolTeacherTestVO englishTeacher = new
		 SchoolTeacherTestVO(993747462, "영어", "박영어", 'W');
		 SchoolTeacherTestVO mathTeacher = new
		 SchoolTeacherTestVO(993747463, "수학", "최수학", 'W');
		 koreanLanguageTeacher.techearInformationPrint();
		 englishTeacher.techearInformationPrint();
		 mathTeacher.techearInformationPrint();

	}
}
