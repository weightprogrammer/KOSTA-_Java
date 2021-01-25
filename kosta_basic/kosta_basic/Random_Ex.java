package kosta_basic;

import java.util.Random;

public class Random_Ex {

	public static void main(String[] args) {
		// Math클래스 안에 random ()매서드
	 double	d= (int)(Math.random() *6) +1;// 1 ~6 까지 뽑는 방법
	 //System.out.println(d);
	
	 //Roandom 클래스 nextInt()사용
	 Random r = new Random();
	 int d2 = r.nextInt(45) +1;
	 System.out.println(d2);

	}

}
