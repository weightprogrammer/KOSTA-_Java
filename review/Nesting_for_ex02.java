package review;

public class Nesting_for_ex02 {

	public static void main(String[] args) {
		// 삼각형으로 생긴 별을 만들어 보자
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
