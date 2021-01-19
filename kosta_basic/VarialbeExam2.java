package kosta_basic;

public class VarialbeExam2 {

	public static void main(String[] args) {
//		int num1;//변수 선언
//		num1 = 10;//변수 초기화
		
		int num1 = 10; //변수 선언 ,초기화
		
//기본리터럴:정수(int),실수형 (double),''(char),""(String), true/false (boolean)

		float num2 = 3.14f;
		double num3 = 3.14;
		
		char num4 = 'A';
		String num5 = "ABC";
		
		boolean num6 = false;
		
//형변환 (Casting) : 기본형 데이터형 (byte, short, int , long , flaot, double, cher)
//byte< short < int < long < float < double
		
		double n = 3.14 + 10; // 묵시적 형변환
		int n2 = (int) (3.14 + 100); //강제 형변환
		
		int num7 = 86;
		System.out.println((char)num7);
		
		for(int i =65; i<=125; i++) {
//			System.out.println((char)i);
		}
		//문자열과 다른 데이터형과의 연산 => 문자열로 형변환
		//문자열 > 다른 데이터형
		String num8 = 7 +"6" +7;
		System.out.println(num8);
		
		num8 ="안녕"; 
		//문자열을 =>정수형으로 형변환 "767" + 10 =>777
		//NumberFormatException 오류가 나오면 Integer.parseInt 에 나오는 값을 확인하자 
		int num9 = Integer.parseInt(num8);
		
		int num10 = num9 + 10;
		System.out.println(num10);
		
		
	}

}
