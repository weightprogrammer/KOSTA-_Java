package JavaEx;

import java.util.Scanner;

public class java_ex010 {

	public static void main(String[] args) {
//		문제 10
//		정수(integer) 두 개를 입력받아 그대로 출력해보자.
//
//		입력
//		두 개의 정수가 차례대로 입력된다.
//
//		출력
//		입력받은 두 정수를 공백으로 구분하여 그대로 출력한다.
//
//		입력 예시 
//		1
//
//		2
//
//		출력 예시
//		1 2
//		도움말
//
//		Scanner 클래스를 사용하면 된다. nextInt() 메소드 사용.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자입력");
		int num = sc.nextInt();
		System.out.println("두번째 숫자입력");
		int sum = sc.nextInt();
		
		System.out.println(num + " " + sum);
	}

}
