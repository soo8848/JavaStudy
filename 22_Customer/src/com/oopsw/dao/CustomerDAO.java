package com.oopsw.dao;
public interface CustomerDAO {
//	//업무
/** 1. 관리자 입장에서 고객 정보를 등록 */
	boolean addCustomer(String name, String phoneNumber);	
/** 2. 이번에 고객 등록-기본 포인트 100*/
	boolean addCustomer(String name, String phoneNumber, int point);
//	boolean addCustomer(CustomerVO vo);

/** 3특정 고객의 포인트를 확인*/
	int getPoint(int customerId);
/** 4특정 고객의 포인트를 수정*/
	boolean updatePoint(int customerId, int newPoint);
/** 5특정 고객의 정보를 삭제*/
	boolean deleteCustomer(int customerId);
}
