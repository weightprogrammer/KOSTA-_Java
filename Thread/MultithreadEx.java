package kosta.Thread;

public class MultithreadEx extends DigitThread {



		public static void main(String[] args) {
			Thread thread = new DigitThread();
			thread.start();
			for( char ch = 'A'; ch<= 'Z'; ch++)
				System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}


