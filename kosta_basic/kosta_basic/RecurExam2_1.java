package kosta_basic;

import java.util.Scanner;

public class RecurExam2_1 {
	
	public static int recur(int n) {
		if(n==0) {
			return 0; //
		}else {
			return n + recur(n+1);
		}
	}
	
	public static int recur2(int n, int arr[] ) {
		if(n<=0 || n >= arr.length) {
			return 0;
		}else {
			return arr[n] +recur2(n+1, arr);
		}
	}
	public static void main(String[] args) {
		// 0 ~ n 까지의 합계를 구하세요 => 재귀 함수   /0부터 계속 더한다
		Scanner sc =new Scanner(System.in);
		System.out.print("입력? ");
		int n = sc.nextInt();
		
//		System.out.println( "," + f(n));
		
		int[] arr= {10,20,30,40};
		System.out.println(recur2(n-1 , arr));
	
		//n ~ arr[n-1] 까지의 합을 구하라. 재귀함수로
		
	}

}
