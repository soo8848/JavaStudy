package com.company;

import java.util.Arrays;

public class EmployeeList {
	private Employee[] list;
	private int count;
	
	public EmployeeList(int length) {
		list = new Employee[length];
	}
	
	public void addEmployee(String number, String name) {
		for (int i = 0; i < list.length; i++) {
			list[i] = new Employee(number,name);
		}
	}
	
	public Boolean isEmployee(Employee e) {
		return false;
		
	}

	@Override
	public String toString() {
		return "EmployeeList [list=" + Arrays.toString(list) + ", count=" + count + "]";
	}
	
	
}
