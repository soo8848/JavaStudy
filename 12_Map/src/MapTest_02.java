import java.util.HashMap;
import java.util.Map;

public class MapTest_02 {
	public static void main(String[] args) {
		
	//�䱸����: 1~3����� �л��� ����-(�й�, �̸� ��)�� �����ϰ� �;��.
	Map<String, String> m1=new HashMap<>();
	m1.put("1��", "ȫ�浿");
	m1.put("2��", "�̼���");
	m1.put("3��", "�������");
	m1.put("3��", "������");
	System.out.println(m1);
	
	Map<Integer, Student> m2=new HashMap<>();
	m2.put(1, new Student("200101001","������"));
	System.out.println(m2);
	}
}
