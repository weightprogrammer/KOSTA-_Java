package kosta.Thread;

public class MultithreadEx1 extends SmallLetters {

	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = {'¤¡','¤¤','¤§','¤©','¤±','¤²'};
		for(char ch : arr)
			System.out.println(ch);

	}

}
