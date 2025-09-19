package EmployeeTest;

/**
 * VO - data�� ���� ���� ����ϴ� ��ü VO�� ����� ���� 1. 1���� ���̺� �� 1���� VO - �Ź� ����� ���ʿ��� �����Ͱ� ����
 * 2. �������� �˻� �÷����� Ȯ��VO ���� ��� 3. Join �̳� subquery���� ���� �������� ���� - ���� ����? 1.2.��
 * ���̺� �����ε� 3.�� ���̺��� �������ϱ� 4. Collection �̳� Map Ȱ��
 */
public class EmployeeVO {
	private int employeeId;
	private String name;
	private float salary;
	
	public EmployeeVO(){}
	
	public EmployeeVO(int employeeId, float salary) {
		this(employeeId, null, salary); //this�� �ڱ� �ڽ� ȣ���ϸ鼭 �ʿ����name�� null
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
	// DB�� ���� VO�� employeeId�� �ߺ��� ���� ���� �ֱ⿡ equals �ϰ� hash�� �ʿ���� ���� �ִ�.

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
