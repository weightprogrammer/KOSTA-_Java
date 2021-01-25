package kosta_basic;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		//세 정수 a,b,c가 입력 되었을때 짝수만 출력해보자
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력해라>");
		int a= sc.nextInt();
		System.out.println("정수를 입력해라>");
		int b= sc.nextInt();
		System.out.println("정수를 입력해라>");
		int c= sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(a);
		}
		if(c%2==0) {
			System.out.println(a);
		}
	}

}
