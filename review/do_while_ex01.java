package review;

import java.util.Scanner;

public class do_while_ex01 {

	public static void main(String[] args) {
		// do-while 문은 while 의 변형으로 최소한 한번은 수행을 하게 한다.
		
//		do {
//			//조건식의 연산결과 참일때 수행될 문장들을 적는다(처음 한 번은 무조건 실행)
//		} while (조건식); 
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;//1 ~100사이의 임의의 수 저장
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요");
			input = sc.nextInt();
			
			if(input > answer ) {
				System.out.println("down");
			}else if(input < answer) {
				System.out.println("UP");
			}
		}while(input!=answer);
		
		System.out.println("정답");
	}
}
