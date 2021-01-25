package kosta_basic;

public class VariableExam {
	static int num2;
	
	public static void main(String[] args) {
		//변수 선언 , 사용하기 위한 전제 조건
		// 1. 데이터의 내용(종류) => 데이터 타입 결정
		// 2. 데이터의 활용 지점 => 변수 선언 위치 결정
		
		//지역변수(로컬변수) : 메서드에서 선언된 변수
		int num1; //변수를 선언 => 메모리 할당
		int num2 = 0;
		num1 =10; //변수를 초기화 => 값을 할당
		System.out.println(num1);
		System.out.println(num2);
		
		//변수는 선언된 위치(scope) 매우 중요하다.
		int num3 = 100;
		
		if(num1 == 10 ) {
			//int num3 = 100;  변수 선언 : 유효구간: if{} 
			//변수는 선언된 위치가 중요하다  유효구간이 다르기 때문에 매우 중요하다.
			num3 = num3 +100;
		}
		System.out.println(num3);
		
	}
}
