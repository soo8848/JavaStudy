import java.io.FileNotFoundException;
import java.io.PrintStream;
// ������ ���� �ð�
public class SystemTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream("sys.txt")); // ���ο��� �ѱ��� �ȱ����� ó�����ش�. ���߿� ����Ϳ� ��� write�ϰ� �Ǹ� ����ȭ�� �ɸ��� �ٸ� ���Ϸ� write�� �ð��� ���(�α�)�س��ų� write�� ��Ÿ���� �ο��Ѵ�.
		System.out.println("�ý��ۿ��� �⺻ �����-����Ϳ� �س�����");
	}
}
