import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String className = "oracle.jdbc.driver.OracleDriver";
		// 드라이버 클래스 이름(자바 패키지 경로)
		Class.forName(className);
		System.out.println("드라이버 연결 완료");
		
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		// JDBC URL 형식(DB 접속 규칙)
		String id = "hr";
		String pw = "hr";
		Connection conn = DriverManager.getConnection(uri,id,pw);
		System.out.println("계정 연결OK");
		// 통로까지는 연결되었으니 이제 SQL을 보내고 실행할 도구가 필요. (카트)
		
		String sql = "select employee_id, first_name, salary from employees";
		Statement stmt = conn.createStatement();
		//성명(명령메시지) 변수 선언 = DB 연결 객체로부터 Statement 생성
		ResultSet rs = stmt.executeQuery(sql);
		//sql 실행 결과를 담는 변수
		
		while(rs.next()){ 
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
		}
		// .getXxx(0) 0번째 컬럼의 값을 가져오는 메소드
		
		rs.close();
		stmt.close();
		conn.close();
	}
}
