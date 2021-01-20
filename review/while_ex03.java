package review;

import java.util.Scanner;

public class while_ex03 {

	public static void main(String[] args) {
		// 사용자 부터 숫자를 입력 받고 이 숫자의 각 자리의 합을 구해보라
		
		int num = 0, sum=0;
		System.out.print("숫자를 입력해보라(예:1234) ");
		
		Scanner sc= new Scanner(System.in);
		String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		num= Integer.parseInt(tmp);
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum+= num%10; //sum = sum+num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /=10; //num =num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합:" + sum);
	}

}
