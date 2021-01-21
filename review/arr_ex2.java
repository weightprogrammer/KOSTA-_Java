package Arr_ex;

public class arr_ex2 {

	public static void main(String[] args) {
		// index 범위 : 0~9 
		int[] arr = new int[4]; //길이가 5인 int 배열 arr을 생성
		System.out.println("arr.legth" + arr.length);
		
		for(int i= 0; i<arr.length; i++) { // index 범위를 벗어나지 않게 하자
			System.out.println(arr[i]);
		}
	}

}
