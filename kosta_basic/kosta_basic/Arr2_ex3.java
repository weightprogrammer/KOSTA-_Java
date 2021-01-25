package kosta_basic;

import java.util.Scanner;

public class Arr2_ex3 {

	public static void main(String[] args) {
		String [][] word = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer", "정수"}
		};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i< word.length; i++) {
			System.out.printf("Q%d.%s의뜻은?", i+1, word[i][0]);
			
			String tmp =sc.nextLine();
			
			if(tmp.equals(word[i][1])) {
				System.out.printf("정답입니다%n%n");
			}else {
				System.out.printf("틀렸습니다 정답은 %s입니다.%n%n",word[i][i]);
			}
		}

	}

}
