package kosta.Thread;

public class AdderThread extends sum implements Runnable {

	
	int start, end;
	public  AdderThread(int s, int e) {
		start =s;
		end =e;
	}
	
	
	@Override
	public void run() {
		for(int i =start; i <=end; i++) {
			addNum(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
