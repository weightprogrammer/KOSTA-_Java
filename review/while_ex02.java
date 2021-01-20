package review;

public class while_ex02 {

	public static void main(String[] args) {
		// 변수 i값만큼 블럭{} 반복해보라 while 문으로...
		// 1부터 몇까지 더해야 100을 넘지 않는 지 알아내라
		
		int sum =0;
		int i = 0; //i를 1씩 증가시켜서 sum에 더한다
		
		while(sum<=100) {
			System.out.printf("%d  -  %d%n" , i, sum);
			sum += ++i;
		}
		
		
		
//		int i =5;
//		
//		while(i!=0) {
//			i--;
//			System.out.println(i +"I can do it");
//		}

	}

}
