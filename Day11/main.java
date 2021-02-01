package kosta.Day11;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class main {
	
	public static void showProduct(Product[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
			System.out.println();
		}
	}
	
	public static Product getProduct(int no, Product[] arr) {
		Product p = null;
		for(int i=0;i<arr.length;i++) {		
			if(no == arr[i].getNumber() ) {
				p = arr[i];
				break;
			}
		}
		
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		Product arr[] = {
			new Phone(1, "갤럭시S21", 500000),	
			new Phone(2, "아이폰12", 800000),
			new NoteBook(3, "그램16", 1500000)
		};
		
		while(true) {
			showProduct(arr);//상품목록 출력
			
			System.out.println("1.장바구니 추가  2.장바구니 목록  3.종료");
			System.out.print("선택: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:				
				System.out.print("상품선택: ");
				int no = sc.nextInt();
				Product p = getProduct(no, arr);
				cart.addCart(p);//장바구니 추가
				break;
			case 2:
				cart.orderList();//장바구니 목록
				break;
			case 3:
				System.out.println("종료");
				return;
			}
		}
		
		
	}

}
