package kosta.Day11;

public class Cart {
	private Product[] pArr;
	private int total;
	private int count;
	
	public Cart() {
		pArr = new Product[10];
	}
	
	public void addCart(Product p) {
		pArr[count++] = p;		
		total += p.discountApply();
	}
	
	public void orderList() {
		for(int i=0;i<count;i++) {
			pArr[i].show();
		}
		System.out.println();
		System.out.println("гу╟Х: " + total);
	}
	

	
}


