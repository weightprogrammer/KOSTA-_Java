package Arr_ex;

public class Arr_ex3 {

	public static void main(String[] args) {
		int sum =0; 	 //총합을 저장하기 위한변수
		float aver = 0f; //평균을 저장하기 위한 변수
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0; i<score.length;i++) {
			sum+= score[i];
		}
		aver =sum /(float)score.length;// 계산결과를 float타입으로 형변환
		
		System.out.println("총합"+sum);
		System.out.println("평균"+aver);
	}

}
