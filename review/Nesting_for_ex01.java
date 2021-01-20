package review;

public class Nesting_for_ex01 {

	public static void main(String[] args) {
		// for문 안에 또 다른 for문을 포함시키는 것이 가능
		
		// 이런 바보짓은 하지말고 for 문을 써보자
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
		//for 문
		for(int i=1;i<=5;i++) {
			System.out.println("*****");
		}
		
		//중첩 for 문
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
