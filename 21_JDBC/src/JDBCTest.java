//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBCTest {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		// 1. ����̹� �ε�
//		String className = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(className);
//		System.out.println("1. Driver loading ok");
//
//		// 2. DBMS ���� (�⺻ ��Ʈ�� 1521)
//		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String id = "hr";
//		String pw = "hr";
//		Connection conn = DriverManager.getConnection(uri, id, pw);
//		System.out.println("2. ���� OK");
//		
//		// 3, 4 ������ ���� SQL���� �ٸ���. ������Ʈ��Ʈ�� ����Ʈ���� ���� �ٴϹǷ� 3. 4.�� ���� �ۼ��Ѵٰ� ����
//		String sql = "select employee_id, first_name, salary from employees"; // �ڹٿ����� sql���� ;�� �ڹ� -> ����Ŭ�� ���� ���߿� Ư�����ڷ� ��ȯ�Ǿ� ������ �߻��ϴ� ���� 
//		Statement stmt = conn.createStatement();
//		ResultSet rs=stmt.executeQuery(sql); // ����ȭ��ǥ = ����ȭ��ǥ;
//		while(rs.next()) // 6�ڸ� ������ int�� ����� �����ϴ�.
//			System.out.println(rs.getInt(1)+" "+ rs.getString(2)
//			+ rs.getFloat(3)); // ���� �ִ� sql ���� ���� ���� �����ϰ� �����;ߵ�. get�ڷ���
//		//5. �ڿ� ��ȯ
//		rs.close();
//		stmt.close();
//		conn.close();
//		
//		// 3. ����
//		System.out.println("���α׷� ����");
//		
//	}
//}