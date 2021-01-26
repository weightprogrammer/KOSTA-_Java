package kosta.mission;

import java.util.Scanner;

public class Mission06 {
	//2개의 정수를 입력받아 b - a 결과를 출력하자
	//b > a 가 되도록 입력받음
	//1. do ~while 입력받기
	//2. while => break;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a입력:");// 출력
		int a = sc.nextInt(); //출력할 a
		int b = 0;
		
//		for(;;) for문 무한반복 방법
		
		while(true) {
			System.out.println("b입력:");
			b = sc.nextInt();
			if(b > a) break;
		}
//		do {
//			System.out.println("b입력:");
//			b = sc.nextInt();
//		}while(a>=b);
//		
		System.out.println("b - a =" + (b-a));
	}

}
