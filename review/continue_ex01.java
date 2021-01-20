package review;

public class continue_ex01 {

	public static void main(String[] args) {
		// continue 문은 반복문 내에서만 사용 되며 반복 진행중 continue문 만나면 반복문 끝으로 이동하여 다음 반복으로 넘어간다
		
		for(int i=0;i<=10;i++) {
			if(i%3==0)
				continue; // 조건식이 참이되어 continue문이 수행되면 블럭의 끝으로 이동한다
						  // break문 과 달리 반복문을 벗어나지 않는다.
			System.out.println(i);
		}
	}

}
