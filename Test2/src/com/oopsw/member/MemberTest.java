package com.oopsw.member;

public class MemberTest {
	
	public static void main(String[] args) {
		Member m1=null;
		try {
			m1 = new Member("too1", "ȫ�浿", 'M');
		} catch (GenderValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NameLengthException e) {
			e.printStackTrace();
		}
		Member m2=null;
		try {
			m2 = new Member("too2", "ȫ", 'X');
		} catch (GenderValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){ // �������� �ͼ����� ���൵ �ȴ�. ������ �����δ� ��Ȯ�� ������ ã�°� ������. ���������δ� Ư�������� �ľ��ϱ� �����. 
			e.printStackTrace();
		}
		
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
