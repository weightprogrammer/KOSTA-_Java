package kosta.mission;

import java.util.Scanner;

public class Mission4_1 {

	//로그인 체크 메서드 구현
	// 메서드 ( id, pass) {
		//리턴 값 0 => 실패 1=>성공
	//}
	public static int login(String id, String pass) {
		String m_id = "kosta";
		String m_pass = "1234";
		
		if(id.equals(m_id) && pass.equals (m_pass)) {
			return 1;//데이터 타입이 일치해야한다.
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("id:");
		String id = sc.nextLine();
		System.out.println("비밀번호");
		String pass = sc.nextLine();
		int re = login(id, pass);
				
		if(re == 1) {
			System.out.println("성공입니다");
		}else {
			System.out.println("실패입니다");
		}
		
	}

}
