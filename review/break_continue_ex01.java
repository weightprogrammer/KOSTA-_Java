package review;

import java.util.Scanner;

public class break_continue_ex01 {

	public static void main(String[] args) {
		// 메뉴를 보여주고 선택하게 해보자
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요 (종료:0");
			
			String tmp = sc.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if (!(1 <= menu && menu <=3)) {
				System.out.println("메뉴를 잘못시켰습니다");
				continue;
			}
			System.out.println("선택메뉴" + menu + "입니다.");
		}

	}

}
