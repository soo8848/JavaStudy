import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// ���� �ͼ� �ؾ���~
public class JDBCTest3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ����̹� Ŭ���� �̸�(�ڹ� ��Ű�� ���)
		
		// JDBC URL ����(DB ���� ��Ģ)
		System.out.println("���� ����OK");
		// ��α����� ����Ǿ����� ���� SQL�� ������ ������ ������ �ʿ�. (īƮ)
		
		//����(��ɸ޽���) ���� ���� = DB ���� ��ü�κ��� Statement ����
		//sql ���� ����� ��� ����
		
		// .next() Ŀ���� ���� ������ �̵� .getXxx(0) 0��° �÷��� ���� �������� �޼ҵ�
		
		// �ڿ� ������� �ݱ�.
	}
}
