package com.employee.company;
/**
 * ����� �䱸����: ��� ���� ���α׷� �Ϲ� ��� - �����ȣ, �̸�, �޿� �μ��� - �����ȣ, �̸�, �޿�, �μ��� ȸ�翡���� ���
 * ����� ��� �޿� Ȯ�� �޿��� ���� ���� ����� ������ Ȯ�� Ư�� �μ��� �μ��� �޿��� Ȯ�� ��, ȸ�系 ����� �ִ� 5�� �̴�.
 */
public class Manager extends Employee {
//�μ��� DepartmentName
	String managerNumber;
	String departmentName;
	
	
	public Manager(String salary, double name, String managerNumber, String departmentName) {
		super(salary, name);
		setManagerNumber(managerNumber);
		setDepartmentName(departmentName);
	}
	
	
	public String getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
