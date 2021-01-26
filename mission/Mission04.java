package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//키보드로 부터 id, pass입력 받아서
		//id,pass 일치하면 "로그인성공"
		//실패시 "로그인 실패"
		//id 불일치 => 해당 아이디가 존재하지 않습니다.
		//pass 불일치 => 비밀번호가 일치하지 않습니다.
		//Scanner => nextLine() => 한줄 문자열 읽어오는 기능
		//문자열 일치=> 문자열.equals("문자열")
		//다시 해보자 실패
		
		String m_id = "kosta";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id:");
		String id = sc.nextLine();
		System.out.println("pass:");
		String pass = sc.nextLine();
		
		if(id.equals(m_id) && pass.equals(m_pass)) {
			System.out.println("로그인성공");
		}else {
			if(!id.equals(m_id)){
				System.out.println("해당아이디가 존재하지않습니다.");
			}else {
				System.out.println("비밀번호가 일치하지않습니다.");
			}
	 }
 }
}
