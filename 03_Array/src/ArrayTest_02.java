/**����� ����(0~100����)  �Է� 1�� 1��, 2�� 2��, 3�� 5�� ����*/
public class ArrayTest_02 {

	public static void main(String[] args){
		 //�Է� - DATABASE
		int [][] scores=new int[3][];
		scores[0]=new int [1];
		scores[1]=new int [2];
		scores[2]=new int [5];
		int sum = 0;
		int lengthCount = 0;
		
		//ó��
		scores[0][0]=100;
		
		scores[1][0]=90;
		scores[1][1]=89;
		
		scores[2][0]=70;
		scores[2][1]=60;
		scores[2][2]=50;
		scores[2][3]=40;
		scores[2][4]=30;
		
		
		//���
		for(int i=0; i< scores.length;i++) {
			for(int j=0; j< scores[i].length; j++){
				sum += scores[i][j];
				lengthCount = scores[i].length + scores.length;
			}
		}
		//���
		System.out.println("���: " + sum);
		System.out.println("����: " + sum / (float)lengthCount);
		
	}//main

}
