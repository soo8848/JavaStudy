package com.oopsw.member;

public class MemberTest {
	
	public static void main(String[] args) {
		Member m1=null;
		try {
			m1 = new Member("too1", "홍길동", 'M');
		} catch (GenderValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NameLengthException e) {
			e.printStackTrace();
		}
		Member m2=null;
		try {
			m2 = new Member("too2", "홍", 'X');
		} catch (GenderValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){ // 마지막에 익셉션을 해줘도 된다. 교과서 적으로는 정확한 오류를 찾는게 맞지만. 현실적으로는 특정오류를 파악하기 힘들다. 
			e.printStackTrace();
		}
		
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
