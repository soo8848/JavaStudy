package com.oopsw.dao;
public interface CustomerDAO {
//	//����
/** 1. ������ ���忡�� �� ������ ��� */
	boolean addCustomer(String name, String phoneNumber);	
/** 2. �̹��� �� ���-�⺻ ����Ʈ 100*/
	boolean addCustomer(String name, String phoneNumber, int point);
//	boolean addCustomer(CustomerVO vo);

/** 3Ư�� ���� ����Ʈ�� Ȯ��*/
	int getPoint(int customerId);
/** 4Ư�� ���� ����Ʈ�� ����*/
	boolean updatePoint(int customerId, int newPoint);
/** 5Ư�� ���� ������ ����*/
	boolean deleteCustomer(int customerId);
}
