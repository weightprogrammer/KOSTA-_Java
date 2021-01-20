package review;

public class while_ex01 {

	public static void main(String[] args) {
		
		
//		while (조건식) {
//			//조건식 의 연산결과 가 참(true)인 동안, 반복될 문장들을 적는다.
//		}

		//for 초기화,조건식,증감식
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		
		//whule
		int i=1; //초기화
		
		while(i<=10) {//조건식
			System.out.println(i);
			i++; // 증감식
		}
	}

}
