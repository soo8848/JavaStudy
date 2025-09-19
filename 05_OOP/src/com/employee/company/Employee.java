package com.employee.company;

/**
 * 김재욱 요구사항: 사원 관리 프로그램 일반 사원 - 사원번호, 이름, 급여 부서장 - 사원번호, 이름, 급여, 부서명 회사에서는 모든
 * 사원의 평균 급여 확인 급여가 가장 많은 사원의 정보를 확인 특정 부서의 부서장 급여를 확인 단, 회사내 사원은 최대 5명 이다.
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
