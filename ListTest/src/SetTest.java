import java.util.*; // ��Ű�� �� ��� ��ü Ȱ��
//� ���� N�� �����ϴµ� �� �ߺ� �������� �ʴ´�. == equals()
public class SetTest {
	public static void main(String[] args) {
		Collection c;
		c=new HashSet();
		
		System.out.println(c.add(1234)); //1.5 int -> Interger 1.5���� ����Ŭ������ �ڵ���ȯ ����.
		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("ȫ�浿"))); //�̷��� �׽�Ʈ �ڵ���� ����°� TDD��� �Ѵ�.
		System.out.println(c.add(1234)); //1.5 int -> Interger 1.5���� ����Ŭ������ �ڵ���ȯ ����.
		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("ȫ�浿"))); //�̷��� �׽�Ʈ �ڵ���� ����°� TDD��� �Ѵ�.
		System.out.println(c);//�ݹ����� - �����ֱ� �޼���
	}
}
// �������ڸ� �����ڴ� �ֶ� �ְ� ���ٴ� �Ÿ� boolean������ ���ϰ� ������ �����̰� �װ� equals����. �ڹٴ� ��� �����Ͱ� ���ͷ� �޸𸮸� �ǵ鸰�ٰ� ����. ���������� �߰��� �ָ��� ���� ���ϴ°� �ǹ̰� �����. �ؽ��ڵ�� ����Ÿ���� int�� �Ǿ� �־��. ������ ���ͷ����� �߼�ü�踦 ����س����� hashcode����. �ּҰ� �ƴ� �ּ� ü�踦 üũ�ϴ� �ſ���.