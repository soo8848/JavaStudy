import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//� ��(UserOject)�� N�� �����ϴµ� 
//���� üũ �Ҷ��� �ְ�
//�ߺ��� üũ �Ҷ��� �ִ�.
//�� �䱸������ ���Դµ� ������ �� ����. -- �Է°����� ���ϱ� == ��ü�� �޾ƾߵȴ�.

public class ListSetTest {
	public static void printAll(Collection<UserObject> c) {
//		System.out.println(c.add(1234)); // 1.5 int -> Interger 1.5���� ����Ŭ������
//											// �ڵ���ȯ ����.
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("ȫ�浿"))); // �̷��� �׽�Ʈ �ڵ���� ����°�
//															// TDD��� �Ѵ�.
//		System.out.println(c.add(1234)); // 1.5 int -> Interger 1.5���� ����Ŭ������
//											// �ڵ���ȯ ����.
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("ȫ�浿"))); // �̷��� �׽�Ʈ �ڵ���� ����°�
															// TDD��� �Ѵ�.
		System.out.println(c);// �ݹ����� - �����ֱ� �޼���

	}

	public static void main(String[] args) {
		printAll(new ArrayList());
		printAll(new HashSet());
	}

}
