package kosta_basic;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. 배열선언, 생성분리
		
		int arr[]; //배열 선언 => 주소값을 넣을수 있는 변수가 생성
		arr = new int [5];  // 배열 생성(여러개의 데이터를 담을 수 있는 변수 생성)
							// 생성된 주소를 arr에 대입을 했다.
		
		// 2. 배열선언, 생성 같이 하는 방법
		int arr2[]= new int [5];
		
		// 3. 배열선언,생성, 초기화 같이하는 방법
		int arr3[] = {1,2,3,4,5};        //선언한 배열안에 생성하고 값을 추가한경우
		//for 문을 이용해서 전체 배열요소를 출력하자
		//arr3[0] =1
		//arr3[1] =2
		//arr3[2] =3
		//arr3[3] =4
		//arr3[4] =5
		
//		for(int i=0;i < arr3.length; i++)

//		System.out.println("arr[" + i+ "]" + arr3[i]);	// 인덱스를 필요할  경우
		
		//향상된 for 문을 이용해서 출력하자
		for(int n :arr3) {
			System.out.print(n +","); //배열안에 있는 값만 필요로 한경우
		}
		
		//배열 사용 시퀀스
		// 1. 배열에 사용될 데이터 타입을 무엇인가?    단점  데임터 타입이 하나만 가능하다
		// 2. 배열의 크기 를 결정 (10개인지 20개인지)-> 초과사용 -> ArrayIndexOut... 에러가 나온다
		//									  단점 크기가 한번 지정후 바꿀수가 없다
		// 3. 배열을 어떻게 초기화 할것인지(직접 인덱스,for,생성과 동시에처리)
		// 4. 배열에 있는 데이터 출력(for문,향상된 for문)
		
		//구구단 7단읠 결과를 배열안에 초기화 후 출력
		
//		int[] arr = new int[8];
//		for(int i;i<=0;i++)
 }
}