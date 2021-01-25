package kosta_basic;

public class Callby_Ex {
//메서드 에서 파라미터 에게 변수를 주어도 바뀌지 않는다.
	public static void change(int num) {
		num+= 100;
		
		//return num;
	}
	public static void change2(int arr[]) {
		arr[0] += 20;
	}
	
	public static void main(String[] args) {
	//CallByValue: 값에 의한 호출
		int num =50;
		int arr[] = {10};
		
		//CallByValue: 값에 의한 호출
		change(num);
		//CallByReference : 주소값에 의한 호출  ||매우 중요하다 꼭 숙지하자 
							//앞으로 객체가 들어간 레퍼런스에서는 주소값을 주니 변경이 가능하다.
		change2(arr);
		
		//System.out.println(num);
		System.out.println(arr[0]);
	}

}
