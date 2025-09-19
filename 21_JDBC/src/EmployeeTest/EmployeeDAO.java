package EmployeeTest;// ȭ�鿡 ���� ���� ����Ʈ �̰� ������ ����
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
//ī�� ��� ���ٰ� �״�� ��� 2�ð� ���� �����ϸ� �� ī��� �ٸ� ����� ����. �׷��� ī�带 �ݳ��ϰ� �����ϱ�
public class EmployeeDAO {
	private Connection conn; // "DAO Ŭ���� ���� ��, ��� ����(conn ���� ��)�� Ŭ���� �� ���� �����ϰ�, �״��� ������, �״��� �޼ҵ���� ������� �ۼ��ض�." ��, Ư���� ������� �ǹ̺��ٴ� �ڵ� �ۼ� ����(������) �� ����
	public EmployeeDAO() throws ClassNotFoundException, SQLException { // �߰��� ���߰� ������ throws ���
		//1.2.
		// 1. ����̹� �ε� new Xxxxx() 
		String className = "oracle.jdbc.driver.OracleDriver"; 
		Class.forName(className); // �� new Xxxxx()�� ���ϰ� �̷��� �ϴ°�? forName���� �ϴ°� DBȮ�强�� �����ϱ� ��.
		System.out.println("1. Driver loading ok");

		// 2. DBMS ���� (�⺻ ��Ʈ�� 1521)
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
	    conn = DriverManager.getConnection(uri, id, pw); //��׶��忡 �̹� ����̹� �Ŵ��� ��ü�� �����ϱ� new ���ص��ȴ�. -> stack �޸𸮿� �̹� �ö� �ְ���~ �׷��� ����� ������~
		System.out.println("2. ���� OK");
	}
	
	//��� ����� ���, �̸�, �޿��� Ȯ��
	public Collection<EmployeeVO> getEmployees(){ // ����� �ڷ����� ������ �ϱ� Clollection , �÷��� ������(3��)�ϱ� VOŬ���� �����
		Collection<EmployeeVO> list=new ArrayList<>();
		// 3, 4 ������ ���� SQL���� �ٸ���. ������Ʈ��Ʈ�� ����Ʈ���� ���� �ٴϹǷ� 3. 4.�� ���� �ۼ��Ѵٰ� ����
		String sql = "select employee_id, first_name, salary from employees"; // �ڹٿ����� sql���� ;�� �ڹ� -> ����Ŭ�� ���� ���߿� Ư�����ڷ� ��ȯ�Ǿ� ������ �߻��ϴ� ���� 
		try {
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql); // ����ȭ��ǥ = ����ȭ��ǥ;
		while(rs.next()) // 6�ڸ� ������ int�� ����� �����ϴ�.
			list.add(new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getFloat(3))); // list �� ���ڵ� ������ ����
//			System.out.println(rs.getInt(1)+" "+ rs.getString(2)
//			+ rs.getFloat(3)); // ���� �ִ� sql ���� ���� ���� �����ϰ� �����;ߵ�. get�ڷ���
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//����� �޿� 6000~9000�� �ش��ϴ� ����� ���, �޿��� Ȯ�� //�˻��ϴ°� �� �� get�޼ҵ��̸� ���� �ϸ� �ʤ���
	public Collection<EmployeeVO> getEmployees(int MinSalary,int MaxSalary) {
		// �� ���ڵ��� ���� ��������   �� �÷��� ���������� 
		Collection<EmployeeVO> list = new ArrayList<>();
		String sql = "select employee_id,salary from employees"
				+ " where salary between "+MinSalary+" and "+MaxSalary; // ""���� ���� �ִ°� �ſ� ���� A and B�� �ƴ϶� AandB�̷��� ����. -> ���� ã�Ⱑ �������.
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
	
//	select employee_id, first_name, salary from employees where first_name = 'Pat' <- "Pat"���� �ϸ� ������. ''�� �ؾߵ�. '���ڿ�' ���� "�÷���"
	//Ư�� �̸��� ���� ����� ���, �̸�, �޿��� Ȯ��
	public Collection<EmployeeVO> getEmployees(String empName) {
		Collection<EmployeeVO> list = new ArrayList<>();
//		String sql = "select employee_id, salary from employees where first_name ="
//				+ " '"+empName+"'";
		//�Է°��� String�϶� ?�� ó���ؾ� ���ݼ� ��ũ��Ʈ�� ������ �� �ִ�.
		String sql = "select employee_id, salary from employees where first_name = ?";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
//		Statement stmt = conn.createStatement();
		pstmt=conn.prepareStatement(sql); //sql���� ���°� Ư¡
		pstmt.setString(1,  empName); //'empName'
//		ResultSet rs = pstmt.executeQuery(); <- rs.close();�� finally�� ������ ���� ������ ������ ����
		rs = pstmt.executeQuery();
		while(rs.next())
			list.add(new EmployeeVO(rs.getInt(1),empName,rs.getFloat(2)));
		}catch(SQLException e) {
			e.printStackTrace();
		}finally { // �� �������� �߰����� finally ī�� �ݳ�
//			rs.close();
			try{ //�̰� �������������� �ֺ��ڵ尡 �ʹ� �������� JDBC�� �����ϴµ� ��ư� ���� �ȿ� �ְ� ���� �ϴ°� �����ϴµ� ������ �� �� �־.
				if(rs !=null)rs.close();
			} catch(SQLException e) {}
			try{if(pstmt !=null) rs.close();
			}catch(SQLException e){}
		}
		return list ;
	}
}
