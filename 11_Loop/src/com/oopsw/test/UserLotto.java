package com.oopsw.test;
import java.util.HashSet;

//Math는 모든 메서드가 static
public class UserLotto {
	private UserLotto(){}
	public static String numbers(){
		return numbers(false);
	}
	public static String numbers(boolean flag) {
		StringBuffer sb=new StringBuffer(); //임시
		HashSet<Integer> lotto=new HashSet<>();			
		getLotto(lotto);//1		
		sb.append(lotto.toString());
		
		if(flag){
			sb.append("보너스번호:");
			sb.append(bonusNumber(lotto)); //2
		}		
		return sb.toString();
	}
	private static int bonusNumber(HashSet<Integer> lotto) {
		int bonusNumber=0;
		while(true){
			bonusNumber = getNumber();
			if(lotto.add(bonusNumber)) break;
		}
		return bonusNumber;
	}
	private static void getLotto(HashSet<Integer> lotto) {
		while(lotto.size() <6)
			lotto.add(getNumber());			
	}
	private static int getNumber() {
		return (int)(Math.random() * 45)+1;
//		int num=(int)(Math.random() * 45)+1;
//		System.out.println(num);//
//		return num;
	}

}
