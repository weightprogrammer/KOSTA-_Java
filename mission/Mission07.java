package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		//UP/down game
		//임의 난수를 생성:1~100 임의숫자 생성
		//키보드로부터 숫자를 입력
		//입력한 숫자와 임의의 난수와 비교
		//정답,up,down =>메세지 출력
		//몇 번시도했는지 도 출력
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int re = r.nextInt(100);
		int count = 0;
		int n;
		
		System.out.println(re);
		while(true) {
			do {
				System.out.println("1 ~ 100입력:");
				n = sc.nextInt();
			}while(n> 100);
			count++;
			if(re==n) {
				System.out.println(count + "번째 성공!");
				break;
			}else if(re < n) {
				System.out.println("Donw");
			}else if(re > n) {
				System.out.println("UP!!");
			}
		}
	}
}
//		int  input = 0, answer =0, count =0;
//		answer =(int) (Math.random() * 100) + 1;
//		Scanner sc =new Scanner(System.in);
//		do {
//			count ++;
//			System.out.println("1 ~ 100 까지 중 골랐으니 맞혀봐라");
//			input = sc.nextInt();
//			
//			if(input > answer) {
//				System.out.println("down");
//			}else if(input < answer) {
//				System.out.println("up");
//			}
//		}while(input!=answer);
//		System.out.println("정답");
//		System.out.println("질문시도는?" + count);
//		}
//	}

