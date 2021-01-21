package JavaEx;

import java.util.Scanner;

public class java_ex008 {

	public static void main(String[] args) {
//		문제 8
//		키보드로 입력한 문자를 그대로 출력하는 프로그램을 작성해보자.
//
//		입력
//		문자 한 개가 입력된다.
//
//		출력
//		입력된 문자를 그대로 출력한다.
//
//		입력 예시 
//		p
//
//		출력 예시
//		p
//
//		도움말
//		Scanner 클래스를 사용하면 된다. nextLine() 메소드 사용.
		Scanner sc = new Scanner(System.in);
		String  sum = sc.nextLine();
		
		System.out.println(sum);
	}

}
