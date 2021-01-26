package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	// 총점을 구하는 메서드
	public static int total(int kor, int eng, int mat) {
		int sum =0;
		sum = kor + eng + mat;  //데이터 타입이 일치해야한다.
		return sum;
	}
	// 평점을 구하는 메서드
	public static int average(int total) {
		int average = total/3;
		 //데이터 타입이 일치해야한다.
		
		return average;
	}
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 대입 받고
		//총점과 평균을 출력하라(평균이 소숫점이 출력)
		Scanner sc =new Scanner(System.in);
		
		int kor, eng, mat;
		
		int sum = 0;
		int aver = 0;
		
		System.out.println("국어");
		kor = sc.nextInt();
		System.out.println("영어");
		eng = sc.nextInt();
		System.out.println("수학");
		mat = sc.nextInt();
		
		sum = total(kor, eng, mat);
		aver = average(sum);
		
		System.out.println("총점" + sum);
		System.out.println("평균" + aver);
		//if 문을 스위치를 만들어보자
		
		switch (aver/10) {
		case 9:
			System.out.println("A학점");
			break;
		case 7:
			System.out.println("B학점");
			break;
		case 5:
			System.out.println("C학점");
			break;

		default :
			System.out.println("f입니다");
			break;
		}
//		if (aver >= 90) { 
//			System.out.println("A점 입니다.");
//		}else if (aver >= 80 ) {
//			System.out.println("당신의 점수는 B점 입니다.");
//		}else if (aver >= 60 ) {
//			System.out.println("당신의 점수는 C점 입니다.");
//		}
		
//		int kor = 8;
//		int math = 7;
//		int en = 5;
//		
//		System.out.println("국어:"+kor);
//		System.out.println("수학:"+ math);
//		System.out.println("영어:"+ en);
//		System.out.println(kor + math + en);
//		System.out.println( kor + math + en /(double) 3);
//		System.out.println( kor + math + en);	
	}
}
