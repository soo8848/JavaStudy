package test.com.oopsw.school;

// �л� �Ǵ� ���� 3�� ���� �Է�/Ȯ��
// �߿� ����Ʈ �ܾ�: �Ǵ�(�ٲ� �� �ִ� �䱸�����̴�.)
// 3��(��������[]) �Է�(�ѹ��� �Է� -> ������) Ȯ��(print())

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class shcoolinformationInputCheck {
	public static void main(String[] args) {
		// �л� �Ǵ� ���� 3�� ���� �Է� ��� Ȯ��
		// �л��� �й�, �̸�, ����
		// ����� ����, ����, �̸�, ����
		//������ - 
		Person[] schoolPerson = { 
				new Teacher("2001", "����", "�ƹ���", 'F'), 
				new Student("200122", "ȫ�浿", 'M'),
				new Student("200123", "�ڼ���", 'F') 
				};
		// ���ο� ���� instanceOf������
		// �����߿��� �л��� ������ Ȯ�� - �й��� Ȯ�� 
		for (int i = 0; i < schoolPerson.length; i++) {
			if(schoolPerson[i] instanceof Student){
//			schoolPerson[i].print(); // �θ�� �����ϸ� �ڽ� �����θ� N�� ��� // �⺻������ byte�������� ���� , ��ü�� ������� ����
				Student s=(Student)schoolPerson[i]; // object casting
				System.out.println(s.getStudentNumber());
			}
 		}
	}
}
