package com.company;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeList employeeList = new EmployeeList(5);
		employeeList.addEmployee("M10","È«±æµ¿");
		employeeList.addEmployee("M11","ÀÓ²©Á¤");
		System.out.println(employeeList);
	}

}
