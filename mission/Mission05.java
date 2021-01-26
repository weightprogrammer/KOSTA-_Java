package kosta.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 키보드로 부터 숫자를 입력받아 합을 구하자
		//음수를 입력하면 새롭게 다시 입력 받도록하자
//		int sum = 0;
//		int num = 0;
//	    Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        do {
//        	System.out.print(sum + num);
//        	sum++;
//        }while (sum < 10);
//        System.out.print("합값:" + sum +num);
		Scanner sc = new Scanner(System.in);
		int n =0;
		do {
			System.out.println("입력:");
			n =sc.nextInt();
		} while (n <= 0);
		int sum = 0;
		int i = 1;
		while (i<=n) {
			sum +=i;
			i++;
		}
        System.out.println("1에서" + n + "까지의 합:" + sum);
	}
}
