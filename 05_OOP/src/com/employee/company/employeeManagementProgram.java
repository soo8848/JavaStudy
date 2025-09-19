package com.employee.company;

/**
 * ����� �䱸����: ��� ���� ���α׷� �Ϲ� ��� - �����ȣ, �̸�, �޿� �μ��� - �����ȣ, �̸�, �޿�, �μ��� ȸ�翡���� ���
 * ����� ��� �޿� Ȯ�� �޿��� ���� ���� ����� ������ Ȯ�� Ư�� �μ��� �μ��� �޿��� Ȯ�� ��, ȸ�系 ����� �ִ� 5�� �̴�.
 �۵��� ���Ѵ�... ��� Ʋ���� �𸣰ڴ�....
 */
public class employeeManagementProgram {
	// �޿��� ���� ���
	// ȸ�系 ��� ���� �ִ� �� ���� ���� �� ����.
	public static void main(String[] args) {
		Employee[] maximumNumberOfEmployee = new Employee[5];
		maximumNumberOfEmployee[0] = new Staff(5000, "������", "20001");
		maximumNumberOfEmployee[1] = new Manager("������", 5000, "������", "20002");
		maximumNumberOfEmployee[2] = new Manager("ȫ����", 4955, "ȫ�浿", "20003");
		maximumNumberOfEmployee[3] = new Staff(715648, "�����", "20004");
		maximumNumberOfEmployee[4] = new Staff(8000, "�ڼ���", "20005");
		int sumSalary = 0;
		String searchDepartmentName = "ȫ����";

		for (Employee emp : maximumNumberOfEmployee) {
			sumSalary += emp.getSalary();
		}
		double avg = (double) sumSalary / maximumNumberOfEmployee.length;
		System.out.println("��� ����� ��� �޿� Ȯ��: " + avg);

		for (Employee emp : maximumNumberOfEmployee) {
			if (emp instanceof Manager) {
				Manager m = (Manager)emp;

				if (m.getDepartmentName().equals(searchDepartmentName)) {
					System.out.println("Ư���μ�: " + searchDepartmentName + "�μ��� �޿�: " + m.getSalary());
				}
			}
		}
	};

}
