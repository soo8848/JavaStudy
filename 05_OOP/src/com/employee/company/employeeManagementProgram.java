package com.employee.company;

/**
 * 김재욱 요구사항: 사원 관리 프로그램 일반 사원 - 사원번호, 이름, 급여 부서장 - 사원번호, 이름, 급여, 부서명 회사에서는 모든
 * 사원의 평균 급여 확인 급여가 가장 많은 사원의 정보를 확인 특정 부서의 부서장 급여를 확인 단, 회사내 사원은 최대 5명 이다.
 작동을 안한다... 어디서 틀린지 모르겠다....
 */
public class employeeManagementProgram {
	// 급여가 같은 사람
	// 회사내 사원 수가 최대 수 보다 적을 수 있음.
	public static void main(String[] args) {
		Employee[] maximumNumberOfEmployee = new Employee[5];
		maximumNumberOfEmployee[0] = new Staff(5000, "정현우", "20001");
		maximumNumberOfEmployee[1] = new Manager("영업부", 5000, "정현우", "20002");
		maximumNumberOfEmployee[2] = new Manager("홍보부", 4955, "홍길동", "20003");
		maximumNumberOfEmployee[3] = new Staff(715648, "장기투", "20004");
		maximumNumberOfEmployee[4] = new Staff(8000, "박성진", "20005");
		int sumSalary = 0;
		String searchDepartmentName = "홍보부";

		for (Employee emp : maximumNumberOfEmployee) {
			sumSalary += emp.getSalary();
		}
		double avg = (double) sumSalary / maximumNumberOfEmployee.length;
		System.out.println("모든 사원의 평균 급여 확인: " + avg);

		for (Employee emp : maximumNumberOfEmployee) {
			if (emp instanceof Manager) {
				Manager m = (Manager)emp;

				if (m.getDepartmentName().equals(searchDepartmentName)) {
					System.out.println("특정부서: " + searchDepartmentName + "부서장 급여: " + m.getSalary());
				}
			}
		}
	};

}
