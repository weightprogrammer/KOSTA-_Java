package kosta.mission;

import java.util.Scanner;

public class Mission9_1 {
	// 메뉴를 선택해서 해당 메뉴의 명령을 실행해보자.
			//1번 추가 2.출력3.검색4.종료 스위치
			//string 배열 생성
			//입력 :1 를 하면
			//배열에 데이터 추가
			//입력 :2 를하면
			//배열에 있는 데이터가 출력
			//입력 :3 를하면
			//해당 문자열에 인덱스를 출력
			//입력 :4번
			//return;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String strr[] =new String[10];
		int count = 0;
		
		
		while(true) {
			System.out.println("1번 추가 2.출력3.검색4.종료");
			System.out.print("메뉴입력:");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.println("문자열입력:");
				String str =sc.nextLine();
				strr[count++] = str;
				break;
			case "2":
				for(int i =0; i<count;i++) {
					System.out.println(strr[i]);
				}
				break;
			case "3":
				System.out.print("검색 입력:");
				String search = sc.nextLine();
				int idex = -1;
				for (int i =0; i<count;i++) {
					if(strr[i].equals(search)) {
						idex =i;
						break;
					}
				}
				System.out.println(idex + " 번쨰 입니다.");
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;

			default:
				break;
			}
		}
		
	}
}