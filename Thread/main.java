package kosta.Thread;

public class main {

	public static void main(String[] args) {
		AdderThread at1 =new AdderThread(1, 50);
		AdderThread at2 =new AdderThread(51, 100);
		
		Thread tr1 = new Thread(at1);
		Thread tr2 = new Thread(at2);
		tr1.start();
		tr2.start();
		
		try {
			tr1.join();
			tr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1 ~ 100 까지의 합" + (at1.qgetNum() + at2.qgetNum()));
	}

}
