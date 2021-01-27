package kosta.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.추가 2.전체검색 3.검색 4.종료
		//Scanner sc = new Scanner(System.in);
		
		//객체 생성
		Manager m = new Manager();		
		
		//참, 거짓을 판별하기 위해 while(true) 를 사용
		while(true) {
			System.out.println("1.추가 2.전체검색 3.검색 4.변경 5.삭제 6.종료");
			System.out.println("선택:");
			String menu =  DateInput.sc.nextLine();
			
			//switch 문으로 해당 메소드 호출
			switch (menu) {
			case "1":
				try {
					m.addPhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.change();
				break;
			case "5":
				m.delete();
				break;
			case "6":
				System.out.println("종료 합니다.");
				
				return;

			default:
				break;
			}
		}

	}

}
