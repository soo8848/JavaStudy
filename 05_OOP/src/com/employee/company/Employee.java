package com.employee.company;

/**
 * ����� �䱸����: ��� ���� ���α׷� �Ϲ� ��� - �����ȣ, �̸�, �޿� �μ��� - �����ȣ, �̸�, �޿�, �μ��� ȸ�翡���� ���
 * ����� ��� �޿� Ȯ�� �޿��� ���� ���� ����� ������ Ȯ�� Ư�� �μ��� �μ��� �޿��� Ȯ�� ��, ȸ�系 ����� �ִ� 5�� �̴�.
 */
public class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		setName(name);
		setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
