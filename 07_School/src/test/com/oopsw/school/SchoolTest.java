package test.com.oopsw.school;

import com.oopsw.school.SchoolList;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class SchoolTest {
	public static void main(String[] args) {
		//1 �Է�, Ȯ��
		SchoolList list=new SchoolList(2);		
		System.out.println(list);
		list.add(new Student("������", "200101001"));
		list.add(new Student("������", "200101001"));
		list.add(new Teacher("������", "200101001"));
		list.add(new Teacher("�̼���", "200101002"));
		System.out.println(list);
		
	}
}
