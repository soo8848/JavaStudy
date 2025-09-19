package com.operationTest01;

public class Operation01 {
//	public class InputCheckMinMaxUniCodeScore { 
// static 붙이기
	public static void main(String[] args) {
		int input1 = 15;
		int input2 = 30;
		
		//두수를 입력해서 최대값을 확인
		int inputMin=Math.min(input1, input1);
		System.out.println("최솟값: "+inputMin);
	
		//두수를 입력해서 최솟값을 확인
		int inputMax=Math.max(input1, input2);
		System.out.println("최대값: "+inputMax);
		
		
		//유니코드를 입력하면 해당 문자를 확인
		int inputUnicode = 65;
		char unicode = (char) inputUnicode;
		System.out.println(unicode);
		
		int inputScore = 80;
		char score;
		
		switch (inputScore) {
		case 90:
			score = 'A';
			break;
			
		case 80:
			score = 'B';
			break;
		case 70:
			score = 'C';
			break;

		default:
			score = 'F';
			break;
		}
		
		System.out.println(score);
	}

}
