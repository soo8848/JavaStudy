package com.oopsw.member;
//  일번 방식으로 하는중. 나중에 더 배우면 이번방법으로 하게될거임. 개요를 알고 있으면 다른 익셉션을 상속받으면 되는데 모르니까 익셉션 상속. 
//1. XxxException상속 
public class GenderValueException extends Exception {
	public GenderValueException(String message) {
		//2. 부모의 연결된 생성자 정의
		super(message);
	}	
}