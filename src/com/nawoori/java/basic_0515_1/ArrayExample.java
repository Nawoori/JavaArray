package com.nawoori.java.basic_0515_1;

public class ArrayExample {

	public static void main(String[] args) {
		// 123
		// 456
		// 789 �����
		
		// 3x3 �迭�Է�
		int result [][] = new int[3][3];
		int count = 0;
		for(int i=0; i < result.length; i++) { 		
		    for(int j=0; j < result[0].length; j++) {
			 count = count +1;
			 result[i][j] = count;
			}
		}

		// 2���� �迭 ���
		for(int i=0; i < result.length; i++) {
		    for(int j=0; j < result[0].length; j++) {
			System.out.print("["+result[i][j]+"]"); // �� 2�������� 1���� �迭ĭ�� ���� ���
			}
			System.out.println(""); // �� 2���� �迭�� 1ȸ�� �� ������ ���
			     }
			}


	public void drawSmail(int count){
		
		//�� ����ؾ� �Ǵ� ������ ����
		
		int total = count * count;
		int array[][] = new int[count][count];
		
		int i = 0;
		int j = 0;
		
		int n = 1;
		while(n <= total){
			//��
			for(j=0; j < count ; j++){
				array[i][j] = n++;
			}
			//��
			for(i=1 ; i < count ; i++){
				array[i][j] = n++;
			}
			//��
			for(; j >= 0 ; j--){
				array[i][j] = n++;
			}
			//��
			for(; i >= 0 ; i--){
				array[i][j] = n++; 
		    }
			
			i = i+1;
			j = j+1;
			
		}
	}
}