package kosta.oop2;

public class MinusMain {

	public static void main(String[] args) {
		
		MinusAccount ma = 
				new MinusAccount("3333-3333", "¹ÚÀç»ó", 6000, 10000);
				
		ma.withdraw(12000);
		ma.print();
	}

}
