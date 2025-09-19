package com.oopsw.company;

import com.oopsw.company.Employee;
import com.oopsw.company.Manager;

public class CompanyTest {
	public static void main(String[] args) {
		//�Է�
		Employee[] allEmployee = new Employee[5];
		
		allEmployee[0] = new Employee("20050101", "����", 10);
		allEmployee[1] = new Employee("20050102", "�����", 20);
		allEmployee[2] = new Manager("20030101", "�����", 30, "��ȹ��");
//		allEmployee[3] = new Employee("20050305", "ǥ���", 3000000);
//		allEmployee[4] = new Manager("20030110", "�ְ���", 6000000, "�ѹ���");
		



		//��� ��� �޿� Ȯ��
		float average = 0;		int count=0;
		for (int i = 0; i < allEmployee.length; i++) {
			if(allEmployee[i] != null) {
			average += allEmployee[i].getSalary();
			count++;
			}
		}
//		average = average / allEmployee.length;

		average = average / count;
		System.out.println("��� ��� �޿�:" + average);
		
		//�޿� ���� ���� ��� ���� Ȯ��
		int maxSalary = maxSalary = allEmployee[0].getSalary();
		for (int i = 0; i < allEmployee.length; i++) {
			//maxSalary = maxSalary = allEmployee[0].getSalary();
			if (allEmployee[i] != null && maxSalary<allEmployee[i].getSalary()){
				maxSalary = allEmployee[i].getSalary();
			}
		}
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] != null && allEmployee[i].getSalary() == maxSalary){
				allEmployee[i].print();
			}
		}

		//Ư�� �μ� �μ��� �޿� Ȯ��
		String department = "��ȹ��";
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] instanceof Manager){ // null�̸� heap�޸𸮿� �ö� ���� �����ϱ� nullüũ ������ ����. allEmployee[i] != null &&
				Manager manager = (Manager) allEmployee[i];
				if (manager.getDepartmentName().equals(department)){ 
					System.out.println(department + " �μ��� �޿�: " + manager.getSalary());
					return; //Ư�� �μ��� �μ����� �������� Ȯ���� �����Ƿ� �Ѹ��̶� ã���� �ٷ� for���� return�ϸ� ���� ���ƿ�. �ݴ�� �μ����� �������̸� return�� ������ ���ߵ�.
				}
			}
		}
	}
}
