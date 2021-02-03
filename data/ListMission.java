package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {
	
	public static void show(List<String> list) {
	
//		int num = list.size();
//		for(int i =0; i< num; i+=1) {
//			System.out.print(list.get(i)+", ");
//		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로 문자열 입력받아
		// 데이터 추가, 삭제 출력을 구현
		LinkedList<String>list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int idx = -1;
		
		while(true) {
			System.out.println("1.추가 2.삭제3.종료");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.print("입력: ");
				list.add(sc.nextLine());   //String str = sc.nextLine();
				show(list);					//list.add(str);
				break;						//show(list);
//			case "2":
//				System.out.println("수정: ");
//				String str = sc.nextLine();
//				idx =list.indexOf(str);
//				if(idx != -1) {
//					System.out.print("수정내용: ");
//					list.set(idx, sc.nextLine());
//				}
//				show(list);
//				break;
			case "2":
				System.out.print("삭제: ");
				String str2 = sc.nextLine();
				
				int idx1 = list.indexOf(str2);
				if( idx1!= -1) {
					list.remove(idx1);
				}
				show(list);
//				idx = list.indexOf(str2);
//				if (idx != -1) {
//					list.remove(idx);
//				}
//				show(list);
				break;
			case "3":
				System.out.println("종료 ");
				return;
			}
		}
	}

}
