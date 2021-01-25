package kosta_basic;

public class Ex1 {

	public static void main(String[] args) {
		
		int x = 1, y = 2, z =3;
		
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
