import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String className = "oracle.jdbc.driver.OracleDriver";
		// ����̹� Ŭ���� �̸�(�ڹ� ��Ű�� ���)
		Class.forName(className);
		System.out.println("����̹� ���� �Ϸ�");
		
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		// JDBC URL ����(DB ���� ��Ģ)
		String id = "hr";
		String pw = "hr";
		Connection conn = DriverManager.getConnection(uri,id,pw);
		System.out.println("���� ����OK");
		// ��α����� ����Ǿ����� ���� SQL�� ������ ������ ������ �ʿ�. (īƮ)
		
		String sql = "select employee_id, first_name, salary from employees";
		Statement stmt = conn.createStatement();
		//����(��ɸ޽���) ���� ���� = DB ���� ��ü�κ��� Statement ����
		ResultSet rs = stmt.executeQuery(sql);
		//sql ���� ����� ��� ����
		
		while(rs.next()){ 
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
		}
		// .getXxx(0) 0��° �÷��� ���� �������� �޼ҵ�
		
		rs.close();
		stmt.close();
		conn.close();
	}
}
