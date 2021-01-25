package kosta_basic;

import java.util.Scanner;

public class Test_sc_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력1");
		sc.nextInt();
		System.out.print("정수입력2");
		sc.nextInt();
		
		System.out.print("문자입력");
		sc.nextLine();
		String a = sc.nextLine();
		System.out.println(a);
		System.out.println("done");
	}

}
