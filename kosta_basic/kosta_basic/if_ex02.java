package kosta_basic;

import java.util.Scanner;

public class if_ex02 {

	public static void main(String[] args) {
		int  score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요");
		Scanner sc=new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다", score);
		
		if(score >= 90) {
			grade ='A';
			if(score >= 98) {
				opt = '+';
			}else if (score < 94) {
				opt= '-';
			}
			System.out.printf("당신의 학점은 %c%c입니다.%n", grade,opt);
		}

	}

}
