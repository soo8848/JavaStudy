import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// 내일 와서 해야쥐~
public class JDBCTest3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 드라이버 클래스 이름(자바 패키지 경로)
		
		// JDBC URL 형식(DB 접속 규칙)
		System.out.println("계정 연결OK");
		// 통로까지는 연결되었으니 이제 SQL을 보내고 실행할 도구가 필요. (카트)
		
		//성명(명령메시지) 변수 선언 = DB 연결 객체로부터 Statement 생성
		//sql 실행 결과를 담는 변수
		
		// .next() 커서를 다음 행으로 이동 .getXxx(0) 0번째 컬럼의 값을 가져오는 메소드
		
		// 자원 순서대로 닫기.
	}
}
