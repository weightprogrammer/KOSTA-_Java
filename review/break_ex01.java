package review;

public class break_ex01 {

	public static void main(String[] args) {
		// break 문 은 자신이 포함된 가장 가까운 반복문을 벗어난다 
		// 주로 if 문과 함께 사용되어 특정조건을 만족할 때 반복문을 벗어나게 한다
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum >100)
				break;
			++i;
			sum +=i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
