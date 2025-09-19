package EmployeeTest;
import java.sql.SQLException;
//급여가 6000~9000 인 사원의 아이디, 급여 확인 
//하는 JDBC문을 작성
//(항상 sql문은 세미클론 제거 해야된다는 걸 명심)
//		String sql = "select employee_id, salary from employees where salary between 6000 and 9000"; 요렇게 하면 현장에서 sql 파악하기가 힘들어짐
// 레코드 단위로 관리하는게 핵심.
// ㄴ DAO파일 따로 만들면 합격

/** 생각의 흐름이 인터페이스 설계부터 나와야된다.
 * 그후에 목록의 자료형이 여러개니까 Collection 사용해야지~ 컬럼이 3개니까 따로 VO파일 제작해서 매개변수로 넣어야지~ while(rs.next())에서 추가하는거는 list니까 .add로 추가해야지 이런 사고 흐름
 * */
public class EmployeeDAOTest {
	public static void main(String[] args) {
		
		try {
			EmployeeDAO dao=new EmployeeDAO();			// 계속 테스트하고 주석처리하는게 이상하네~ -> 내가 가진 코딩 환경의 이상한 점 인식이 중요
//			System.out.println(dao.getEmployees());
//			System.out.println(dao.getEmployees(100,300));
//			System.out.println(dao.getEmployees(6000,9000));
//			System.out.println(dao.getEmployees(" 스크립트조작 ","메소드에 int로 매개변수를 적어놔서 스크립트 조작 불가능"));
			System.out.println(dao.getEmployees("Steven")); // 입력값이 없거나 문자열이 아니면 공격형 스크립트가 통하지 않음.
			System.out.println(dao.getEmployees("' or 1=1 --")); // 공격형 스크립트 -> 다른애들해결안 1. 공백제거 2. 특수문자제거 -> 80년대 부터 이슈되던건데 해결할 수 있는 라이브러리를 만들어서 가자.
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println("종료");
	}
}
