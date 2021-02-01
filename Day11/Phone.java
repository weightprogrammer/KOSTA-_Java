package kosta.Day11;

public class Phone implements Product {

	private int no;
	private String name;
	private int price;
	
	public Phone() {}	

	public Phone(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public int discountApply() {
		price = (int)(price*0.8);		
		return price;
	}

	@Override
	public void show() {
		System.out.println("번호: " + no);
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getNumber() {
		return no;
	}




	
}
