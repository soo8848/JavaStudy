package EmployeeTest;
import java.sql.SQLException;
//�޿��� 6000~9000 �� ����� ���̵�, �޿� Ȯ�� 
//�ϴ� JDBC���� �ۼ�
//(�׻� sql���� ����Ŭ�� ���� �ؾߵȴٴ� �� ���)
//		String sql = "select employee_id, salary from employees where salary between 6000 and 9000"; �䷸�� �ϸ� ���忡�� sql �ľ��ϱⰡ �������
// ���ڵ� ������ �����ϴ°� �ٽ�.
// �� DAO���� ���� ����� �հ�

/** ������ �帧�� �������̽� ������� ���;ߵȴ�.
 * ���Ŀ� ����� �ڷ����� �������ϱ� Collection ����ؾ���~ �÷��� 3���ϱ� ���� VO���� �����ؼ� �Ű������� �־����~ while(rs.next())���� �߰��ϴ°Ŵ� list�ϱ� .add�� �߰��ؾ��� �̷� ��� �帧
 * */
public class EmployeeDAOTest {
	public static void main(String[] args) {
		
		try {
			EmployeeDAO dao=new EmployeeDAO();			// ��� �׽�Ʈ�ϰ� �ּ�ó���ϴ°� �̻��ϳ�~ -> ���� ���� �ڵ� ȯ���� �̻��� �� �ν��� �߿�
//			System.out.println(dao.getEmployees());
//			System.out.println(dao.getEmployees(100,300));
//			System.out.println(dao.getEmployees(6000,9000));
//			System.out.println(dao.getEmployees(" ��ũ��Ʈ���� ","�޼ҵ忡 int�� �Ű������� ������� ��ũ��Ʈ ���� �Ұ���"));
			System.out.println(dao.getEmployees("Steven")); // �Է°��� ���ų� ���ڿ��� �ƴϸ� ������ ��ũ��Ʈ�� ������ ����.
			System.out.println(dao.getEmployees("' or 1=1 --")); // ������ ��ũ��Ʈ -> �ٸ��ֵ��ذ�� 1. �������� 2. Ư���������� -> 80��� ���� �̽��Ǵ��ǵ� �ذ��� �� �ִ� ���̺귯���� ���� ����.
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println("����");
	}
}
