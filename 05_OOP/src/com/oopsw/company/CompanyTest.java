package com.oopsw.company;

import com.oopsw.company.Employee;
import com.oopsw.company.Manager;

public class CompanyTest {
	public static void main(String[] args) {
		//입력
		Employee[] allEmployee = new Employee[5];
		
		allEmployee[0] = new Employee("20050101", "김사원", 10);
		allEmployee[1] = new Employee("20050102", "오사원", 20);
		allEmployee[2] = new Manager("20030101", "김과장", 30, "기획부");
//		allEmployee[3] = new Employee("20050305", "표사원", 3000000);
//		allEmployee[4] = new Manager("20030110", "최과장", 6000000, "총무부");
		



		//사원 평균 급여 확인
		float average = 0;		int count=0;
		for (int i = 0; i < allEmployee.length; i++) {
			if(allEmployee[i] != null) {
			average += allEmployee[i].getSalary();
			count++;
			}
		}
//		average = average / allEmployee.length;

		average = average / count;
		System.out.println("사원 평균 급여:" + average);
		
		//급여 가장 많은 사원 정보 확인
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

		//특정 부서 부서장 급여 확인
		String department = "기획부";
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] instanceof Manager){ // null이면 heap메모리에 올라갈 일이 없으니까 null체크 할일이 없다. allEmployee[i] != null &&
				Manager manager = (Manager) allEmployee[i];
				if (manager.getDepartmentName().equals(department)){ 
					System.out.println(department + " 부서장 급여: " + manager.getSalary());
					return; //특정 부서의 부서장이 여러명의 확률이 없으므로 한명이라 찾으면 바로 for문을 return하면 아주 좋아요. 반대로 부서장이 여러명이면 return을 오히려 뺴야됨.
				}
			}
		}
	}
}
