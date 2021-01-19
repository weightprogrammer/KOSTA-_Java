package kosta_basic;

public class VariableTest {

	public static void main(String[] args) {
		//1. 적절한 데이터 타입 삽입
		double n1 = 11.4 + 10;
		System.out.println(n1);
		
		double n2 = 10+ 11.4;
		System.out.println(n2);
		
		int n3 = (int) n2;
		System.out.println(n3);
//		
		String n4 = n3 + "" ;
		System.out.println(n4);
//		
		int n5 = Integer.parseInt(n4);
		System.out.println(n5);
		
		int b1 = 10;
		//b1 = b1+ 5;
		b1+= 5;
		System.out.println(b1);
		
		int b2 = 20;
		int b3 = ++b2;
		System.out.println(b2);
		System.out.println(b3);
		//연산자는 출력과 출력 전으로 나뉜다. 후위 연산자는 후에 전위는 대입후 앞에서 진행된다.
		int b4 = 30;
		System.out.println(b4++);
	}

}
