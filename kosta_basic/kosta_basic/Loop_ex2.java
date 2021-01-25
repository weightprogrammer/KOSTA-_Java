package kosta_basic;

public class Loop_ex2 {

	public static void main(String[] args) {
		//중첩 for문 -> for문안에 for이 있는경우
//		for(int i =1; i<=3;i++) {
//			for(int j=1; j<=2;j++) {
//				System.out.println("i=" + i +"," + "j" + j);
//			}
//		}
         //구구단 2단 ~ 9단 출력
		//int sum =0;
//		for(int i=1; i<=9; i++) {
//			System.out.println("7 *"+ i +"=" +7*i);
//		}
		
//		System.out.println("7단");
//		for(int i =2;i<=9;i++) {
//			System.out.println("##" + i+ "단##");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i +"*" +j + "=" +i*j);
//			}
//		}
		
		//4x+5y =60 => x,y를 구하자.
//		for(int x=0;x<=15;x++) {
//			for(int y=0; y<=15; y++) {
//				if((4*x)+(5*y)==60) {
//					System.out.println(x + "," + y );
//				}
//			}
//				
//		}
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
