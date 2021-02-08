package kosta.Thread;

public class ThreadEx2 extends Thread {
	
	public void run() {

		for(int i=0; i< 50; i++) {
			System.out.print(new String("-"));
		}
	}
	
}
