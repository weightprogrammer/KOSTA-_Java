package kosta_basic;

public class If_Exam {

	public static void main(String[] args) {
		int a =100;
		int b = 20;
		
		if(a>b) {
			System.out.println("a보다 b가 크다");
			
		}else {
			System.out.println("b보다 a가 크다");
		}
		
		int n = 5;
		
		switch (n) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;

		default:
			System.out.println("그밖에 내용");
			break;
		}
		
	}

}
