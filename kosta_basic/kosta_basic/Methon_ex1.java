package kosta_basic;

public class Methon_ex1 {
	//메서드는 중복된 코드를 막기위해 만든다.
	//메서드 형태
	// 접근제어자 - 리턴형 - 메서트 이름(파라미터){
	//      메소드 내용
	//}
	
	static void printCharacter(char ch,int num) {
		for(int i=1;i<=num;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static int add(int n1, int n2) {
		int sum =0;
		sum = n1 + n2;  //데이터 타입이 일치해야한다.
		
		return sum;
	}
	
	public static void main(String[] args) {
		printCharacter('*', 20); //메서드 호출
		
		System.out.println("Hello");
		
		printCharacter('#', 15);
		printCharacter('A', 2);
		
		int n1 = 10;
		int n2 = 20;
		
		int re = add(n1, n2);
		System.out.println(re);
	}

}
