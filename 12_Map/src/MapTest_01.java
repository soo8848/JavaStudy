import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest_01 {
	public static void main(String[] args) {
		// VM������ Ȯ���ϰ� ����.
		Properties pro = System.getProperties(); // Ư�� ȯ������. �⺻���� api ���� -> ���õ�
													// api ������ ����
		// System.out.println(pro.keySet());
		Set<Object> keys = pro.keySet();

		for (Object key : keys) {
			System.out.println(key.toString() + "=" +
		    System.getProperty(key.toString()));
		} // foreach ���� for��
			// ���� ��ó�� ���°� ��������
			// 1.5
		Map<String, String> map = System.getenv();
		for (String key : map.keySet())
		     System.out.println(key + "=>" + System.getProperty(key));
	}
}
