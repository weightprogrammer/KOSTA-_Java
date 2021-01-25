package kosta_basic;

import java.util.Scanner;

public class Arr_ex03 {

	public static void main(String[] args) {
		// 로또 만들기
		int[] ball = new int[45];
		
		for(int i=0; i< ball.length; i++) 
			ball[i] = i+1;
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i < 6; i++) {
			j =(int) (Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for(int i=0; i < 6 ; i++)
			System.out.println(i + ball[i]);
	}

}
