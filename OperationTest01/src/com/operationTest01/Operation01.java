package com.operationTest01;

public class Operation01 {
//	public class InputCheckMinMaxUniCodeScore { 
// static ���̱�
	public static void main(String[] args) {
		int input1 = 15;
		int input2 = 30;
		
		//�μ��� �Է��ؼ� �ִ밪�� Ȯ��
		int inputMin=Math.min(input1, input1);
		System.out.println("�ּڰ�: "+inputMin);
	
		//�μ��� �Է��ؼ� �ּڰ��� Ȯ��
		int inputMax=Math.max(input1, input2);
		System.out.println("�ִ밪: "+inputMax);
		
		
		//�����ڵ带 �Է��ϸ� �ش� ���ڸ� Ȯ��
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
