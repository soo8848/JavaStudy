package com.company;

public class ManagerList extends EmployeeList{

public ManagerList(int length) {
		super(length);
		
	}

public String getOfficeNumber(Manager manger) {
	return manger.getOfficeNumber();
}
}
