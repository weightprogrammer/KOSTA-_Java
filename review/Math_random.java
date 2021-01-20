package review;

public class Math_random {

	public static void main(String[] args) {
		// 난수 를 얻기 위해서는 Math.random() 을 사용해야 하는데
		//이 메서드는 0.0과1.0사이의 범위에 속하는 하나의 double값을 변환한다.
		//0.0은 범위에 포함되고 1.0은 포홤되지 않는다.

		//0.0 <= Math.random() < 1.0
		
		int num = 0;
		
		//괄호 {} 안의 내용을 5번 반복한다
		for (int i =1; i<=5; i++) {
			num = (int) (Math.random() *6) +1;
			System.out.println(num);
		}
		
	}

}
