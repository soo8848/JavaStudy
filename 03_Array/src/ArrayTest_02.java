/**김재욱 점수(0~100사이)  입력 1등 1명, 2등 2명, 3등 5명 정의*/
public class ArrayTest_02 {

	public static void main(String[] args){
		 //입력 - DATABASE
		int [][] scores=new int[3][];
		scores[0]=new int [1];
		scores[1]=new int [2];
		scores[2]=new int [5];
		int sum = 0;
		int lengthCount = 0;
		
		//처리
		scores[0][0]=100;
		
		scores[1][0]=90;
		scores[1][1]=89;
		
		scores[2][0]=70;
		scores[2][1]=60;
		scores[2][2]=50;
		scores[2][3]=40;
		scores[2][4]=30;
		
		
		//출력
		for(int i=0; i< scores.length;i++) {
			for(int j=0; j< scores[i].length; j++){
				sum += scores[i][j];
				lengthCount = scores[i].length + scores.length;
			}
		}
		//출력
		System.out.println("평균: " + sum);
		System.out.println("총합: " + sum / (float)lengthCount);
		
	}//main

}
