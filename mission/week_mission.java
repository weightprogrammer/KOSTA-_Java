package kosta.mission;

import java.util.Scanner;

public class week_mission {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int t;
		
		for(;;) {
			System.out.println("테스트 케이스입력 :");
			t= sc.nextInt();
			sc.nextLine();
			if(1 <= t && t <= 50)
				break;
			}
		long[] a = new long[t];
		long[] b = new long[t];
		
		for (int i = 0; i< t; i++) {
			for(;;) {
				System.out.println("입력 :");
				
				a[i] = sc.nextLong();
				b[i] = sc.nextLong();
				sc.nextLine();
				
				if (a[i] >= b[i] && b[i] >= 1 && b[i] <=5000) {
					break;
				}else {
					System.out.println("조건이 맞지 않습니다.");
				}
			}
		}
		int day = 0;
		for (int i=0; i<t; i++) {
			for (;;) {
				a[i] =a[i] *2;
				b[i] =b[i] *3;
				day++;
				if(b[i] > a[i])
					break;
			}
			System.out.println("#T" + (i + 1) + "\t" +day);
			day =0;
		}
	}
}

