package com.oopsw.member;
//  �Ϲ� ������� �ϴ���. ���߿� �� ���� �̹�������� �ϰԵɰ���. ���並 �˰� ������ �ٸ� �ͼ����� ��ӹ����� �Ǵµ� �𸣴ϱ� �ͼ��� ���. 
//1. XxxException��� 
public class GenderValueException extends Exception {
	public GenderValueException(String message) {
		//2. �θ��� ����� ������ ����
		super(message);
	}	
}