package kosta.mission;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Board arr[] = {
				new Board(1, "java", "vare", "good"),
				new Board(1, "html", "vare", "notbad")
		};
		
		int arr2[] = {1};
//		Board b1 = new Board(1, "java", "vare", "good");
//		Board b2 = new Board(1, "html", "vare", "notbad");
	
		System.out.println("번호" + "\t" +"제목" +"\t" +"작성자" +"\t" +"내용");
		for(int i=0; i<arr.length;i++) {
			arr[i].boardPrint();
		}
	}

}
