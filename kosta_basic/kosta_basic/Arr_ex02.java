package kosta_basic;

import java.util.Scanner;

public class Arr_ex02 {
	//배열 사용 시퀀스
	// 1. 배열에 사용될 데이터 타입을 무엇인가?    단점  데임터 타입이 하나만 가능하다
	// 2. 배열의 크기 를 결정 (10개인지 20개인지)-> 초과사용 -> ArrayIndexOut... 에러가 나온다
	//									  단점 크기가 한번 지정후 바꿀수가 없다
	// 3. 배열을 어떻게 초기화 할것인지(직접 인덱스,for,생성과 동시에처리)
	// 4. 배열에 있는 데이터 출력(for문,향상된 for문)
	public static void main(String[] args) {
		// 문자열 배열 생성 후 키보드로 부터 데이터를 초기화 =>q 문자를 입력 될때까지
		// nextLine(): 키보드 부터 한줄입력
		// 배열 전체 내용을 출력
		
		
		Scanner sc = new Scanner(System.in);
		String sArr[] =new String[10];
		int count =0;
		
		while(true) {
			System.out.println("입력:");
			String str =sc.nextLine();
			if(str.equals("q")) break;// "q" 가 나올때 브레이크 해준다.
			sArr[count++] = str;  
			//상수였기 때문에 변수로 카운트로 바꿔주고 계속 증가할수 있도록 ++넣는다.
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(sArr[i]);
		}
		
		
		
		
		
		
		
//		String [] names = {"a", "b", "q"};
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=0; i < names.length;i++)
//		System.out.println("names["+i+"]:" + names[i]);
//		
//		String tmp =names[2];
//		System.out.println("tmp:" + tmp);
//		names[0] = 

	}

}
