package com.employee.company;
/**
 * 김재욱 요구사항: 사원 관리 프로그램 일반 사원 - 사원번호, 이름, 급여 부서장 - 사원번호, 이름, 급여, 부서명 회사에서는 모든
 * 사원의 평균 급여 확인 급여가 가장 많은 사원의 정보를 확인 특정 부서의 부서장 급여를 확인 단, 회사내 사원은 최대 5명 이다.
 */
public class Manager extends Employee {
//부서명 DepartmentName
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
