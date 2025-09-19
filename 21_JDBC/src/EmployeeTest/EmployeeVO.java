package EmployeeTest;

/**
 * VO - data를 묶기 위해 사용하는 객체 VO를 만드는 기준 1. 1개의 테이블 당 1개의 VO - 매번 만들면 불필요한 데이터가 많음
 * 2. 업무에서 검색 컬럼들을 확인VO 공통 사용 3. Join 이나 subquery에서 사용될 데이터의 묶음 - 무슨 얘기냐? 1.2.는
 * 테이블 기준인데 3.은 테이블이 겹쳐지니까 4. Collection 이나 Map 활용
 */
public class EmployeeVO {
	private int employeeId;
	private String name;
	private float salary;
	
	public EmployeeVO(){}
	
	public EmployeeVO(int employeeId, float salary) {
		this(employeeId, null, salary); //this로 자기 자신 호출하면서 필요없는name을 null
	}
	
	public EmployeeVO(int employeeId, String name, float salary) {
	setEmployeeId(employeeId);
	setName(name);
	setSalary(salary);
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	// DB를 쓰는 VO라 employeeId의 중복이 없을 수도 있기에 equals 하고 hash가 필요없을 수도 있다.

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
