package kosta.Thread;

import javax.swing.JOptionPane;

public class Ex1 extends ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은"+ input + "입니다");
	}

}
