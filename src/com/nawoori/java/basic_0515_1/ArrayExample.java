package com.nawoori.java.basic_0515_1;

public class ArrayExample {

	public static void main(String[] args) {
		// 123
		// 456
		// 789 만들기
		
		// 3x3 배열입력
		int result [][] = new int[3][3];
		int count = 0;
		for(int i=0; i < result.length; i++) { 		
		    for(int j=0; j < result[0].length; j++) {
			 count = count +1;
			 result[i][j] = count;
			}
		}

		// 2차원 배열 출력
		for(int i=0; i < result.length; i++) {
		    for(int j=0; j < result[0].length; j++) {
			System.out.print("["+result[i][j]+"]"); // 각 2차원줄의 1차월 배열칸의 값을 출력
			}
			System.out.println(""); // 각 2차원 배열이 1회전 할 때마다 출력
			     }
			}


	public void drawSmail(int count){
		
		//총 출력해야 되는 숫자의 개수
		
		int total = count * count;
		int array[][] = new int[count][count];
		
		int i = 0;
		int j = 0;
		
		int n = 1;
		while(n <= total){
			//북
			for(j=0; j < count ; j++){
				array[i][j] = n++;
			}
			//동
			for(i=1 ; i < count ; i++){
				array[i][j] = n++;
			}
			//남
			for(; j >= 0 ; j--){
				array[i][j] = n++;
			}
			//서
			for(; i >= 0 ; i--){
				array[i][j] = n++; 
		    }
			
			i = i+1;
			j = j+1;
			
		}
	}
}