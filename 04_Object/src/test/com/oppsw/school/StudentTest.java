package test.com.oppsw.school;

import com.oopsw.school.StudentVO;

public class StudentTest {

	public static void main(String[] args) {
		// ����	
		int number = 10; // �ٵ� ���� ����� VM�� �� ��. �׷��� �̸��� �Ȱ����� ���ʰ� �������� ���ƾߵ�. �̰� VM�� �˾Ƽ� ��.
		// �л��� ����(����� ���� Ÿ��)�� �Է�
		// �����Ŵ�. ��� ������ �Ѱ���. ������ ���ϸ� ���ʰ� ��������
		// ������ �ٸ��� �����ʿ� ()�Ұ�ȣ�� �ش�.
		StudentVO s1 = new StudentVO();
		StudentVO s2 = new StudentVO("200101002","������",'F');  
//		s2.setStudentNumber("02001001"); // public�� private�� �ٲ㼭 �ָ� ��ȯ�� ����
		s2.setName("ȫ");
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
