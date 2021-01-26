package kosta.mission;

import java.util.Scanner;

public class WeekMission_1 {

	public static int deep(int a,int b,int day) {
		if(b>a) {
			return day;
		}else {
			return deep(a*2,b*3, day+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int t= sc.nextInt();// 게임수 3판
		
		for(int i=0;i<t;i++) {
			sb.append("#" +(i+1) + " " + deep(sc.nextInt(), sc.nextInt(), 0));
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
