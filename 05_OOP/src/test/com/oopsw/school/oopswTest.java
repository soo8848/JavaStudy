package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;


public class oopswTest {
	public static void main(String args[]) {
		Student s1 = new Student("200101001","ȫ�浿",'M');
		s1.print();

		Teacher t1 = new Teacher("t001","���� ","wjsgPdud",'F');
		t1.print();
		// ����� 44, 55, 66, S, M, L
		int size='S';
		//�л� �Ǵ� ������ ������ �Է�, Ȯ�� -�� ��� ���尡��� �θ�� �����ϴ°� ����
		//������ (1.��Ӱ���, 2.�����Ǹ޼��尡 ������ �־�� ��. 3. �θ�� ���� = new �ڽ�() ���� �����ؾ��Ѵ�.
//		Person p=s1; // ������ ������ �Ҷ��� üũ �����ҋ��� ������ �����ϴ� �ְ� �켱 ��, Student�� ����
		Person p=new Student("200101002", "�̼��� ", 'M'); // �����ҋ��� Student�� �켱
		p.print();                                     // ��, Student�� print�� ���ؿ����.
	}
}
// �̰� ��¥ �ʿ��Ѱ�? ��ǥ������ �x������ �л��� ���� �ּҰ� ���� �־���. �׷��� ��ŷ �� �׳� ���� �ּҸ� �и� �ƴ�. �׷��� 
// ��ΰ� �α��� �����ϰ� �س��� (�����ΰ�) ������ ������ ����ȭ��, �л��� �л�ȭ��, ����� ���ȭ���� ������.
// �׷��� ��ü ������ ��(�ٽ�)�� ���⼺�� �ʿ��� ���̴�.