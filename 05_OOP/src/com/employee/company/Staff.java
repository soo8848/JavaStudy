package com.employee.company;
/**
 * ����� �䱸����: ��� ���� ���α׷� �Ϲ� ��� - �����ȣ, �̸�, �޿� �μ��� - �����ȣ, �̸�, �޿�, �μ��� ȸ�翡���� ���
 * ����� ��� �޿� Ȯ�� �޿��� ���� ���� ����� ������ Ȯ�� Ư�� �μ��� �μ��� �޿��� Ȯ�� ��, ȸ�系 ����� �ִ� 5�� �̴�.
 */
public class Staff extends Employee{
	private String staffNumber;

	
	
	
	
	public Staff(double salary, String name, String staffNumber) {
		super(name, salary);
		setStaffNumber(staffNumber);
	}

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	
	
}
