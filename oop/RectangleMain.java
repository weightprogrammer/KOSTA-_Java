package kosta.oop;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("start");
		Rectangle r1 = new Rectangle(sc.nextInt(),sc.nextInt()); //new 객체가 생성될때 자동으로 생성된다.
		Rectangle r2 = new Rectangle(sc.nextInt(),sc.nextInt());
		
//		System.out.println("가로:");
//		r1.w =sc.nextInt();
//		
//		System.out.println("세로");
//		r1.h = sc.nextInt();
		
		r1.area();
		r1.print();
		r2.area();
		r2.print();
	}

}
