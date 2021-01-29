package kosta.oop;



public class BookMain {

	public static void main(String[] args) {
		
		int total = 0;
		
		Book [] arr= {
				
				new Book("java", 30000),
				new Book("jsp", 25000),
				new Book("html", 15000),
		};
		
		
		for(int i =0; i<arr.length;i++) {
			arr[i].discount();
			arr[i].print();
			total += arr[i].dc;
		}
		
		System.out.println("총금액:" + total + " 입니다.");
		
//		Book java =new Book("java", 30000);
//		Book jsp =new Book("jsp", 25000);
//		Book html =new Book("html", 15000);
//		
//		
//		java.discount();
//		java.print();
//		
	}

}
