package kosta.phone;

import java.util.Scanner;

public class PhoneInfo {
	//멤버 변수 선언
	//멤버 메서드 정의
	
	Scanner sc= new Scanner(System.in);
	
	 String name;
	 String phoneNum;
	 String birth;
	
	//디폴트 생성
	public PhoneInfo() {}
	
	//생성자 생성
	public PhoneInfo(String name, String phoneNum, String birth) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}
	
	
	//출력 메소드 생성
	public void show() {
		System.out.println("이름 : " + name + "\t\t" +"전화번호 : " + phoneNum + "\t" +"생년월일 :" + birth);
	}
}
