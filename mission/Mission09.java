package kosta.mission;

import java.util.Scanner;

public class Mission09 {
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

		// 1.배열생성
		String[] names = new String[3];
		int size = names.length;
		// 2.입력받기
		Scanner put = new Scanner(System.in);
		// 3.입력된 이름을 배열에 순서에 맞게 저장
		for (int i = 0; i < size; i++) {
			System.out.print("이름을 입력하세요. ");
			names[i] = put.next();
		}
		for (int i = 0; i < size; i++) {
			// 4.화면에 입력된 이름을 표시한다.
			System.out.println("이름: " + names[i]);
		}
	}
}