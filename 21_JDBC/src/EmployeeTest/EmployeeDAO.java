package EmployeeTest;// 화면에 따른 업무 리스트 뽑고 쿼리문 예측
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
//카드 들고 갔다가 그대로 들고 2시간 동안 딴짓하면 그 카드는 다른 사람이 못씀. 그러니 카드를 반납하고 딴짓하기
public class EmployeeDAO {
	private Connection conn; // "DAO 클래스 만들 때, 멤버 변수(conn 같은 거)는 클래스 맨 위에 선언하고, 그다음 생성자, 그다음 메소드들을 순서대로 작성해라." 즉, 특별한 기술적인 의미보다는 코드 작성 순서(컨벤션) 를 설명
	public EmployeeDAO() throws ClassNotFoundException, SQLException { // 중간에 멈추고 싶을때 throws 사용
		//1.2.
		// 1. 드라이버 로딩 new Xxxxx() 
		String className = "oracle.jdbc.driver.OracleDriver"; 
		Class.forName(className); // 왜 new Xxxxx()로 안하고 이렇게 하는가? forName으로 하는게 DB확장성에 좋으니까 씀.
		System.out.println("1. Driver loading ok");

		// 2. DBMS 연동 (기본 포트는 1521)
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
	    conn = DriverManager.getConnection(uri, id, pw); //백그라운드에 이미 드라이버 매니저 객체가 있으니까 new 안해도된다. -> stack 메모리에 이미 올라가 있겠지~ 그렇게 만들어 놨겠지~
		System.out.println("2. 연결 OK");
	}
	
	//모든 사원의 사번, 이름, 급여를 확인
	public Collection<EmployeeVO> getEmployees(){ // 목록의 자료형이 여러개 니까 Clollection , 컬럼이 여러개(3개)니까 VO클래스 만들기
		Collection<EmployeeVO> list=new ArrayList<>();
		// 3, 4 업무에 따라 SQL문이 다르다. 스테이트먼트와 리절트셋은 같이 다니므로 3. 4.번 같이 작성한다고 생각
		String sql = "select employee_id, first_name, salary from employees"; // 자바에서의 sql문의 ;는 자바 -> 오라클로 가는 도중에 특수문자로 변환되어 오류가 발생하니 주의 
		try {
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql); // 가는화살표 = 오는화살표;
		while(rs.next()) // 6자리 정도는 int로 충분히 가능하다.
			list.add(new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getFloat(3))); // list 로 레코드 단위로 관리
//			System.out.println(rs.getInt(1)+" "+ rs.getString(2)
//			+ rs.getFloat(3)); // 위에 있는 sql 쿼리 문에 따라서 유연하게 가져와야됨. get자료형
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//사원의 급여 6000~9000에 해당하는 사원의 사번, 급여를 확인 //검색하는건 걍 다 get메소드이름 으로 하면 됨ㅇㅇ
	public Collection<EmployeeVO> getEmployees(int MinSalary,int MaxSalary) {
		// ㄴ 레코드의 갯수 여러개라서   ㄴ 컬럼의 갯수여러개 
		Collection<EmployeeVO> list = new ArrayList<>();
		String sql = "select employee_id,salary from employees"
				+ " where salary between "+MinSalary+" and "+MaxSalary; // ""에서 공백 넣는게 매우 종요 A and B가 아니라 AandB이렇게 써짐. -> 오류 찾기가 힘들어짐.
		try {
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
			list.add(new EmployeeVO(rs.getInt(1),rs.getFloat(2)));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
//	select employee_id, first_name, salary from employees where first_name = 'Pat' <- "Pat"으로 하면 오류남. ''로 해야됨. '문자열' 구분 "컬럼명"
	//특정 이름을 가진 사원의 사번, 이름, 급여를 확인
	public Collection<EmployeeVO> getEmployees(String empName) {
		Collection<EmployeeVO> list = new ArrayList<>();
//		String sql = "select employee_id, salary from employees where first_name ="
//				+ " '"+empName+"'";
		//입력값이 String일때 ?로 처리해야 공격성 스크립트를 예방할 수 있다.
		String sql = "select employee_id, salary from employees where first_name = ?";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
//		Statement stmt = conn.createStatement();
		pstmt=conn.prepareStatement(sql); //sql먼저 쓰는게 특징
		pstmt.setString(1,  empName); //'empName'
//		ResultSet rs = pstmt.executeQuery(); <- rs.close();를 finally에 선언할 수가 없으니 밖으로 뺴기
		rs = pstmt.executeQuery();
		while(rs.next())
			list.add(new EmployeeVO(rs.getInt(1),empName,rs.getFloat(2)));
		}catch(SQLException e) {
			e.printStackTrace();
		}finally { // 맨 마지막에 추가해준 finally 카드 반납
//			rs.close();
			try{ //이걸 먼저안한이유는 주변코드가 너무 많아지면 JDBC를 이해하는데 어렵고 변수 안에 넣고 뺴고 하는거 이해하는데 산으로 갈 수 있어서.
				if(rs !=null)rs.close();
			} catch(SQLException e) {}
			try{if(pstmt !=null) rs.close();
			}catch(SQLException e){}
		}
		return list ;
	}
}
