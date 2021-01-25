package kosta_basic;

import java.util.Scanner;

public class if_Ex {

	public static void main(String[] args) {
		int score =0;
		char grade = ' ';
		System.out.println("점수를 입력해라");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >=90) {
			grade = 'A';
		}else if (80 <= score && score <90) {
			grade = 'B';
		}else if (score >=70) {
			grade = 'c';
		}else if (score >=40) {
			grade = 'd';
		}else {
			grade ='f';
		}
		System.out.println("당신의학점은 " + grade +"입니다.");
	}

}
//public static void main(String[] args) {
//	System.out.println("숫자를 입력하세요.");
//	Scanner sc = new Scanner(System.in);
//	int input = sc.nextInt();
//	
//	if(input==0) {
//		System.out.println("입력한 숫자는 0입니다");
//	}else {
//		System.out.println("입력한 숫자는 0이 아님");
//int x = 0;
//System.out.printf("x=%d 일때, 참인 것은%n", x);
//
//if(x==0) System.out.println("x==0");
//if(x!=0) System.out.println("x!=0");
//if(!(x==0)) System.out.println("!(x==0)");
//if(!(x!=0)) System.out.println("!(x!=0)");
//
//x =1;
//System.out.printf("x=%d 일때, 참인 것은%n", x);
//if(x==0) System.out.println("x==0");
//if(x!=0) System.out.println("x!=0");
//if(!(x==0)) System.out.println("!(x==0)");
//if(!(x!=0)) System.out.println("!(x!=0)");
