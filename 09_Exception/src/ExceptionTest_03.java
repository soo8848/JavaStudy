//3. CheckedException - API �ִ� ���
public class ExceptionTest_03 {
	public static void main(String[] args) {
		
		try {
//			Class.forName("java.lang.String"); // �����ִ��ڵ� new String()
			Class.forName("String"); // �����ִ��ڵ� new String()
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ��ī�� ���̺� ����� Ÿ������ ���ϻ��� ���� ��Ȳ
		
		System.out.println("���� ���� ");
	}

}
