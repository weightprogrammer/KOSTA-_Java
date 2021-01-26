package kosta.mission;

import java.util.Scanner;

public class Mission08 {
	//배열 사용 시퀀스
// 1. 배열에 사용될 데이터 타입을 무엇인가?    단점  데임터 타입이 하나만 가능하다
// 2. 배열의 크기 를 결정 (10개인지 20개인지)-> 초과사용 -> ArrayIndexOut... 에러가 나온다
//									  단점 크기가 한번 지정후 바꿀수가 없다
// 3. 배열을 어떻게 초기화 할것인지(직접 인덱스,for,생성과 동시에처리)
// 4. 배열에 있는 데이터 출력(for문,향상된 for문)
	
	//총점을 구하는 메서드 
	public static void total(int arr[]) {
		for(int i=0;i<3;i++) {
			arr[3] += arr[i];
		}
	}
	//평점을 구하는 메서드
	public static void average(int arr[]) {
		arr[4] += arr[3]/3;
		
	}
	//출력하는 메서드
	public static void print(int arr[]) {
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		// 국어 영어 수학 점수를 입력하라
		// 총점과 평균을 출력하라
		//모든 변수를 배열을 이용하여 구현하라
		
		Scanner sc =new Scanner(System.in);
		int arr[] = new int [5];
		for(int i=0;i<3;i++) {
			System.out.println("입력:");
			arr[i] = sc.nextInt();
//			arr[3] += arr[i];
		}
		total(arr);
		average(arr);
		print(arr);
		
//		arr[4] = arr[3]/3;
//		System.out.println("국어\t영어\t수학\t총점\t평균");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"\t");
//		}
		
	}

}
