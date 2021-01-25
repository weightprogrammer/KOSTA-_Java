package kosta_basic;

public class Ex_001 {

	public static void main(String[] args) {
		//구구단 7단읠 결과를 배열안에 초기화 후 출력
		
		int arr4[] = new int[9];
		for(int i =0;i< arr4.length; i++) {
			arr4[i] =7 *(i+1);
			System.out.println("7*" + (i+1)+ "=" + arr4[i]);
		}
	}

}
