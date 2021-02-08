package kosta.Thread;

public class Main1 {

	public static void main(String[] args) {
		Manger m = new Manger();
		
		Baker b1 = new  Baker("±èÅ¹±¸" , m);
		Baker b2 = new  Baker("¹ÚÅ¹±¸" , m);
		Baker b3 = new  Baker("ÀÌÅ¹±¸" , m);
		
		
		Customer c1 = new Customer("±è¼Òºñ", m);
		Customer c2 = new Customer("ÀÌ¼Òºñ", m);
		Customer c3 = new Customer("¹Ú¼Òºñ", m);
		
		b1.start();
		b2.start();
		b3.start();
		
		for(int i = 0; i<1000000;i++ ) {}
		
		c1.start();
		c2.start();
		c3.start();
	}

}
