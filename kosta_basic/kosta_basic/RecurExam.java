package kosta_basic;

import java.util.Scanner;

public class RecurExam {
	
	static int f(int n) {
		if(n>0) {
			return n *f(n-1); //
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		//재귀 함수 중요중요 매우중요  			알고리즘을 잘 풀기 위해선 (for),(if),(재귀함수),(배열)
		//재귀 함수는 자기 자신을 계속 풀러 오는것
		//재귀 함수(팩토리얼 계산 Ex:5!= 5 * 4 * 3 * 2 * 1)
		//재귀 함수는 항상 탈출 조건을 걸어야 한다 안그럼 무한반복
		Scanner sc =new Scanner(System.in);
		System.out.print("정수 입력:");
		int x = sc.nextInt();
		
		System.out.println(x + "!=" + f(x));
	}

}
