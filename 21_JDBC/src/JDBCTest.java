//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBCTest {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		// 1. 드라이버 로딩
//		String className = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(className);
//		System.out.println("1. Driver loading ok");
//
//		// 2. DBMS 연동 (기본 포트는 1521)
//		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String id = "hr";
//		String pw = "hr";
//		Connection conn = DriverManager.getConnection(uri, id, pw);
//		System.out.println("2. 연결 OK");
//		
//		// 3, 4 업무에 따라 SQL문이 다르다. 스테이트먼트와 리절트셋은 같이 다니므로 3. 4.번 같이 작성한다고 생각
//		String sql = "select employee_id, first_name, salary from employees"; // 자바에서의 sql문의 ;는 자바 -> 오라클로 가는 도중에 특수문자로 변환되어 오류가 발생하니 주의 
//		Statement stmt = conn.createStatement();
//		ResultSet rs=stmt.executeQuery(sql); // 가는화살표 = 오는화살표;
//		while(rs.next()) // 6자리 정도는 int로 충분히 가능하다.
//			System.out.println(rs.getInt(1)+" "+ rs.getString(2)
//			+ rs.getFloat(3)); // 위에 있는 sql 쿼리 문에 따라서 유연하게 가져와야됨. get자료형
//		//5. 자원 반환
//		rs.close();
//		stmt.close();
//		conn.close();
//		
//		// 3. 종료
//		System.out.println("프로그램 종료");
//		
//	}
//}